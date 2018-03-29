package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaClassitem;

@MyBatisDao
public interface LdapmMpwWaClassitemDao extends CrudDao<LdapmMpwWaClassitem> {
    int insert(LdapmMpwWaClassitem record);

    int insertSelective(LdapmMpwWaClassitem record);
}