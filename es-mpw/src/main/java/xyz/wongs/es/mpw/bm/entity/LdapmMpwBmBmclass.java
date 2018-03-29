package xyz.wongs.es.mpw.bm.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

public class LdapmMpwBmBmclass extends DataEntity<LdapmMpwBmBmclass>{
    private Integer monthId;

    private String unitId;

    private String name5;

    private String name2;

    private String pkBmClass;

    private String name6;

    private String name;

    private String name4;

    private String name3;

    private String pkGroup;

    private String pkOrg;

    private String code;

    private String pkPeriodscheme;

    private String currid;

    private String pkFinanceorg;

    private String creator;

    private String creationtime;

    private String modifier;

    private String modifiedtime;

    private String cyear;

    private String cperiod;

    private String startyear;

    private String startperiod;

    private String stopflag;

    private BigDecimal idisplayorder;

    private String note;

    private String enableorgbase;

    private String editdatasource;

    private String allowadditem;

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

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5 == null ? null : name5.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getPkBmClass() {
        return pkBmClass;
    }

    public void setPkBmClass(String pkBmClass) {
        this.pkBmClass = pkBmClass == null ? null : pkBmClass.trim();
    }

    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6 == null ? null : name6.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4 == null ? null : name4.trim();
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3 == null ? null : name3.trim();
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPkPeriodscheme() {
        return pkPeriodscheme;
    }

    public void setPkPeriodscheme(String pkPeriodscheme) {
        this.pkPeriodscheme = pkPeriodscheme == null ? null : pkPeriodscheme.trim();
    }

    public String getCurrid() {
        return currid;
    }

    public void setCurrid(String currid) {
        this.currid = currid == null ? null : currid.trim();
    }

    public String getPkFinanceorg() {
        return pkFinanceorg;
    }

    public void setPkFinanceorg(String pkFinanceorg) {
        this.pkFinanceorg = pkFinanceorg == null ? null : pkFinanceorg.trim();
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

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
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

    public String getStartyear() {
        return startyear;
    }

    public void setStartyear(String startyear) {
        this.startyear = startyear == null ? null : startyear.trim();
    }

    public String getStartperiod() {
        return startperiod;
    }

    public void setStartperiod(String startperiod) {
        this.startperiod = startperiod == null ? null : startperiod.trim();
    }

    public String getStopflag() {
        return stopflag;
    }

    public void setStopflag(String stopflag) {
        this.stopflag = stopflag == null ? null : stopflag.trim();
    }

    public BigDecimal getIdisplayorder() {
        return idisplayorder;
    }

    public void setIdisplayorder(BigDecimal idisplayorder) {
        this.idisplayorder = idisplayorder;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getEnableorgbase() {
        return enableorgbase;
    }

    public void setEnableorgbase(String enableorgbase) {
        this.enableorgbase = enableorgbase == null ? null : enableorgbase.trim();
    }

    public String getEditdatasource() {
        return editdatasource;
    }

    public void setEditdatasource(String editdatasource) {
        this.editdatasource = editdatasource == null ? null : editdatasource.trim();
    }

    public String getAllowadditem() {
        return allowadditem;
    }

    public void setAllowadditem(String allowadditem) {
        this.allowadditem = allowadditem == null ? null : allowadditem.trim();
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