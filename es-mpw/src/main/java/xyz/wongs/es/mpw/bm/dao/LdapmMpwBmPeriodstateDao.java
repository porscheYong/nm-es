package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmPeriodstate;

@MyBatisDao
public interface LdapmMpwBmPeriodstateDao extends CrudDao<LdapmMpwBmPeriodstate> {
    int insert(LdapmMpwBmPeriodstate record);

    int insertSelective(LdapmMpwBmPeriodstate record);
}