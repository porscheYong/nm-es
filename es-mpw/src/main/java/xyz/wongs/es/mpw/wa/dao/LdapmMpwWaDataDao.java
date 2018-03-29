package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaData;

@MyBatisDao
public interface LdapmMpwWaDataDao extends CrudDao<LdapmMpwWaData>{
    int insert(LdapmMpwWaData record);

    int insertSelective(LdapmMpwWaData record);
}