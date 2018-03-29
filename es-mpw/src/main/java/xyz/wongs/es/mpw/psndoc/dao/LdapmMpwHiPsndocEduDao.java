package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocEdu;

@MyBatisDao
public interface LdapmMpwHiPsndocEduDao extends CrudDao<LdapmMpwHiPsndocEdu> {
    int insert(LdapmMpwHiPsndocEdu record);

    int insertSelective(LdapmMpwHiPsndocEdu record);
}