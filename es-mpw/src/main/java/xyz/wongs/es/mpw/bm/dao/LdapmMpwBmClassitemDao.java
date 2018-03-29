package xyz.wongs.es.mpw.bm.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmClassitem;

@MyBatisDao
public interface LdapmMpwBmClassitemDao extends CrudDao<LdapmMpwBmClassitem> {
    int insert(LdapmMpwBmClassitem record);

    int insertSelective(LdapmMpwBmClassitem record);
}