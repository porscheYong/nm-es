package xyz.wongs.es.core.area.dao;

import xyz.wongs.es.common.persistence.TreeDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.core.area.entity.Location;

@MyBatisDao
public interface LocationDao  extends TreeDao<Location> {
}
