package xyz.wongs.es.mpw.org.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwOrgDept;

@MyBatisDao
public interface LdapmMpwOrgDeptDao extends CrudDao<LdapmMpwOrgDept> {
    int insert(LdapmMpwOrgDept record);

    int insertSelective(LdapmMpwOrgDept record);
}