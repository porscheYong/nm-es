package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaWaclass;

@MyBatisDao
public interface LdapmMpwWaWaclassDao extends CrudDao<LdapmMpwWaWaclass> {
    int insert(LdapmMpwWaWaclass record);

    int insertSelective(LdapmMpwWaWaclass record);
}