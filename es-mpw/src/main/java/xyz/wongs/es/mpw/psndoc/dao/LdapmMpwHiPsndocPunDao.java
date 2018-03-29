package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocPun;

@MyBatisDao
public interface LdapmMpwHiPsndocPunDao extends CrudDao<LdapmMpwHiPsndocPun> {
    int insert(LdapmMpwHiPsndocPun record);

    int insertSelective(LdapmMpwHiPsndocPun record);
}