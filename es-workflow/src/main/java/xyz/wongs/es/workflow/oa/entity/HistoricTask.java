package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 调用接口传有限个值
 * 避免数据传输过多消耗资源宽带
 *
 * @author liuxiaodong
 * @date 2018/5/30
 */
public class HistoricTask implements Serializable {

    private static final long serialVersionUID = 8727926125359311107L;

    private String processInstanceId;

    private String processDefinitionId;

    private Date startTime;

    private Date endTime;

    private Long durationInMillis;

    /**
     * taskDefName
     */
    private String name;


    private String assignee;

    private String procDefName;

    private String formSender;

    private Object formTheme;

    private Object formContent;

    private Long atiCategoryId;

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
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

    public Long getDurationInMillis() {
        return durationInMillis;
    }

    public void setDurationInMillis(Long durationInMillis) {
        this.durationInMillis = durationInMillis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProcDefName() {
        return procDefName;
    }

    public void setProcDefName(String procDefName) {
        this.procDefName = procDefName;
    }

    public String getFormSender() {
        return formSender;
    }

    public void setFormSender(String formSender) {
        this.formSender = formSender;
    }

    public Object getFormTheme() {
        return formTheme;
    }

    public void setFormTheme(Object formTheme) {
        this.formTheme = formTheme;
    }

    public Object getFormContent() {
        return formContent;
    }

    public void setFormContent(Object formContent) {
        this.formContent = formContent;
    }

    public Long getAtiCategoryId() {
        return atiCategoryId;
    }

    public void setAtiCategoryId(Long atiCategoryId) {
        this.atiCategoryId = atiCategoryId;
    }
}
