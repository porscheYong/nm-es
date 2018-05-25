package xyz.wongs.es.workflow.modifystaffinfo.service;

import com.google.common.collect.Lists;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.oa.service.OaBaseTaskListenerService;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.annotation.Resource;
import java.util.List;

/**
 * 盟市人员入职流程分管领导环节候选人处理processor
 * @author liuxiaodong
 * @date 2018/5/24
 */
@Service
public class StaffEntryForHrLeaderAssignProcessor extends OaBaseTaskListenerService
        implements TaskListener {

    private static final long serialVersionUID = 118746121105620593L;

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
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().
                processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();
        List<AtiUser> hrLeaderUsers = (List<AtiUser>) runtimeService.getVariable(delegateTask.
                getProcessInstanceId(),processDefinition.getKey() + ProcDefKey.ENTRY_TASK_DEF_KEY[4]);
        List<String> names = Lists.newArrayList();
        if(hrLeaderUsers!=null) {
            addNames(hrLeaderUsers,names,delegateTask);
            return;
        }

        //本流程该节点的候选人为：
//        Long  atiUserId = (Long) delegateTask.getVariable("applyUser");
//        hrLeaderUsers = atiUserDao.getHrUsersByAtiUserId(atiUserId);
//
//        addNames(hrLeaderUsers,names,delegateTask);

        delegateTask.addCandidateUser("zhangyong");



        //如果有任务委托，添加委托人
        if(null != hrLeaderUsers) {
            addDelegateNames(hrLeaderUsers,delegateTask);

            taskService.setVariable(delegateTask.getId(),ProcDefKey.ENTRY_TASK_DEF_KEY[4],hrLeaderUsers);
        }

    }
}
