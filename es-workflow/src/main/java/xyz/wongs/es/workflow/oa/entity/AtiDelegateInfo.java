package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 委托信息Entity,维护委托关系
 * @author liuxiaodong
 */
public class AtiDelegateInfo implements Serializable {

    private static final long serialVersionUID = 4493630605009373286L;

    private Long atiDelegateInfoId;

    /** 代理人 */
    private Object attorney;

    /** 委托人，原办理人 */
    private Object assignee;

    private Date startTime;

    private Date endTime;

    private Object procDefId;

    private String delegateReason;

    private String status;

    public Long getAtiDelegateInfoId() {
        return atiDelegateInfoId;
    }

    public void setAtiDelegateInfoId(Long atiDelegateInfoId) {
        this.atiDelegateInfoId = atiDelegateInfoId;
    }

    public Object getAttorney() {
        return attorney;
    }

    public void setAttorney(Object attorney) {
        this.attorney = attorney;
    }

    public Object getAssignee() {
        return assignee;
    }

    public void setAssignee(Object assignee) {
        this.assignee = assignee;
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

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }

    public String getDelegateReason() {
        return delegateReason;
    }

    public void setDelegateReason(String delegateReason) {
        this.delegateReason = delegateReason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}