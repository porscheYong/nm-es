package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaUnitctg;

@MyBatisDao
public interface LdapmMpwWaUnitctgDao extends CrudDao<LdapmMpwWaUnitctg> {
    int insert(LdapmMpwWaUnitctg record);

    int insertSelective(LdapmMpwWaUnitctg record);
}