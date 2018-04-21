package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 委托历史 Entity
 * @author liuxiaodong
 */
public class AtiDelegateHistory implements Serializable {

    private static final long serialVersionUID = -1899047480041891719L;

    private Long atiDelegateHistoryId;

    private Object attorney;

    private Object assignee;

    private Date delegateTime;

    private Object procInstId;

    private Object taskId;

    private Object taskDefKey;

    private Object reason;

    private String status;

    public AtiDelegateHistory() {
    }

    public AtiDelegateHistory(Object attorney, Object assignee, Date delegateTime, Object procInstId, Object taskId, Object taskDefKey, Object reason, String status) {
        this.attorney = attorney;
        this.assignee = assignee;
        this.delegateTime = delegateTime;
        this.procInstId = procInstId;
        this.taskId = taskId;
        this.taskDefKey = taskDefKey;
        this.reason = reason;
        this.status = status;
    }

    public Long getAtiDelegateHistoryId() {
        return atiDelegateHistoryId;
    }

    public void setAtiDelegateHistoryId(Long atiDelegateHistoryId) {
        this.atiDelegateHistoryId = atiDelegateHistoryId;
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

    public Date getDelegateTime() {
        return delegateTime;
    }

    public void setDelegateTime(Date delegateTime) {
        this.delegateTime = delegateTime;
    }

    public Object getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Object procInstId) {
        this.procInstId = procInstId;
    }

    public Object getTaskId() {
        return taskId;
    }

    public void setTaskId(Object taskId) {
        this.taskId = taskId;
    }

    public Object getTaskDefKey() {
        return taskDefKey;
    }

    public void setTaskDefKey(Object taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}