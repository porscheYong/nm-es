package xyz.wongs.es.mpw.cost.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.cost.entity.LdapmMpwWbPsnCostB;

@MyBatisDao
public interface LdapmMpwWbPsnCostBDao extends CrudDao<LdapmMpwWbPsnCostB> {
    int insert(LdapmMpwWbPsnCostB record);

    int insertSelective(LdapmMpwWbPsnCostB record);
}