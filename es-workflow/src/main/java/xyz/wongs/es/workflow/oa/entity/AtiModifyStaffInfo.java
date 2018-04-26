package xyz.wongs.es.workflow.oa.entity;

import xyz.wongs.es.workflow.user.entity.AtiUser;

/**
 * 修改人员信息Entity
 * @author liuxiaodong
 * @date 2018/4/26
 */
public class AtiModifyStaffInfo extends AtiBaseForm {

    private static final long serialVersionUID = -2758070507187266768L;

    /** 个性表单标识  */
    private Long atiSpecificFormId;
    /** 流程分类标识  */
    private Long atiActCategoryId;

    private AtiUser atiUser;

    private String newName;

    private String newPhone;

    private String newEmail;

    private String newPassword;

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

    public AtiUser getAtiUser() {
        return atiUser;
    }

    public void setAtiUser(AtiUser atiUser) {
        this.atiUser = atiUser;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getNewPhone() {
        return newPhone;
    }

    public void setNewPhone(String newPhone) {
        this.newPhone = newPhone;
    }

    public String getNewEmail() {
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
