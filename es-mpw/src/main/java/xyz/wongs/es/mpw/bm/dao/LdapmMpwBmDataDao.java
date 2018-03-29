package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmData;

@MyBatisDao
public interface LdapmMpwBmDataDao extends CrudDao<LdapmMpwBmData> {
    int insert(LdapmMpwBmData record);

    int insertSelective(LdapmMpwBmData record);
}