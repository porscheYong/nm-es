package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 节点监听器，与流程图业务相关
 * 以部门经理审批为例，动态指定节点签收人
 * @author liuxiaodong
 */
@Service
@Transactional
public class AutoAssignProcessor implements TaskListener {

	private static final long serialVersionUID = 1L;

	@Autowired
	private AtiUserDao atiUserMapper;
	@Autowired
	private AtiRoleDao atiRoleMapper;

	@Override
	public void notify(DelegateTask delegateTask) {

		//部门经理角色编号
		AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("2000");

		List<AtiUser> users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());
		List<String> names = Lists.newArrayList();
		for(AtiUser atiUser : users) {
			names.add(String.valueOf(atiUser.getAtiUserId()));
		}

		//添加处理人
		delegateTask.addCandidateUsers(names);



	}

}
