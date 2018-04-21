package xyz.wongs.es.workflow.oa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiLeave;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;

import java.util.List;
import java.util.Map;

/** 个性表单接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiSpecificFormMapper extends CrudDao<AtiSpecificForm> {

    /**
     * 启动流程，批量插入个性表单数据
     * @param specificForms
     */
    void insertSpecificForms(List<AtiSpecificForm> specificForms);

    /**
     * 审批环节添加部门经理意见
     * @param atiLeave
     */
    void updateDeptLeaderText(AtiLeave atiLeave);


    /**
     * 审批环节添加人事意见
     * @param atiLeave
     */
    void updateHrText(AtiLeave atiLeave);

    /**
     * 通过ati_base_form_id 获取虚拟对象leave
     * @param atiBaseFormId
     * @return
     */
    AtiLeave getAtiLeaveByBaseFormId(Long atiBaseFormId);
}