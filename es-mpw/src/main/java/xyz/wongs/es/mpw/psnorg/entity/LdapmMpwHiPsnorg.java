package xyz.wongs.es.mpw.psnorg.entity;

import xyz.wongs.es.common.persistence.DataEntity;
import xyz.wongs.es.mpw.psnjob.entity.LdapmMpwHiPsnjob;

import java.math.BigDecimal;

public class LdapmMpwHiPsnorg extends DataEntity<LdapmMpwHiPsnorg> {
    private Integer monthId;

    private String unitId;

    private String begindate;

    private String creationtime;

    private String creator;

    private Long dr;

    private String empforms;

    private String enddate;

    private String endflag;

    private BigDecimal indocSource;

    private String indocflag;

    private String joinsysdate;

    private String lastflag;

    private String modifiedtime;

    private String modifier;

    private String orgglbdef1;

    private BigDecimal orgglbdef10;

    private String orgglbdef2;

    private BigDecimal orgglbdef3;

    private BigDecimal orgglbdef4;

    private String orgglbdef5;

    private String orgglbdef6;

    private String orgglbdef7;

    private BigDecimal orgglbdef8;

    private String orgglbdef9;

    private BigDecimal orgrelaid;

    private String pkGroup;

    private String pkHrorg;

    private String pkOrg;

    private String pkPsndoc;

    private String pkPsnorg;

    private BigDecimal psntype;

    private String startpaydate;

    private String stoppaydate;

    private String ts;

    private BigDecimal workage;

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

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
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

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getEmpforms() {
        return empforms;
    }

    public void setEmpforms(String empforms) {
        this.empforms = empforms == null ? null : empforms.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getEndflag() {
        return endflag;
    }

    public void setEndflag(String endflag) {
        this.endflag = endflag == null ? null : endflag.trim();
    }

    public BigDecimal getIndocSource() {
        return indocSource;
    }

    public void setIndocSource(BigDecimal indocSource) {
        this.indocSource = indocSource;
    }

    public String getIndocflag() {
        return indocflag;
    }

    public void setIndocflag(String indocflag) {
        this.indocflag = indocflag == null ? null : indocflag.trim();
    }

    public String getJoinsysdate() {
        return joinsysdate;
    }

    public void setJoinsysdate(String joinsysdate) {
        this.joinsysdate = joinsysdate == null ? null : joinsysdate.trim();
    }

    public String getLastflag() {
        return lastflag;
    }

    public void setLastflag(String lastflag) {
        this.lastflag = lastflag == null ? null : lastflag.trim();
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

    public String getOrgglbdef1() {
        return orgglbdef1;
    }

    public void setOrgglbdef1(String orgglbdef1) {
        this.orgglbdef1 = orgglbdef1 == null ? null : orgglbdef1.trim();
    }

    public BigDecimal getOrgglbdef10() {
        return orgglbdef10;
    }

    public void setOrgglbdef10(BigDecimal orgglbdef10) {
        this.orgglbdef10 = orgglbdef10;
    }

    public String getOrgglbdef2() {
        return orgglbdef2;
    }

    public void setOrgglbdef2(String orgglbdef2) {
        this.orgglbdef2 = orgglbdef2 == null ? null : orgglbdef2.trim();
    }

    public BigDecimal getOrgglbdef3() {
        return orgglbdef3;
    }

    public void setOrgglbdef3(BigDecimal orgglbdef3) {
        this.orgglbdef3 = orgglbdef3;
    }

    public BigDecimal getOrgglbdef4() {
        return orgglbdef4;
    }

    public void setOrgglbdef4(BigDecimal orgglbdef4) {
        this.orgglbdef4 = orgglbdef4;
    }

    public String getOrgglbdef5() {
        return orgglbdef5;
    }

    public void setOrgglbdef5(String orgglbdef5) {
        this.orgglbdef5 = orgglbdef5 == null ? null : orgglbdef5.trim();
    }

    public String getOrgglbdef6() {
        return orgglbdef6;
    }

    public void setOrgglbdef6(String orgglbdef6) {
        this.orgglbdef6 = orgglbdef6 == null ? null : orgglbdef6.trim();
    }

    public String getOrgglbdef7() {
        return orgglbdef7;
    }

    public void setOrgglbdef7(String orgglbdef7) {
        this.orgglbdef7 = orgglbdef7 == null ? null : orgglbdef7.trim();
    }

    public BigDecimal getOrgglbdef8() {
        return orgglbdef8;
    }

    public void setOrgglbdef8(BigDecimal orgglbdef8) {
        this.orgglbdef8 = orgglbdef8;
    }

    public String getOrgglbdef9() {
        return orgglbdef9;
    }

    public void setOrgglbdef9(String orgglbdef9) {
        this.orgglbdef9 = orgglbdef9 == null ? null : orgglbdef9.trim();
    }

    public BigDecimal getOrgrelaid() {
        return orgrelaid;
    }

    public void setOrgrelaid(BigDecimal orgrelaid) {
        this.orgrelaid = orgrelaid;
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkHrorg() {
        return pkHrorg;
    }

    public void setPkHrorg(String pkHrorg) {
        this.pkHrorg = pkHrorg == null ? null : pkHrorg.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
    }

    public String getPkPsnorg() {
        return pkPsnorg;
    }

    public void setPkPsnorg(String pkPsnorg) {
        this.pkPsnorg = pkPsnorg == null ? null : pkPsnorg.trim();
    }

    public BigDecimal getPsntype() {
        return psntype;
    }

    public void setPsntype(BigDecimal psntype) {
        this.psntype = psntype;
    }

    public String getStartpaydate() {
        return startpaydate;
    }

    public void setStartpaydate(String startpaydate) {
        this.startpaydate = startpaydate == null ? null : startpaydate.trim();
    }

    public String getStoppaydate() {
        return stoppaydate;
    }

    public void setStoppaydate(String stoppaydate) {
        this.stoppaydate = stoppaydate == null ? null : stoppaydate.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public BigDecimal getWorkage() {
        return workage;
    }

    public void setWorkage(BigDecimal workage) {
        this.workage = workage;
    }
}