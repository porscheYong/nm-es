package xyz.wongs.es.mpw.org.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelSyncCostcenter;

@MyBatisDao
public interface LdapmMpwTelSyncCostcenterDao extends CrudDao<LdapmMpwTelSyncCostcenter> {
    int insert(LdapmMpwTelSyncCostcenter record);

    int insertSelective(LdapmMpwTelSyncCostcenter record);
}