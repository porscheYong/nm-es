package xyz.wongs.es.mpw.psn.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnTramsg;

@MyBatisDao
public interface LdapmMpwWbPsnTramsgDao extends CrudDao<LdapmMpwWbPsnTramsg> {
    int insert(LdapmMpwWbPsnTramsg record);

    int insertSelective(LdapmMpwWbPsnTramsg record);
}