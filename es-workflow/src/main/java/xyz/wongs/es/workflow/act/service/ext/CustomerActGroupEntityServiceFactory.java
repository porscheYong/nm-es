/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service.ext;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.GroupIdentityManager;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Activiti Group Entity Factory
 * @author liuxiaodong
 * @version 2018年4月14日
 */
public class CustomerActGroupEntityServiceFactory implements SessionFactory {
	
	@Autowired
	private CustomerActGroupEntityService customerActGroupEntityService;
	
	@Override
	public Class<?> getSessionType() {
		// 返回原始的GroupIdentityManager类型
		return GroupIdentityManager.class;
	}

	@Override
	public Session openSession() {
		// 返回自定义的GroupEntityManager实例
		return customerActGroupEntityService;
	}

}
