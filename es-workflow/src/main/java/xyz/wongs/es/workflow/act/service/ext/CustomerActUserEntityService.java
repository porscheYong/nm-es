/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service.ext;

import com.google.common.collect.Lists;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * Activiti User Entity Service
 * @author liuxiaodong
 * @version 2018年4月14日
 */
@Service
public class CustomerActUserEntityService extends UserEntityManager {

	@Autowired
	private UserService userService;


	@Override
	public User createNewUser(String userId) {
		return new UserEntity(userId);
	}

	@Override
	public void insertUser(User user) {
		throw new RuntimeException("not implement method.");
	}

	public void updateUser(UserEntity updatedUser) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public UserEntity findUserById(String userId) {
		AtiUser user = userService.getAtiUserByName(userId);
		if (user == null){
			return null;
		}
		UserEntity userEntity = new UserEntity();
		userEntity.setId(String.valueOf(user.getAtiUserId()));
		userEntity.setLastName(StringUtils.EMPTY);
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getMail());
		userEntity.setRevision(1);
		return userEntity;
	}

	@Override
	public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public long findUserCountByQueryCriteria(UserQueryImpl query) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public List<Group> findGroupsByUser(String userId) {

		List<Group> list = Lists.newArrayList();
		List<AtiRole> roles = userService.getRolesByUserId(userId);
		for (AtiRole role : roles){
			list.add(userService.toActivitiGroup(role));
		}
		return list;
	}

	@Override
	public UserQuery createNewUserQuery() {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public IdentityInfoEntity findUserInfoByUserIdAndKey(String userId, String key) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public List<String> findUserInfoKeysByUserIdAndType(String userId, String type) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public Boolean checkPassword(String userId, String password) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public List<User> findPotentialStarterUsers(String proceDefId) {
		throw new RuntimeException("not implement method.");

	}

	@Override
	public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
		throw new RuntimeException("not implement method.");
	}

	@Override
	public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
		throw new RuntimeException("not implement method.");
	}
	
}
