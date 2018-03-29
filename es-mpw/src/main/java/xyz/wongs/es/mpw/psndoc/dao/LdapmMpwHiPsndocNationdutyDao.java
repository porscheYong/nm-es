package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocNationduty;

@MyBatisDao
public interface LdapmMpwHiPsndocNationdutyDao extends CrudDao<LdapmMpwHiPsndocNationduty> {
    int insert(LdapmMpwHiPsndocNationduty record);

    int insertSelective(LdapmMpwHiPsndocNationduty record);
}