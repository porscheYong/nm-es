package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocRetire;

@MyBatisDao
public interface LdapmMpwHiPsndocRetireDao extends CrudDao<LdapmMpwHiPsndocRetire> {
    int insert(LdapmMpwHiPsndocRetire record);

    int insertSelective(LdapmMpwHiPsndocRetire record);
}