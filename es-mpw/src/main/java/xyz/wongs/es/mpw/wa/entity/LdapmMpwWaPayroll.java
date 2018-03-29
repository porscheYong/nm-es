package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaPayroll extends DataEntity<LdapmMpwWaPayroll> {
    private Integer monthId;

    private String unitId;

    private String pkPayroll;

    private String applyNote;

    private String applydate;

    private String approveNote;

    private String approvedate;

    private String approver;

    private BigDecimal batch;

    private String billcode;

    private String billname;

    private BigDecimal billstate;

    private String billtype;

    private String cperiod;

    private String creationtime;

    private String creator;

    private String cyear;

    private Long dr;

    private String isapproved;

    private String modifiedtime;

    private String modifier;

    private String operator;

    private String pkBusitype;

    private String pkGroup;

    private String pkOrg;

    private String pkWaClass;

    private String transtypeid;

    private String ts;

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

    public String getPkPayroll() {
        return pkPayroll;
    }

    public void setPkPayroll(String pkPayroll) {
        this.pkPayroll = pkPayroll == null ? null : pkPayroll.trim();
    }

    public String getApplyNote() {
        return applyNote;
    }

    public void setApplyNote(String applyNote) {
        this.applyNote = applyNote == null ? null : applyNote.trim();
    }

    public String getApplydate() {
        return applydate;
    }

    public void setApplydate(String applydate) {
        this.applydate = applydate == null ? null : applydate.trim();
    }

    public String getApproveNote() {
        return approveNote;
    }

    public void setApproveNote(String approveNote) {
        this.approveNote = approveNote == null ? null : approveNote.trim();
    }

    public String getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(String approvedate) {
        this.approvedate = approvedate == null ? null : approvedate.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public BigDecimal getBatch() {
        return batch;
    }

    public void setBatch(BigDecimal batch) {
        this.batch = batch;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode == null ? null : billcode.trim();
    }

    public String getBillname() {
        return billname;
    }

    public void setBillname(String billname) {
        this.billname = billname == null ? null : billname.trim();
    }

    public BigDecimal getBillstate() {
        return billstate;
    }

    public void setBillstate(BigDecimal billstate) {
        this.billstate = billstate;
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype == null ? null : billtype.trim();
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod == null ? null : cperiod.trim();
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

    public String getCyear() {
        return cyear;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear == null ? null : cyear.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public String getIsapproved() {
        return isapproved;
    }

    public void setIsapproved(String isapproved) {
        this.isapproved = isapproved == null ? null : isapproved.trim();
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getPkBusitype() {
        return pkBusitype;
    }

    public void setPkBusitype(String pkBusitype) {
        this.pkBusitype = pkBusitype == null ? null : pkBusitype.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkWaClass() {
        return pkWaClass;
    }

    public void setPkWaClass(String pkWaClass) {
        this.pkWaClass = pkWaClass == null ? null : pkWaClass.trim();
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
}