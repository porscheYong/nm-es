package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaInludeclass;

@MyBatisDao
public interface LdapmMpwWaInludeclassDao extends CrudDao<LdapmMpwWaInludeclass> {
    int insert(LdapmMpwWaInludeclass record);

    int insertSelective(LdapmMpwWaInludeclass record);
}