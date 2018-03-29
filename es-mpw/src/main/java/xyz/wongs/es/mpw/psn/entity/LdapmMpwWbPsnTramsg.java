package xyz.wongs.es.mpw.psn.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbPsnTramsg extends DataEntity<LdapmMpwWbPsnTramsg> {
    private Integer monthId;

    private String unitId;

    private String pkPsnTramsg;

    private String pkPsnMsg;

    private String traClass;

    private String traLevel;

    private String traAct;

    private String traCourse;

    private String begindate;

    private String enddate;

    private String traTime;

    private String traMode;

    private String traObjective;

    private String traContentClass;

    private String traLocation;

    private String traResult;

    private String certname;

    private String certunit;

    private String certcode;

    private String remark;

    private String ts;

    private BigDecimal dr;

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

    private String traCode;

    private String traMethod;

    private String traContent;

    private String traValidity;

    private String traSignDate;

    private String traHostUnit;

    private String traCoOrganizer;

    private String traUndertakingUnit;

    private BigDecimal traLeaEvaluationResults;

    private BigDecimal traPerformanceResults;

    private String traCertificateLevel;

    private String onlineUniversityPk;

    private String traHostUnitPk;

    private String traHostDeptPk;

    private String traCardUnitPk;

    private String traCardDeptPk;

    private String traFileUnitPk;

    private String traFileDeptPk;

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

    public String getPkPsnTramsg() {
        return pkPsnTramsg;
    }

    public void setPkPsnTramsg(String pkPsnTramsg) {
        this.pkPsnTramsg = pkPsnTramsg == null ? null : pkPsnTramsg.trim();
    }

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg == null ? null : pkPsnMsg.trim();
    }

    public String getTraClass() {
        return traClass;
    }

    public void setTraClass(String traClass) {
        this.traClass = traClass == null ? null : traClass.trim();
    }

    public String getTraLevel() {
        return traLevel;
    }

    public void setTraLevel(String traLevel) {
        this.traLevel = traLevel == null ? null : traLevel.trim();
    }

    public String getTraAct() {
        return traAct;
    }

    public void setTraAct(String traAct) {
        this.traAct = traAct == null ? null : traAct.trim();
    }

    public String getTraCourse() {
        return traCourse;
    }

    public void setTraCourse(String traCourse) {
        this.traCourse = traCourse == null ? null : traCourse.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getTraTime() {
        return traTime;
    }

    public void setTraTime(String traTime) {
        this.traTime = traTime == null ? null : traTime.trim();
    }

    public String getTraMode() {
        return traMode;
    }

    public void setTraMode(String traMode) {
        this.traMode = traMode == null ? null : traMode.trim();
    }

    public String getTraObjective() {
        return traObjective;
    }

    public void setTraObjective(String traObjective) {
        this.traObjective = traObjective == null ? null : traObjective.trim();
    }

    public String getTraContentClass() {
        return traContentClass;
    }

    public void setTraContentClass(String traContentClass) {
        this.traContentClass = traContentClass == null ? null : traContentClass.trim();
    }

    public String getTraLocation() {
        return traLocation;
    }

    public void setTraLocation(String traLocation) {
        this.traLocation = traLocation == null ? null : traLocation.trim();
    }

    public String getTraResult() {
        return traResult;
    }

    public void setTraResult(String traResult) {
        this.traResult = traResult == null ? null : traResult.trim();
    }

    public String getCertname() {
        return certname;
    }

    public void setCertname(String certname) {
        this.certname = certname == null ? null : certname.trim();
    }

    public String getCertunit() {
        return certunit;
    }

    public void setCertunit(String certunit) {
        this.certunit = certunit == null ? null : certunit.trim();
    }

    public String getCertcode() {
        return certcode;
    }

    public void setCertcode(String certcode) {
        this.certcode = certcode == null ? null : certcode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getTraCode() {
        return traCode;
    }

    public void setTraCode(String traCode) {
        this.traCode = traCode == null ? null : traCode.trim();
    }

    public String getTraMethod() {
        return traMethod;
    }

    public void setTraMethod(String traMethod) {
        this.traMethod = traMethod == null ? null : traMethod.trim();
    }

    public String getTraContent() {
        return traContent;
    }

    public void setTraContent(String traContent) {
        this.traContent = traContent == null ? null : traContent.trim();
    }

    public String getTraValidity() {
        return traValidity;
    }

    public void setTraValidity(String traValidity) {
        this.traValidity = traValidity == null ? null : traValidity.trim();
    }

    public String getTraSignDate() {
        return traSignDate;
    }

    public void setTraSignDate(String traSignDate) {
        this.traSignDate = traSignDate == null ? null : traSignDate.trim();
    }

    public String getTraHostUnit() {
        return traHostUnit;
    }

    public void setTraHostUnit(String traHostUnit) {
        this.traHostUnit = traHostUnit == null ? null : traHostUnit.trim();
    }

    public String getTraCoOrganizer() {
        return traCoOrganizer;
    }

    public void setTraCoOrganizer(String traCoOrganizer) {
        this.traCoOrganizer = traCoOrganizer == null ? null : traCoOrganizer.trim();
    }

    public String getTraUndertakingUnit() {
        return traUndertakingUnit;
    }

    public void setTraUndertakingUnit(String traUndertakingUnit) {
        this.traUndertakingUnit = traUndertakingUnit == null ? null : traUndertakingUnit.trim();
    }

    public BigDecimal getTraLeaEvaluationResults() {
        return traLeaEvaluationResults;
    }

    public void setTraLeaEvaluationResults(BigDecimal traLeaEvaluationResults) {
        this.traLeaEvaluationResults = traLeaEvaluationResults;
    }

    public BigDecimal getTraPerformanceResults() {
        return traPerformanceResults;
    }

    public void setTraPerformanceResults(BigDecimal traPerformanceResults) {
        this.traPerformanceResults = traPerformanceResults;
    }

    public String getTraCertificateLevel() {
        return traCertificateLevel;
    }

    public void setTraCertificateLevel(String traCertificateLevel) {
        this.traCertificateLevel = traCertificateLevel == null ? null : traCertificateLevel.trim();
    }

    public String getOnlineUniversityPk() {
        return onlineUniversityPk;
    }

    public void setOnlineUniversityPk(String onlineUniversityPk) {
        this.onlineUniversityPk = onlineUniversityPk == null ? null : onlineUniversityPk.trim();
    }

    public String getTraHostUnitPk() {
        return traHostUnitPk;
    }

    public void setTraHostUnitPk(String traHostUnitPk) {
        this.traHostUnitPk = traHostUnitPk == null ? null : traHostUnitPk.trim();
    }

    public String getTraHostDeptPk() {
        return traHostDeptPk;
    }

    public void setTraHostDeptPk(String traHostDeptPk) {
        this.traHostDeptPk = traHostDeptPk == null ? null : traHostDeptPk.trim();
    }

    public String getTraCardUnitPk() {
        return traCardUnitPk;
    }

    public void setTraCardUnitPk(String traCardUnitPk) {
        this.traCardUnitPk = traCardUnitPk == null ? null : traCardUnitPk.trim();
    }

    public String getTraCardDeptPk() {
        return traCardDeptPk;
    }

    public void setTraCardDeptPk(String traCardDeptPk) {
        this.traCardDeptPk = traCardDeptPk == null ? null : traCardDeptPk.trim();
    }

    public String getTraFileUnitPk() {
        return traFileUnitPk;
    }

    public void setTraFileUnitPk(String traFileUnitPk) {
        this.traFileUnitPk = traFileUnitPk == null ? null : traFileUnitPk.trim();
    }

    public String getTraFileDeptPk() {
        return traFileDeptPk;
    }

    public void setTraFileDeptPk(String traFileDeptPk) {
        this.traFileDeptPk = traFileDeptPk == null ? null : traFileDeptPk.trim();
    }

}