package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocEnc;

@MyBatisDao
public interface LdapmMpwHiPsndocEncDao extends CrudDao<LdapmMpwHiPsndocEnc> {
    int insert(LdapmMpwHiPsndocEnc record);

    int insertSelective(LdapmMpwHiPsndocEnc record);
}