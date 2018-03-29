package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocAbroad;

@MyBatisDao
public interface LdapmMpwHiPsndocAbroadDao extends CrudDao<LdapmMpwHiPsndocAbroad> {
    int insert(LdapmMpwHiPsndocAbroad record);

    int insertSelective(LdapmMpwHiPsndocAbroad record);
}