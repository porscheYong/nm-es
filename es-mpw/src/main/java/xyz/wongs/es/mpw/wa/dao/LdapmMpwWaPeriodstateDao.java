package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPeriodstate;

@MyBatisDao
public interface LdapmMpwWaPeriodstateDao extends CrudDao<LdapmMpwWaPeriodstate> {
    int insert(LdapmMpwWaPeriodstate record);

    int insertSelective(LdapmMpwWaPeriodstate record);
}