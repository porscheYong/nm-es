package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef2;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef2Dao extends CrudDao<LdapmMpwHiPsndocGlbdef2> {
    int insert(LdapmMpwHiPsndocGlbdef2 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef2 record);
}