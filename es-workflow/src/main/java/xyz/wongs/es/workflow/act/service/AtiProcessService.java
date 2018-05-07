package xyz.wongs.es.workflow.act.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.collect.Lists;
import org.activiti.bpmn.converter.BpmnXMLConverter;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.editor.constants.ModelDataJsonConstants;
import org.activiti.editor.language.json.converter.BpmnJsonConverter;
import org.activiti.engine.ActivitiException;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.oa.dao.AtiDelegateInfoDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.annotation.Resource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipInputStream;

/**
 * 流程定义相关Service
 * @author liuxiaodong
 * @date 2018/4/23
 */
@Service
public class AtiProcessService {

    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;
    @Resource
    private AtiDelegateInfoDao atiDelegateInfoMapper;
    @Resource
    private RepositoryService repositoryService;


    /**
     * 流程定义列表
     */
    public Page<Object[]> processList(Page<Object[]> page, String category) {

        ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery()
                .latestVersion().orderByProcessDefinitionKey().asc();

        if (StringUtils.isNotEmpty(category)){
            processDefinitionQuery.processDefinitionCategory(category);
        }

        page.setCount(processDefinitionQuery.count());

        List<ProcessDefinition> processDefinitionList = processDefinitionQuery.listPage(page.getFirstResult(), page.getMaxResults());
        for (ProcessDefinition processDefinition : processDefinitionList) {
            String deploymentId = processDefinition.getDeploymentId();
            Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(deploymentId).singleResult();
            page.getList().add(new Object[]{processDefinition, deployment});
        }

        return page;
    }


    /**
     * 运行流程定义列表
     */
    public Page<ProcessInstance> runningList(Page<ProcessInstance> page, String procInsId, String procDefKey) {

        ProcessInstanceQuery processInstanceQuery = runtimeService.createProcessInstanceQuery();

        if (StringUtils.isNotBlank(procDefKey)){
            processInstanceQuery.processDefinitionKey(procDefKey);
        }

        if (StringUtils.isNotBlank(procInsId)){
            processInstanceQuery.processInstanceId(procInsId);
        }

        page.setCount(processInstanceQuery.count());
        page.setList(processInstanceQuery.listPage(page.getFirstResult(), page.getMaxResults()));
        return page;
    }





    /**
     * 工作交接
     * @param leaver
     * @param receiver
     */
    public void saveWorkHandOver(String leaver,String receiver) {

        //1.待领取
        TaskQuery toClaimQuery = taskService.createTaskQuery().taskCandidateUser(leaver)
                .includeProcessVariables().active().orderByTaskCreateTime().desc();
        List<Task> toClaimList = toClaimQuery.list();
        for(Task task : toClaimList) {
            taskService.deleteCandidateUser(task.getId(),leaver);
            taskService.addCandidateUser(task.getId(),receiver);
        }

        //2.待执行
        TaskQuery todoTaskQuery = taskService.createTaskQuery().taskAssignee(leaver).active()
                .includeProcessVariables().orderByTaskCreateTime().desc();
        List<Task> todoList = todoTaskQuery.list();
        for(Task task:todoList) {
            taskService.setAssignee(task.getId(),receiver);
        }


        //3.委托和代理
        List<AtiDelegateInfo> list = atiDelegateInfoMapper.getDelegateInfoByLeaver(leaver);
        for(AtiDelegateInfo delegateInfo : list) {
            if(delegateInfo.getAssignee().equals(leaver)) {
                atiDelegateInfoMapper.updateDelegateAssignee(leaver,receiver);
            }
            if(delegateInfo.getAttorney().equals(leaver)) {
                atiDelegateInfoMapper.updateDelegateAttorney(leaver,receiver);
            }
        }

    }


    /**
     * 任务改派
     * @param procInstId
     * @param taskDefKey
     * @param users
     */
    public void alterAssignee(String procInstId,String taskDefKey,List<AtiUser> users) {

        Task currentTask = taskService.createTaskQuery().processInstanceId(procInstId).active().singleResult();
        //当前任务改派
        if(taskDefKey.equals(currentTask.getTaskDefinitionKey())) {
            //获取当前节点候选人
            List<AtiUser> taskCandidateUsers = (List<AtiUser>) taskService.getVariable(currentTask.getId(),taskDefKey);
            //1. 清空所有候选人
            for(AtiUser user : taskCandidateUsers) {
                taskService.deleteCandidateUser(currentTask.getId(), String.valueOf(user.getAtiUserId()));
            }

            //2. 给节点添加办理人
            for(AtiUser user : users) {
                taskService.addCandidateUser(currentTask.getId(), String.valueOf(user.getAtiUserId()));
            }

            return;
        }

        //非当前任务改派
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(currentTask.getProcessDefinitionId()).singleResult();
        String[] actDefKeys = (String[]) ProcDefKey.map.get(processDefinition.getKey());

        //任务改派时，往流程实例中添加变量，到节点指派候选人时再取出该变量中的用户
        for(int i=0;i<actDefKeys.length;i++) {
            if(actDefKeys[i].equals(taskDefKey)) {
                runtimeService.setVariable(procInstId,processDefinition.getKey() + actDefKeys[i],users);
                break;
            }
        }

    }


    /**
     * 根据流程实例ID获取流程所有节点
     * @param procInstId
     * @return
     */
    public List<Map<String ,Object>> getTaskDefKeys(String procInstId) {

        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(procInstId).singleResult();

        String processDefinitionId = processInstance.getProcessDefinitionId();
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        List<Map<String, Object>> list = null;
        if (bpmnModel != null) {
            list = Lists.newArrayList();
            Collection<FlowElement> flowElements = bpmnModel.getMainProcess().getFlowElements();
            for (FlowElement e : flowElements) {
                //取用户任务节点
                if (e.getId().indexOf("flow") != -1 || e.getId().indexOf("gateway") != -1) {
                    continue;
                }
                Map<String, Object> map = new HashMap<>();
                map.put("id", e.getId());
                map.put("name", e.getName());
                list.add(map);
            }
        }
        return list;
    }



