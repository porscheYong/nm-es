package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwWaTaxgroupmember extends DataEntity<LdapmMpwWaTaxgroupmember> {
    private Integer monthId;

    private String unitId;

    private String pkTaxgrpmember;

    private String pkTaxgroup;

    private String pkWaclass;

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

    public String getPkTaxgrpmember() {
        return pkTaxgrpmember;
    }

    public void setPkTaxgrpmember(String pkTaxgrpmember) {
        this.pkTaxgrpmember = pkTaxgrpmember == null ? null : pkTaxgrpmember.trim();
    }

    public String getPkTaxgroup() {
        return pkTaxgroup;
    }

    public void setPkTaxgroup(String pkTaxgroup) {
        this.pkTaxgroup = pkTaxgroup == null ? null : pkTaxgroup.trim();
    }

    public String getPkWaclass() {
        return pkWaclass;
    }

    public void setPkWaclass(String pkWaclass) {
        this.pkWaclass = pkWaclass == null ? null : pkWaclass.trim();
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