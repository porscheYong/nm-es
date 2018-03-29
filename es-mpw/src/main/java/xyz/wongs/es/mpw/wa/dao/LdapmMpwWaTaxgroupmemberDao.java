package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaTaxgroupmember;

@MyBatisDao
public interface LdapmMpwWaTaxgroupmemberDao extends CrudDao<LdapmMpwWaTaxgroupmember> {
    int insert(LdapmMpwWaTaxgroupmember record);

    int insertSelective(LdapmMpwWaTaxgroupmember record);
}