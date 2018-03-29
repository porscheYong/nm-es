package xyz.wongs.es.mpw.cost.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.cost.entity.LdapmMpwWbPsnCostH;

@MyBatisDao
public interface LdapmMpwWbPsnCostHDao extends CrudDao<LdapmMpwWbPsnCostH> {
    int insert(LdapmMpwWbPsnCostH record);

    int insertSelective(LdapmMpwWbPsnCostH record);
}