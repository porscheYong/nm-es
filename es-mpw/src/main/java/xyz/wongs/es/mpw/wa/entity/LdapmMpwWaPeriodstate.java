package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaPeriodstate extends DataEntity<LdapmMpwWaPeriodstate> {
    private Integer monthId;

    private String unitId;

    private String pkPeriodstate;

    private String pkWaClass;

    private String pkWaPeriod;

    private String checkflag;

    private String enableflag;

    private String caculateflag;

    private String payoffflag;

    private String accountmark;

    private String operatorid;

    private String daccdate;

    private String vpaycomment;

    private String cpaydate;

    private String cpreclassid;

    private String isapproved;

    private String pkGroup;

    private String pkOrg;

    private BigDecimal classtype;

    private String ts;

    private Long dr;

    private String syncempflag;


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

    public String getPkPeriodstate() {
        return pkPeriodstate;
    }

    public void setPkPeriodstate(String pkPeriodstate) {
        this.pkPeriodstate = pkPeriodstate == null ? null : pkPeriodstate.trim();
    }

    public String getPkWaClass() {
        return pkWaClass;
    }

    public void setPkWaClass(String pkWaClass) {
        this.pkWaClass = pkWaClass == null ? null : pkWaClass.trim();
    }

    public String getPkWaPeriod() {
        return pkWaPeriod;
    }

    public void setPkWaPeriod(String pkWaPeriod) {
        this.pkWaPeriod = pkWaPeriod == null ? null : pkWaPeriod.trim();
    }

    public String getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag == null ? null : checkflag.trim();
    }

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public String getCaculateflag() {
        return caculateflag;
    }

    public void setCaculateflag(String caculateflag) {
        this.caculateflag = caculateflag == null ? null : caculateflag.trim();
    }

    public String getPayoffflag() {
        return payoffflag;
    }

    public void setPayoffflag(String payoffflag) {
        this.payoffflag = payoffflag == null ? null : payoffflag.trim();
    }

    public String getAccountmark() {
        return accountmark;
    }

    public void setAccountmark(String accountmark) {
        this.accountmark = accountmark == null ? null : accountmark.trim();
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid == null ? null : operatorid.trim();
    }

    public String getDaccdate() {
        return daccdate;
    }

    public void setDaccdate(String daccdate) {
        this.daccdate = daccdate == null ? null : daccdate.trim();
    }

    public String getVpaycomment() {
        return vpaycomment;
    }

    public void setVpaycomment(String vpaycomment) {
        this.vpaycomment = vpaycomment == null ? null : vpaycomment.trim();
    }

    public String getCpaydate() {
        return cpaydate;
    }

    public void setCpaydate(String cpaydate) {
        this.cpaydate = cpaydate == null ? null : cpaydate.trim();
    }

    public String getCpreclassid() {
        return cpreclassid;
    }

    public void setCpreclassid(String cpreclassid) {
        this.cpreclassid = cpreclassid == null ? null : cpreclassid.trim();
    }

    public String getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(String isapproved) {
        this.isapproved = isapproved == null ? null : isapproved.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public BigDecimal getClasstype() {
        return classtype;
    }

    public void setClasstype(BigDecimal classtype) {
        this.classtype = classtype;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getSyncempflag() {
        return syncempflag;
    }

    public void setSyncempflag(String syncempflag) {
        this.syncempflag = syncempflag;
    }
}