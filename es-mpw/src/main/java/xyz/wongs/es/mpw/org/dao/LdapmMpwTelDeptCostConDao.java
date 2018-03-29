package xyz.wongs.es.mpw.org.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelDeptCostCon;

@MyBatisDao
public interface LdapmMpwTelDeptCostConDao extends CrudDao<LdapmMpwTelDeptCostCon> {
    int insert(LdapmMpwTelDeptCostCon record);

    int insertSelective(LdapmMpwTelDeptCostCon record);
}