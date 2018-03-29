package xyz.wongs.es.mpw.bm.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwBmPeriodstate extends DataEntity<LdapmMpwBmPeriodstate> {
    private Integer monthId;

    private String unitId;

    private String pkPeriodstate;

    private String pkBmClass;

    private String pkBmPeriod;

    private String recacuflag;

    private String checkflag;

    private String accountmark;

    private String operatorid;

    private String daccountdate;

    private String pkGroup;

    private String pkOrg;

    private String enableflag;

    private String isapproved;

    private String ts;

    private Long dr;


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

    public String getPkBmClass() {
        return pkBmClass;
    }

    public void setPkBmClass(String pkBmClass) {
        this.pkBmClass = pkBmClass == null ? null : pkBmClass.trim();
    }

    public String getPkBmPeriod() {
        return pkBmPeriod;
    }

    public void setPkBmPeriod(String pkBmPeriod) {
        this.pkBmPeriod = pkBmPeriod == null ? null : pkBmPeriod.trim();
    }

    public String getRecacuflag() {
        return recacuflag;
    }

    public void setRecacuflag(String recacuflag) {
        this.recacuflag = recacuflag == null ? null : recacuflag.trim();
    }

    public String getCheckflag() {
        return checkflag;
    }

    public void setCheckflag(String checkflag) {
        this.checkflag = checkflag == null ? null : checkflag.trim();
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

    public String getDaccountdate() {
        return daccountdate;
    }

    public void setDaccountdate(String daccountdate) {
        this.daccountdate = daccountdate == null ? null : daccountdate.trim();
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

    public String getEnableflag() {
        return enableflag;
    }

    public void setEnableflag(String enableflag) {
        this.enableflag = enableflag == null ? null : enableflag.trim();
    }

    public String getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(String isapproved) {
        this.isapproved = isapproved == null ? null : isapproved.trim();
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


}