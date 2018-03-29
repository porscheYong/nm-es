package xyz.wongs.es.mpw.cost.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbPsnCostH extends DataEntity<LdapmMpwWbPsnCostH>{
    private Integer monthId;

    private String unitId;

    private String pkPsnCostH;

    private String pkCtManage;

    private String pkCorp;

    private String year;

    private String period;

    private String managers;

    private String operator;

    private String grantflag;

    private String sendflag;

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

    private String pkOrg;

    private String pkGroup;

    private String ts;

    private BigDecimal dr;

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

    public String getPkPsnCostH() {
        return pkPsnCostH;
    }

    public void setPkPsnCostH(String pkPsnCostH) {
        this.pkPsnCostH = pkPsnCostH == null ? null : pkPsnCostH.trim();
    }

    public String getPkCtManage() {
        return pkCtManage;
    }

    public void setPkCtManage(String pkCtManage) {
        this.pkCtManage = pkCtManage == null ? null : pkCtManage.trim();
    }

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
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

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers == null ? null : managers.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getGrantflag() {
        return grantflag;
    }

    public void setGrantflag(String grantflag) {
        this.grantflag = grantflag == null ? null : grantflag.trim();
    }

    public String getSendflag() {
        return sendflag;
    }

    public void setSendflag(String sendflag) {
        this.sendflag = sendflag == null ? null : sendflag.trim();
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

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
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
}