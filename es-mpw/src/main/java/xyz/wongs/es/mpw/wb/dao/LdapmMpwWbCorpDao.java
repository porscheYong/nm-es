package xyz.wongs.es.mpw.wb.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wb.entity.LdapmMpwWbCorp;

@MyBatisDao
public interface LdapmMpwWbCorpDao extends CrudDao<LdapmMpwWbCorp> {
    int insert(LdapmMpwWbCorp record);

    int insertSelective(LdapmMpwWbCorp record);
}