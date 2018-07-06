package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricTaskInstanceQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ProcessDefCache;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.*;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 通用流程Service
 * @author liuxiaodong
 * @date 2018/5/25
 */

@Service
public class OaBaseObjectService {


    @Resource
    private AtiBaseFormDao atiBaseFormDao;
    @Resource
    private AtiSpecificFormDao atiSpecificFormDao;
    @Resource
    private AtiTaskService atiTaskService;
    @Resource
    private HistoryService historyService;
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private TaskService taskService;
    @Resource
    private AtiSpecificFormService atiSpecificFormService;
    @Resource
    private RuntimeService runtimeService;


    /**
     * 发起流程或重新申请
     * @param baseObject
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public String save(OaBaseObject baseObject) {

        List<AtiSpecificForm> specificForms = getSpecificForms(baseObject);

        // 申请发起

        //添加procDefId到通用配置表单
        if(baseObject.getProcDefId() == null){
            baseObject.setProcDefId(baseObject.getAct().getProcDefId());
        }

        atiBaseFormDao.addAtiBaseForm(baseObject);

        Long currentBaseFormId = baseObject.getAtiBaseFormId();
        baseObject.setAtiBaseFormId(currentBaseFormId);

        for(AtiSpecificForm atiSpecificForm : specificForms) {
            atiSpecificFormDao.insert(atiSpecificForm);
        }

        //使用ATI_BASE_FORM_ID 作为 businessId
        String businessId = String.valueOf(currentBaseFormId);

        // 启动流程
        String procInstId = atiTaskService.startProcess(baseObject.getProcDefKey(), ProcDefKey.ATI_BASE_FORM_KEY,
                businessId, baseObject.getAtiActCategoryId(),baseObject);
        return procInstId;

    }

    /**
     * 通过虚拟对象oaBaseObject获取atiSpecificForm对象集合
     * @param oaBaseObject
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(OaBaseObject oaBaseObject) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        AtiSpecificForm specificFormOutStaffInfo = getSpecificForm(oaBaseObject);
        specificFormOutStaffInfo.setParameter("OUT_STAFF_ID");
        specificFormOutStaffInfo.setParamValue(String.valueOf(oaBaseObject.getOutStaffId()));
        specificForms.add(specificFormOutStaffInfo);

        AtiSpecificForm specificFormTrial = getSpecificForm(oaBaseObject);
        specificFormTrial.setParameter("TRIAL_ID");
        specificFormTrial.setParamValue(String.valueOf(oaBaseObject.getTrialId()));
        specificForms.add(specificFormTrial);

        AtiSpecificForm specificFormPsnjob = getSpecificForm(oaBaseObject);
        specificFormPsnjob.setParameter("PSNJOB_ID");
        specificFormPsnjob.setParamValue(String.valueOf(oaBaseObject.getPsnjobId()));
        specificForms.add(specificFormPsnjob);

        AtiSpecificForm specificFormRetire = getSpecificForm(oaBaseObject);
        specificFormRetire.setParameter("RETIRE_ID");
        specificFormRetire.setParamValue(String.valueOf(oaBaseObject.getRetireId()));
        specificForms.add(specificFormRetire);

        AtiSpecificForm specificFormEnc = getSpecificForm(oaBaseObject);
        specificFormEnc.setParameter("ENC_ID");
        specificFormEnc.setParamValue(String.valueOf(oaBaseObject.getEncId()));
        specificForms.add(specificFormEnc);

        AtiSpecificForm specificFormPunish = getSpecificForm(oaBaseObject);
        specificFormPunish.setParameter("PUNISH_ID");
        specificFormPunish.setParamValue(String.valueOf(oaBaseObject.getPunishId()));
        specificForms.add(specificFormPunish);

        AtiSpecificForm specificFormTalentTeam = getSpecificForm(oaBaseObject);
        specificFormTalentTeam.setParameter("TALENT_TEAM_ID");
        specificFormTalentTeam.setParamValue(String.valueOf(oaBaseObject.getTalentTeamId()));
        specificForms.add(specificFormTalentTeam);

        AtiSpecificForm specificFormEdu = getSpecificForm(oaBaseObject);
        specificFormEdu.setParameter("EDU_ID");
        specificFormEdu.setParamValue(String.valueOf(oaBaseObject.getEduId()));
        specificForms.add(specificFormEdu);

        AtiSpecificForm specificFormFamily = getSpecificForm(oaBaseObject);
        specificFormFamily.setParameter("FAMILY_ID");
        specificFormFamily.setParamValue(String.valueOf(oaBaseObject.getFamilyId()));
        specificForms.add(specificFormFamily);

        AtiSpecificForm specificFormTitle = getSpecificForm(oaBaseObject);
        specificFormTitle.setParameter("TITLE_ID");
        specificFormTitle.setParamValue(String.valueOf(oaBaseObject.getTitleId()));
        specificForms.add(specificFormTitle);

        AtiSpecificForm specificFormPartyLog = getSpecificForm(oaBaseObject);
        specificFormPartyLog.setParameter("PARTY_LOG_ID");
        specificFormPartyLog.setParamValue(String.valueOf(oaBaseObject.getPartyLogId()));
        specificForms.add(specificFormPartyLog);

        AtiSpecificForm specificFormPrimaryKeyHis = getSpecificForm(oaBaseObject);
        specificFormPrimaryKeyHis.setParameter("PRIMARY_ID_HIS");
        specificFormPrimaryKeyHis.setParamValue(String.valueOf(oaBaseObject.getPrimaryIdHis()));
        specificForms.add(specificFormPrimaryKeyHis);

        AtiSpecificForm specificFormFirstText = getSpecificForm(oaBaseObject);
        specificFormFirstText.setParameter("FIRST_TEXT");
        specificFormFirstText.setParamValue(oaBaseObject.getFifthText());
        specificForms.add(specificFormFirstText);

        AtiSpecificForm specificFormSecondText = getSpecificForm(oaBaseObject);
        specificFormSecondText.setParameter("SECOND_TEXT");
        specificFormSecondText.setParamValue(oaBaseObject.getSecondText());
        specificForms.add(specificFormSecondText);

        AtiSpecificForm specificFormThirdText = getSpecificForm(oaBaseObject);
        specificFormThirdText.setParameter("THIRD_TEXT");
        specificFormThirdText.setParamValue(oaBaseObject.getThirdText());
        specificForms.add(specificFormThirdText);

        AtiSpecificForm specificFormFourthText = getSpecificForm(oaBaseObject);
        specificFormFourthText.setParameter("FOURTH_TEXT");
        specificFormFourthText.setParamValue(oaBaseObject.getFourthText());
        specificForms.add(specificFormFourthText);

        AtiSpecificForm specificFormFifthText = getSpecificForm(oaBaseObject);
        specificFormFifthText.setParameter("FIFTH_TEXT");
        specificFormFifthText.setParamValue(oaBaseObject.getFifthText());
        specificForms.add(specificFormFifthText);


        return specificForms;
    }


    public AtiSpecificForm getSpecificForm(OaBaseObject baseObject) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(baseObject.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(baseObject.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(baseObject.getAtiActCategoryId());
        return  atiSpecificForm;
    }


    public List<HistoricTask> getHistToricTaskList(String assignName) {
        HistoricTaskInstanceQuery histTaskQuery = historyService.createHistoricTaskInstanceQuery()
                .taskAssignee(assignName).finished().includeProcessVariables()
                .orderByHistoricTaskInstanceEndTime().desc();


        // 查询列表
        List<HistoricTaskInstance> histList = histTaskQuery.list();

        List<HistoricTask> historicTasks = new ArrayList<>();
        for(HistoricTaskInstance taskInstance : histList) {
            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
            if(null != baseObject) {
                HistoricTask historicTask = new HistoricTask();
                historicTask.setProcessDefinitionId(taskInstance.getProcessDefinitionId());
                historicTask.setProcessInstanceId(taskInstance.getProcessInstanceId());
                historicTask.setAssignee(taskInstance.getAssignee());
                historicTask.setDurationInMillis(taskInstance.getDurationInMillis());
                historicTask.setStartTime(taskInstance.getStartTime());
                historicTask.setEndTime(taskInstance.getEndTime());
                historicTask.setName(taskInstance.getName());


                historicTask.setFormSender(baseObject.getFormSender());
                historicTask.setFormTheme(baseObject.getFormTheme());
                historicTask.setFormContent(baseObject.getFormContent());
                historicTask.setAtiCategoryId(baseObject.getAtiActCategoryId());

                List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().
                        processDefinitionId(taskInstance.getProcessDefinitionId()).list();
                historicTask.setProcDefName(list.get(0).getName());
                historicTasks.add(historicTask);
            }

        }
        return historicTasks;
    }


    /**
     * 流程审批环节
     * @param flag
     * @param taskId
     * @param procInstId
     * @param comment
     */
    public void saveAudit(String comment, String flag, String taskId, String procInstId) {
        List<Task> task = taskService.createTaskQuery().taskId(taskId).list();
        String taskDefKey = task.get(0).getTaskDefinitionKey();
        OaBaseObject oaBaseObject = atiSpecificFormService.getOabaseObjectByPorcInstId(procInstId);
        //只针对通用流程，固定的审批环节，即modify,deptLeader,hr,hrLeader,admin
        switch (taskDefKey) {
            case "deptLeaderAudit":
                oaBaseObject.setSecondText(comment);
                atiSpecificFormService.updateSecondText(oaBaseObject);
                break;
            case "hrAudit":
                oaBaseObject.setThirdText(comment);
                atiSpecificFormService.updateThridText(oaBaseObject);
                break;
            case "hrLeaderAudit":
                oaBaseObject.setFourthText(comment);
                atiSpecificFormService.updateFourthText(oaBaseObject);
                break;
            case "admin":
                break;
            case "modify":
                break;
            default:
                return;

        }
        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", flag);
        atiTaskService.complete(taskId, procInstId, comment, vars);
    }


