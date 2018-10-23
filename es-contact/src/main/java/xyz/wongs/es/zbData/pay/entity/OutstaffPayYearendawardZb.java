package xyz.wongs.es.zbData.pay.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @ClassName: OutstaffPayYearendawardZb
 * @Description: TODO 中博提供的数据：外包薪酬--年终奖
 * @Auther: wang Yiren
 * @Date: 2018/10/21 14:57
 * @Vesion 1.0
 */
public class OutstaffPayYearendawardZb extends DataEntity<OutstaffPayYearendawardZb> {
    /**
     * 主键
     **/
    @CsvBindByName(column = "pay_year_id")
    private Long payYearId;
    /**
     * 员工编号
     **/
    @CsvBindByName(column = "login_name")
    private String loginName;
    /**
     * 员工姓名
     **/
    @CsvBindByName(column = "user_name")
    private String userName;
    /**
     * 身份证号码
     **/
    @CsvBindByName(column = "identity_card")
    private String identityCard;
    /**
     * 性别
     **/
    @CsvBindByName(column = "sex")
    private String sex;
    /**
     * 岗位等级
     **/
    @CsvBindByName(column = "job_rank")
    private String jobRank;
    /**
     * 岗位工资档次
     **/
    @CsvBindByName(column = "job_wages_rank")
    private String  jobWagesRank;
    /**
     * 岗位序列
     **/
    @CsvBindByName(column = "post_sequence")
    private String postSequence;
    /**
     * 岗位层级
     **/
    @CsvBindByName(column = "injury")
    private String injury;
    /**
     * 年终奖
     **/
    @CsvBindByName(column = "annual_bonus")
    private BigDecimal annualBonus;
    /**
     * 重点专项工作奖励
     **/
    @CsvBindByName(column = "emphasis_zx_reward")
    private BigDecimal emphasisZxReward;
    /**
     * 超收奖励
     **/
    @CsvBindByName(column = "super_harvest_reward")
    private BigDecimal superHarvestReward;
    /**
     * 年度专项奖励
     **/
    @CsvBindByName(column = "year_zx_rew")
    private BigDecimal yearZxRew;
    /**
     * 年度荣誉奖励
     **/
    @CsvBindByName(column = "year_honour_rew")
    private BigDecimal yearHonourRew;
    /**
     * 年度其他
     **/
    @CsvBindByName(column = "year_other")
    private BigDecimal yearOther;
    /**
     * 考勤扣减
     **/
    @CsvBindByName(column = "attendance_deduction")
    private BigDecimal attendanceDeduction;
    /**
     * 应发合计
     **/
    @CsvBindByName(column = "total_due")
    private BigDecimal totalDue;
    /**
     * 备注
     **/
    @CsvBindByName(column = "remark")
    private String remark;
    /**
     * 本次扣税基数
     **/
    @CsvBindByName(column = "this_button_numb")
    private BigDecimal thisButtonNumb;
    /**
     * 本次扣税额
     **/
    @CsvBindByName(column = "this_button_amount")
    private BigDecimal thisButtonAmount;
    /**
     * 实发合计
     **/
    @CsvBindByName(column = "actual_hair_sum")
    private BigDecimal actualHairSum;

    public Long getPayYearId() {
        return payYearId;
    }

    public void setPayYearId(Long payYearId) {
        this.payYearId = payYearId;
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

    public String getPostSequence() {
        return postSequence;
    }

    public void setPostSequence(String postSequence) {
        this.postSequence = postSequence;
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

    public BigDecimal getYearZxRew() {
        return yearZxRew;
    }

    public void setYearZxRew(BigDecimal yearZxRew) {
        this.yearZxRew = yearZxRew;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    @Override
    public String toString() {
        return "OutstaffPayYearendawardZb{" +
                "payYearId=" + payYearId +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", sex='" + sex + '\'' +
                ", jobRank='" + jobRank + '\'' +
                ", jobWagesRank='" + jobWagesRank + '\'' +
                ", postSequence='" + postSequence + '\'' +
                ", injury='" + injury + '\'' +
                ", annualBonus=" + annualBonus +
                ", emphasisZxReward=" + emphasisZxReward +
                ", superHarvestReward=" + superHarvestReward +
                ", yearZxRew=" + yearZxRew +
                ", yearHonourRew=" + yearHonourRew +
                ", yearOther=" + yearOther +
                ", attendanceDeduction=" + attendanceDeduction +
                ", totalDue=" + totalDue +
                ", remark='" + remark + '\'' +
                ", thisButtonNumb=" + thisButtonNumb +
                ", thisButtonAmount=" + thisButtonAmount +
                ", actualHairSum=" + actualHairSum +
                '}';
    }
}

