/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.modules.test.entity.Test;
import xyz.wongs.es.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author WCNGS@QQ.COM
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
