package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPrmlv;

@MyBatisDao
public interface LdapmMpwWaPrmlvDao extends CrudDao<LdapmMpwWaPrmlv> {
    int insert(LdapmMpwWaPrmlv record);

    int insertSelective(LdapmMpwWaPrmlv record);
}