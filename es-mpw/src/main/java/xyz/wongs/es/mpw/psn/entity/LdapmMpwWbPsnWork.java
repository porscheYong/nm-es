package xyz.wongs.es.mpw.psn.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWbPsnWork extends DataEntity<LdapmMpwWbPsnWork> {
    private Integer monthId;

    private String unitId;

    private String pkPsnWork;

    private String pkPsnMsg;

    private String psnUid;

    private String busicorp;

    private String busidept;

    private String pkOmJob;

    private String jobname;

    private String begindate;

    private String pkCorp;

    private String jobtype;

    private String enddate;

    private String qualiname;

    private String qualilevel;

    private BigDecimal psnStatus;

    private BigDecimal psnType;

    private String pkCt;

    private String orgremark;

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

    private Long recordnum;

    private String issceo;

    private String wbbegindate;

    private String wbenddate;

    private String datasources;

    private String globalRecordnum;

    private String pkHcmpsnWork;

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

    public String getPkPsnWork() {
        return pkPsnWork;
    }

    public void setPkPsnWork(String pkPsnWork) {
        this.pkPsnWork = pkPsnWork == null ? null : pkPsnWork.trim();
    }

    public String getPkPsnMsg() {
        return pkPsnMsg;
    }

    public void setPkPsnMsg(String pkPsnMsg) {
        this.pkPsnMsg = pkPsnMsg == null ? null : pkPsnMsg.trim();
    }

    public String getPsnUid() {
        return psnUid;
    }

    public void setPsnUid(String psnUid) {
        this.psnUid = psnUid == null ? null : psnUid.trim();
    }

    public String getBusicorp() {
        return busicorp;
    }

    public void setBusicorp(String busicorp) {
        this.busicorp = busicorp == null ? null : busicorp.trim();
    }

    public String getBusidept() {
        return busidept;
    }

    public void setBusidept(String busidept) {
        this.busidept = busidept == null ? null : busidept.trim();
    }

    public String getPkOmJob() {
        return pkOmJob;
    }

    public void setPkOmJob(String pkOmJob) {
        this.pkOmJob = pkOmJob == null ? null : pkOmJob.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getBegindate() {
        return begindate;
    }

    public void setBegindate(String begindate) {
        this.begindate = begindate == null ? null : begindate.trim();
    }

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype == null ? null : jobtype.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
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

    public BigDecimal getPsnStatus() {
        return psnStatus;
    }

    public void setPsnStatus(BigDecimal psnStatus) {
        this.psnStatus = psnStatus;
    }

    public BigDecimal getPsnType() {
        return psnType;
    }

    public void setPsnType(BigDecimal psnType) {
        this.psnType = psnType;
    }

    public String getPkCt() {
        return pkCt;
    }

    public void setPkCt(String pkCt) {
        this.pkCt = pkCt == null ? null : pkCt.trim();
    }

    public String getOrgremark() {
        return orgremark;
    }

    public void setOrgremark(String orgremark) {
        this.orgremark = orgremark == null ? null : orgremark.trim();
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

    public Long getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(Long recordnum) {
        this.recordnum = recordnum;
    }

    public String getIssceo() {
        return issceo;
    }

    public void setIssceo(String issceo) {
        this.issceo = issceo == null ? null : issceo.trim();
    }

    public String getWbbegindate() {
        return wbbegindate;
    }

    public void setWbbegindate(String wbbegindate) {
        this.wbbegindate = wbbegindate == null ? null : wbbegindate.trim();
    }

    public String getWbenddate() {
        return wbenddate;
    }

    public void setWbenddate(String wbenddate) {
        this.wbenddate = wbenddate == null ? null : wbenddate.trim();
    }

    public String getDatasources() {
        return datasources;
    }

    public void setDatasources(String datasources) {
        this.datasources = datasources == null ? null : datasources.trim();
    }

    public String getGlobalRecordnum() {
        return globalRecordnum;
    }

    public void setGlobalRecordnum(String globalRecordnum) {
        this.globalRecordnum = globalRecordnum == null ? null : globalRecordnum.trim();
    }

    public String getPkHcmpsnWork() {
        return pkHcmpsnWork;
    }

    public void setPkHcmpsnWork(String pkHcmpsnWork) {
        this.pkHcmpsnWork = pkHcmpsnWork == null ? null : pkHcmpsnWork.trim();
    }
}