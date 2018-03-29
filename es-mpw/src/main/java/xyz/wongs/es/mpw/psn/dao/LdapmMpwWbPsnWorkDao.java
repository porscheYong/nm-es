package xyz.wongs.es.mpw.psn.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnWork;

@MyBatisDao
public interface LdapmMpwWbPsnWorkDao extends CrudDao<LdapmMpwWbPsnWork> {
    int insert(LdapmMpwWbPsnWork record);

    int insertSelective(LdapmMpwWbPsnWork record);
}