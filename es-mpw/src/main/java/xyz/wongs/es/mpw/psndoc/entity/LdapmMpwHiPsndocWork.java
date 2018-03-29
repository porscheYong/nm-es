package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocWork extends DataEntity<LdapmMpwHiPsndocWork> {
    private Integer monthId;

    private String unitId;

    private String begindate;

    private String bgCheck;

    private String certifier;

    private String certiphone;

    private String creationtime;

    private String creator;

    private String dimissionReason;

    private Long dr;

    private String enddate;

    private String glbdef1;

    private String glbdef2;

    private String lastflag;

    private String linkphone;

    private String memo;

    private String modifiedtime;

    private String modifier;

    private String pkGroup;

    private String pkOrg;

    private String pkPsndoc;

    private String pkPsndocSub;

    private String pkPsnjob;

    private String pkPsnorg;

    private BigDecimal recordnum;

    private String ts;

    private String workAddr;

    private String workachive;

    private String workcorp;

    private String workdept;

    private String workduty;

    private String workjob;

    private String workpost;

    private String glbdef3;

    private String glbdef4;

    private String glbdef5;



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

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getBgCheck() {
        return bgCheck;
    }

    public void setBgCheck(String bgCheck) {
        this.bgCheck = bgCheck == null ? null : bgCheck.trim();
    }

    public String getCertifier() {
        return certifier;
    }

    public void setCertifier(String certifier) {
        this.certifier = certifier == null ? null : certifier.trim();
    }

    public String getCertiphone() {
        return certiphone;
    }

    public void setCertiphone(String certiphone) {
        this.certiphone = certiphone == null ? null : certiphone.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getDimissionReason() {
        return dimissionReason;
    }

    public void setDimissionReason(String dimissionReason) {
        this.dimissionReason = dimissionReason == null ? null : dimissionReason.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getGlbdef1() {
        return glbdef1;
    }

    public void setGlbdef1(String glbdef1) {
        this.glbdef1 = glbdef1 == null ? null : glbdef1.trim();
    }

    public String getGlbdef2() {
        return glbdef2;
    }

    public void setGlbdef2(String glbdef2) {
        this.glbdef2 = glbdef2 == null ? null : glbdef2.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public String getPkPsndocSub() {
        return pkPsndocSub;
    }

    public void setPkPsndocSub(String pkPsndocSub) {
        this.pkPsndocSub = pkPsndocSub == null ? null : pkPsndocSub.trim();
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

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr == null ? null : workAddr.trim();
    }

    public String getWorkachive() {
        return workachive;
    }

    public void setWorkachive(String workachive) {
        this.workachive = workachive == null ? null : workachive.trim();
    }

    public String getWorkcorp() {
        return workcorp;
    }

    public void setWorkcorp(String workcorp) {
        this.workcorp = workcorp == null ? null : workcorp.trim();
    }

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept == null ? null : workdept.trim();
    }

    public String getWorkduty() {
        return workduty;
    }

    public void setWorkduty(String workduty) {
        this.workduty = workduty == null ? null : workduty.trim();
    }

    public String getWorkjob() {
        return workjob;
    }

    public void setWorkjob(String workjob) {
        this.workjob = workjob == null ? null : workjob.trim();
    }

    public String getWorkpost() {
        return workpost;
    }

    public void setWorkpost(String workpost) {
        this.workpost = workpost == null ? null : workpost.trim();
    }

    public String getGlbdef3() {
        return glbdef3;
    }

    public void setGlbdef3(String glbdef3) {
        this.glbdef3 = glbdef3 == null ? null : glbdef3.trim();
    }

    public String getGlbdef4() {
        return glbdef4;
    }

    public void setGlbdef4(String glbdef4) {
        this.glbdef4 = glbdef4 == null ? null : glbdef4.trim();
    }

    public String getGlbdef5() {
        return glbdef5;
    }

    public void setGlbdef5(String glbdef5) {
        this.glbdef5 = glbdef5 == null ? null : glbdef5.trim();
    }
}