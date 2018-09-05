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
    private String staffId;
    private String outStaffId;
    /**	转正	*/
    private String trialId;
    /**	任职	*/
    private String psnjobIdModify;
    private String psnjobIdAdd;
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
    /** 薪资变动情况  */
    private String wadocIdModify;
    private String wadocIdAdd;
    /** 考核信息    */
    private String assId;
    /** 职业资格管理  */
    private String nationdutyId;

    /** 历史数据主键 */
    private String primaryIdHis;

    /**	基本信息	*/
    private String staffIdHis;
    private String outStaffIdHis;
    /**	转正	*/
    private String trialIdHis;
    /**	任制	*/
    private String psnjobIdHis;
    /**	离退	*/
    private String retireIdHis;
    /**	奖励	*/
    private String encIdHis;
    /**	惩罚	*/
    private String punishIdHis;
    /**	专业人才队伍	*/
    private String talentTeamIdHis;
    /**	教育经历	*/
    private String eduIdHis;
    /**	人员家庭	*/
    private String familyIdHis;
    /**	专业技术职务	*/
    private String titleIdHis;
    /**	政治面貌	*/
    private String partyLogIdHis;
    /** 薪资变动情况  */
    private String wadocIdHis;
    /** 考核信息    */
    private String assIdHis;
    /** 职业资格管理  */
    private String nationdutyIdHis;

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

    public String getPsnjobIdModify() {
        return psnjobIdModify;
    }

    public void setPsnjobIdModify(String psnjobIdModify) {
        this.psnjobIdModify = psnjobIdModify;
    }

    public String getPsnjobIdAdd() {
        return psnjobIdAdd;
    }

    public void setPsnjobIdAdd(String psnjobIdAdd) {
        this.psnjobIdAdd = psnjobIdAdd;
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

    public String getWadocIdModify() {
        return wadocIdModify;
    }

    public void setWadocIdModify(String wadocIdModify) {
        this.wadocIdModify = wadocIdModify;
    }

    public String getWadocIdAdd() {
        return wadocIdAdd;
    }

    public void setWadocIdAdd(String wadocIdAdd) {
        this.wadocIdAdd = wadocIdAdd;
    }

    public String getOutStaffIdHis() {
        return outStaffIdHis;
    }

    public void setOutStaffIdHis(String outStaffIdHis) {
        this.outStaffIdHis = outStaffIdHis;
    }

    public String getTrialIdHis() {
        return trialIdHis;
    }

    public void setTrialIdHis(String trialIdHis) {
        this.trialIdHis = trialIdHis;
    }

    public String getPsnjobIdHis() {
        return psnjobIdHis;
    }

    public void setPsnjobIdHis(String psnjobIdHis) {
        this.psnjobIdHis = psnjobIdHis;
    }

    public String getRetireIdHis() {
        return retireIdHis;
    }

    public void setRetireIdHis(String retireIdHis) {
        this.retireIdHis = retireIdHis;
    }

    public String getEncIdHis() {
        return encIdHis;
    }

    public void setEncIdHis(String encIdHis) {
        this.encIdHis = encIdHis;
    }

    public String getPunishIdHis() {
        return punishIdHis;
    }

    public void setPunishIdHis(String punishIdHis) {
        this.punishIdHis = punishIdHis;
    }

    public String getTalentTeamIdHis() {
        return talentTeamIdHis;
    }

    public void setTalentTeamIdHis(String talentTeamIdHis) {
        this.talentTeamIdHis = talentTeamIdHis;
    }

    public String getEduIdHis() {
        return eduIdHis;
    }

    public void setEduIdHis(String eduIdHis) {
        this.eduIdHis = eduIdHis;
    }

    public String getFamilyIdHis() {
        return familyIdHis;
    }

    public void setFamilyIdHis(String familyIdHis) {
        this.familyIdHis = familyIdHis;
    }

    public String getTitleIdHis() {
        return titleIdHis;
    }

    public void setTitleIdHis(String titleIdHis) {
        this.titleIdHis = titleIdHis;
    }

    public String getPartyLogIdHis() {
        return partyLogIdHis;
    }

    public void setPartyLogIdHis(String partyLogIdHis) {
        this.partyLogIdHis = partyLogIdHis;
    }

    public String getWadocIdHis() {
        return wadocIdHis;
    }

    public void setWadocIdHis(String wadocIdHis) {
        this.wadocIdHis = wadocIdHis;
    }

    public String getAssId() {
        return assId;
    }

    public void setAssId(String assId) {
        this.assId = assId;
    }

    public String getAssIdHis() {
        return assIdHis;
    }

    public void setAssIdHis(String assIdHis) {
        this.assIdHis = assIdHis;
    }

    public String getNationdutyId() {
        return nationdutyId;
    }

    public void setNationdutyId(String nationdutyId) {
        this.nationdutyId = nationdutyId;
    }

    public String getNationdutyIdHis() {
        return nationdutyIdHis;
    }

    public void setNationdutyIdHis(String nationdutyIdHis) {
        this.nationdutyIdHis = nationdutyIdHis;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffIdHis() {
        return staffIdHis;
    }

    public void setStaffIdHis(String staffIdHis) {
        this.staffIdHis = staffIdHis;
    }
}
