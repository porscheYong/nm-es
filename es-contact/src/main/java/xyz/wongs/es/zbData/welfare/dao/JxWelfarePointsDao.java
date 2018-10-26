package xyz.wongs.es.zbdata.welfare.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.welfare.entity.JxWelfarePoints;

/**
 * @Author Wang Yiren
 * @Description //TODO
 * @Date 16:56 2018/10/25
 * @Param
 * @return
 **/
@MyBatisDao
public interface JxWelfarePointsDao extends CrudDao<JxWelfarePoints>{

    int insert(JxWelfarePoints record);

    int insertSelective(JxWelfarePoints record);
}