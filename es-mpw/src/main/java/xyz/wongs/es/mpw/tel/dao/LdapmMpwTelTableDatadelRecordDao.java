package xyz.wongs.es.mpw.tel.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.tel.entity.LdapmMpwTelTableDatadelRecord;

@MyBatisDao
public interface LdapmMpwTelTableDatadelRecordDao extends CrudDao<LdapmMpwTelTableDatadelRecord>{
    int insert(LdapmMpwTelTableDatadelRecord record);

    int insertSelective(LdapmMpwTelTableDatadelRecord record);
}