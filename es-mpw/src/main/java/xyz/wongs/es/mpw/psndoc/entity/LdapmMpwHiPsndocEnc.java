package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwHiPsndocEnc extends DataEntity<LdapmMpwHiPsndocEnc> {
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String encourmatter;

    private String creationtime;

    private String encourdate;

    private String encourtype;

    private String encourmeas;

    private String glbdef1;

    private String modifier;

    private String glbdef5;

    private String pkOrg;

    private String pkGroup;

    private String modifiedtime;

    private String encourorg;

    private String encourrank;

    private String creator;

    private String pkPsndoc;

    private String ts;

    private Long dr;

    private String lastflag;

    private String recordnum;


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

    public String getEncourmatter() {
        return encourmatter;
    }

    public void setEncourmatter(String encourmatter) {
        this.encourmatter = encourmatter == null ? null : encourmatter.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getEncourdate() {
        return encourdate;
    }

    public void setEncourdate(String encourdate) {
        this.encourdate = encourdate == null ? null : encourdate.trim();
    }

    public String getEncourtype() {
        return encourtype;
    }

    public void setEncourtype(String encourtype) {
        this.encourtype = encourtype == null ? null : encourtype.trim();
    }

    public String getEncourmeas() {
        return encourmeas;
    }

    public void setEncourmeas(String encourmeas) {
        this.encourmeas = encourmeas == null ? null : encourmeas.trim();
    }

    public String getGlbdef1() {
        return glbdef1;
    }

    public void setGlbdef1(String glbdef1) {
        this.glbdef1 = glbdef1 == null ? null : glbdef1.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getGlbdef5() {
        return glbdef5;
    }

    public void setGlbdef5(String glbdef5) {
        this.glbdef5 = glbdef5 == null ? null : glbdef5.trim();
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

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getEncourorg() {
        return encourorg;
    }

    public void setEncourorg(String encourorg) {
        this.encourorg = encourorg == null ? null : encourorg.trim();
    }

    public String getEncourrank() {
        return encourrank;
    }

    public void setEncourrank(String encourrank) {
        this.encourrank = encourrank == null ? null : encourrank.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
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

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }

    public String getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(String recordnum) {
        this.recordnum = recordnum == null ? null : recordnum.trim();
    }

}