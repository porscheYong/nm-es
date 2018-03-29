package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPeriod;

@MyBatisDao
public interface LdapmMpwWaPeriodDao extends CrudDao<LdapmMpwWaPeriod> {
    int insert(LdapmMpwWaPeriod record);

    int insertSelective(LdapmMpwWaPeriod record);
}