package xyz.wongs.es.mpw.psn.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnVocqua;

@MyBatisDao
public interface LdapmMpwWbPsnVocquaDao extends CrudDao<LdapmMpwWbPsnVocqua> {
    int insert(LdapmMpwWbPsnVocqua record);

    int insertSelective(LdapmMpwWbPsnVocqua record);
}