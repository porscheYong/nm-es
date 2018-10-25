package xyz.wongs.es.zbData.pay.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbData.pay.entity.JxOutsourceYearBonus;

/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 14:04 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxOutsourceYearBonusDao extends CrudDao<JxOutsourceYearBonus>{
    
    int insert(JxOutsourceYearBonus record);

    int insertSelective(JxOutsourceYearBonus record);
}