    /**
     * 流程历史流转
     * @param procInsId
     * @return
     */
    public List<HistoricFlow> histoicFlowList(String procInsId){
        List<HistoricFlow> actList = Lists.newArrayList();
        List<HistoricActivityInstance> list = historyService.createHistoricActivityInstanceQuery().processInstanceId(procInsId)
                .orderByHistoricActivityInstanceStartTime().asc().orderByHistoricActivityInstanceEndTime().asc().list();

        boolean start = false;
        Map<String, Integer> actMap = Maps.newHashMap();

        for (int i=0; i<list.size(); i++){

            HistoricActivityInstance histIns = list.get(i);

            // 过滤开始节点前的节点
            if (StringUtils.isNotBlank("startEvent") && "startEvent".equals(histIns.getActivityId())){
                start = true;
            }
            if (StringUtils.isNotBlank("startEvent") && !start){
                continue;
            }

            // 只显示开始节点和结束节点，并且执行人不为空的任务
            if (StringUtils.isNotBlank(histIns.getAssignee())
                    || "startEvent".equals(histIns.getActivityType())
                    || "endEvent".equals(histIns.getActivityType())){

                // 给节点增加一个序号
                Integer actNum = actMap.get(histIns.getId());
                if (actNum == null){
                    actMap.put(histIns.getId(), actMap.size() + 1);
                }

                HistoricFlow historicFlow = new HistoricFlow();
                historicFlow.setActNum(actMap.get(histIns.getId()));
                historicFlow.setStartTime(histIns.getStartTime());
                historicFlow.setEndTime(histIns.getEndTime());
                historicFlow.setDuringTime(String.valueOf(histIns.getDurationInMillis()));
                historicFlow.setTaskDefKey(histIns.getActivityName());

                if("startEvent".equals(histIns.getActivityId())) {
                    OaBaseObject oaBaseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(procInsId);
                    historicFlow.setAssignee(oaBaseObject.getFormSender());
                }else {
                    historicFlow.setAssignee(histIns.getAssignee());
                }

//                // 获取意见评论内容
                if (StringUtils.isNotBlank(histIns.getTaskId())){
                    List<Comment> commentList = taskService.getTaskComments(histIns.getTaskId());
                    if (commentList.size()>0){
                        historicFlow.setComment(commentList.get(0).getFullMessage());
                    }
                }

                actList.add(historicFlow);
            }


        }
        return actList;
    }

    /**
     * 用户名获取其中code值第一个数字位置
     * @param currentUserName
     * @return
     */
    public Integer getIndex(String currentUserName) {
        char[] chars = currentUserName.toCharArray();
        for(int i=0;i<chars.length;i++) {
            if(chars[i] >= 48 && chars[i] <= 58) {
                System.out.println("..." + chars[i]);
                return  i;
            }
        }
        return null;
    }

    /**
     * 校验用户有效性
     * @param assignName
     * @return
     */
    public boolean isAssignName(String assignName) {
        List<ProcessInstance> instances = runtimeService.createProcessInstanceQuery().list();
        boolean isAssignName = false;
        for(ProcessInstance instance : instances) {
            Task task = taskService.createTaskQuery().processInstanceId(instance.getId()).singleResult();
            List<AtiUser> users = (List<AtiUser>) taskService.getVariable(task.getId(),task.getTaskDefinitionKey());
            if(null != users && users.size()>0) {
                for(AtiUser user : users) {
                    if(assignName.equals(user.getName())){
                        isAssignName = true;
                        break;
                    }
                }
                if(isAssignName) {
                    break;
                }
            }

        }
        return isAssignName;
    }
}
