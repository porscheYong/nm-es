package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocWadoc;

@MyBatisDao
public interface LdapmMpwHiPsndocWadocDao extends CrudDao<LdapmMpwHiPsndocWadoc> {
    int insert(LdapmMpwHiPsndocWadoc record);

    int insertSelective(LdapmMpwHiPsndocWadoc record);
}