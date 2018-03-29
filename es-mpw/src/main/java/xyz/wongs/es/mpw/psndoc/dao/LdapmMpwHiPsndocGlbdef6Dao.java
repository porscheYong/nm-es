package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef6;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef6Dao extends CrudDao<LdapmMpwHiPsndocGlbdef6> {
    int insert(LdapmMpwHiPsndocGlbdef6 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef6 record);
}