package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwHiPsndocPun extends DataEntity<LdapmMpwHiPsndocPun> {
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String punishtype;

    private String punishorg;

    private String modifiedtime;

    private String pkGroup;

    private String pkOrg;

    private String modifier;

    private String creator;

    private String creationtime;

    private String punishmatter;

    private String glbdef4;

    private String punishmeas;

    private String punishdate;

    private String glbdef2;

    private String glbdef3;

    private String pkPsndoc;

    private String ts;

    private String dr;

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

    public String getPunishtype() {
        return punishtype;
    }

    public void setPunishtype(String punishtype) {
        this.punishtype = punishtype == null ? null : punishtype.trim();
    }

    public String getPunishorg() {
        return punishorg;
    }

    public void setPunishorg(String punishorg) {
        this.punishorg = punishorg == null ? null : punishorg.trim();
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

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getPunishmatter() {
        return punishmatter;
    }

    public void setPunishmatter(String punishmatter) {
        this.punishmatter = punishmatter == null ? null : punishmatter.trim();
    }

    public String getGlbdef4() {
        return glbdef4;
    }

    public void setGlbdef4(String glbdef4) {
        this.glbdef4 = glbdef4 == null ? null : glbdef4.trim();
    }

    public String getPunishmeas() {
        return punishmeas;
    }

    public void setPunishmeas(String punishmeas) {
        this.punishmeas = punishmeas == null ? null : punishmeas.trim();
    }

    public String getPunishdate() {
        return punishdate;
    }

    public void setPunishdate(String punishdate) {
        this.punishdate = punishdate == null ? null : punishdate.trim();
    }

    public String getGlbdef2() {
        return glbdef2;
    }

    public void setGlbdef2(String glbdef2) {
        this.glbdef2 = glbdef2 == null ? null : glbdef2.trim();
    }

    public String getGlbdef3() {
        return glbdef3;
    }

    public void setGlbdef3(String glbdef3) {
        this.glbdef3 = glbdef3 == null ? null : glbdef3.trim();
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

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr == null ? null : dr.trim();
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