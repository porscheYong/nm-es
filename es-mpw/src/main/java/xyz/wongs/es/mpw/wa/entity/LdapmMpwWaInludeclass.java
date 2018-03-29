package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaInludeclass extends DataEntity<LdapmMpwWaInludeclass> {
    private Integer monthId;

    private String unitId;

    private String pkGroup;

    private String pkOrg;

    private String pkIncludeclass;

    private String pkParentclass;

    private BigDecimal batch;

    private String pkChildclass;

    private String cyear;

    private String cperiod;

    private String memo;

    private Long dr;

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

    public String getPkIncludeclass() {
        return pkIncludeclass;
    }

    public void setPkIncludeclass(String pkIncludeclass) {
        this.pkIncludeclass = pkIncludeclass == null ? null : pkIncludeclass.trim();
    }

    public String getPkParentclass() {
        return pkParentclass;
    }

    public void setPkParentclass(String pkParentclass) {
        this.pkParentclass = pkParentclass == null ? null : pkParentclass.trim();
    }

    public BigDecimal getBatch() {
        return batch;
    }

    public void setBatch(BigDecimal batch) {
        this.batch = batch;
    }

    public String getPkChildclass() {
        return pkChildclass;
    }

    public void setPkChildclass(String pkChildclass) {
        this.pkChildclass = pkChildclass == null ? null : pkChildclass.trim();
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
}