package xyz.wongs.es.mpw.hi.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwHiStapply extends DataEntity<LdapmMpwHiStapply> {
    private Integer monthId;

    private String unitId;

    private String pkHiStapply;

    private String addreason;

    private String applyDate;

    private String approveNote;

    private BigDecimal approveState;

    private String approveTime;

    private String approver;

    private BigDecimal assgid;

    private String billCode;

    private String billmaker;

    private String businessType;

    private String creationtime;

    private String creator;

    private Long dr;

    private String effectdate;

    private String funCode;

    private String ifaddblack;

    private String ifaddpsnchg;

    private String ifendpart;

    private String ifsynwork;

    private String isdisablepsn;

    private String ishrssbill;

    private String isneedfile;

    private String memo;

    private String modifiedtime;

    private String modifier;

    private String newdeposemode;

    private String newjobmode;

    private String newmemo;

    private String newoccupation;

    private String newpkDept;

    private String newpkJob;

    private String newpkJobType;

    private String newpkJobgrade;

    private String newpkJobrank;

    private String newpkOrg;

    private String newpkPost;

    private String newpkPostseries;

    private String newpkPsncl;

    private String newpoststat;

    private String newseries;

    private String newworktype;

    private String olddeposemode;

    private String oldjobmode;

    private String oldmemo;

    private String oldoccupation;

    private String oldpkDept;

    private String oldpkJob;

    private String oldpkJobType;

    private String oldpkJobgrade;

    private String oldpkJobrank;

    private String oldpkOrg;

    private String oldpkPost;

    private String oldpkPostseries;

    private String oldpkPsncl;

    private String oldpoststat;

    private String oldseries;

    private String oldworktype;

    private String pkBilltype;

    private String pkGroup;

    private String pkHiOrg;

    private String pkOldHiOrg;

    private String pkOrg;

    private String pkPsndoc;

    private String pkPsnjob;

    private String pkPsnorg;

    private String pkTrnstype;

    private String sreason;

    private BigDecimal stapplyMode;

    private String transtype;

    private String transtypeid;

    private String trialFlag;

    private BigDecimal trialUnit;

    private String trialbegindate;

    private BigDecimal trialdays;

    private String trialenddate;

    private String ts;

    private String oldjobglbdef1;

    private String newjobglbdef1;

    private String oldjobglbdef2;

    private String newjobglbdef2;

    private String oldjobglbdef3;

    private String newjobglbdef3;

    private String oldjobglbdef4;

    private String newjobglbdef4;

    private String oldjobglbdef5;

    private String newjobglbdef5;

    private String oldjobglbdef6;

    private String newjobglbdef6;

    private String oldjobglbdef7;

    private String newjobglbdef7;

    private String oldjobglbdef8;

    private String newjobglbdef8;

    private String oldjobglbdef9;

    private String newjobglbdef9;

    private String oldjobglbdef10;

    private String newjobglbdef10;

    private String oldjobglbdef13;

    private String newjobglbdef13;

    private String oldjobglbdef14;

    private String newjobglbdef14;

    private String oldjobglbdef15;

    private String newjobglbdef15;

    private String oldjobglbdef16;

    private String newjobglbdef16;

    private String oldjobglbdef17;

    private String newjobglbdef17;

    private String oldjobglbdef18;

    private String newjobglbdef18;

    private String oldjobglbdef19;

    private String newjobglbdef19;

    private String oldjobglbdef20;

    private String newjobglbdef20;

    private String oldjobglbdef21;

    private String newjobglbdef21;

    private String oldjobglbdef22;

    private String newjobglbdef22;

    private String oldjobglbdef23;

    private String newjobglbdef23;

    private String oldjobglbdef24;

    private String newjobglbdef24;

    private String issyncglbdef11;

    private String oldjobglbdef27;

    private String newjobglbdef27;

    private String oldjobglbdef25;

    private String newjobglbdef25;

    private String oldjobglbdef26;

    private String newjobglbdef26;

    private String oldjobglbdef28;

    private String newjobglbdef28;

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

    public String getPkHiStapply() {
        return pkHiStapply;
    }

    public void setPkHiStapply(String pkHiStapply) {
        this.pkHiStapply = pkHiStapply == null ? null : pkHiStapply.trim();
    }

    public String getAddreason() {
        return addreason;
    }

    public void setAddreason(String addreason) {
        this.addreason = addreason == null ? null : addreason.trim();
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

    public BigDecimal getAssgid() {
        return assgid;
    }

    public void setAssgid(BigDecimal assgid) {
        this.assgid = assgid;
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

    public String getEffectdate() {
        return effectdate;
    }

    public void setEffectdate(String effectdate) {
        this.effectdate = effectdate == null ? null : effectdate.trim();
    }

    public String getFunCode() {
        return funCode;
    }

    public void setFunCode(String funCode) {
        this.funCode = funCode == null ? null : funCode.trim();
    }

    public String getIfaddblack() {
        return ifaddblack;
    }

    public void setIfaddblack(String ifaddblack) {
        this.ifaddblack = ifaddblack == null ? null : ifaddblack.trim();
    }

    public String getIfaddpsnchg() {
        return ifaddpsnchg;
    }

    public void setIfaddpsnchg(String ifaddpsnchg) {
        this.ifaddpsnchg = ifaddpsnchg == null ? null : ifaddpsnchg.trim();
    }

    public String getIfendpart() {
        return ifendpart;
    }

    public void setIfendpart(String ifendpart) {
        this.ifendpart = ifendpart == null ? null : ifendpart.trim();
    }

    public String getIfsynwork() {
        return ifsynwork;
    }

    public void setIfsynwork(String ifsynwork) {
        this.ifsynwork = ifsynwork == null ? null : ifsynwork.trim();
    }

    public String getIsdisablepsn() {
        return isdisablepsn;
    }

    public void setIsdisablepsn(String isdisablepsn) {
        this.isdisablepsn = isdisablepsn == null ? null : isdisablepsn.trim();
    }

    public String getIshrssbill() {
        return ishrssbill;
    }

    public void setIshrssbill(String ishrssbill) {
        this.ishrssbill = ishrssbill == null ? null : ishrssbill.trim();
    }

    public String getIsneedfile() {
        return isneedfile;
    }

    public void setIsneedfile(String isneedfile) {
        this.isneedfile = isneedfile == null ? null : isneedfile.trim();
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

    public String getNewdeposemode() {
        return newdeposemode;
    }

    public void setNewdeposemode(String newdeposemode) {
        this.newdeposemode = newdeposemode == null ? null : newdeposemode.trim();
    }

    public String getNewjobmode() {
        return newjobmode;
    }

    public void setNewjobmode(String newjobmode) {
        this.newjobmode = newjobmode == null ? null : newjobmode.trim();
    }

    public String getNewmemo() {
        return newmemo;
    }

    public void setNewmemo(String newmemo) {
        this.newmemo = newmemo == null ? null : newmemo.trim();
    }

    public String getNewoccupation() {
        return newoccupation;
    }

    public void setNewoccupation(String newoccupation) {
        this.newoccupation = newoccupation == null ? null : newoccupation.trim();
    }

    public String getNewpkDept() {
        return newpkDept;
    }

    public void setNewpkDept(String newpkDept) {
        this.newpkDept = newpkDept == null ? null : newpkDept.trim();
    }

    public String getNewpkJob() {
        return newpkJob;
    }

    public void setNewpkJob(String newpkJob) {
        this.newpkJob = newpkJob == null ? null : newpkJob.trim();
    }

    public String getNewpkJobType() {
        return newpkJobType;
    }

    public void setNewpkJobType(String newpkJobType) {
        this.newpkJobType = newpkJobType == null ? null : newpkJobType.trim();
    }

    public String getNewpkJobgrade() {
        return newpkJobgrade;
    }

    public void setNewpkJobgrade(String newpkJobgrade) {
        this.newpkJobgrade = newpkJobgrade == null ? null : newpkJobgrade.trim();
    }

    public String getNewpkJobrank() {
        return newpkJobrank;
    }

    public void setNewpkJobrank(String newpkJobrank) {
        this.newpkJobrank = newpkJobrank == null ? null : newpkJobrank.trim();
    }

    public String getNewpkOrg() {
        return newpkOrg;
    }

    public void setNewpkOrg(String newpkOrg) {
        this.newpkOrg = newpkOrg == null ? null : newpkOrg.trim();
    }

    public String getNewpkPost() {
        return newpkPost;
    }

    public void setNewpkPost(String newpkPost) {
        this.newpkPost = newpkPost == null ? null : newpkPost.trim();
    }

    public String getNewpkPostseries() {
        return newpkPostseries;
    }

    public void setNewpkPostseries(String newpkPostseries) {
        this.newpkPostseries = newpkPostseries == null ? null : newpkPostseries.trim();
    }

    public String getNewpkPsncl() {
        return newpkPsncl;
    }

    public void setNewpkPsncl(String newpkPsncl) {
        this.newpkPsncl = newpkPsncl == null ? null : newpkPsncl.trim();
    }

    public String getNewpoststat() {
        return newpoststat;
    }

    public void setNewpoststat(String newpoststat) {
        this.newpoststat = newpoststat == null ? null : newpoststat.trim();
    }

    public String getNewseries() {
        return newseries;
    }

    public void setNewseries(String newseries) {
        this.newseries = newseries == null ? null : newseries.trim();
    }

    public String getNewworktype() {
        return newworktype;
    }

    public void setNewworktype(String newworktype) {
        this.newworktype = newworktype == null ? null : newworktype.trim();
    }

    public String getOlddeposemode() {
        return olddeposemode;
    }

    public void setOlddeposemode(String olddeposemode) {
        this.olddeposemode = olddeposemode == null ? null : olddeposemode.trim();
    }

    public String getOldjobmode() {
        return oldjobmode;
    }

    public void setOldjobmode(String oldjobmode) {
        this.oldjobmode = oldjobmode == null ? null : oldjobmode.trim();
    }

    public String getOldmemo() {
        return oldmemo;
    }

    public void setOldmemo(String oldmemo) {
        this.oldmemo = oldmemo == null ? null : oldmemo.trim();
    }

    public String getOldoccupation() {
        return oldoccupation;
    }

    public void setOldoccupation(String oldoccupation) {
        this.oldoccupation = oldoccupation == null ? null : oldoccupation.trim();
    }

    public String getOldpkDept() {
        return oldpkDept;
    }

    public void setOldpkDept(String oldpkDept) {
        this.oldpkDept = oldpkDept == null ? null : oldpkDept.trim();
    }

    public String getOldpkJob() {
        return oldpkJob;
    }

    public void setOldpkJob(String oldpkJob) {
        this.oldpkJob = oldpkJob == null ? null : oldpkJob.trim();
    }

    public String getOldpkJobType() {
        return oldpkJobType;
    }

    public void setOldpkJobType(String oldpkJobType) {
        this.oldpkJobType = oldpkJobType == null ? null : oldpkJobType.trim();
    }

    public String getOldpkJobgrade() {
        return oldpkJobgrade;
    }

    public void setOldpkJobgrade(String oldpkJobgrade) {
        this.oldpkJobgrade = oldpkJobgrade == null ? null : oldpkJobgrade.trim();
    }

    public String getOldpkJobrank() {
        return oldpkJobrank;
    }

    public void setOldpkJobrank(String oldpkJobrank) {
        this.oldpkJobrank = oldpkJobrank == null ? null : oldpkJobrank.trim();
    }

    public String getOldpkOrg() {
        return oldpkOrg;
    }

    public void setOldpkOrg(String oldpkOrg) {
        this.oldpkOrg = oldpkOrg == null ? null : oldpkOrg.trim();
    }

    public String getOldpkPost() {
        return oldpkPost;
    }

    public void setOldpkPost(String oldpkPost) {
        this.oldpkPost = oldpkPost == null ? null : oldpkPost.trim();
    }

    public String getOldpkPostseries() {
        return oldpkPostseries;
    }

    public void setOldpkPostseries(String oldpkPostseries) {
        this.oldpkPostseries = oldpkPostseries == null ? null : oldpkPostseries.trim();
    }

    public String getOldpkPsncl() {
        return oldpkPsncl;
    }

    public void setOldpkPsncl(String oldpkPsncl) {
        this.oldpkPsncl = oldpkPsncl == null ? null : oldpkPsncl.trim();
    }

    public String getOldpoststat() {
        return oldpoststat;
    }

    public void setOldpoststat(String oldpoststat) {
        this.oldpoststat = oldpoststat == null ? null : oldpoststat.trim();
    }

    public String getOldseries() {
        return oldseries;
    }

    public void setOldseries(String oldseries) {
        this.oldseries = oldseries == null ? null : oldseries.trim();
    }

    public String getOldworktype() {
        return oldworktype;
    }

    public void setOldworktype(String oldworktype) {
        this.oldworktype = oldworktype == null ? null : oldworktype.trim();
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

    public String getPkOldHiOrg() {
        return pkOldHiOrg;
    }

    public void setPkOldHiOrg(String pkOldHiOrg) {
        this.pkOldHiOrg = pkOldHiOrg == null ? null : pkOldHiOrg.trim();
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

    public String getPkPsnorg() {
        return pkPsnorg;
    }

    public void setPkPsnorg(String pkPsnorg) {
        this.pkPsnorg = pkPsnorg == null ? null : pkPsnorg.trim();
    }

    public String getPkTrnstype() {
        return pkTrnstype;
    }

    public void setPkTrnstype(String pkTrnstype) {
        this.pkTrnstype = pkTrnstype == null ? null : pkTrnstype.trim();
    }

    public String getSreason() {
        return sreason;
    }

    public void setSreason(String sreason) {
        this.sreason = sreason == null ? null : sreason.trim();
    }

    public BigDecimal getStapplyMode() {
        return stapplyMode;
    }

    public void setStapplyMode(BigDecimal stapplyMode) {
        this.stapplyMode = stapplyMode;
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

    public String getTrialFlag() {
        return trialFlag;
    }

    public void setTrialFlag(String trialFlag) {
        this.trialFlag = trialFlag == null ? null : trialFlag.trim();
    }

    public BigDecimal getTrialUnit() {
        return trialUnit;
    }

    public void setTrialUnit(BigDecimal trialUnit) {
        this.trialUnit = trialUnit;
    }

    public String getTrialbegindate() {
        return trialbegindate;
    }

    public void setTrialbegindate(String trialbegindate) {
        this.trialbegindate = trialbegindate == null ? null : trialbegindate.trim();
    }

    public BigDecimal getTrialdays() {
        return trialdays;
    }

    public void setTrialdays(BigDecimal trialdays) {
        this.trialdays = trialdays;
    }

    public String getTrialenddate() {
        return trialenddate;
    }

    public void setTrialenddate(String trialenddate) {
        this.trialenddate = trialenddate == null ? null : trialenddate.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public String getOldjobglbdef1() {
        return oldjobglbdef1;
    }

    public void setOldjobglbdef1(String oldjobglbdef1) {
        this.oldjobglbdef1 = oldjobglbdef1 == null ? null : oldjobglbdef1.trim();
    }

    public String getNewjobglbdef1() {
        return newjobglbdef1;
    }

    public void setNewjobglbdef1(String newjobglbdef1) {
        this.newjobglbdef1 = newjobglbdef1 == null ? null : newjobglbdef1.trim();
    }

    public String getOldjobglbdef2() {
        return oldjobglbdef2;
    }

    public void setOldjobglbdef2(String oldjobglbdef2) {
        this.oldjobglbdef2 = oldjobglbdef2 == null ? null : oldjobglbdef2.trim();
    }

    public String getNewjobglbdef2() {
        return newjobglbdef2;
    }

    public void setNewjobglbdef2(String newjobglbdef2) {
        this.newjobglbdef2 = newjobglbdef2 == null ? null : newjobglbdef2.trim();
    }

    public String getOldjobglbdef3() {
        return oldjobglbdef3;
    }

    public void setOldjobglbdef3(String oldjobglbdef3) {
        this.oldjobglbdef3 = oldjobglbdef3 == null ? null : oldjobglbdef3.trim();
    }

    public String getNewjobglbdef3() {
        return newjobglbdef3;
    }

    public void setNewjobglbdef3(String newjobglbdef3) {
        this.newjobglbdef3 = newjobglbdef3 == null ? null : newjobglbdef3.trim();
    }

    public String getOldjobglbdef4() {
        return oldjobglbdef4;
    }

    public void setOldjobglbdef4(String oldjobglbdef4) {
        this.oldjobglbdef4 = oldjobglbdef4 == null ? null : oldjobglbdef4.trim();
    }

    public String getNewjobglbdef4() {
        return newjobglbdef4;
    }

    public void setNewjobglbdef4(String newjobglbdef4) {
        this.newjobglbdef4 = newjobglbdef4 == null ? null : newjobglbdef4.trim();
    }

    public String getOldjobglbdef5() {
        return oldjobglbdef5;
    }

    public void setOldjobglbdef5(String oldjobglbdef5) {
        this.oldjobglbdef5 = oldjobglbdef5 == null ? null : oldjobglbdef5.trim();
    }

    public String getNewjobglbdef5() {
        return newjobglbdef5;
    }

    public void setNewjobglbdef5(String newjobglbdef5) {
        this.newjobglbdef5 = newjobglbdef5 == null ? null : newjobglbdef5.trim();
    }

    public String getOldjobglbdef6() {
        return oldjobglbdef6;
    }

    public void setOldjobglbdef6(String oldjobglbdef6) {
        this.oldjobglbdef6 = oldjobglbdef6 == null ? null : oldjobglbdef6.trim();
    }

    public String getNewjobglbdef6() {
        return newjobglbdef6;
    }

    public void setNewjobglbdef6(String newjobglbdef6) {
        this.newjobglbdef6 = newjobglbdef6 == null ? null : newjobglbdef6.trim();
    }

    public String getOldjobglbdef7() {
        return oldjobglbdef7;
    }

    public void setOldjobglbdef7(String oldjobglbdef7) {
        this.oldjobglbdef7 = oldjobglbdef7 == null ? null : oldjobglbdef7.trim();
    }

    public String getNewjobglbdef7() {
        return newjobglbdef7;
    }

    public void setNewjobglbdef7(String newjobglbdef7) {
        this.newjobglbdef7 = newjobglbdef7 == null ? null : newjobglbdef7.trim();
    }

    public String getOldjobglbdef8() {
        return oldjobglbdef8;
    }

    public void setOldjobglbdef8(String oldjobglbdef8) {
        this.oldjobglbdef8 = oldjobglbdef8 == null ? null : oldjobglbdef8.trim();
    }

    public String getNewjobglbdef8() {
        return newjobglbdef8;
    }

    public void setNewjobglbdef8(String newjobglbdef8) {
        this.newjobglbdef8 = newjobglbdef8 == null ? null : newjobglbdef8.trim();
    }

    public String getOldjobglbdef9() {
        return oldjobglbdef9;
    }

    public void setOldjobglbdef9(String oldjobglbdef9) {
        this.oldjobglbdef9 = oldjobglbdef9 == null ? null : oldjobglbdef9.trim();
    }

    public String getNewjobglbdef9() {
        return newjobglbdef9;
    }

    public void setNewjobglbdef9(String newjobglbdef9) {
        this.newjobglbdef9 = newjobglbdef9 == null ? null : newjobglbdef9.trim();
    }

    public String getOldjobglbdef10() {
        return oldjobglbdef10;
    }

    public void setOldjobglbdef10(String oldjobglbdef10) {
        this.oldjobglbdef10 = oldjobglbdef10 == null ? null : oldjobglbdef10.trim();
    }

    public String getNewjobglbdef10() {
        return newjobglbdef10;
    }

    public void setNewjobglbdef10(String newjobglbdef10) {
        this.newjobglbdef10 = newjobglbdef10 == null ? null : newjobglbdef10.trim();
    }

    public String getOldjobglbdef13() {
        return oldjobglbdef13;
    }

    public void setOldjobglbdef13(String oldjobglbdef13) {
        this.oldjobglbdef13 = oldjobglbdef13 == null ? null : oldjobglbdef13.trim();
    }

    public String getNewjobglbdef13() {
        return newjobglbdef13;
    }

    public void setNewjobglbdef13(String newjobglbdef13) {
        this.newjobglbdef13 = newjobglbdef13 == null ? null : newjobglbdef13.trim();
    }

    public String getOldjobglbdef14() {
        return oldjobglbdef14;
    }

    public void setOldjobglbdef14(String oldjobglbdef14) {
        this.oldjobglbdef14 = oldjobglbdef14 == null ? null : oldjobglbdef14.trim();
    }

    public String getNewjobglbdef14() {
        return newjobglbdef14;
    }

    public void setNewjobglbdef14(String newjobglbdef14) {
        this.newjobglbdef14 = newjobglbdef14 == null ? null : newjobglbdef14.trim();
    }

    public String getOldjobglbdef15() {
        return oldjobglbdef15;
    }

    public void setOldjobglbdef15(String oldjobglbdef15) {
        this.oldjobglbdef15 = oldjobglbdef15 == null ? null : oldjobglbdef15.trim();
    }

    public String getNewjobglbdef15() {
        return newjobglbdef15;
    }

    public void setNewjobglbdef15(String newjobglbdef15) {
        this.newjobglbdef15 = newjobglbdef15 == null ? null : newjobglbdef15.trim();
    }

    public String getOldjobglbdef16() {
        return oldjobglbdef16;
    }

    public void setOldjobglbdef16(String oldjobglbdef16) {
        this.oldjobglbdef16 = oldjobglbdef16 == null ? null : oldjobglbdef16.trim();
    }

    public String getNewjobglbdef16() {
        return newjobglbdef16;
    }

    public void setNewjobglbdef16(String newjobglbdef16) {
        this.newjobglbdef16 = newjobglbdef16 == null ? null : newjobglbdef16.trim();
    }

    public String getOldjobglbdef17() {
        return oldjobglbdef17;
    }

    public void setOldjobglbdef17(String oldjobglbdef17) {
        this.oldjobglbdef17 = oldjobglbdef17 == null ? null : oldjobglbdef17.trim();
    }

    public String getNewjobglbdef17() {
        return newjobglbdef17;
    }

    public void setNewjobglbdef17(String newjobglbdef17) {
        this.newjobglbdef17 = newjobglbdef17 == null ? null : newjobglbdef17.trim();
    }

    public String getOldjobglbdef18() {
        return oldjobglbdef18;
    }

    public void setOldjobglbdef18(String oldjobglbdef18) {
        this.oldjobglbdef18 = oldjobglbdef18 == null ? null : oldjobglbdef18.trim();
    }

    public String getNewjobglbdef18() {
        return newjobglbdef18;
    }

    public void setNewjobglbdef18(String newjobglbdef18) {
        this.newjobglbdef18 = newjobglbdef18 == null ? null : newjobglbdef18.trim();
    }

    public String getOldjobglbdef19() {
        return oldjobglbdef19;
    }

    public void setOldjobglbdef19(String oldjobglbdef19) {
        this.oldjobglbdef19 = oldjobglbdef19 == null ? null : oldjobglbdef19.trim();
    }

    public String getNewjobglbdef19() {
        return newjobglbdef19;
    }

    public void setNewjobglbdef19(String newjobglbdef19) {
        this.newjobglbdef19 = newjobglbdef19 == null ? null : newjobglbdef19.trim();
    }

    public String getOldjobglbdef20() {
        return oldjobglbdef20;
    }

    public void setOldjobglbdef20(String oldjobglbdef20) {
        this.oldjobglbdef20 = oldjobglbdef20 == null ? null : oldjobglbdef20.trim();
    }

    public String getNewjobglbdef20() {
        return newjobglbdef20;
    }

    public void setNewjobglbdef20(String newjobglbdef20) {
        this.newjobglbdef20 = newjobglbdef20 == null ? null : newjobglbdef20.trim();
    }

    public String getOldjobglbdef21() {
        return oldjobglbdef21;
    }

    public void setOldjobglbdef21(String oldjobglbdef21) {
        this.oldjobglbdef21 = oldjobglbdef21 == null ? null : oldjobglbdef21.trim();
    }

    public String getNewjobglbdef21() {
        return newjobglbdef21;
    }

    public void setNewjobglbdef21(String newjobglbdef21) {
        this.newjobglbdef21 = newjobglbdef21 == null ? null : newjobglbdef21.trim();
    }

    public String getOldjobglbdef22() {
        return oldjobglbdef22;
    }

    public void setOldjobglbdef22(String oldjobglbdef22) {
        this.oldjobglbdef22 = oldjobglbdef22 == null ? null : oldjobglbdef22.trim();
    }

    public String getNewjobglbdef22() {
        return newjobglbdef22;
    }

    public void setNewjobglbdef22(String newjobglbdef22) {
        this.newjobglbdef22 = newjobglbdef22 == null ? null : newjobglbdef22.trim();
    }

    public String getOldjobglbdef23() {
        return oldjobglbdef23;
    }

    public void setOldjobglbdef23(String oldjobglbdef23) {
        this.oldjobglbdef23 = oldjobglbdef23 == null ? null : oldjobglbdef23.trim();
    }

    public String getNewjobglbdef23() {
        return newjobglbdef23;
    }

    public void setNewjobglbdef23(String newjobglbdef23) {
        this.newjobglbdef23 = newjobglbdef23 == null ? null : newjobglbdef23.trim();
    }

    public String getOldjobglbdef24() {
        return oldjobglbdef24;
    }

    public void setOldjobglbdef24(String oldjobglbdef24) {
        this.oldjobglbdef24 = oldjobglbdef24 == null ? null : oldjobglbdef24.trim();
    }

    public String getNewjobglbdef24() {
        return newjobglbdef24;
    }

    public void setNewjobglbdef24(String newjobglbdef24) {
        this.newjobglbdef24 = newjobglbdef24 == null ? null : newjobglbdef24.trim();
    }

    public String getIssyncglbdef11() {
        return issyncglbdef11;
    }

    public void setIssyncglbdef11(String issyncglbdef11) {
        this.issyncglbdef11 = issyncglbdef11 == null ? null : issyncglbdef11.trim();
    }

    public String getOldjobglbdef27() {
        return oldjobglbdef27;
    }

    public void setOldjobglbdef27(String oldjobglbdef27) {
        this.oldjobglbdef27 = oldjobglbdef27 == null ? null : oldjobglbdef27.trim();
    }

    public String getNewjobglbdef27() {
        return newjobglbdef27;
    }

    public void setNewjobglbdef27(String newjobglbdef27) {
        this.newjobglbdef27 = newjobglbdef27 == null ? null : newjobglbdef27.trim();
    }

    public String getOldjobglbdef25() {
        return oldjobglbdef25;
    }

    public void setOldjobglbdef25(String oldjobglbdef25) {
        this.oldjobglbdef25 = oldjobglbdef25 == null ? null : oldjobglbdef25.trim();
    }

    public String getNewjobglbdef25() {
        return newjobglbdef25;
    }

    public void setNewjobglbdef25(String newjobglbdef25) {
        this.newjobglbdef25 = newjobglbdef25 == null ? null : newjobglbdef25.trim();
    }

    public String getOldjobglbdef26() {
        return oldjobglbdef26;
    }

    public void setOldjobglbdef26(String oldjobglbdef26) {
        this.oldjobglbdef26 = oldjobglbdef26 == null ? null : oldjobglbdef26.trim();
    }

    public String getNewjobglbdef26() {
        return newjobglbdef26;
    }

    public void setNewjobglbdef26(String newjobglbdef26) {
        this.newjobglbdef26 = newjobglbdef26 == null ? null : newjobglbdef26.trim();
    }

    public String getOldjobglbdef28() {
        return oldjobglbdef28;
    }

    public void setOldjobglbdef28(String oldjobglbdef28) {
        this.oldjobglbdef28 = oldjobglbdef28 == null ? null : oldjobglbdef28.trim();
    }

    public String getNewjobglbdef28() {
        return newjobglbdef28;
    }

    public void setNewjobglbdef28(String newjobglbdef28) {
        this.newjobglbdef28 = newjobglbdef28 == null ? null : newjobglbdef28.trim();
    }
}