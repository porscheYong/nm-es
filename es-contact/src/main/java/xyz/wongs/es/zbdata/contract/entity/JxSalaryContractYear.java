package xyz.wongs.es.zbdata.contract.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @Author Wang Yiren
 * @Description //TODO 薪酬合同--年终奖
 * @Date 17:06 2018/10/25
 * @Param 
 * @return 
 **/
public class JxSalaryContractYear extends DataEntity<JxSalaryContractYear>{

    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxContractYearId;

    @CsvBindByName(column = "login_name")
    private String loginName;

    @CsvBindByName(column = "user_name")
    private String userName;

    @CsvBindByName(column = "identity_card")
    private String identityCard;

    @CsvBindByName(column = "sex")
    private String sex;

    @CsvBindByName(column = "job_rank")
    private String jobRank;

    @CsvBindByName(column = "job_wages_rank")
    private String jobWagesRank;

    @CsvBindByName(column = "injury")
    private String injury;

    @CsvBindByName(column = "annual_bonus")
    private BigDecimal annualBonus;

    @CsvBindByName(column = "emphasis_zx_reward")
    private BigDecimal emphasisZxReward;

    @CsvBindByName(column = "super_harvest_reward")
    private BigDecimal superHarvestReward;

    @CsvBindByName(column = "year_honour_rew")
    private BigDecimal yearHonourRew;

    @CsvBindByName(column = "year_other")
    private BigDecimal yearOther;

    @CsvBindByName(column = "attendance_deduction")
    private BigDecimal attendanceDeduction;

    @CsvBindByName(column = "total_due")
    private BigDecimal totalDue;

    @CsvBindByName(column = "remarks")
    private String remarks;

    @CsvBindByName(column = "this_button_numb")
    private BigDecimal thisButtonNumb;

    @CsvBindByName(column = "this_button_amount")
    private BigDecimal thisButtonAmount;

    @CsvBindByName(column = "actual_hair_sum")
    private BigDecimal actualHairSum;

    @CsvBindByName(column = "post_sequence")
    private String postSequence;

    @CsvBindByName(column = "year_zx_rew")
    private BigDecimal yearZxRew;

    public Integer getJxContractYearId() {
        return jxContractYearId;
    }

    public void setJxContractYearId(Integer jxContractYearId) {
        this.jxContractYearId = jxContractYearId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJobRank() {
        return jobRank;
    }

    public void setJobRank(String jobRank) {
        this.jobRank = jobRank;
    }

    public String getJobWagesRank() {
        return jobWagesRank;
    }

    public void setJobWagesRank(String jobWagesRank) {
        this.jobWagesRank = jobWagesRank;
    }

    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }

    public BigDecimal getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(BigDecimal annualBonus) {
        this.annualBonus = annualBonus;
    }

    public BigDecimal getEmphasisZxReward() {
        return emphasisZxReward;
    }

    public void setEmphasisZxReward(BigDecimal emphasisZxReward) {
        this.emphasisZxReward = emphasisZxReward;
    }

    public BigDecimal getSuperHarvestReward() {
        return superHarvestReward;
    }

    public void setSuperHarvestReward(BigDecimal superHarvestReward) {
        this.superHarvestReward = superHarvestReward;
    }

    public BigDecimal getYearHonourRew() {
        return yearHonourRew;
    }

    public void setYearHonourRew(BigDecimal yearHonourRew) {
        this.yearHonourRew = yearHonourRew;
    }

    public BigDecimal getYearOther() {
        return yearOther;
    }

    public void setYearOther(BigDecimal yearOther) {
        this.yearOther = yearOther;
    }

    public BigDecimal getAttendanceDeduction() {
        return attendanceDeduction;
    }

    public void setAttendanceDeduction(BigDecimal attendanceDeduction) {
        this.attendanceDeduction = attendanceDeduction;
    }

    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getThisButtonNumb() {
        return thisButtonNumb;
    }

    public void setThisButtonNumb(BigDecimal thisButtonNumb) {
        this.thisButtonNumb = thisButtonNumb;
    }

    public BigDecimal getThisButtonAmount() {
        return thisButtonAmount;
    }

    public void setThisButtonAmount(BigDecimal thisButtonAmount) {
        this.thisButtonAmount = thisButtonAmount;
    }

    public BigDecimal getActualHairSum() {
        return actualHairSum;
    }

    public void setActualHairSum(BigDecimal actualHairSum) {
        this.actualHairSum = actualHairSum;
    }

    public String getPostSequence() {
        return postSequence;
    }

    public void setPostSequence(String postSequence) {
        this.postSequence = postSequence;
    }

    public BigDecimal getYearZxRew() {
        return yearZxRew;
    }

    public void setYearZxRew(BigDecimal yearZxRew) {
        this.yearZxRew = yearZxRew;
    }
}