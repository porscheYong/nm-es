package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiPsndocLangabili extends DataEntity<LdapmMpwHiPsndocLangabili> {
    private Integer monthId;

    private String unitId;

    private String certifcode;

    private String certifdate;

    private String certifname;

    private String creationtime;

    private String creator;

    private String langlev;

    private String langskill;

    private String langsort;

    private String lastflag;

    private String memo;

    private String modifiedtime;

    private String modifier;

    private String pkGroup;

    private String pkOrg;

    private String pkPsndoc;

    private String pkPsndocSub;

    private BigDecimal recordnum;

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

    public String getCertifcode() {
        return certifcode;
    }

    public void setCertifcode(String certifcode) {
        this.certifcode = certifcode == null ? null : certifcode.trim();
    }

    public String getCertifdate() {
        return certifdate;
    }

    public void setCertifdate(String certifdate) {
        this.certifdate = certifdate == null ? null : certifdate.trim();
    }

    public String getCertifname() {
        return certifname;
    }

    public void setCertifname(String certifname) {
        this.certifname = certifname == null ? null : certifname.trim();
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

    public String getLanglev() {
        return langlev;
    }

    public void setLanglev(String langlev) {
        this.langlev = langlev == null ? null : langlev.trim();
    }

    public String getLangskill() {
        return langskill;
    }

    public void setLangskill(String langskill) {
        this.langskill = langskill == null ? null : langskill.trim();
    }

    public String getLangsort() {
        return langsort;
    }

    public void setLangsort(String langsort) {
        this.langsort = langsort == null ? null : langsort.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
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

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }
}