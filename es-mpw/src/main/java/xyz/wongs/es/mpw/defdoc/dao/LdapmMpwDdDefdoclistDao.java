package xyz.wongs.es.mpw.defdoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwBdDefdoc;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwDdDefdoclist;

import java.util.List;

@MyBatisDao
public interface LdapmMpwDdDefdoclistDao extends CrudDao<LdapmMpwDdDefdoclist> {

    int insert(LdapmMpwDdDefdoclist record);

    int insertSelective(LdapmMpwDdDefdoclist record);

    int insertBatch(List<LdapmMpwDdDefdoclist> list);
}