package xyz.wongs.es.workflow.oa.entity;

import java.util.Date;

/**
 *
 * @author liuxiaodong
 * @date 2018/4/11
 */
public class AtiLeave extends AtiBaseForm {

    private static final long serialVersionUID = 1252320475849198244L;

    /** 个性表单标识  */
    private Long atiSpecificFormId;
    /** 流程分类标识  */
    private Long atiActCategoryId;


    /** 请假原因    */
    private String reason;
    /** 请假开始日期  */
    private Date startTime;
    /** 请假结束日期  */
    private Date endTime;
    /** 实际开始时间  */
    private Date realityStartTime;
    /** 实际结束时间  */
    private Date realityEndTime;
    /** 假种  */
    private String leaveType;
    /** 部门领导意见  */
    private String deptLeaderText;
    /** 人事意见    */
    private String hrText;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getRealityStartTime() {
        return realityStartTime;
    }

    public void setRealityStartTime(Date realityStartTime) {
        this.realityStartTime = realityStartTime;
    }

    public Date getRealityEndTime() {
        return realityEndTime;
    }

    public void setRealityEndTime(Date realityEndTime) {
        this.realityEndTime = realityEndTime;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getDeptLeaderText() {
        return deptLeaderText;
    }

    public void setDeptLeaderText(String deptLeaderText) {
        this.deptLeaderText = deptLeaderText;
    }

    public String getHrText() {
        return hrText;
    }

    public void setHrText(String hrText) {
        this.hrText = hrText;
    }
}
