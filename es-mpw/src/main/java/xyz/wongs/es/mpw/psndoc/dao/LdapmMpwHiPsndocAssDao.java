package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocAss;

@MyBatisDao
public interface LdapmMpwHiPsndocAssDao extends CrudDao<LdapmMpwHiPsndocAss> {
    int insert(LdapmMpwHiPsndocAss record);

    int insertSelective(LdapmMpwHiPsndocAss record);
}