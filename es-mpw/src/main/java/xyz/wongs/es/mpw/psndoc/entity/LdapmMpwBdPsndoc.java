package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwBdPsndoc extends DataEntity<LdapmMpwBdPsndoc> {

    private Integer monthId;

    private String unitId;

    private String pkPsndoc;

    private String pkHrorg;

    private String glbdef10;

    private String glbdef11;

    private String glbdef2;

    private String glbdef3;

    private String glbdef6;

    private String glbdef7;

    private String glbdef8;

    private String glbdef9;

    private String glbdef12;

    private String glbdef13;

    private String birthdate;

    private String def3;

    private String def4;

    private String homephone;

    private String id;

    private String idtype;

    private String joinworkdate;

    private String mobile;

    private String name;

    private String officephone;

    private String pkGroup;

    private BigDecimal sex;

    private String usedname;

    private String characterrpr;

    private String country;

    private String fileaddress;

    private String health;

    private String marital;

    private String nationality;

    private String nativeplace;

    private String photo;

    private String previewphoto;

    private String shortname;

    private String addr;

    private String code;

    private String creationtime;

    private String creator;

    private BigDecimal dataoriginflag;

    private String def1;

    private String def10;

    private String def11;

    private String def12;

    private String def13;

    private String def14;

    private String def15;

    private String def16;

    private String def17;

    private String def18;

    private String def19;

    private String def2;

    private String def20;

    private String def5;

    private String def6;

    private String def7;

    private String def8;

    private String def9;

    private Long dr;

    private String email;

    private BigDecimal enablestate;

    private String isshopassist;

    private String mnecode;

    private String modifiedtime;

    private String modifier;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private String name6;

    private String pkOrg;

    private String ts;

    private String bloodtype;

    private String censusaddr;

    private String dieDate;

    private String dieRemark;

    private String edu;

    private String fax;

    private String ishiskeypsn;

    private String joinpolitydate;

    private String marriagedate;

    private String penelauth;

    private String permanreside;

    private String pkDegree;

    private String polity;

    private String postalcode;

    private String prof;

    private String retiredate;

    private String secretEmail;

    private String titletechpost;

    private String istemp;

    private String psnUid;

    private String glbdef14;

    private String glbdef15;

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

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public String getPkHrorg() {
        return pkHrorg;
    }

    public void setPkHrorg(String pkHrorg) {
        this.pkHrorg = pkHrorg == null ? null : pkHrorg.trim();
    }

    public String getGlbdef10() {
        return glbdef10;
    }

    public void setGlbdef10(String glbdef10) {
        this.glbdef10 = glbdef10 == null ? null : glbdef10.trim();
    }

    public String getGlbdef11() {
        return glbdef11;
    }

    public void setGlbdef11(String glbdef11) {
        this.glbdef11 = glbdef11 == null ? null : glbdef11.trim();
    }

    public String getGlbdef2() {
        return glbdef2;
    }

    public void setGlbdef2(String glbdef2) {
        this.glbdef2 = glbdef2 == null ? null : glbdef2.trim();
    }

    public String getGlbdef3() {
        return glbdef3;
    }

    public void setGlbdef3(String glbdef3) {
        this.glbdef3 = glbdef3 == null ? null : glbdef3.trim();
    }

    public String getGlbdef6() {
        return glbdef6;
    }

    public void setGlbdef6(String glbdef6) {
        this.glbdef6 = glbdef6 == null ? null : glbdef6.trim();
    }

    public String getGlbdef7() {
        return glbdef7;
    }

    public void setGlbdef7(String glbdef7) {
        this.glbdef7 = glbdef7 == null ? null : glbdef7.trim();
    }

    public String getGlbdef8() {
        return glbdef8;
    }

    public void setGlbdef8(String glbdef8) {
        this.glbdef8 = glbdef8 == null ? null : glbdef8.trim();
    }

    public String getGlbdef9() {
        return glbdef9;
    }

    public void setGlbdef9(String glbdef9) {
        this.glbdef9 = glbdef9 == null ? null : glbdef9.trim();
    }

    public String getGlbdef12() {
        return glbdef12;
    }

    public void setGlbdef12(String glbdef12) {
        this.glbdef12 = glbdef12 == null ? null : glbdef12.trim();
    }

    public String getGlbdef13() {
        return glbdef13;
    }

    public void setGlbdef13(String glbdef13) {
        this.glbdef13 = glbdef13 == null ? null : glbdef13.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3 == null ? null : def3.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone == null ? null : homephone.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getJoinworkdate() {
        return joinworkdate;
    }

    public void setJoinworkdate(String joinworkdate) {
        this.joinworkdate = joinworkdate == null ? null : joinworkdate.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public BigDecimal getSex() {
        return sex;
    }

    public void setSex(BigDecimal sex) {
        this.sex = sex;
    }

    public String getUsedname() {
        return usedname;
    }

    public void setUsedname(String usedname) {
        this.usedname = usedname == null ? null : usedname.trim();
    }

    public String getCharacterrpr() {
        return characterrpr;
    }

    public void setCharacterrpr(String characterrpr) {
        this.characterrpr = characterrpr == null ? null : characterrpr.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getFileaddress() {
        return fileaddress;
    }

    public void setFileaddress(String fileaddress) {
        this.fileaddress = fileaddress == null ? null : fileaddress.trim();
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health == null ? null : health.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace == null ? null : nativeplace.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getPreviewphoto() {
        return previewphoto;
    }

    public void setPreviewphoto(String previewphoto) {
        this.previewphoto = previewphoto == null ? null : previewphoto.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public BigDecimal getDataoriginflag() {
        return dataoriginflag;
    }

    public void setDataoriginflag(BigDecimal dataoriginflag) {
        this.dataoriginflag = dataoriginflag;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1 == null ? null : def1.trim();
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10 == null ? null : def10.trim();
    }

    public String getDef11() {
        return def11;
    }

    public void setDef11(String def11) {
        this.def11 = def11 == null ? null : def11.trim();
    }

    public String getDef12() {
        return def12;
    }

    public void setDef12(String def12) {
        this.def12 = def12 == null ? null : def12.trim();
    }

    public String getDef13() {
        return def13;
    }

    public void setDef13(String def13) {
        this.def13 = def13 == null ? null : def13.trim();
    }

    public String getDef14() {
        return def14;
    }

    public void setDef14(String def14) {
        this.def14 = def14 == null ? null : def14.trim();
    }

    public String getDef15() {
        return def15;
    }

    public void setDef15(String def15) {
        this.def15 = def15 == null ? null : def15.trim();
    }

    public String getDef16() {
        return def16;
    }

    public void setDef16(String def16) {
        this.def16 = def16 == null ? null : def16.trim();
    }

    public String getDef17() {
        return def17;
    }

    public void setDef17(String def17) {
        this.def17 = def17 == null ? null : def17.trim();
    }

    public String getDef18() {
        return def18;
    }

    public void setDef18(String def18) {
        this.def18 = def18 == null ? null : def18.trim();
    }

    public String getDef19() {
        return def19;
    }

    public void setDef19(String def19) {
        this.def19 = def19 == null ? null : def19.trim();
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2 == null ? null : def2.trim();
    }

    public String getDef20() {
        return def20;
    }

    public void setDef20(String def20) {
        this.def20 = def20 == null ? null : def20.trim();
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5 == null ? null : def5.trim();
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6 == null ? null : def6.trim();
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7 == null ? null : def7.trim();
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8 == null ? null : def8.trim();
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9 == null ? null : def9.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public BigDecimal getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(BigDecimal enablestate) {
        this.enablestate = enablestate;
    }

    public String getIsshopassist() {
        return isshopassist;
    }

    public void setIsshopassist(String isshopassist) {
        this.isshopassist = isshopassist == null ? null : isshopassist.trim();
    }

    public String getMnecode() {
        return mnecode;
    }

    public void setMnecode(String mnecode) {
        this.mnecode = mnecode == null ? null : mnecode.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3 == null ? null : name3.trim();
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4 == null ? null : name4.trim();
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5 == null ? null : name5.trim();
    }

    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6 == null ? null : name6.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype == null ? null : bloodtype.trim();
    }

    public String getCensusaddr() {
        return censusaddr;
    }

    public void setCensusaddr(String censusaddr) {
        this.censusaddr = censusaddr == null ? null : censusaddr.trim();
    }

    public String getDieDate() {
        return dieDate;
    }

    public void setDieDate(String dieDate) {
        this.dieDate = dieDate == null ? null : dieDate.trim();
    }

    public String getDieRemark() {
        return dieRemark;
    }

    public void setDieRemark(String dieRemark) {
        this.dieRemark = dieRemark == null ? null : dieRemark.trim();
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu == null ? null : edu.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getIshiskeypsn() {
        return ishiskeypsn;
    }

    public void setIshiskeypsn(String ishiskeypsn) {
        this.ishiskeypsn = ishiskeypsn == null ? null : ishiskeypsn.trim();
    }

    public String getJoinpolitydate() {
        return joinpolitydate;
    }

    public void setJoinpolitydate(String joinpolitydate) {
        this.joinpolitydate = joinpolitydate == null ? null : joinpolitydate.trim();
    }

    public String getMarriagedate() {
        return marriagedate;
    }

    public void setMarriagedate(String marriagedate) {
        this.marriagedate = marriagedate == null ? null : marriagedate.trim();
    }

    public String getPenelauth() {
        return penelauth;
    }

    public void setPenelauth(String penelauth) {
        this.penelauth = penelauth == null ? null : penelauth.trim();
    }

    public String getPermanreside() {
        return permanreside;
    }

    public void setPermanreside(String permanreside) {
        this.permanreside = permanreside == null ? null : permanreside.trim();
    }

    public String getPkDegree() {
        return pkDegree;
    }

    public void setPkDegree(String pkDegree) {
        this.pkDegree = pkDegree == null ? null : pkDegree.trim();
    }

    public String getPolity() {
        return polity;
    }

    public void setPolity(String polity) {
        this.polity = polity == null ? null : polity.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof == null ? null : prof.trim();
    }

    public String getRetiredate() {
        return retiredate;
    }

    public void setRetiredate(String retiredate) {
        this.retiredate = retiredate == null ? null : retiredate.trim();
    }

    public String getSecretEmail() {
        return secretEmail;
    }

    public void setSecretEmail(String secretEmail) {
        this.secretEmail = secretEmail == null ? null : secretEmail.trim();
    }

    public String getTitletechpost() {
        return titletechpost;
    }

    public void setTitletechpost(String titletechpost) {
        this.titletechpost = titletechpost == null ? null : titletechpost.trim();
    }

    public String getIstemp() {
        return istemp;
    }

    public void setIstemp(String istemp) {
        this.istemp = istemp == null ? null : istemp.trim();
    }

    public String getPsnUid() {
        return psnUid;
    }

    public void setPsnUid(String psnUid) {
        this.psnUid = psnUid == null ? null : psnUid.trim();
    }

    public String getGlbdef14() {
        return glbdef14;
    }

    public void setGlbdef14(String glbdef14) {
        this.glbdef14 = glbdef14 == null ? null : glbdef14.trim();
    }

    public String getGlbdef15() {
        return glbdef15;
    }

    public void setGlbdef15(String glbdef15) {
        this.glbdef15 = glbdef15 == null ? null : glbdef15.trim();
    }
}