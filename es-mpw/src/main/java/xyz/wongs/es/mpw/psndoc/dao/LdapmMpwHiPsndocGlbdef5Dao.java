package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef5;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef5Dao extends CrudDao<LdapmMpwHiPsndocGlbdef5> {
    int insert(LdapmMpwHiPsndocGlbdef5 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef5 record);
}