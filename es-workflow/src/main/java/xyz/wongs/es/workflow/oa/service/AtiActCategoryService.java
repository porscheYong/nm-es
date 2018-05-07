package xyz.wongs.es.workflow.oa.service;

import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.ProcessDefinition;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.modules.cms.entity.Category;
import xyz.wongs.es.workflow.oa.dao.AtiActCategoryDao;
import xyz.wongs.es.workflow.oa.entity.AtiActCategory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/2
 */
@Service
public class AtiActCategoryService {

    @Resource
    private AtiActCategoryDao atiActCategoryDao;

    public List<AtiActCategory> findAllCategory() {
        return atiActCategoryDao.findAllCategory();
    }

    /**
     * 流程分类树模型的路径
     * @param list
     * @param category
     * @return
     */
    public String getCategoryPids(List<AtiActCategory> list,AtiActCategory category) {

        if(category.getParentCategoryId() == null) {
            return "0";
        }

        AtiActCategory parentCategory = null;
        for(AtiActCategory c : list) {
            if(c.getAtiActCategoryId().equals(category.getParentCategoryId())) {
                parentCategory = c;
            }
            break;
        }
        if(parentCategory == null) {
            return null;
        }

        return getCategoryPids(list,parentCategory) + "," + category.getAtiActCategoryId();

    }

    public List<Map<String,Object>> getProcessDefinitionByCategoryId(String atiActCategoryId) {
        return atiActCategoryDao.getProcessDefinitionByCategoryId(atiActCategoryId);
    }

}
