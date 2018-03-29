package xyz.wongs.es.mpw.hi.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHrTrnstype extends DataEntity<LdapmMpwHrTrnstype> {
    private Integer monthId;

    private String unitId;

    private String pkTrnstype;

    private String creationtime;

    private String creator;

    private Long dr;

    private BigDecimal enablestate;

    private String ishrss;

    private String memo;

    private String modifiedtime;

    private String modifier;

    private String pkGroup;

    private String pkOrg;

    private String systypeflag;

    private BigDecimal trnsevent;

    private String trnstypecode;

    private String trnstypename;

    private String trnstypename2;

    private String trnstypename3;

    private String trnstypename4;

    private String trnstypename5;

    private String trnstypename6;

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

    public String getPkTrnstype() {
        return pkTrnstype;
    }

    public void setPkTrnstype(String pkTrnstype) {
        this.pkTrnstype = pkTrnstype == null ? null : pkTrnstype.trim();
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

    public BigDecimal getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(BigDecimal enablestate) {
        this.enablestate = enablestate;
    }

    public String getIshrss() {
        return ishrss;
    }

    public void setIshrss(String ishrss) {
        this.ishrss = ishrss == null ? null : ishrss.trim();
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

    public String getSystypeflag() {
        return systypeflag;
    }

    public void setSystypeflag(String systypeflag) {
        this.systypeflag = systypeflag == null ? null : systypeflag.trim();
    }

    public BigDecimal getTrnsevent() {
        return trnsevent;
    }

    public void setTrnsevent(BigDecimal trnsevent) {
        this.trnsevent = trnsevent;
    }

    public String getTrnstypecode() {
        return trnstypecode;
    }

    public void setTrnstypecode(String trnstypecode) {
        this.trnstypecode = trnstypecode == null ? null : trnstypecode.trim();
    }

    public String getTrnstypename() {
        return trnstypename;
    }

    public void setTrnstypename(String trnstypename) {
        this.trnstypename = trnstypename == null ? null : trnstypename.trim();
    }

    public String getTrnstypename2() {
        return trnstypename2;
    }

    public void setTrnstypename2(String trnstypename2) {
        this.trnstypename2 = trnstypename2 == null ? null : trnstypename2.trim();
    }

    public String getTrnstypename3() {
        return trnstypename3;
    }

    public void setTrnstypename3(String trnstypename3) {
        this.trnstypename3 = trnstypename3 == null ? null : trnstypename3.trim();
    }

    public String getTrnstypename4() {
        return trnstypename4;
    }

    public void setTrnstypename4(String trnstypename4) {
        this.trnstypename4 = trnstypename4 == null ? null : trnstypename4.trim();
    }

    public String getTrnstypename5() {
        return trnstypename5;
    }

    public void setTrnstypename5(String trnstypename5) {
        this.trnstypename5 = trnstypename5 == null ? null : trnstypename5.trim();
    }

    public String getTrnstypename6() {
        return trnstypename6;
    }

    public void setTrnstypename6(String trnstypename6) {
        this.trnstypename6 = trnstypename6 == null ? null : trnstypename6.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}