/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.sys.dao;

import xyz.wongs.es.common.persistence.TreeDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author WCNGS@QQ.COM
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {

    public String getOfficeIdByOfficeName(String name);
}