    /**
     * 部署流程 - 保存
     * @param file
     * @return
     */
    @Transactional(readOnly = false)
    public String deploy(String exportDir, String category, MultipartFile file) {

        String message = "";

        String fileName = file.getOriginalFilename();

        try {
            InputStream fileInputStream = file.getInputStream();
            Deployment deployment;
            String extension = FilenameUtils.getExtension(fileName);
            if (extension.equals("zip") || extension.equals("bar")) {
                ZipInputStream zip = new ZipInputStream(fileInputStream);
                deployment = repositoryService.createDeployment().addZipInputStream(zip).deploy();
            } else if (extension.equals("png")) {
                deployment = repositoryService.createDeployment().addInputStream(fileName, fileInputStream).deploy();
            } else if (fileName.indexOf("bpmn20.xml") != -1) {
                deployment = repositoryService.createDeployment().addInputStream(fileName, fileInputStream).deploy();
            } else if (extension.equals("bpmn")) { // bpmn扩展名特殊处理，转换为bpmn20.xml
                String baseName = FilenameUtils.getBaseName(fileName);
                deployment = repositoryService.createDeployment().addInputStream(baseName + ".bpmn20.xml", fileInputStream).deploy();
            } else {
                message = "不支持的文件类型：" + extension;
                return message;
            }

            List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().deploymentId(deployment.getId()).list();

            // 设置流程分类
            for (ProcessDefinition processDefinition : list) {
                repositoryService.setProcessDefinitionCategory(processDefinition.getId(), category);
                message += "部署成功，流程ID=" + processDefinition.getId() + "<br/>";
            }

            if (list.size() == 0){
                message = "部署失败，没有流程。";
            }

        } catch (Exception e) {
            throw new ActivitiException("部署失败！", e);
        }
        return message;
    }


    /**
     * 读取流程资源
     * @param procDefId
     * @param proInsId
     * @param resType
     * @return
     * @throws Exception
     */
    public InputStream resourceRead(String procDefId, String proInsId, String resType) throws Exception {

        if (StringUtils.isBlank(procDefId)){
            ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(proInsId).singleResult();
            procDefId = processInstance.getProcessDefinitionId();
        }
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(procDefId).singleResult();

        String resourceName = "";
        if (resType.equals("image")) {
            resourceName = processDefinition.getDiagramResourceName();
        } else if (resType.equals("xml")) {
            resourceName = processDefinition.getResourceName();
        }

        InputStream resourceAsStream = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(), resourceName);
        return resourceAsStream;
    }


    /**
     * 挂起、激活流程实例
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public String updateState(String state, String procDefId) {
        if (state.equals("active")) {
            repositoryService.activateProcessDefinitionById(procDefId, true, null);
            return "已激活ID为[" + procDefId + "]的流程定义。";
        } else if (state.equals("suspend")) {
            repositoryService.suspendProcessDefinitionById(procDefId, true, null);
            return "已挂起ID为[" + procDefId + "]的流程定义。";
        }
        return "无操作";
    }



    /**
     * 删除部署的流程，级联删除流程实例
     * @param deploymentId 流程部署ID
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void deleteDeployment(String deploymentId) {
        repositoryService.deleteDeployment(deploymentId, true);
    }


    /**
     * 将部署的流程转换为模型
     * @param procDefId
     * @throws UnsupportedEncodingException
     * @throws XMLStreamException
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public org.activiti.engine.repository.Model convertToModel(String procDefId) throws UnsupportedEncodingException, XMLStreamException {

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(procDefId).singleResult();
        InputStream bpmnStream = repositoryService.getResourceAsStream(processDefinition.getDeploymentId(),
                processDefinition.getResourceName());
        XMLInputFactory xif = XMLInputFactory.newInstance();
        InputStreamReader in = new InputStreamReader(bpmnStream, "UTF-8");
        XMLStreamReader xtr = xif.createXMLStreamReader(in);
        BpmnModel bpmnModel = new BpmnXMLConverter().convertToBpmnModel(xtr);

        BpmnJsonConverter converter = new BpmnJsonConverter();
        ObjectNode modelNode = converter.convertToJson(bpmnModel);
        org.activiti.engine.repository.Model modelData = repositoryService.newModel();
        modelData.setKey(processDefinition.getKey());
        modelData.setName(processDefinition.getResourceName());
        modelData.setCategory(processDefinition.getCategory());
        modelData.setDeploymentId(processDefinition.getDeploymentId());
        modelData.setVersion(Integer.parseInt(String.valueOf(repositoryService.createModelQuery().modelKey(modelData.getKey()).count()+1)));

        ObjectNode modelObjectNode = new ObjectMapper().createObjectNode();
        modelObjectNode.put(ModelDataJsonConstants.MODEL_NAME, processDefinition.getName());
        modelObjectNode.put(ModelDataJsonConstants.MODEL_REVISION, modelData.getVersion());
        modelObjectNode.put(ModelDataJsonConstants.MODEL_DESCRIPTION, processDefinition.getDescription());
        modelData.setMetaInfo(modelObjectNode.toString());

        repositoryService.saveModel(modelData);

        repositoryService.addModelEditorSource(modelData.getId(), modelNode.toString().getBytes("utf-8"));

        return modelData;
    }
}
