package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocTrain;

@MyBatisDao
public interface LdapmMpwHiPsndocTrainDao extends CrudDao<LdapmMpwHiPsndocTrain> {
    int insert(LdapmMpwHiPsndocTrain record);

    int insertSelective(LdapmMpwHiPsndocTrain record);
}