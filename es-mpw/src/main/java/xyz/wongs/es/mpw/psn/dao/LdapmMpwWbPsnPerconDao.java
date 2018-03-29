package xyz.wongs.es.mpw.psn.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnPercon;

@MyBatisDao
public interface LdapmMpwWbPsnPerconDao extends CrudDao<LdapmMpwWbPsnPercon> {
    int insert(LdapmMpwWbPsnPercon record);

    int insertSelective(LdapmMpwWbPsnPercon record);
}