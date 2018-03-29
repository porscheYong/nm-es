package xyz.wongs.es.mpw.wa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPayroll;

@MyBatisDao
public interface LdapmMpwWaPayrollDao extends CrudDao<LdapmMpwWaPayroll> {
    int insert(LdapmMpwWaPayroll record);

    int insertSelective(LdapmMpwWaPayroll record);
}