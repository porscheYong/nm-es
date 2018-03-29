package xyz.wongs.es.mpw.post.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwOmPostseries extends DataEntity<LdapmMpwOmPostseries> {
    private Integer monthId;

    private String unitId;

    private String creationtime;

    private String creator;

    private BigDecimal enablestate;

    private String fatherPk;

    private String innercode;

    private String modifiedtime;

    private String modifier;

    private String pkGroup;

    private String pkOrg;

    private String pkPostseries;

    private String postseriescode;

    private String postseriesdesc;

    private String postseriesname;

    private String seq;

    private String postseriesname2;

    private String postseriesname3;

    private String postseriesname4;

    private String postseriesname5;

    private String postseriesname6;

    private String ts;

    private Long dr;

    private BigDecimal dataoriginflag;


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

    public BigDecimal getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(BigDecimal enablestate) {
        this.enablestate = enablestate;
    }

    public String getFatherPk() {
        return fatherPk;
    }

    public void setFatherPk(String fatherPk) {
        this.fatherPk = fatherPk == null ? null : fatherPk.trim();
    }

    public String getInnercode() {
        return innercode;
    }

    public void setInnercode(String innercode) {
        this.innercode = innercode == null ? null : innercode.trim();
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

    public String getPkPostseries() {
        return pkPostseries;
    }

    public void setPkPostseries(String pkPostseries) {
        this.pkPostseries = pkPostseries == null ? null : pkPostseries.trim();
    }

    public String getPostseriescode() {
        return postseriescode;
    }

    public void setPostseriescode(String postseriescode) {
        this.postseriescode = postseriescode == null ? null : postseriescode.trim();
    }

    public String getPostseriesdesc() {
        return postseriesdesc;
    }

    public void setPostseriesdesc(String postseriesdesc) {
        this.postseriesdesc = postseriesdesc == null ? null : postseriesdesc.trim();
    }

    public String getPostseriesname() {
        return postseriesname;
    }

    public void setPostseriesname(String postseriesname) {
        this.postseriesname = postseriesname == null ? null : postseriesname.trim();
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }

    public String getPostseriesname2() {
        return postseriesname2;
    }

    public void setPostseriesname2(String postseriesname2) {
        this.postseriesname2 = postseriesname2 == null ? null : postseriesname2.trim();
    }

    public String getPostseriesname3() {
        return postseriesname3;
    }

    public void setPostseriesname3(String postseriesname3) {
        this.postseriesname3 = postseriesname3 == null ? null : postseriesname3.trim();
    }

    public String getPostseriesname4() {
        return postseriesname4;
    }

    public void setPostseriesname4(String postseriesname4) {
        this.postseriesname4 = postseriesname4 == null ? null : postseriesname4.trim();
    }

    public String getPostseriesname5() {
        return postseriesname5;
    }

    public void setPostseriesname5(String postseriesname5) {
        this.postseriesname5 = postseriesname5 == null ? null : postseriesname5.trim();
    }

    public String getPostseriesname6() {
        return postseriesname6;
    }

    public void setPostseriesname6(String postseriesname6) {
        this.postseriesname6 = postseriesname6 == null ? null : postseriesname6.trim();
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

    public BigDecimal getDataoriginflag() {
        return dataoriginflag;
    }

    public void setDataoriginflag(BigDecimal dataoriginflag) {
        this.dataoriginflag = dataoriginflag;
    }


}