package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmPeriod;

@MyBatisDao
public interface LdapmMpwBmPeriodDao extends CrudDao<LdapmMpwBmPeriod> {
    int insert(LdapmMpwBmPeriod record);

    int insertSelective(LdapmMpwBmPeriod record);
}