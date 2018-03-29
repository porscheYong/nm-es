package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiExchangeapply;

@MyBatisDao
public interface LdapmMpwHiExchangeapplyDao extends CrudDao<LdapmMpwHiExchangeapply> {
    int insert(LdapmMpwHiExchangeapply ldapmMpwHiExchangeapply);

    int insertSelective(LdapmMpwHiExchangeapply ldapmMpwHiExchangeapply);
}