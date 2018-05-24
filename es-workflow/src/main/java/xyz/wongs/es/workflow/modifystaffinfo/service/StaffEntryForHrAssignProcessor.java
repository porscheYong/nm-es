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
 * 盟市人员流程人力资源环节候选人分配processor
 * @author liuxiaodong
 * @date 2018/5/24
 */
@Service
public class StaffEntryForHrAssignProcessor extends OaBaseTaskListenerService implements TaskListener {

    private static final long serialVersionUID = 7479422571393597233L;
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;
    @Resource
    private AtiUserDao atiUserDao;


    @Override
    public void notify(DelegateTask delegateTask) {

        //分配候选人之前先查看是否有任务改派
        ProcessDefinition processDefinition = repositoryService.
                createProcessDefinitionQuery().processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();
        List<AtiUser> hrUsers = (List<AtiUser>) runtimeService.getVariable(delegateTask.
                getProcessInstanceId(),processDefinition.getKey() + ProcDefKey.ENTRY_TASK_DEF_KEY[3]);
        List<String> names = Lists.newArrayList();
        if(hrUsers!=null) {
            addNames(hrUsers,names,delegateTask);
            return;
        }

        //本流程该节点的候选人为：发起人所在部门的人力资源部
//        Long  atiUserId = (Long) delegateTask.getVariable("applyUser");
//        hrUsers = atiUserDao.getHrUsersByAtiUserId(atiUserId);
//
//        addNames(hrUsers,names,delegateTask);

        delegateTask.addCandidateUser("hr");


        //如果有任务委托，添加委托人
        if(null != hrUsers) {
            addDelegateNames(hrUsers,delegateTask);

            taskService.setVariable(delegateTask.getId(),ProcDefKey.ENTRY_TASK_DEF_KEY[3],hrUsers);
        }



    }
}
