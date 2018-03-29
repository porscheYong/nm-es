package xyz.wongs.es.mpw.psn.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnMsg;

@MyBatisDao
public interface LdapmMpwWbPsnMsgDao extends CrudDao<LdapmMpwWbPsnMsg> {
    int insert(LdapmMpwWbPsnMsg record);

    int insertSelective(LdapmMpwWbPsnMsg record);
}