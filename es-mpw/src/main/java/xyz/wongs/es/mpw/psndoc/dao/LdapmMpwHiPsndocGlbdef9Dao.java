package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef9;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef9Dao extends CrudDao<LdapmMpwHiPsndocGlbdef9> {
    int insert(LdapmMpwHiPsndocGlbdef9 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef9 record);
}