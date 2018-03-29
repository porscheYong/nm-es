package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef1;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef1Dao extends CrudDao<LdapmMpwHiPsndocGlbdef1> {
    int insert(LdapmMpwHiPsndocGlbdef1 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef1 record);
}