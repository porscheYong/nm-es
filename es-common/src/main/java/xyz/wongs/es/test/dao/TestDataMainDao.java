/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.test.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.test.entity.TestDataMain;

/**
 * 主子表生成DAO接口
 * @author WCNGS@QQ.COM
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}