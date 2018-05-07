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
 * 人力资源节点添加候选人
 * @author liuxiaodong
 * @date 2018/4/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ModifyStaffInfoHrAssignProcessor extends OaBaseTaskListenerService implements TaskListener {

    private static final long serialVersionUID = 7499738744879695134L;

    @Resource
    private AtiUserDao atiUserDao;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private TaskService taskService;

    @Override
    public void notify(DelegateTask delegateTask) {


        //分配候选人之前先查看是否有任务改派
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();
        List<AtiUser> hrUsers = (List<AtiUser>) runtimeService.getVariable(delegateTask.getProcessInstanceId(),processDefinition.getKey() + ProcDefKey.MODIFY_TASK_DEF_KEY[2]);
        List<String> names = Lists.newArrayList();
        if(hrUsers!=null) {
            addNames(hrUsers,names,delegateTask);
            return;
        }

        //本流程该节点的候选人为：发起人所在部门的人力资源部
        Long  atiUserId = (Long) delegateTask.getVariable("applyUser");
        hrUsers = atiUserDao.getHrUsersByAtiUserId(atiUserId);

        addNames(hrUsers,names,delegateTask);


        //如果有任务委托，添加委托人
        addDelegateNames(hrUsers,delegateTask);

        taskService.setVariable(delegateTask.getId(),ProcDefKey.MODIFY_TASK_DEF_KEY[2],hrUsers);

    }
}
