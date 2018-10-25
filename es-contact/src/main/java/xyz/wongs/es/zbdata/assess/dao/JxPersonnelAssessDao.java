package xyz.wongs.es.zbdata.assess.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.assess.entity.JxPersonnelAssess;

/**
 * @Author Wang Yiren
 * @Description //TODO 
 * @Date 17:04 2018/10/25
 * @Param 
 * @return 
 **/
@MyBatisDao
public interface JxPersonnelAssessDao extends CrudDao<JxPersonnelAssess>{
    
    int insert(JxPersonnelAssess record);

    int insertSelective(JxPersonnelAssess record);
}