package xyz.wongs.es.workflow.oa.dao;

import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.ProcessDefinition;
import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiActCategory;

import java.util.List;
import java.util.Map;

/**
 * 流程分类 Dao
 * @author liuxiaodong
 * @date 2018/4/28
 */
@MyBatisDao
public interface AtiActCategoryDao extends CrudDao<AtiActCategory> {

    /**
     *
     * @param atiActCategoryId
     * @return
     */
    AtiActCategory getCategoryByCategoryId(Long atiActCategoryId);

    /**
     * 查找所有分类
     * @return
     */
    List<AtiActCategory> findAllCategory();


    List<Map<String,Object>> getProcessDefinitionByCategoryId(String category);

}
