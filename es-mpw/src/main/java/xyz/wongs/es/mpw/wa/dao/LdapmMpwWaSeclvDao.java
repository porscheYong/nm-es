package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaSeclv;

@MyBatisDao
public interface LdapmMpwWaSeclvDao extends CrudDao<LdapmMpwWaSeclv> {
    int insert(LdapmMpwWaSeclv record);

    int insertSelective(LdapmMpwWaSeclv record);
}