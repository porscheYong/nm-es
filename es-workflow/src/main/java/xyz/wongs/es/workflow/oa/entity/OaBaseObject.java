package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/25
 */
public class OaBaseObject extends AtiBaseForm implements Serializable {

    private static final long serialVersionUID = 8413354207023210707L;

    /** 个性表单标识  */
    private Long atiSpecificFormId;

    /** 流程分类标识  */
    private Long atiActCategoryId;

    private String procDefKey;

    private String primaryId;
    /**	基本信息	*/
    private String outStaffId;
    /**	转正	*/
    private String trialId;
    /**	任制	*/
    private String psnjobId;
    /**	离退	*/
    private String retireId;
    /**	奖励	*/
    private String encId;
    /**	惩罚	*/
    private String punishId;
    /**	专业人才队伍	*/
    private String talentTeamId;
    /**	教育经历	*/
    private String eduId;
    /**	人员家庭	*/
    private String familyId;
    /**	专业技术职务	*/
    private String titleId;
    /**	政治面貌	*/
    private String partyLogId;
    /** 历史数据主键 */
    private String primaryIdHis;

    private String firstText;

    private String secondText;

    private String thirdText;

    private String fourthText;

    private String fifthText;

    public Long getAtiSpecificFormId() {
        return atiSpecificFormId;
    }

    public void setAtiSpecificFormId(Long atiSpecificFormId) {
        this.atiSpecificFormId = atiSpecificFormId;
    }

    public Long getAtiActCategoryId() {
        return atiActCategoryId;
    }

    public void setAtiActCategoryId(Long atiActCategoryId) {
        this.atiActCategoryId = atiActCategoryId;
    }

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public String getThirdText() {
        return thirdText;
    }

    public void setThirdText(String thirdText) {
        this.thirdText = thirdText;
    }

    public String getFourthText() {
        return fourthText;
    }

    public void setFourthText(String fourthText) {
        this.fourthText = fourthText;
    }

    public String getFifthText() {
        return fifthText;
    }

    public void setFifthText(String fifthText) {
        this.fifthText = fifthText;
    }

    public String getProcDefKey() {
        return procDefKey;
    }

    public void setProcDefKey(String procDefKey) {
        this.procDefKey = procDefKey;
    }

    public String getOutStaffId() {
        return outStaffId;
    }

    public void setOutStaffId(String outStaffId) {
        this.outStaffId = outStaffId;
    }

    public String getTrialId() {
        return trialId;
    }

    public void setTrialId(String trialId) {
        this.trialId = trialId;
    }

    public String getPsnjobId() {
        return psnjobId;
    }

    public void setPsnjobId(String psnjobId) {
        this.psnjobId = psnjobId;
    }

    public String getRetireId() {
        return retireId;
    }

    public void setRetireId(String retireId) {
        this.retireId = retireId;
    }

    public String getEncId() {
        return encId;
    }

    public void setEncId(String encId) {
        this.encId = encId;
    }

    public String getPunishId() {
        return punishId;
    }

    public void setPunishId(String punishId) {
        this.punishId = punishId;
    }

    public String getTalentTeamId() {
        return talentTeamId;
    }

    public void setTalentTeamId(String talentTeamId) {
        this.talentTeamId = talentTeamId;
    }

    public String getEduId() {
        return eduId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public String getFamilyId() {
        return familyId;
    }

    public void setFamilyId(String familyId) {
        this.familyId = familyId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public String getPartyLogId() {
        return partyLogId;
    }

    public void setPartyLogId(String partyLogId) {
        this.partyLogId = partyLogId;
    }

    public String getPrimaryIdHis() {
        return primaryIdHis;
    }

    public void setPrimaryIdHis(String primaryIdHis) {
        this.primaryIdHis = primaryIdHis;
    }

    public String getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }
}
