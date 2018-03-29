package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHrTrnstype;

@MyBatisDao
public interface LdapmMpwHrTrnstypeDao extends CrudDao<LdapmMpwHrTrnstype> {
    int insert(LdapmMpwHrTrnstype ldapmMpwHrTrnstype);

    int insertSelective(LdapmMpwHrTrnstype ldapmMpwHrTrnstype);
}