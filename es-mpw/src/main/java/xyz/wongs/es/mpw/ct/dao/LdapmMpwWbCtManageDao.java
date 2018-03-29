package xyz.wongs.es.mpw.ct.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.ct.entity.LdapmMpwWbCtManage;

@MyBatisDao
public interface LdapmMpwWbCtManageDao extends CrudDao<LdapmMpwWbCtManage> {
    int insert(LdapmMpwWbCtManage record);

    int insertSelective(LdapmMpwWbCtManage record);
}