package xyz.wongs.es.workflow.modifystaffinfo.entity;

import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;

/**
 * 人员入职虚拟对象
 * @author liuxiaodong
 * @date 2018/5/22
 */
public class AtiStaffEntry extends AtiBaseForm {

    private static final long serialVersionUID = 1324670692443378845L;

    /** 个性表单标识  */
    private Long atiSpecificFormId;

    /** 流程分类标识  */
    private Long atiActCategoryId;

    private Long staffId;

    public Long getAtiSpecificFormId() {
        return atiSpecificFormId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public void setAtiSpecificFormId(Long atiSpecificFormId) {
        this.atiSpecificFormId = atiSpecificFormId;
    }

    public Long getAtiActCategoryId() {
        return atiActCategoryId;
    }

    public void setAtiActCategoryId(Long atiActCategoryId) {
        this.atiActCategoryId = atiActCategoryId;
    }

}
