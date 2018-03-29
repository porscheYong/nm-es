package xyz.wongs.es.mpw.bm.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwBmPeriod extends DataEntity<LdapmMpwBmPeriod> {
    private Integer monthId;

    private String unitId;

    private String pkBmPeriod;

    private String pkPeriodscheme;

    private String year;

    private String period;

    private String cstartdate;

    private String cenddate;

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

    public String getPkBmPeriod() {
        return pkBmPeriod;
    }

    public void setPkBmPeriod(String pkBmPeriod) {
        this.pkBmPeriod = pkBmPeriod == null ? null : pkBmPeriod.trim();
    }

    public String getPkPeriodscheme() {
        return pkPeriodscheme;
    }

    public void setPkPeriodscheme(String pkPeriodscheme) {
        this.pkPeriodscheme = pkPeriodscheme == null ? null : pkPeriodscheme.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
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