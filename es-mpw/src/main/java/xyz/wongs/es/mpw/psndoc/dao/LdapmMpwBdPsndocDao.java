package xyz.wongs.es.mpw.psndoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwBdPsndoc;

import java.util.List;

@MyBatisDao
public interface LdapmMpwBdPsndocDao extends CrudDao<LdapmMpwBdPsndoc> {

    int insert(LdapmMpwBdPsndoc record);

    int insertSelective(LdapmMpwBdPsndoc record);

    @Override
    int insertBatch(List<LdapmMpwBdPsndoc> list);
}