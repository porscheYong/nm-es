package xyz.wongs.es.entity;

import xyz.wongs.es.common.persistence.ActEntity;

import java.io.Serializable;

/**通用配置表单Entity
 * @author liuxiaodong
 */
public class AtiBaseForm extends ActEntity<AtiBaseForm> implements Serializable {

    /** 表单标识 */
    private Long atiBaseFormId;
    /** 发起人ID */
    private Long formSender;
    /** 工单主题    */
    private Object formTheme;
    /** 表单内容    */
    private Object formContent;
    /**  流程定义ID  */
    private Object procDefId;
    /** 流程实例ID  */
    private String procInstId;
    /** 紧急程度    */
    private String urgent;
    /** 级别  */
    private String level;

    public Long getAtiBaseFormId() {
        return atiBaseFormId;
    }

    public void setAtiBaseFormId(Long atiBaseFormId) {
        this.atiBaseFormId = atiBaseFormId;
    }

    public Long getFormSender() {
        return formSender;
    }

    public void setFormSender(Long formSender) {
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

    public Object getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Object procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getUrgent() {
        return urgent;
    }

    public void setUrgent(String urgent) {
        this.urgent = urgent;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}