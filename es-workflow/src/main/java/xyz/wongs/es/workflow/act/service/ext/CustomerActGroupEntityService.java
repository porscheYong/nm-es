/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service.ext;

import com.google.common.collect.Lists;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.GroupQuery;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * Activiti Group Entity Service
 * @author liuxiaodong
 * @version 2018年4月14日
 */
@Service
public class CustomerActGroupEntityService extends GroupEntityManager {

	@Autowired
	private UserService userService;
	
	@Override
	public Group createNewGroup(String groupId) {
		return new GroupEntity(groupId);
	}

	@Override
	public void insertGroup(Group group) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public void deleteGroup(String groupId) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public GroupQuery createNewGroupQuery() {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public List<Group> findGroupByQueryCriteria(GroupQueryImpl query, Page page) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public long findGroupCountByQueryCriteria(GroupQueryImpl query) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public List<Group> findGroupsByUser(String userId) {
		List<Group> list = Lists.newArrayList();
		AtiUser user = userService.getAtiUserByName(userId);
		if (user != null && user.getRoleList() != null){
			for (AtiRole role : user.getRoleList()){
				list.add(userService.toActivitiGroup(role));
			}
		}
		return list;
	}

	@Override
	public List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
//		return getDbSqlSession().selectListWithRawParameter("selectGroupByNativeQuery", parameterMap, firstResult, maxResults);
		throw new RuntimeException("not implement method.");
	}

	@Override
	public long findGroupCountByNativeQuery(Map<String, Object> parameterMap) {
//		return (Long) getDbSqlSession().selectOne("selectGroupCountByNativeQuery", parameterMap);
		throw new RuntimeException("not implement method.");
	}

}