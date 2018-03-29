package xyz.wongs.es.mpw.org.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwOrgOrgs;

@MyBatisDao
public interface LdapmMpwOrgOrgsDao extends CrudDao<LdapmMpwOrgOrgs> {
    int insert(LdapmMpwOrgOrgs record);

    int insertSelective(LdapmMpwOrgOrgs record);
}