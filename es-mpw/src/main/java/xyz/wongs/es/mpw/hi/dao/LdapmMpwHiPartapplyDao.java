package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiPartapply;

@MyBatisDao
public interface LdapmMpwHiPartapplyDao extends CrudDao<LdapmMpwHiPartapply> {
    int insert(LdapmMpwHiPartapply ldapmMpwHiPartapply);

    int insertSelective(LdapmMpwHiPartapply ldapmMpwHiPartapply);
}