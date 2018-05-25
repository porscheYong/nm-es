package xyz.wongs.es.workflow.modifystaffinfo.service;

import com.google.common.collect.Lists;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.oa.service.OaBaseTaskListenerService;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.annotation.Resource;
import java.util.List;

/**
 * 人员入职流程 部门领导审批环节 候选人处理
 * @author liuxiaodong
 * @date 2018/5/22
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StaffEntryForDeptLeaderAssignProcessor extends OaBaseTaskListenerService implements TaskListener {

    private static final long serialVersionUID = -8739817415679603516L;

    @Resource
    private AtiUserDao atiUserDao;
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;

    @Override
    public void notify(DelegateTask delegateTask) {
        //分配候选人之前先查看是否有任务改派
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();
        List<AtiUser> deptLeaderUsers = (List<AtiUser>) runtimeService.getVariable(delegateTask.getProcessInstanceId(),processDefinition.getKey() + ProcDefKey.ENTRY_TASK_DEF_KEY[2]);
        List<String> names = Lists.newArrayList();
        if(deptLeaderUsers!=null) {
            addNames(deptLeaderUsers,names,delegateTask);
            return;
        }

        //本流程该节点的候选人为：
//        Long  atiUserId = (Long) delegateTask.getVariable("applyUser");
//        deptLeaderUsers = atiUserDao.getHrUsersByAtiUserId(atiUserId);

//        addNames(deptLeaderUsers,names,delegateTask);

        delegateTask.addCandidateUser("n15020476");


        //如果有任务委托，添加委托人
        if(deptLeaderUsers != null) {
            addDelegateNames(deptLeaderUsers,delegateTask);

            taskService.setVariable(delegateTask.getId(),ProcDefKey.ENTRY_TASK_DEF_KEY[2],deptLeaderUsers);
        }

    }
}
