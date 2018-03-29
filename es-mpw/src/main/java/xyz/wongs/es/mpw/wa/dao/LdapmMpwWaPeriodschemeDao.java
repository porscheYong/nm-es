package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPeriodscheme;

@MyBatisDao
public interface LdapmMpwWaPeriodschemeDao extends CrudDao<LdapmMpwWaPeriodscheme> {
    int insert(LdapmMpwWaPeriodscheme record);

    int insertSelective(LdapmMpwWaPeriodscheme record);
}