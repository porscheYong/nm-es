package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiStapply;

@MyBatisDao
public interface LdapmMpwHiStapplyDao extends CrudDao<LdapmMpwHiStapply> {
    int insert(LdapmMpwHiStapply ldapmMpwHiStapply);

    int insertSelective(LdapmMpwHiStapply ldapmMpwHiStapply);
}