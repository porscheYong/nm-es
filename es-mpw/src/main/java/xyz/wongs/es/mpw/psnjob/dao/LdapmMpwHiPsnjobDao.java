package xyz.wongs.es.mpw.psnjob.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psnjob.entity.LdapmMpwHiPsnjob;

@MyBatisDao
public interface LdapmMpwHiPsnjobDao extends CrudDao<LdapmMpwHiPsnjob> {
    int insert(LdapmMpwHiPsnjob record);

    int insertSelective(LdapmMpwHiPsnjob record);
}