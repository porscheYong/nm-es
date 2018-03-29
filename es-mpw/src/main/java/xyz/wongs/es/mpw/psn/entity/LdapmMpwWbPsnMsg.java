package xyz.wongs.es.mpw.psn.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbPsnMsg extends DataEntity<LdapmMpwWbPsnMsg>{
    private Integer monthId;

    private String unitId;

    private String pkPsnMsg;

    private String pkOrg;

    private String pkGroup;

    private String psncode;

    private String psnname;

    private String id;

    private String sex;

    private String birthdate;

    private String highestEducation;

    private String fulltimeEducation;

    private String degree;

    private String busilife;

    private String defStr1;

    private String defStr2;

    private String defStr3;

    private String defStr4;

    private String defStr5;

    private BigDecimal defNum1;

    private BigDecimal defNum2;

    private BigDecimal defNum3;

    private BigDecimal defNum4;

    private BigDecimal defNum5;

    private String isSend;

    private BigDecimal dr;

    private String mobtelephone;

    private String officephone;

    private String ts;

    private String pkHcmpsnMsg;

    private String psnflag;

    private String iszw;

    private String isqd;

    private String psnNature;

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

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg == null ? null : pkPsnMsg.trim();
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

    public String getPsncode() {
        return psncode;
    }

    public void setPsncode(String psncode) {
        this.psncode = psncode == null ? null : psncode.trim();
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname == null ? null : psnname.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }

    public String getFulltimeEducation() {
        return fulltimeEducation;
    }

    public void setFulltimeEducation(String fulltimeEducation) {
        this.fulltimeEducation = fulltimeEducation == null ? null : fulltimeEducation.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getBusilife() {
        return busilife;
    }

    public void setBusilife(String busilife) {
        this.busilife = busilife == null ? null : busilife.trim();
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

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }

    public BigDecimal getDr() {
        return dr;
    }

    public void setDr(BigDecimal dr) {
        this.dr = dr;
    }

    public String getMobtelephone() {
        return mobtelephone;
    }

    public void setMobtelephone(String mobtelephone) {
        this.mobtelephone = mobtelephone == null ? null : mobtelephone.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getPkHcmpsnMsg() {
        return pkHcmpsnMsg;
    }

    public void setPkHcmpsnMsg(String pkHcmpsnMsg) {
        this.pkHcmpsnMsg = pkHcmpsnMsg == null ? null : pkHcmpsnMsg.trim();
    }

    public String getPsnflag() {
        return psnflag;
    }

    public void setPsnflag(String psnflag) {
        this.psnflag = psnflag == null ? null : psnflag.trim();
    }

    public String getIszw() {
        return iszw;
    }

    public void setIszw(String iszw) {
        this.iszw = iszw == null ? null : iszw.trim();
    }

    public String getIsqd() {
        return isqd;
    }

    public void setIsqd(String isqd) {
        this.isqd = isqd == null ? null : isqd.trim();
    }

    public String getPsnNature() {
        return psnNature;
    }

    public void setPsnNature(String psnNature) {
        this.psnNature = psnNature == null ? null : psnNature.trim();
    }
}