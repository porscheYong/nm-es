package xyz.wongs.es.workflow.act.service;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.oa.dao.AtiDelegateInfoDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 流程定义相关Service
 * @author liuxiaodong
 * @date 2018/4/23
 */
@Service
public class AtiProcessService {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private AtiDelegateInfoDao atiDelegateInfoMapper;
    @Autowired
    private RepositoryService repositoryService;

    /**
     * 流程定义列表
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
            //1. 清空所有办理人
            if(currentTask.getAssignee() == null) {
                taskService.claim(currentTask.getId(), "user");
            }
            taskService.unclaim(currentTask.getId());
            //2. 给节点添加办理人
            for(AtiUser user : users) {
                taskService.addCandidateUser(currentTask.getId(), String.valueOf(user.getAtiUserId()));
            }
        }

        //非当前任务改派
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(currentTask.getProcessDefinitionId()).singleResult();
        ProcDefKey.init();
        String[] actDefKeys = (String[]) ProcDefKey.map.get(processDefinition.getKey());

        //任务改派时，往流程实例中添加变量，到节点指派候选人时再取出该变量中的用户
        for(int i=0;i<actDefKeys.length;i++) {
            if(actDefKeys[i].equals(taskDefKey)) {
                runtimeService.setVariable(procInstId,actDefKeys[i],users);
                break;
            }
        }

    }
}
