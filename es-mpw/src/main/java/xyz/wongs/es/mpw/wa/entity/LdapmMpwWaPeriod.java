package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwWaPeriod extends DataEntity<LdapmMpwWaPeriod> {
    private Integer monthId;

    private String unitId;

    private String pkWaPeriod;

    private String pkPeriodscheme;

    private String cyear;

    private String cperiod;

    private String cstartdate;

    private String cenddate;

    private String vcalyear;

    private String vcalmonth;

    private String caccyear;

    private String caccperiod;

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

    public String getPkWaPeriod() {
        return pkWaPeriod;
    }

    public void setPkWaPeriod(String pkWaPeriod) {
        this.pkWaPeriod = pkWaPeriod == null ? null : pkWaPeriod.trim();
    }

    public String getPkPeriodscheme() {
        return pkPeriodscheme;
    }

    public void setPkPeriodscheme(String pkPeriodscheme) {
        this.pkPeriodscheme = pkPeriodscheme == null ? null : pkPeriodscheme.trim();
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

    public String getCstartdate() {
        return cstartdate;
    }

    public void setCstartdate(String cstartdate) {
        this.cstartdate = cstartdate == null ? null : cstartdate.trim();
    }

    public String getCenddate() {
        return cenddate;
    }

    public void setCenddate(String cenddate) {
        this.cenddate = cenddate == null ? null : cenddate.trim();
    }

    public String getVcalyear() {
        return vcalyear;
    }

    public void setVcalyear(String vcalyear) {
        this.vcalyear = vcalyear == null ? null : vcalyear.trim();
    }

    public String getVcalmonth() {
        return vcalmonth;
    }

    public void setVcalmonth(String vcalmonth) {
        this.vcalmonth = vcalmonth == null ? null : vcalmonth.trim();
    }

    public String getCaccyear() {
        return caccyear;
    }

    public void setCaccyear(String caccyear) {
        this.caccyear = caccyear == null ? null : caccyear.trim();
    }

    public String getCaccperiod() {
        return caccperiod;
    }

    public void setCaccperiod(String caccperiod) {
        this.caccperiod = caccperiod == null ? null : caccperiod.trim();
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