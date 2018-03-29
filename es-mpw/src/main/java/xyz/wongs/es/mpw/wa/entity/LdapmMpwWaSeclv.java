package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaSeclv extends DataEntity<LdapmMpwWaSeclv>{
    private Integer monthId;

    private String unitId;

    private String pkWaSeclv;

    private BigDecimal displayindex;

    private Long dr;

    private String levelname;

    private String pkWaGrd;

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

    public String getPkWaSeclv() {
        return pkWaSeclv;
    }

    public void setPkWaSeclv(String pkWaSeclv) {
        this.pkWaSeclv = pkWaSeclv == null ? null : pkWaSeclv.trim();
    }

    public BigDecimal getDisplayindex() {
        return displayindex;
    }

    public void setDisplayindex(BigDecimal displayindex) {
        this.displayindex = displayindex;
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public String getPkWaGrd() {
        return pkWaGrd;
    }

    public void setPkWaGrd(String pkWaGrd) {
        this.pkWaGrd = pkWaGrd == null ? null : pkWaGrd.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}