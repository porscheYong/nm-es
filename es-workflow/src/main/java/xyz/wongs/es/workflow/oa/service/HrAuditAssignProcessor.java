package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.workflow.oa.entity.TaskDefKey;
import xyz.wongs.es.workflow.user.dao.AtiRoleMapper;
import xyz.wongs.es.workflow.user.dao.AtiUserMapper;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 节点监听器，与流程图业务相关
 * 以人事审批为例，动态指定节点签收人
 * @author liuxiaodong
 */
@Service
@Transactional
public class HrAuditAssignProcessor implements TaskListener {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AtiUserMapper atiUserMapper;
	@Autowired
	private AtiRoleMapper atiRoleMapper;
	@Autowired
	private RuntimeService runtimeService;

	@Override
	public void notify(DelegateTask delegateTask) {

		Object vars = runtimeService.getVariable(delegateTask.getProcessInstanceId(),TaskDefKey.LEAVE_TASK_DEF_KEY[3]);

		List<AtiUser> users = (List<AtiUser>) vars;
		List<String> names = Lists.newArrayList();

		if(users!=null) {
			for(AtiUser atiUser : users) {
				names.add(String.valueOf(atiUser.getAtiUserId()));
			}
			delegateTask.addCandidateUsers(names);
			return;
		}

		//人事角色编号
		AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("3000");
		users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());

		for(AtiUser atiUser : users) {
			names.add(String.valueOf(atiUser.getAtiUserId()));
		}

		//添加处理人
		delegateTask.addCandidateUsers(names);

	}

}
