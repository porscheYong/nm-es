package xyz.wongs.es.zbdata.contract.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.contract.entity.JxSalaryContractMonth;

/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 16:49 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxSalaryContractMonthDao extends CrudDao<JxSalaryContractMonth>{
    
    int insert(JxSalaryContractMonth record);

    int insertSelective(JxSalaryContractMonth record);
}