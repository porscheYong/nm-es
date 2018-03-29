package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaUnitctg extends DataEntity<LdapmMpwWaUnitctg> {
    private Integer monthId;

    private String unitId;

    private String pkWaUnitctg;

    private String pkWaClass;

    private String classedid;

    private BigDecimal iunittype;

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

    public String getPkWaUnitctg() {
        return pkWaUnitctg;
    }

    public void setPkWaUnitctg(String pkWaUnitctg) {
        this.pkWaUnitctg = pkWaUnitctg == null ? null : pkWaUnitctg.trim();
    }

    public String getPkWaClass() {
        return pkWaClass;
    }

    public void setPkWaClass(String pkWaClass) {
        this.pkWaClass = pkWaClass == null ? null : pkWaClass.trim();
    }

    public String getClassedid() {
        return classedid;
    }

    public void setClassedid(String classedid) {
        this.classedid = classedid == null ? null : classedid.trim();
    }

    public BigDecimal getIunittype() {
        return iunittype;
    }

    public void setIunittype(BigDecimal iunittype) {
        this.iunittype = iunittype;
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