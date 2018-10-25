package xyz.wongs.es.zbdata.pay.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.pay.entity.JxOutsourceInsurance;
/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 14:04 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxOutsourceInsuranceDao extends CrudDao<JxOutsourceInsurance> {
    
    int insert(JxOutsourceInsurance record);

    int insertSelective(JxOutsourceInsurance record);
}