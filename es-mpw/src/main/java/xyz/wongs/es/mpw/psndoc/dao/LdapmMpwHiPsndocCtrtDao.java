package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocCtrt;

@MyBatisDao
public interface LdapmMpwHiPsndocCtrtDao extends CrudDao<LdapmMpwHiPsndocCtrt> {
    int insert(LdapmMpwHiPsndocCtrt record);

    int insertSelective(LdapmMpwHiPsndocCtrt record);
}