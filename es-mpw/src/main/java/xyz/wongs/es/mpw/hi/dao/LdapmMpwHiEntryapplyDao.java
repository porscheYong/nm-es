package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiEntryapply;

@MyBatisDao
public interface LdapmMpwHiEntryapplyDao extends CrudDao<LdapmMpwHiEntryapply>{
    int insert(LdapmMpwHiEntryapply ldapmMpwHiEntryapply);

    int insertSelective(LdapmMpwHiEntryapply ldapmMpwHiEntryapply);
}