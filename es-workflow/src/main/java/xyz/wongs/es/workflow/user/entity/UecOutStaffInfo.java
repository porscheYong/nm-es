package xyz.wongs.es.workflow.user.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 内蒙主数据平台外包人员基本信息
 * 调用接口验证用户使用
 * @author liuxiaodong
 */
public class UecOutStaffInfo implements Serializable {
    private Long outStaffId;

    private Integer monthId;

    private String pkPsnMsg;

    private String pkOrg;

    private String psncode;

    private String psnname;

    private String idnum;

    private String sex;

    private String birthdate;

    private String highestEducation;

    private String fulltimeEducation;

    private String degree;

    private String busilife;

    private String isSend;

    private Short dr;

    private String mobtelephone;

    private String officephone;

    private String ts;

    private String pkHcmpsnMsg;

    private String psnflag;

    private String iszw;

    private String isqd;

    private String pkHrorg;

    private String usedname;

    private String nationality;

    private String characterrpr;

    private String censusaddr;

    private String fileaddress;

    private String health;

    private String marital;

    private String glbdef12;

    private String glbdef13;

    private String homephone;

    private String joinworkdate;

    private String glbdef2;

    private String glbdef3;

    private String def3;

    private String def4;

    private String email;

    private String glbdef7;

    private String glbdef8;

    private String joinpolitydate;

    private String polity;

    private String prof;

    private String titletechpost;

    private String glbdef15;

    private String retiredate;

    private String creator;

    private String creationtime;

    private BigDecimal enablestate;

    private String modifier;

    private String modifiedtime;

    private String dieDate;

    private String dieRemark;

    private String ishiskeypsn;

    private String psnUid;

    private String glbdef14;

    private String isshopassist;

    private String enterunittime;

    private String property;

    private String memo;

    private Date effDate;

    private Date expDate;

    private String statusCd;

    private Date statusDate;

    private Date createDate;

    private Long createStaff;

    private Date updateDate;

    private Long updateStaff;

    public Long getOutStaffId() {
        return outStaffId;
    }

    public void setOutStaffId(Long outStaffId) {
        this.outStaffId = outStaffId;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg;
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg;
    }

    public String getPsncode() {
        return psncode;
    }

    public void setPsncode(String psncode) {
        this.psncode = psncode;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    public String getFulltimeEducation() {
        return fulltimeEducation;
    }

    public void setFulltimeEducation(String fulltimeEducation) {
        this.fulltimeEducation = fulltimeEducation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getBusilife() {
        return busilife;
    }

    public void setBusilife(String busilife) {
        this.busilife = busilife;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public Short getDr() {
        return dr;
    }

    public void setDr(Short dr) {
        this.dr = dr;
    }

    public String getMobtelephone() {
        return mobtelephone;
    }

    public void setMobtelephone(String mobtelephone) {
        this.mobtelephone = mobtelephone;
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getPkHcmpsnMsg() {
        return pkHcmpsnMsg;
    }

    public void setPkHcmpsnMsg(String pkHcmpsnMsg) {
        this.pkHcmpsnMsg = pkHcmpsnMsg;
    }

    public String getPsnflag() {
        return psnflag;
    }

    public void setPsnflag(String psnflag) {
        this.psnflag = psnflag;
    }

    public String getIszw() {
        return iszw;
    }

    public void setIszw(String iszw) {
        this.iszw = iszw;
    }

    public String getIsqd() {
        return isqd;
    }

    public void setIsqd(String isqd) {
        this.isqd = isqd;
    }

    public String getPkHrorg() {
        return pkHrorg;
    }

    public void setPkHrorg(String pkHrorg) {
        this.pkHrorg = pkHrorg;
    }

    public String getUsedname() {
        return usedname;
    }

    public void setUsedname(String usedname) {
        this.usedname = usedname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCharacterrpr() {
        return characterrpr;
    }

    public void setCharacterrpr(String characterrpr) {
        this.characterrpr = characterrpr;
    }

    public String getCensusaddr() {
        return censusaddr;
    }

    public void setCensusaddr(String censusaddr) {
        this.censusaddr = censusaddr;
    }

    public String getFileaddress() {
        return fileaddress;
    }

    public void setFileaddress(String fileaddress) {
        this.fileaddress = fileaddress;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getGlbdef12() {
        return glbdef12;
    }

    public void setGlbdef12(String glbdef12) {
        this.glbdef12 = glbdef12;
    }

    public String getGlbdef13() {
        return glbdef13;
    }

    public void setGlbdef13(String glbdef13) {
        this.glbdef13 = glbdef13;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getJoinworkdate() {
        return joinworkdate;
    }

    public void setJoinworkdate(String joinworkdate) {
        this.joinworkdate = joinworkdate;
    }

    public String getGlbdef2() {
        return glbdef2;
    }

    public void setGlbdef2(String glbdef2) {
        this.glbdef2 = glbdef2;
    }

    public String getGlbdef3() {
        return glbdef3;
    }

    public void setGlbdef3(String glbdef3) {
        this.glbdef3 = glbdef3;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGlbdef7() {
        return glbdef7;
    }

    public void setGlbdef7(String glbdef7) {
        this.glbdef7 = glbdef7;
    }

    public String getGlbdef8() {
        return glbdef8;
    }

    public void setGlbdef8(String glbdef8) {
        this.glbdef8 = glbdef8;
    }

    public String getJoinpolitydate() {
        return joinpolitydate;
    }

    public void setJoinpolitydate(String joinpolitydate) {
        this.joinpolitydate = joinpolitydate;
    }

    public String getPolity() {
        return polity;
    }

    public void setPolity(String polity) {
        this.polity = polity;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getTitletechpost() {
        return titletechpost;
    }

    public void setTitletechpost(String titletechpost) {
        this.titletechpost = titletechpost;
    }

    public String getGlbdef15() {
        return glbdef15;
    }

    public void setGlbdef15(String glbdef15) {
        this.glbdef15 = glbdef15;
    }

    public String getRetiredate() {
        return retiredate;
    }

    public void setRetiredate(String retiredate) {
        this.retiredate = retiredate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public BigDecimal getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(BigDecimal enablestate) {
        this.enablestate = enablestate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getDieDate() {
        return dieDate;
    }

    public void setDieDate(String dieDate) {
        this.dieDate = dieDate;
    }

    public String getDieRemark() {
        return dieRemark;
    }

    public void setDieRemark(String dieRemark) {
        this.dieRemark = dieRemark;
    }

    public String getIshiskeypsn() {
        return ishiskeypsn;
    }

    public void setIshiskeypsn(String ishiskeypsn) {
        this.ishiskeypsn = ishiskeypsn;
    }

    public String getPsnUid() {
        return psnUid;
    }

    public void setPsnUid(String psnUid) {
        this.psnUid = psnUid;
    }

    public String getGlbdef14() {
        return glbdef14;
    }

    public void setGlbdef14(String glbdef14) {
        this.glbdef14 = glbdef14;
    }

    public String getIsshopassist() {
        return isshopassist;
    }

    public void setIsshopassist(String isshopassist) {
        this.isshopassist = isshopassist;
    }

    public String getEnterunittime() {
        return enterunittime;
    }

    public void setEnterunittime(String enterunittime) {
        this.enterunittime = enterunittime;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getEffDate() {
        return effDate;
    }

    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(Long createStaff) {
        this.createStaff = createStaff;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Long getUpdateStaff() {
        return updateStaff;
    }

    public void setUpdateStaff(Long updateStaff) {
        this.updateStaff = updateStaff;
    }
}