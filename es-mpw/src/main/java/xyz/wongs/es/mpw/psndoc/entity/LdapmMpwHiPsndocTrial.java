package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocTrial extends DataEntity<LdapmMpwHiPsndocTrial>{
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String creator;

    private String endflag;

    private BigDecimal assgid;

    private BigDecimal trialType;

    private BigDecimal recordnum;

    private String enddate;

    private String modifiedtime;

    private String pkGroup;

    private String memo;

    private BigDecimal trialresult;

    private String modifier;

    private String creationtime;

    private String begindate;

    private String pkHrorg;

    private String regulardate;

    private String pkPsndoc;

    private Long dr;

    private String ts;

    private String pkOrg;

    private String pkPsnjob;

    private String pkPsnorg;

    private String lastflag;

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

    public String getPkPsndocSub() {
        return pkPsndocSub;
    }

    public void setPkPsndocSub(String pkPsndocSub) {
        this.pkPsndocSub = pkPsndocSub == null ? null : pkPsndocSub.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getEndflag() {
        return endflag;
    }

    public void setEndflag(String endflag) {
        this.endflag = endflag == null ? null : endflag.trim();
    }

    public BigDecimal getAssgid() {
        return assgid;
    }

    public void setAssgid(BigDecimal assgid) {
        this.assgid = assgid;
    }

    public BigDecimal getTrialType() {
        return trialType;
    }

    public void setTrialType(BigDecimal trialType) {
        this.trialType = trialType;
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public BigDecimal getTrialresult() {
        return trialresult;
    }

    public void setTrialresult(BigDecimal trialresult) {
        this.trialresult = trialresult;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getPkHrorg() {
        return pkHrorg;
    }

    public void setPkHrorg(String pkHrorg) {
        this.pkHrorg = pkHrorg == null ? null : pkHrorg.trim();
    }

    public String getRegulardate() {
        return regulardate;
    }

    public void setRegulardate(String regulardate) {
        this.regulardate = regulardate == null ? null : regulardate.trim();
    }

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkPsnjob() {
        return pkPsnjob;
    }

    public void setPkPsnjob(String pkPsnjob) {
        this.pkPsnjob = pkPsnjob == null ? null : pkPsnjob.trim();
    }

    public String getPkPsnorg() {
        return pkPsnorg;
    }

    public void setPkPsnorg(String pkPsnorg) {
        this.pkPsnorg = pkPsnorg == null ? null : pkPsnorg.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }
}