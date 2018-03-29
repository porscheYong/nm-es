package xyz.wongs.es.mpw.tel.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwTelJobAssignCorp extends DataEntity<LdapmMpwTelJobAssignCorp> {
    private Integer monthId;

    private String unitId;

    private String pkJobAssign;

    private String choose;

    private String operator;

    private String operateOrg;

    private String pkOrg;

    private String ownerOrg;

    private String pkOmJob;

    private String postcode;

    private String suporior;

    private String assignDate;

    private String revokeDate;

    private String pkPostseries;

    private Short assignStatus;

    private String def1;

    private String def2;

    private String def3;

    private String def4;

    private String def5;

    private String pkGroup;

    private String ts;

    private Short dr;

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getPkJobAssign() {
        return pkJobAssign;
    }

    public void setPkJobAssign(String pkJobAssign) {
        this.pkJobAssign = pkJobAssign == null ? null : pkJobAssign.trim();
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose == null ? null : choose.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperateOrg() {
        return operateOrg;
    }

    public void setOperateOrg(String operateOrg) {
        this.operateOrg = operateOrg == null ? null : operateOrg.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg == null ? null : ownerOrg.trim();
    }

    public String getPkOmJob() {
        return pkOmJob;
    }

    public void setPkOmJob(String pkOmJob) {
        this.pkOmJob = pkOmJob == null ? null : pkOmJob.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getSuporior() {
        return suporior;
    }

    public void setSuporior(String suporior) {
        this.suporior = suporior == null ? null : suporior.trim();
    }

    public String getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(String assignDate) {
        this.assignDate = assignDate == null ? null : assignDate.trim();
    }

    public String getRevokeDate() {
        return revokeDate;
    }

    public void setRevokeDate(String revokeDate) {
        this.revokeDate = revokeDate == null ? null : revokeDate.trim();
    }

    public String getPkPostseries() {
        return pkPostseries;
    }

    public void setPkPostseries(String pkPostseries) {
        this.pkPostseries = pkPostseries == null ? null : pkPostseries.trim();
    }

    public Short getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(Short assignStatus) {
        this.assignStatus = assignStatus;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Short getDr() {
        return dr;
    }

    public void setDr(Short dr) {
        this.dr = dr;
    }
}