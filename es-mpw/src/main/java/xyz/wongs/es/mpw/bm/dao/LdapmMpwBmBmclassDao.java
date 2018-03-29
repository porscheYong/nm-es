package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmData;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmBmclass;

@MyBatisDao
public interface LdapmMpwBmBmclassDao extends CrudDao<LdapmMpwBmBmclass> {
    int insert(LdapmMpwBmBmclass record);

    int insertSelective(LdapmMpwBmBmclass record);
}