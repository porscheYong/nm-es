package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef7;

@MyBatisDao
public interface LdapmMpwHiPsndocGlbdef7Dao extends CrudDao<LdapmMpwHiPsndocGlbdef7> {
    int insert(LdapmMpwHiPsndocGlbdef7 record);

    int insertSelective(LdapmMpwHiPsndocGlbdef7 record);
}