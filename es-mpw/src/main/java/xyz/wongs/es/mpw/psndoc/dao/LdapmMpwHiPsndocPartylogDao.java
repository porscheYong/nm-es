package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocPartylog;

@MyBatisDao
public interface LdapmMpwHiPsndocPartylogDao extends CrudDao<LdapmMpwHiPsndocPartylog> {
    int insert(LdapmMpwHiPsndocPartylog record);

    int insertSelective(LdapmMpwHiPsndocPartylog record);
}