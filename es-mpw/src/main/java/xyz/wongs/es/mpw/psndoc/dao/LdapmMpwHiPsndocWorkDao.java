package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocWork;

@MyBatisDao
public interface LdapmMpwHiPsndocWorkDao extends CrudDao<LdapmMpwHiPsndocWork> {
    int insert(LdapmMpwHiPsndocWork record);

    int insertSelective(LdapmMpwHiPsndocWork record);
}