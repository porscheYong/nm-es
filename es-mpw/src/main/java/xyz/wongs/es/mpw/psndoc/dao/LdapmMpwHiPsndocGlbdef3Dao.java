package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef3;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef3Dao extends CrudDao<LdapmMpwHiPsndocGlbdef3> {
    int insert(LdapmMpwHiPsndocGlbdef3 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef3 record);
}