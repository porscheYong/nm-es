package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef8;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef8Dao extends CrudDao<LdapmMpwHiPsndocGlbdef8> {
    int insert(LdapmMpwHiPsndocGlbdef8 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef8 record);
}