package xyz.wongs.es.zbdata.welfare.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbdata.welfare.entity.JxWelfareProduct;

/**
 * @Author Wang Yiren
 * @Description //TODO
 * @Date 16:57 2018/10/25
 * @Param
 * @return
 **/
@MyBatisDao
public interface JxWelfareProductDao extends CrudDao<JxWelfareProduct>{

    int insert(JxWelfareProduct record);

    int insertSelective(JxWelfareProduct record);
}