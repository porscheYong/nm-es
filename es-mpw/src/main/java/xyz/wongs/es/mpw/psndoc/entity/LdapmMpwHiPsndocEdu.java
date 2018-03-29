package xyz.wongs.es.mpw.psndoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

public class LdapmMpwHiPsndocEdu extends DataEntity<LdapmMpwHiPsndocEdu> {
    private Integer monthId;

    private String unitId;

    private String pkPsndocSub;

    private String modifiedtime;

    private String modifier;

    private String pkOrg;

    private String pkGroup;

    private String studymode;

    private String glbdef7;

    private String memo;

    private String glbdef6;

    private String glbdef5;

    private String lasteducation;

    private String creationtime;

    private String creator;

    private String glbdef4;

    private String glbdef3;

    private BigDecimal edusystem;

    private String pkDegree;

    private String major;

    private String begindate;

    private String glbdef1;

    private String enddate;

    private BigDecimal approveflag;

    private String certifcode;

    private String glbdef2;

    private String majortype;

    private String period;

    private String educationctifcode;

    private String degreedate;

    private String degreeunit;

    private String school;

    private String education;

    private String pkPsndoc;

    private String lastflag;

    private BigDecimal recordnum;

    private String schooltype;

    private String ts;

    private Long dr;

    private String glbdef8;

    private String glbdef9;


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

    public String getPkPsndocSub() {
        return pkPsndocSub;
    }

    public void setPkPsndocSub(String pkPsndocSub) {
        this.pkPsndocSub = pkPsndocSub == null ? null : pkPsndocSub.trim();
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

    public String getStudymode() {
        return studymode;
    }

    public void setStudymode(String studymode) {
        this.studymode = studymode == null ? null : studymode.trim();
    }

    public String getGlbdef7() {
        return glbdef7;
    }

    public void setGlbdef7(String glbdef7) {
        this.glbdef7 = glbdef7 == null ? null : glbdef7.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getGlbdef6() {
        return glbdef6;
    }

    public void setGlbdef6(String glbdef6) {
        this.glbdef6 = glbdef6 == null ? null : glbdef6.trim();
    }

    public String getGlbdef5() {
        return glbdef5;
    }

    public void setGlbdef5(String glbdef5) {
        this.glbdef5 = glbdef5 == null ? null : glbdef5.trim();
    }

    public String getLasteducation() {
        return lasteducation;
    }

    public void setLasteducation(String lasteducation) {
        this.lasteducation = lasteducation == null ? null : lasteducation.trim();
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

    public String getGlbdef4() {
        return glbdef4;
    }

    public void setGlbdef4(String glbdef4) {
        this.glbdef4 = glbdef4 == null ? null : glbdef4.trim();
    }

    public String getGlbdef3() {
        return glbdef3;
    }

    public void setGlbdef3(String glbdef3) {
        this.glbdef3 = glbdef3 == null ? null : glbdef3.trim();
    }

    public BigDecimal getEdusystem() {
        return edusystem;
    }

    public void setEdusystem(BigDecimal edusystem) {
        this.edusystem = edusystem;
    }

    public String getPkDegree() {
        return pkDegree;
    }

    public void setPkDegree(String pkDegree) {
        this.pkDegree = pkDegree == null ? null : pkDegree.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getGlbdef1() {
        return glbdef1;
    }

    public void setGlbdef1(String glbdef1) {
        this.glbdef1 = glbdef1 == null ? null : glbdef1.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public BigDecimal getApproveflag() {
        return approveflag;
    }

    public void setApproveflag(BigDecimal approveflag) {
        this.approveflag = approveflag;
    }

    public String getCertifcode() {
        return certifcode;
    }

    public void setCertifcode(String certifcode) {
        this.certifcode = certifcode == null ? null : certifcode.trim();
    }

    public String getGlbdef2() {
        return glbdef2;
    }

    public void setGlbdef2(String glbdef2) {
        this.glbdef2 = glbdef2 == null ? null : glbdef2.trim();
    }

    public String getMajortype() {
        return majortype;
    }

    public void setMajortype(String majortype) {
        this.majortype = majortype == null ? null : majortype.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public String getEducationctifcode() {
        return educationctifcode;
    }

    public void setEducationctifcode(String educationctifcode) {
        this.educationctifcode = educationctifcode == null ? null : educationctifcode.trim();
    }

    public String getDegreedate() {
        return degreedate;
    }

    public void setDegreedate(String degreedate) {
        this.degreedate = degreedate == null ? null : degreedate.trim();
    }

    public String getDegreeunit() {
        return degreeunit;
    }

    public void setDegreeunit(String degreeunit) {
        this.degreeunit = degreeunit == null ? null : degreeunit.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
    }

    public BigDecimal getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(BigDecimal recordnum) {
        this.recordnum = recordnum;
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype == null ? null : schooltype.trim();
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

}