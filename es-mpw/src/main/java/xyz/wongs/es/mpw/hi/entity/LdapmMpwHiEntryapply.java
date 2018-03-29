package xyz.wongs.es.mpw.hi.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiEntryapply extends DataEntity<LdapmMpwHiEntryapply> {
    private Integer monthId;

    private String unitId;

    private String pkEntryapply;

    private String applyDate;

    private String approveNote;

    private BigDecimal approveState;

    private String approveTime;

    private String approver;

    private String billCode;

    private String billmaker;

    private String businessType;

    private String creationtime;

    private String creator;

    private Long dr;

    private String issyncwork;

    private String memo;

    private String modifiedtime;

    private String modifier;

    private String pkBilltype;

    private String pkGroup;

    private String pkHiOrg;

    private String pkOrg;

    private String pkPsndoc;

    private String pkPsnjob;

    private String transtype;

    private String transtypeid;

    private String ts;

    private String vattachment;

    private String issyncglbdef11;

    private String vleaderposition;

    private String vdutydept;

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

    public String getPkEntryapply() {
        return pkEntryapply;
    }

    public void setPkEntryapply(String pkEntryapply) {
        this.pkEntryapply = pkEntryapply == null ? null : pkEntryapply.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getApproveNote() {
        return approveNote;
    }

    public void setApproveNote(String approveNote) {
        this.approveNote = approveNote == null ? null : approveNote.trim();
    }

    public BigDecimal getApproveState() {
        return approveState;
    }

    public void setApproveState(BigDecimal approveState) {
        this.approveState = approveState;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime == null ? null : approveTime.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getBillmaker() {
        return billmaker;
    }

    public void setBillmaker(String billmaker) {
        this.billmaker = billmaker == null ? null : billmaker.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
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

    public String getIssyncwork() {
        return issyncwork;
    }

    public void setIssyncwork(String issyncwork) {
        this.issyncwork = issyncwork == null ? null : issyncwork.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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

    public String getPkBilltype() {
        return pkBilltype;
    }

    public void setPkBilltype(String pkBilltype) {
        this.pkBilltype = pkBilltype == null ? null : pkBilltype.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkHiOrg() {
        return pkHiOrg;
    }

    public void setPkHiOrg(String pkHiOrg) {
        this.pkHiOrg = pkHiOrg == null ? null : pkHiOrg.trim();
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

    public String getPkPsnjob() {
        return pkPsnjob;
    }

    public void setPkPsnjob(String pkPsnjob) {
        this.pkPsnjob = pkPsnjob == null ? null : pkPsnjob.trim();
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype == null ? null : transtype.trim();
    }

    public String getTranstypeid() {
        return transtypeid;
    }

    public void setTranstypeid(String transtypeid) {
        this.transtypeid = transtypeid == null ? null : transtypeid.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getVattachment() {
        return vattachment;
    }

    public void setVattachment(String vattachment) {
        this.vattachment = vattachment == null ? null : vattachment.trim();
    }

    public String getIssyncglbdef11() {
        return issyncglbdef11;
    }

    public void setIssyncglbdef11(String issyncglbdef11) {
        this.issyncglbdef11 = issyncglbdef11 == null ? null : issyncglbdef11.trim();
    }

    public String getVleaderposition() {
        return vleaderposition;
    }

    public void setVleaderposition(String vleaderposition) {
        this.vleaderposition = vleaderposition == null ? null : vleaderposition.trim();
    }

    public String getVdutydept() {
        return vdutydept;
    }

    public void setVdutydept(String vdutydept) {
        this.vdutydept = vdutydept == null ? null : vdutydept.trim();
    }
}