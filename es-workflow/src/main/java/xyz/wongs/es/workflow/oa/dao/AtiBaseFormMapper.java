package xyz.wongs.es.workflow.oa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;

/**
 * 通用表单接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiBaseFormMapper extends CrudDao<AtiBaseForm> {

    /**
     * 获取当前通用表单标识，目的是与通用表名组成businessKey
     * @return
     */
    public Long getCurrentBaseFormId();

    /**
     * 更新基础表单流程实例ID
     * @param atiBaseForm
     */
    public void updateProcInstID(AtiBaseForm atiBaseForm);
}