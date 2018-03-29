package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocLangabili;

@MyBatisDao
public interface LdapmMpwHiPsndocLangabiliDao extends CrudDao<LdapmMpwHiPsndocLangabili> {
    int insert(LdapmMpwHiPsndocLangabili record);

    int insertSelective(LdapmMpwHiPsndocLangabili record);
}