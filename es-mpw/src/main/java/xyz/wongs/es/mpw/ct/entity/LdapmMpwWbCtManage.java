package xyz.wongs.es.mpw.ct.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbCtManage extends DataEntity<LdapmMpwWbCtManage> {
    private Integer monthId;

    private String unitId;

    private String pkCtManage;

    private String ctCode;

    private String ctName;

    private String managerUnit;

    private String managerName;

    private String managerCode;

    private BigDecimal ctMoney;

    private String ctType;

    private String ctBeginDate;

    private String ctEndDate;

    private String postponeFlag;

    private String postponeDate;

    private String templateType;

    private String ctCodeOld;

    private String ismoney;

    private BigDecimal contmoney;

    private BigDecimal changemoney;

    private String supplierCode;

    private String newMark;

    private String defStr1;

    private String defStr2;

    private String defStr3;

    private String defStr4;

    private String defStr5;

    private String defStr6;

    private String defStr7;

    private String defStr8;

    private BigDecimal defNum1;

    private BigDecimal defNum2;

    private BigDecimal defNum3;

    private BigDecimal defNum4;

    private BigDecimal defNum5;

    private String pkCorp;

    private String ts;

    private BigDecimal dr;

    private String ctmanager;

    private BigDecimal operateType;

    private String ctflag;

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

    public String getPkCtManage() {
        return pkCtManage;
    }

    public void setPkCtManage(String pkCtManage) {
        this.pkCtManage = pkCtManage == null ? null : pkCtManage.trim();
    }

    public String getCtCode() {
        return ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode == null ? null : ctCode.trim();
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName == null ? null : ctName.trim();
    }

    public String getManagerUnit() {
        return managerUnit;
    }

    public void setManagerUnit(String managerUnit) {
        this.managerUnit = managerUnit == null ? null : managerUnit.trim();
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerCode() {
        return managerCode;
    }

    public void setManagerCode(String managerCode) {
        this.managerCode = managerCode == null ? null : managerCode.trim();
    }

    public BigDecimal getCtMoney() {
        return ctMoney;
    }

    public void setCtMoney(BigDecimal ctMoney) {
        this.ctMoney = ctMoney;
    }

    public String getCtType() {
        return ctType;
    }

    public void setCtType(String ctType) {
        this.ctType = ctType == null ? null : ctType.trim();
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

    public String getPostponeFlag() {
        return postponeFlag;
    }

    public void setPostponeFlag(String postponeFlag) {
        this.postponeFlag = postponeFlag == null ? null : postponeFlag.trim();
    }

    public String getPostponeDate() {
        return postponeDate;
    }

    public void setPostponeDate(String postponeDate) {
        this.postponeDate = postponeDate == null ? null : postponeDate.trim();
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    public String getCtCodeOld() {
        return ctCodeOld;
    }

    public void setCtCodeOld(String ctCodeOld) {
        this.ctCodeOld = ctCodeOld == null ? null : ctCodeOld.trim();
    }

    public String getIsmoney() {
        return ismoney;
    }

    public void setIsmoney(String ismoney) {
        this.ismoney = ismoney == null ? null : ismoney.trim();
    }

    public BigDecimal getContmoney() {
        return contmoney;
    }

    public void setContmoney(BigDecimal contmoney) {
        this.contmoney = contmoney;
    }

    public BigDecimal getChangemoney() {
        return changemoney;
    }

    public void setChangemoney(BigDecimal changemoney) {
        this.changemoney = changemoney;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode == null ? null : supplierCode.trim();
    }

    public String getNewMark() {
        return newMark;
    }

    public void setNewMark(String newMark) {
        this.newMark = newMark == null ? null : newMark.trim();
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

    public String getDefStr5() {
        return defStr5;
    }

    public void setDefStr5(String defStr5) {
        this.defStr5 = defStr5 == null ? null : defStr5.trim();
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

    public BigDecimal getDefNum1() {
        return defNum1;
    }

    public void setDefNum1(BigDecimal defNum1) {
        this.defNum1 = defNum1;
    }

    public BigDecimal getDefNum2() {
        return defNum2;
    }

    public void setDefNum2(BigDecimal defNum2) {
        this.defNum2 = defNum2;
    }

    public BigDecimal getDefNum3() {
        return defNum3;
    }

    public void setDefNum3(BigDecimal defNum3) {
        this.defNum3 = defNum3;
    }

    public BigDecimal getDefNum4() {
        return defNum4;
    }

    public void setDefNum4(BigDecimal defNum4) {
        this.defNum4 = defNum4;
    }

    public BigDecimal getDefNum5() {
        return defNum5;
    }

    public void setDefNum5(BigDecimal defNum5) {
        this.defNum5 = defNum5;
    }

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public BigDecimal getDr() {
        return dr;
    }

    public void setDr(BigDecimal dr) {
        this.dr = dr;
    }

    public String getCtmanager() {
        return ctmanager;
    }

    public void setCtmanager(String ctmanager) {
        this.ctmanager = ctmanager == null ? null : ctmanager.trim();
    }

    public BigDecimal getOperateType() {
        return operateType;
    }

    public void setOperateType(BigDecimal operateType) {
        this.operateType = operateType;
    }

    public String getCtflag() {
        return ctflag;
    }

    public void setCtflag(String ctflag) {
        this.ctflag = ctflag == null ? null : ctflag.trim();
    }
}