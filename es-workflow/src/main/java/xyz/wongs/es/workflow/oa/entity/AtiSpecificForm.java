package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;

public class AtiSpecificForm implements Serializable {

    private static final long serialVersionUID = -2483434549160419476L;

    private Long atiSpecificFormId;

    private Long atiBaseFormId;

    private Long atiActCategoryId;

    private String parameter;

    private String paramValue;

    public AtiSpecificForm() {
    }

    public AtiSpecificForm(Long atiBaseFormId, String parameter, String paramValue) {
        this.atiBaseFormId = atiBaseFormId;
        this.parameter = parameter;
        this.paramValue = paramValue;
    }

    public Long getAtiSpecificFormId() {
        return atiSpecificFormId;
    }

    public void setAtiSpecificFormId(Long atiSpecificFormId) {
        this.atiSpecificFormId = atiSpecificFormId;
    }

    public Long getAtiBaseFormId() {
        return atiBaseFormId;
    }

    public void setAtiBaseFormId(Long atiBaseFormId) {
        this.atiBaseFormId = atiBaseFormId;
    }

    public Long getAtiActCategoryId() {
        return atiActCategoryId;
    }

    public void setAtiActCategoryId(Long atiActCategoryId) {
        this.atiActCategoryId = atiActCategoryId;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}