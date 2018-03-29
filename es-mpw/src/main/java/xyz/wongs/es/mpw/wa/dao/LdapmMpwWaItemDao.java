package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaItem;

@MyBatisDao
public interface LdapmMpwWaItemDao extends CrudDao<LdapmMpwWaItem> {
    int insert(LdapmMpwWaItem record);

    int insertSelective(LdapmMpwWaItem record);
}