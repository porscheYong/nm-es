package xyz.wongs.es.zbdata.contract.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.contract.entity.JxSalaryContractYear;

/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 16:53 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxSalaryContractYearDao extends CrudDao<JxSalaryContractYear>{
    
    int insert(JxSalaryContractYear record);

    int insertSelective(JxSalaryContractYear record);
}