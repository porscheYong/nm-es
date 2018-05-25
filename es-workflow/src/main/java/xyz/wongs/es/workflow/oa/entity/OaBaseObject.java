package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/25
 */
public class OaBaseObject extends AtiBaseForm implements Serializable {

    private static final long serialVersionUID = 8413354207023210707L;

    /** 个性表单标识  */
    private Long atiSpecificFormId;

    /** 流程分类标识  */
    private Long atiActCategoryId;

    /** 主键 */
    private Long primaryId;

    public Long getAtiSpecificFormId() {
        return atiSpecificFormId;
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

    public Long getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Long primaryId) {
        this.primaryId = primaryId;
    }
}
