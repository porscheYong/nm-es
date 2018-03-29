package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocTrial;

@MyBatisDao
public interface LdapmMpwHiPsndocTrialDao  extends CrudDao<LdapmMpwHiPsndocTrial> {
    int insert(LdapmMpwHiPsndocTrial record);

    int insertSelective(LdapmMpwHiPsndocTrial record);
}