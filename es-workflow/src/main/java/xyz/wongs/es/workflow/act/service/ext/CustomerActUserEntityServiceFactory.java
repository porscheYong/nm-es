/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service.ext;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Activiti User Entity Service Factory
 * @author liuxiaodong
 * @version 2018年4月14日
 */
public class CustomerActUserEntityServiceFactory implements SessionFactory {
	
	@Autowired
	private CustomerActUserEntityService customerActUserEntityService;

	@Override
	public Class<?> getSessionType() {
		// 返回原始的UserIdentityManager类型
		return UserIdentityManager.class;
	}

	@Override
	public Session openSession() {
		// 返回自定义的UserEntityManager实例
		return customerActUserEntityService;
	}

}
