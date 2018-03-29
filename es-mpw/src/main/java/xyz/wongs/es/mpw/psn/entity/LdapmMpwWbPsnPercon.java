package xyz.wongs.es.mpw.psn.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

public class LdapmMpwWbPsnPercon extends DataEntity<LdapmMpwWbPsnPercon> {
    private Integer monthId;

    private String unitId;

    private String pkPsnPercon;

    private String pkPsnMsg;

    private String ctCode;

    private String pkTermtype;

    private String ctBeginDate;

    private String ctEndDate;

    private String trialPeriod;

    private String actualEndDate;

    private String ctChangeType;

    private String workhourSystem;

    private String ctMajor;

    private String newMark;

    private String remark;

    private BigDecimal ts;

    private Long dr;

    private String defStr1;

    private String defStr2;

    private String defStr3;

    private String defStr4;

    private BigDecimal defStr5;

    private String defStr6;

    private String defStr7;

    private String defStr8;

    private String defNum1;

    private String defNum2;

    private Date loadDate;

    private Long etlDay;

    private Short localPartitionId;

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

    public String getPkPsnPercon() {
        return pkPsnPercon;
    }

    public void setPkPsnPercon(String pkPsnPercon) {
        this.pkPsnPercon = pkPsnPercon == null ? null : pkPsnPercon.trim();
    }

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg == null ? null : pkPsnMsg.trim();
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode == null ? null : ctCode.trim();
    }

    public String getPkTermtype() {
        return pkTermtype;
    }

    public void setPkTermtype(String pkTermtype) {
        this.pkTermtype = pkTermtype == null ? null : pkTermtype.trim();
    }

    public String getCtBeginDate() {
        return ctBeginDate;
    }

    public void setCtBeginDate(String ctBeginDate) {
        this.ctBeginDate = ctBeginDate == null ? null : ctBeginDate.trim();
    }

    public String getCtEndDate() {
        return ctEndDate;
    }

    public void setCtEndDate(String ctEndDate) {
        this.ctEndDate = ctEndDate == null ? null : ctEndDate.trim();
    }

    public String getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(String trialPeriod) {
        this.trialPeriod = trialPeriod == null ? null : trialPeriod.trim();
    }

    public String getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(String actualEndDate) {
        this.actualEndDate = actualEndDate == null ? null : actualEndDate.trim();
    }

    public String getCtChangeType() {
        return ctChangeType;
    }

    public void setCtChangeType(String ctChangeType) {
        this.ctChangeType = ctChangeType == null ? null : ctChangeType.trim();
    }

    public String getWorkhourSystem() {
        return workhourSystem;
    }

    public void setWorkhourSystem(String workhourSystem) {
        this.workhourSystem = workhourSystem == null ? null : workhourSystem.trim();
    }

    public String getCtMajor() {
        return ctMajor;
    }

    public void setCtMajor(String ctMajor) {
        this.ctMajor = ctMajor == null ? null : ctMajor.trim();
    }

    public String getNewMark() {
        return newMark;
    }

    public void setNewMark(String newMark) {
        this.newMark = newMark == null ? null : newMark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTs() {
        return ts;
    }

    public void setTs(BigDecimal ts) {
        this.ts = ts;
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getDefStr1() {
        return defStr1;
    }

    public void setDefStr1(String defStr1) {
        this.defStr1 = defStr1 == null ? null : defStr1.trim();
    }

    public String getDefStr2() {
        return defStr2;
    }

    public void setDefStr2(String defStr2) {
        this.defStr2 = defStr2 == null ? null : defStr2.trim();
    }

    public String getDefStr3() {
        return defStr3;
    }

    public void setDefStr3(String defStr3) {
        this.defStr3 = defStr3 == null ? null : defStr3.trim();
    }

    public String getDefStr4() {
        return defStr4;
    }

    public void setDefStr4(String defStr4) {
        this.defStr4 = defStr4 == null ? null : defStr4.trim();
    }

    public BigDecimal getDefStr5() {
        return defStr5;
    }

    public void setDefStr5(BigDecimal defStr5) {
        this.defStr5 = defStr5;
    }

    public String getDefStr6() {
        return defStr6;
    }

    public void setDefStr6(String defStr6) {
        this.defStr6 = defStr6 == null ? null : defStr6.trim();
    }

    public String getDefStr7() {
        return defStr7;
    }

    public void setDefStr7(String defStr7) {
        this.defStr7 = defStr7 == null ? null : defStr7.trim();
    }

    public String getDefStr8() {
        return defStr8;
    }

    public void setDefStr8(String defStr8) {
        this.defStr8 = defStr8 == null ? null : defStr8.trim();
    }

    public String getDefNum1() {
        return defNum1;
    }

    public void setDefNum1(String defNum1) {
        this.defNum1 = defNum1 == null ? null : defNum1.trim();
    }

    public String getDefNum2() {
        return defNum2;
    }

    public void setDefNum2(String defNum2) {
        this.defNum2 = defNum2 == null ? null : defNum2.trim();
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Long getEtlDay() {
        return etlDay;
    }

    public void setEtlDay(Long etlDay) {
        this.etlDay = etlDay;
    }

    public Short getLocalPartitionId() {
        return localPartitionId;
    }

    public void setLocalPartitionId(Short localPartitionId) {
        this.localPartitionId = localPartitionId;
    }
}