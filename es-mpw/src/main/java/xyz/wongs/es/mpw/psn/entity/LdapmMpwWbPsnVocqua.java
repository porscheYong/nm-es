package xyz.wongs.es.mpw.psn.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbPsnVocqua extends DataEntity<LdapmMpwWbPsnVocqua> {
    private Integer monthId;

    private String unitId;

    private String pkPsnVocqua;

    private String pkPsnMsg;

    private String qualitype;

    private String qualiname;

    private String qualilevel;

    private String certunit;

    private String certcode;

    private String getQualiDate;

    private String qualiEffPeriod;

    private String highestLevelFlag;

    private String jobQualiMatch;

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

    private String pkOmPost;

    private BigDecimal theoreticalResults;

    private BigDecimal practicalResults;

    private BigDecimal finalResults;

    private String encodeCertifiedProgram;

    private String encodeActivityProgram;

    private String certdept;

    private String pkOrg;

    private String onlineUniversityPk;

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

    public String getPkPsnVocqua() {
        return pkPsnVocqua;
    }

    public void setPkPsnVocqua(String pkPsnVocqua) {
        this.pkPsnVocqua = pkPsnVocqua == null ? null : pkPsnVocqua.trim();
    }

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg == null ? null : pkPsnMsg.trim();
    }

    public String getQualitype() {
        return qualitype;
    }

    public void setQualitype(String qualitype) {
        this.qualitype = qualitype == null ? null : qualitype.trim();
    }

    public String getQualiname() {
        return qualiname;
    }

    public void setQualiname(String qualiname) {
        this.qualiname = qualiname == null ? null : qualiname.trim();
    }

    public String getQualilevel() {
        return qualilevel;
    }

    public void setQualilevel(String qualilevel) {
        this.qualilevel = qualilevel == null ? null : qualilevel.trim();
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

    public String getGetQualiDate() {
        return getQualiDate;
    }

    public void setGetQualiDate(String getQualiDate) {
        this.getQualiDate = getQualiDate == null ? null : getQualiDate.trim();
    }

    public String getQualiEffPeriod() {
        return qualiEffPeriod;
    }

    public void setQualiEffPeriod(String qualiEffPeriod) {
        this.qualiEffPeriod = qualiEffPeriod == null ? null : qualiEffPeriod.trim();
    }

    public String getHighestLevelFlag() {
        return highestLevelFlag;
    }

    public void setHighestLevelFlag(String highestLevelFlag) {
        this.highestLevelFlag = highestLevelFlag == null ? null : highestLevelFlag.trim();
    }

    public String getJobQualiMatch() {
        return jobQualiMatch;
    }

    public void setJobQualiMatch(String jobQualiMatch) {
        this.jobQualiMatch = jobQualiMatch == null ? null : jobQualiMatch.trim();
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

    public String getPkOmPost() {
        return pkOmPost;
    }

    public void setPkOmPost(String pkOmPost) {
        this.pkOmPost = pkOmPost == null ? null : pkOmPost.trim();
    }

    public BigDecimal getTheoreticalResults() {
        return theoreticalResults;
    }

    public void setTheoreticalResults(BigDecimal theoreticalResults) {
        this.theoreticalResults = theoreticalResults;
    }

    public BigDecimal getPracticalResults() {
        return practicalResults;
    }

    public void setPracticalResults(BigDecimal practicalResults) {
        this.practicalResults = practicalResults;
    }

    public BigDecimal getFinalResults() {
        return finalResults;
    }

    public void setFinalResults(BigDecimal finalResults) {
        this.finalResults = finalResults;
    }

    public String getEncodeCertifiedProgram() {
        return encodeCertifiedProgram;
    }

    public void setEncodeCertifiedProgram(String encodeCertifiedProgram) {
        this.encodeCertifiedProgram = encodeCertifiedProgram == null ? null : encodeCertifiedProgram.trim();
    }

    public String getEncodeActivityProgram() {
        return encodeActivityProgram;
    }

    public void setEncodeActivityProgram(String encodeActivityProgram) {
        this.encodeActivityProgram = encodeActivityProgram == null ? null : encodeActivityProgram.trim();
    }

    public String getCertdept() {
        return certdept;
    }

    public void setCertdept(String certdept) {
        this.certdept = certdept == null ? null : certdept.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getOnlineUniversityPk() {
        return onlineUniversityPk;
    }

    public void setOnlineUniversityPk(String onlineUniversityPk) {
        this.onlineUniversityPk = onlineUniversityPk == null ? null : onlineUniversityPk.trim();
    }
}