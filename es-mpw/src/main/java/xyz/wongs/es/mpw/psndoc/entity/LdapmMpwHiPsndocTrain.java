package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocTrain extends DataEntity<LdapmMpwHiPsndocTrain> {
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String trmLocation;

    private String glbdef6;

    private String traim;

    private String traResult;

    private String actName;

    private String glbdef5;

    private String traType;

    private String memo;

    private String trmCertifCode;

    private String certificateUnit;

    private String trmCertifName;

    private String glbdef4;

    private String traMode;

    private BigDecimal traTime;

    private String begindate;

    private String traContent;

    private BigDecimal traCost;

    private String enddate;

    private String pkPsndoc;

    private BigDecimal absenceCount;

    private String actCode;

    private String actName2;

    private String actName3;

    private String actName4;

    private String actName5;

    private String actName6;

    private String assOption;

    private BigDecimal assResult;

    private String assistUnit;

    private String certificateDate;

    private String contcode;

    private String creationtime;

    private String creator;

    private Long dr;

    private String entrepreneur;

    private String isallduty;

    private String lastflag;

    private String modifiedtime;

    private String modifier;

    private String pkAct;

    private String pkGroup;

    private String pkOrg;

    private String pkPsnjob;

    private String pkPsnorg;

    private String purveyor;

    private BigDecimal recordnum;

    private String signonDt;

    private BigDecimal sourceType;

    private BigDecimal taketrmMethod;

    private String ts;

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

    public String getTrmLocation() {
        return trmLocation;
    }

    public void setTrmLocation(String trmLocation) {
        this.trmLocation = trmLocation == null ? null : trmLocation.trim();
    }

    public String getGlbdef6() {
        return glbdef6;
    }

    public void setGlbdef6(String glbdef6) {
        this.glbdef6 = glbdef6 == null ? null : glbdef6.trim();
    }

    public String getTraim() {
        return traim;
    }

    public void setTraim(String traim) {
        this.traim = traim == null ? null : traim.trim();
    }

    public String getTraResult() {
        return traResult;
    }

    public void setTraResult(String traResult) {
        this.traResult = traResult == null ? null : traResult.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public String getGlbdef5() {
        return glbdef5;
    }

    public void setGlbdef5(String glbdef5) {
        this.glbdef5 = glbdef5 == null ? null : glbdef5.trim();
    }

    public String getTraType() {
        return traType;
    }

    public void setTraType(String traType) {
        this.traType = traType == null ? null : traType.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getTrmCertifCode() {
        return trmCertifCode;
    }

    public void setTrmCertifCode(String trmCertifCode) {
        this.trmCertifCode = trmCertifCode == null ? null : trmCertifCode.trim();
    }

    public String getCertificateUnit() {
        return certificateUnit;
    }

    public void setCertificateUnit(String certificateUnit) {
        this.certificateUnit = certificateUnit == null ? null : certificateUnit.trim();
    }

    public String getTrmCertifName() {
        return trmCertifName;
    }

    public void setTrmCertifName(String trmCertifName) {
        this.trmCertifName = trmCertifName == null ? null : trmCertifName.trim();
    }

    public String getGlbdef4() {
        return glbdef4;
    }

    public void setGlbdef4(String glbdef4) {
        this.glbdef4 = glbdef4 == null ? null : glbdef4.trim();
    }

    public String getTraMode() {
        return traMode;
    }

    public void setTraMode(String traMode) {
        this.traMode = traMode == null ? null : traMode.trim();
    }

    public BigDecimal getTraTime() {
        return traTime;
    }

    public void setTraTime(BigDecimal traTime) {
        this.traTime = traTime;
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getTraContent() {
        return traContent;
    }

    public void setTraContent(String traContent) {
        this.traContent = traContent == null ? null : traContent.trim();
    }

    public BigDecimal getTraCost() {
        return traCost;
    }

    public void setTraCost(BigDecimal traCost) {
        this.traCost = traCost;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public BigDecimal getAbsenceCount() {
        return absenceCount;
    }

    public void setAbsenceCount(BigDecimal absenceCount) {
        this.absenceCount = absenceCount;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode == null ? null : actCode.trim();
    }

    public String getActName2() {
        return actName2;
    }

    public void setActName2(String actName2) {
        this.actName2 = actName2 == null ? null : actName2.trim();
    }

    public String getActName3() {
        return actName3;
    }

    public void setActName3(String actName3) {
        this.actName3 = actName3 == null ? null : actName3.trim();
    }

    public String getActName4() {
        return actName4;
    }

    public void setActName4(String actName4) {
        this.actName4 = actName4 == null ? null : actName4.trim();
    }

    public String getActName5() {
        return actName5;
    }

    public void setActName5(String actName5) {
        this.actName5 = actName5 == null ? null : actName5.trim();
    }

    public String getActName6() {
        return actName6;
    }

    public void setActName6(String actName6) {
        this.actName6 = actName6 == null ? null : actName6.trim();
    }

    public String getAssOption() {
        return assOption;
    }

    public void setAssOption(String assOption) {
        this.assOption = assOption == null ? null : assOption.trim();
    }

    public BigDecimal getAssResult() {
        return assResult;
    }

    public void setAssResult(BigDecimal assResult) {
        this.assResult = assResult;
    }

    public String getAssistUnit() {
        return assistUnit;
    }

    public void setAssistUnit(String assistUnit) {
        this.assistUnit = assistUnit == null ? null : assistUnit.trim();
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate == null ? null : certificateDate.trim();
    }

    public String getContcode() {
        return contcode;
    }

    public void setContcode(String contcode) {
        this.contcode = contcode == null ? null : contcode.trim();
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

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getEntrepreneur() {
        return entrepreneur;
    }

    public void setEntrepreneur(String entrepreneur) {
        this.entrepreneur = entrepreneur == null ? null : entrepreneur.trim();
    }

    public String getIsallduty() {
        return isallduty;
    }

    public void setIsallduty(String isallduty) {
        this.isallduty = isallduty == null ? null : isallduty.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
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

    public String getPkAct() {
        return pkAct;
    }

    public void setPkAct(String pkAct) {
        this.pkAct = pkAct == null ? null : pkAct.trim();
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

    public String getPurveyor() {
        return purveyor;
    }

    public void setPurveyor(String purveyor) {
        this.purveyor = purveyor == null ? null : purveyor.trim();
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getSignonDt() {
        return signonDt;
    }

    public void setSignonDt(String signonDt) {
        this.signonDt = signonDt == null ? null : signonDt.trim();
    }

    public BigDecimal getSourceType() {
        return sourceType;
    }

    public void setSourceType(BigDecimal sourceType) {
        this.sourceType = sourceType;
    }

    public BigDecimal getTaketrmMethod() {
        return taketrmMethod;
    }

    public void setTaketrmMethod(BigDecimal taketrmMethod) {
        this.taketrmMethod = taketrmMethod;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}