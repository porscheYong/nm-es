package xyz.wongs.es.workflow.workattendace.service;

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
import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.annotation.Resource;
import java.util.List;

/**
 * 节点监听器，与流程图业务相关
 * 以人事审批为例，动态指定节点签收人
 * @author liuxiaodong
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LeaveHrAuditAssignProcessor extends OaBaseTaskListenerService implements TaskListener {

	private static final long serialVersionUID = 1L;

	@Resource
	private AtiUserDao atiUserDao;
	@Resource
	private AtiRoleDao atiRoleDao;
	@Resource
	private RuntimeService runtimeService;
	@Resource
	private TaskService taskService;
	@Resource
	private RepositoryService repositoryService;

	@Override
	public void notify(DelegateTask delegateTask) {

		//如果有任务改派，修改候选人
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(delegateTask.getProcessDefinitionId()).singleResult();

		List<AtiUser> users = (List<AtiUser>) runtimeService.getVariable(delegateTask.getProcessInstanceId(), processDefinition.getKey() + ProcDefKey.LEAVE_TASK_DEF_KEY[3]);
		List<String> names = Lists.newArrayList();

		if(users!=null) {
			addNames(users,names,delegateTask);
			return;
		}


		//节点正常情况下的设置候选人
		//测试，人事角色编号
		AtiRole atiRole = atiRoleDao.getRoleByRoleCode("3000");
		users = atiUserDao.getUsersByRoleId(atiRole.getAtiRoleId());

		addNames(users,names,delegateTask);


		//如果有任务委托，添加委托人
		addDelegateNames(users,delegateTask);

        taskService.setVariable(delegateTask.getId(),ProcDefKey.LEAVE_TASK_DEF_KEY[3],users);

	}

}
