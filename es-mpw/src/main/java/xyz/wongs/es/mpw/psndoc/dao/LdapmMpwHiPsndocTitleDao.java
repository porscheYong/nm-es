package xyz.wongs.es.mpw.psndoc.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocTitle;

@MyBatisDao
public interface LdapmMpwHiPsndocTitleDao extends CrudDao<LdapmMpwHiPsndocTitle> {
    int insert(LdapmMpwHiPsndocTitle record);

    int insertSelective(LdapmMpwHiPsndocTitle record);
}