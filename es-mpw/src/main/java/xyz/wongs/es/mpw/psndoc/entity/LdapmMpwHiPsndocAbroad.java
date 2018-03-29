package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocAbroad extends DataEntity<LdapmMpwHiPsndocAbroad> {

    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String abroaddate;

    private String abroadway;

    private String pkGroup;

    private String modifiedtime;

    private String modifier;

    private String creationtime;

    private String creator;

    private String abroadprodate;

    private String abroadout;

    private String abroadarea;

    private String abroadex;

    private String abroadreturn;

    private String abroadgroup;

    private String abroadnumber;

    private String abroadoutlay;

    private String abroadpro;

    private String abroadunit;

    private String pkOrg;

    private String pkPsndoc;

    private String ts;

    private Long dr;

    private String begindate;

    private String enddate;

    private String lastflag;

    private BigDecimal recordnum;

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

    public String getAbroaddate() {
        return abroaddate;
    }

    public void setAbroaddate(String abroaddate) {
        this.abroaddate = abroaddate == null ? null : abroaddate.trim();
    }

    public String getAbroadway() {
        return abroadway;
    }

    public void setAbroadway(String abroadway) {
        this.abroadway = abroadway == null ? null : abroadway.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
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

    public String getAbroadprodate() {
        return abroadprodate;
    }

    public void setAbroadprodate(String abroadprodate) {
        this.abroadprodate = abroadprodate == null ? null : abroadprodate.trim();
    }

    public String getAbroadout() {
        return abroadout;
    }

    public void setAbroadout(String abroadout) {
        this.abroadout = abroadout == null ? null : abroadout.trim();
    }

    public String getAbroadarea() {
        return abroadarea;
    }

    public void setAbroadarea(String abroadarea) {
        this.abroadarea = abroadarea == null ? null : abroadarea.trim();
    }

    public String getAbroadex() {
        return abroadex;
    }

    public void setAbroadex(String abroadex) {
        this.abroadex = abroadex == null ? null : abroadex.trim();
    }

    public String getAbroadreturn() {
        return abroadreturn;
    }

    public void setAbroadreturn(String abroadreturn) {
        this.abroadreturn = abroadreturn == null ? null : abroadreturn.trim();
    }

    public String getAbroadgroup() {
        return abroadgroup;
    }

    public void setAbroadgroup(String abroadgroup) {
        this.abroadgroup = abroadgroup == null ? null : abroadgroup.trim();
    }

    public String getAbroadnumber() {
        return abroadnumber;
    }

    public void setAbroadnumber(String abroadnumber) {
        this.abroadnumber = abroadnumber == null ? null : abroadnumber.trim();
    }

    public String getAbroadoutlay() {
        return abroadoutlay;
    }

    public void setAbroadoutlay(String abroadoutlay) {
        this.abroadoutlay = abroadoutlay == null ? null : abroadoutlay.trim();
    }

    public String getAbroadpro() {
        return abroadpro;
    }

    public void setAbroadpro(String abroadpro) {
        this.abroadpro = abroadpro == null ? null : abroadpro.trim();
    }

    public String getAbroadunit() {
        return abroadunit;
    }

    public void setAbroadunit(String abroadunit) {
        this.abroadunit = abroadunit == null ? null : abroadunit.trim();
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

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }
}