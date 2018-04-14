package xyz.wongs.es.workflow.oa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;

import java.util.List;

/**
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiSpecificFormMapper extends CrudDao<AtiSpecificForm> {

    /**
     * 启动流程，批量插入个性表单数据
     * @param specificForms
     */
    public void insertSpecificForms(List<AtiSpecificForm> specificForms);
}