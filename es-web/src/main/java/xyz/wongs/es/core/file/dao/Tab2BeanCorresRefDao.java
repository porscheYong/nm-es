package xyz.wongs.es.core.file.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;

import java.util.List;


@MyBatisDao
public interface Tab2BeanCorresRefDao extends CrudDao<Tab2BeanCorresRef> {
    int deleteByPrimaryKey(String tableName);

    @Override
    int insert(Tab2BeanCorresRef record);

    int getCount();

    int insertSelective(Tab2BeanCorresRef record);

    Tab2BeanCorresRef selectByPrimaryKey(String tableName);

    List<Tab2BeanCorresRef> findNotExists(Tab2BeanCorresRef tab2BeanCorresRef);

    int updateByPrimaryKeySelective(Tab2BeanCorresRef record);

    int updateByPrimaryKey(Tab2BeanCorresRef record);

    Tab2BeanCorresRef findByEntityName(String entityName);
}