package xyz.wongs.es.zbData.pay.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbData.pay.entity.JxOutsourceMonthWages;

/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 13:57 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxOutsourceMonthWagesDao extends CrudDao<JxOutsourceMonthWages>{
    
    int insert(JxOutsourceMonthWages record);

    int insertSelective(JxOutsourceMonthWages record);
}