package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaTaxgroup;

@MyBatisDao
public interface LdapmMpwWaTaxgroupDao extends CrudDao<LdapmMpwWaTaxgroup> {
    int insert(LdapmMpwWaTaxgroup record);

    int insertSelective(LdapmMpwWaTaxgroup record);
}