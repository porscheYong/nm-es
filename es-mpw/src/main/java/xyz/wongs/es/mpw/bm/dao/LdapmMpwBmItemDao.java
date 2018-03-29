package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmItem;

@MyBatisDao
public interface LdapmMpwBmItemDao extends CrudDao<LdapmMpwBmItem> {
    int insert(LdapmMpwBmItem record);

    int insertSelective(LdapmMpwBmItem record);
}