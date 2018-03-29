package xyz.wongs.es.mpw.tel.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.tel.entity.LdapmMpwTelJobAssignCorp;

@MyBatisDao
public interface LdapmMpwTelJobAssignCorpDao extends CrudDao<LdapmMpwTelJobAssignCorp>{
    int insert(LdapmMpwTelJobAssignCorp corp);

    int insertSelective(LdapmMpwTelJobAssignCorp corp);
}