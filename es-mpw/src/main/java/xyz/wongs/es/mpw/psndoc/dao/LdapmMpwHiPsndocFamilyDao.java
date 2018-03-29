package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocFamily;

@MyBatisDao
public interface LdapmMpwHiPsndocFamilyDao extends CrudDao<LdapmMpwHiPsndocFamily> {
    int insert(LdapmMpwHiPsndocFamily record);

    int insertSelective(LdapmMpwHiPsndocFamily record);
}