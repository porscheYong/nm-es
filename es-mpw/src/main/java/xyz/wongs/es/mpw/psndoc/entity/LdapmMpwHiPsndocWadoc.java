package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocWadoc extends DataEntity<LdapmMpwHiPsndocWadoc> {
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String pkPsndoc;

    private String pkPsnjob;

    private String negotiationWage;

    private String workflowflag;

    private String begindate;

    private String enddate;

    private String cyear;

    private String cperiod;

    private BigDecimal iadjustmatter;

    private BigDecimal recordnum;

    private String lastflag;

    private String pkWaItem;

    private String pkWaCrt;

    private BigDecimal nmoney;

    private String pkWaGrd;

    private String waflag;

    private String changedate;

    private String pkChangecause;

    private BigDecimal nprobationwage;

    private String vbasefile;

    private String vnote;

    private String pkOrg;

    private String pkGroup;

    private BigDecimal criterionvalue;

    private String pkWaPrmlv;

    private String pkWaSeclv;

    private BigDecimal crtMinValue;

    private BigDecimal crtMaxValue;

    private String partflag;

    private BigDecimal assgid;

    private Long dr;

    private String ts;

    private String executedate;

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

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public String getPkPsnjob() {
        return pkPsnjob;
    }

    public void setPkPsnjob(String pkPsnjob) {
        this.pkPsnjob = pkPsnjob == null ? null : pkPsnjob.trim();
    }

    public String getNegotiationWage() {
        return negotiationWage;
    }

    public void setNegotiationWage(String negotiationWage) {
        this.negotiationWage = negotiationWage == null ? null : negotiationWage.trim();
    }

    public String getWorkflowflag() {
        return workflowflag;
    }

    public void setWorkflowflag(String workflowflag) {
        this.workflowflag = workflowflag == null ? null : workflowflag.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getCyear() {
        return cyear;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear == null ? null : cyear.trim();
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod == null ? null : cperiod.trim();
    }

    public BigDecimal getIadjustmatter() {
        return iadjustmatter;
    }

    public void setIadjustmatter(BigDecimal iadjustmatter) {
        this.iadjustmatter = iadjustmatter;
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }

    public String getPkWaItem() {
        return pkWaItem;
    }

    public void setPkWaItem(String pkWaItem) {
        this.pkWaItem = pkWaItem == null ? null : pkWaItem.trim();
    }

    public String getPkWaCrt() {
        return pkWaCrt;
    }

    public void setPkWaCrt(String pkWaCrt) {
        this.pkWaCrt = pkWaCrt == null ? null : pkWaCrt.trim();
    }

    public BigDecimal getNmoney() {
        return nmoney;
    }

    public void setNmoney(BigDecimal nmoney) {
        this.nmoney = nmoney;
    }

    public String getPkWaGrd() {
        return pkWaGrd;
    }

    public void setPkWaGrd(String pkWaGrd) {
        this.pkWaGrd = pkWaGrd == null ? null : pkWaGrd.trim();
    }

    public String getWaflag() {
        return waflag;
    }

    public void setWaflag(String waflag) {
        this.waflag = waflag == null ? null : waflag.trim();
    }

    public String getChangedate() {
        return changedate;
    }

    public void setChangedate(String changedate) {
        this.changedate = changedate == null ? null : changedate.trim();
    }

    public String getPkChangecause() {
        return pkChangecause;
    }

    public void setPkChangecause(String pkChangecause) {
        this.pkChangecause = pkChangecause == null ? null : pkChangecause.trim();
    }

    public BigDecimal getNprobationwage() {
        return nprobationwage;
    }

    public void setNprobationwage(BigDecimal nprobationwage) {
        this.nprobationwage = nprobationwage;
    }

    public String getVbasefile() {
        return vbasefile;
    }

    public void setVbasefile(String vbasefile) {
        this.vbasefile = vbasefile == null ? null : vbasefile.trim();
    }

    public String getVnote() {
        return vnote;
    }

    public void setVnote(String vnote) {
        this.vnote = vnote == null ? null : vnote.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public BigDecimal getCriterionvalue() {
        return criterionvalue;
    }

    public void setCriterionvalue(BigDecimal criterionvalue) {
        this.criterionvalue = criterionvalue;
    }

    public String getPkWaPrmlv() {
        return pkWaPrmlv;
    }

    public void setPkWaPrmlv(String pkWaPrmlv) {
        this.pkWaPrmlv = pkWaPrmlv == null ? null : pkWaPrmlv.trim();
    }

    public String getPkWaSeclv() {
        return pkWaSeclv;
    }

    public void setPkWaSeclv(String pkWaSeclv) {
        this.pkWaSeclv = pkWaSeclv == null ? null : pkWaSeclv.trim();
    }

    public BigDecimal getCrtMinValue() {
        return crtMinValue;
    }

    public void setCrtMinValue(BigDecimal crtMinValue) {
        this.crtMinValue = crtMinValue;
    }

    public BigDecimal getCrtMaxValue() {
        return crtMaxValue;
    }

    public void setCrtMaxValue(BigDecimal crtMaxValue) {
        this.crtMaxValue = crtMaxValue;
    }

    public String getPartflag() {
        return partflag;
    }

    public void setPartflag(String partflag) {
        this.partflag = partflag == null ? null : partflag.trim();
    }

    public BigDecimal getAssgid() {
        return assgid;
    }

    public void setAssgid(BigDecimal assgid) {
        this.assgid = assgid;
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

    public String getExecutedate() {
        return executedate;
    }

    public void setExecutedate(String executedate) {
        this.executedate = executedate;
    }
}