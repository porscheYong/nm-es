package xyz.wongs.es.zbdata.contract.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @Author Wang Yiren
 * @Description //TODO 薪酬合同--月度薪酬
 * @Date 17:05 2018/10/25
 * @Param 
 * @return 
 **/
public class JxSalaryContractMonth extends DataEntity<JxSalaryContractMonth>{

    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxContractMonthId;

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

    @CsvBindByName(column = "post_sequence")
    private String postSequence;

    @CsvBindByName(column = "injury")
    private String injury;

    @CsvBindByName(column = "job_level")
    private BigDecimal jobLevel;

    @CsvBindByName(column = "job_wages_reissue")
    private BigDecimal jobWagesReissue;

    @CsvBindByName(column = "job_wages_repl")
    private BigDecimal jobWagesRepl;

    @CsvBindByName(column = "month_jx_pay")
    private BigDecimal monthJxPay;

    @CsvBindByName(column = "rei_month_jx_pay")
    private BigDecimal reiMonthJxPay;

    @CsvBindByName(column = "repl_month_jx_pay")
    private BigDecimal replMonthJxPay;

    @CsvBindByName(column = "zx_business_jl")
    private BigDecimal zxBusinessJl;

    @CsvBindByName(column = "year_allowance")
    private BigDecimal yearAllowance;

    @CsvBindByName(column = "comprehensive_subsidy")
    private BigDecimal comprehensiveSubsidy;

    @CsvBindByName(column = "speciality_subsidy")
    private BigDecimal specialitySubsidy;

    @CsvBindByName(column = "example_allowance")
    private BigDecimal exampleAllowance;

    @CsvBindByName(column = "outside_subsidy")
    private BigDecimal outsideSubsidy;

    @CsvBindByName(column = "cold_subsidy")
    private BigDecimal coldSubsidy;

    @CsvBindByName(column = "monitor_allowance")
    private BigDecimal monitorAllowance;

    @CsvBindByName(column = "overtime_pay")
    private BigDecimal overtimePay;

    @CsvBindByName(column = "night_allowance")
    private BigDecimal nightAllowance;

    @CsvBindByName(column = "other_pay")
    private BigDecimal otherPay;

    @CsvBindByName(column = "good_pay")
    private BigDecimal goodPay;

    @CsvBindByName(column = "attendance_deduction")
    private BigDecimal attendanceDeduction;

    @CsvBindByName(column = "heatstroke_pay")
    private BigDecimal heatstrokePay;

    @CsvBindByName(column = "female_allowance")
    private BigDecimal femaleAllowance;

    @CsvBindByName(column = "heating_allowance")
    private BigDecimal heatingAllowance;

    @CsvBindByName(column = "difficulty_subsidy")
    private BigDecimal difficultySubsidy;

    @CsvBindByName(column = "total_due")
    private BigDecimal totalDue;

    @CsvBindByName(column = "remarks")
    private String remarks;

    @CsvBindByName(column = "basic_medical_gr_bu")
    private BigDecimal basicMedicalGrBu;

    @CsvBindByName(column = "large_medical_gr_bu")
    private BigDecimal largeMedicalGrBu;

    @CsvBindByName(column = "basic_old_gr_bu")
    private BigDecimal basicOldGrBu;

    @CsvBindByName(column = "lose_work_gr_bu")
    private BigDecimal loseWorkGrBu;

    @CsvBindByName(column = "house_fund_gr_bu")
    private BigDecimal houseFundGrBu;

    @CsvBindByName(column = "company_annuity_gr_bu")
    private BigDecimal companyAnnuityGrBu;

    @CsvBindByName(column = "telephone_sum_js")
    private BigDecimal telephoneSumJs;

    @CsvBindByName(column = "fare_sum_js")
    private BigDecimal fareSumJs;

    @CsvBindByName(column = "catering_js")
    private BigDecimal cateringJs;

    @CsvBindByName(column = "welfare_js")
    private BigDecimal welfareJs;

    @CsvBindByName(column = "other_sum_js")
    private BigDecimal otherSumJs;

    @CsvBindByName(column = "this_button_numb")
    private BigDecimal thisButtonNumb;

    @CsvBindByName(column = "this_button_amount")
    private BigDecimal thisButtonAmount;

    @CsvBindByName(column = "deduction_sum")
    private BigDecimal deductionSum;

    @CsvBindByName(column = "actual_hair_sum")
    private BigDecimal actualHairSum;

    @CsvBindByName(column = "basic_medical_dw_fd")
    private BigDecimal basicMedicalDwFd;

    @CsvBindByName(column = "large_medical_dw_fd")
    private BigDecimal largeMedicalDwFd;

    @CsvBindByName(column = "basic_old_dw_fd")
    private BigDecimal basicOldDwFd;

    @CsvBindByName(column = "lose_work_dw_fd")
    private BigDecimal loseWorkDwFd;

    @CsvBindByName(column = "house_fund_dw_fd")
    private BigDecimal houseFundDwFd;

    @CsvBindByName(column = "birth_dw_fd")
    private BigDecimal birthDwFd;

    @CsvBindByName(column = "injury_dw_fd")
    private BigDecimal injuryDwFd;

    @CsvBindByName(column = "basic_old_dw_bj")
    private BigDecimal basicOldDwBj;

    @CsvBindByName(column = "lose_work_dw_bj")
    private BigDecimal loseWorkDwBj;

    @CsvBindByName(column = "house_fund_dw_bj")
    private BigDecimal houseFundDwBj;

    @CsvBindByName(column = "birth_dw_bj")
    private BigDecimal birthDwBj;

    @CsvBindByName(column = "injury_dw_bj")
    private BigDecimal injuryDwBj;

    @CsvBindByName(column = "basic_medical_dw_bj")
    private BigDecimal basicMedicalDwBj;

    @CsvBindByName(column = "large_medical_dw_bj")
    private BigDecimal largeMedicalDwBj;

    @CsvBindByName(column = "basic_medical_gr_bj")
    private BigDecimal basicMedicalGrBj;

    @CsvBindByName(column = "large_medical_gr_bj")
    private BigDecimal largeMedicalGrBj;

    @CsvBindByName(column = "basic_old_gr_bj")
    private BigDecimal basicOldGrBj;

    @CsvBindByName(column = "lose_work_gr_bj")
    private BigDecimal loseWorkGrBj;

    @CsvBindByName(column = "house_fund_gr_bj")
    private BigDecimal houseFundGrBj;

    public Integer getJxContractMonthId() {
        return jxContractMonthId;
    }

    public void setJxContractMonthId(Integer jxContractMonthId) {
        this.jxContractMonthId = jxContractMonthId;
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

    public BigDecimal getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(BigDecimal jobLevel) {
        this.jobLevel = jobLevel;
    }

    public BigDecimal getJobWagesReissue() {
        return jobWagesReissue;
    }

    public void setJobWagesReissue(BigDecimal jobWagesReissue) {
        this.jobWagesReissue = jobWagesReissue;
    }

    public BigDecimal getJobWagesRepl() {
        return jobWagesRepl;
    }

    public void setJobWagesRepl(BigDecimal jobWagesRepl) {
        this.jobWagesRepl = jobWagesRepl;
    }

    public BigDecimal getMonthJxPay() {
        return monthJxPay;
    }

    public void setMonthJxPay(BigDecimal monthJxPay) {
        this.monthJxPay = monthJxPay;
    }

    public BigDecimal getReiMonthJxPay() {
        return reiMonthJxPay;
    }

    public void setReiMonthJxPay(BigDecimal reiMonthJxPay) {
        this.reiMonthJxPay = reiMonthJxPay;
    }

    public BigDecimal getReplMonthJxPay() {
        return replMonthJxPay;
    }

    public void setReplMonthJxPay(BigDecimal replMonthJxPay) {
        this.replMonthJxPay = replMonthJxPay;
    }

    public BigDecimal getZxBusinessJl() {
        return zxBusinessJl;
    }

    public void setZxBusinessJl(BigDecimal zxBusinessJl) {
        this.zxBusinessJl = zxBusinessJl;
    }

    public BigDecimal getYearAllowance() {
        return yearAllowance;
    }

    public void setYearAllowance(BigDecimal yearAllowance) {
        this.yearAllowance = yearAllowance;
    }

    public BigDecimal getComprehensiveSubsidy() {
        return comprehensiveSubsidy;
    }

    public void setComprehensiveSubsidy(BigDecimal comprehensiveSubsidy) {
        this.comprehensiveSubsidy = comprehensiveSubsidy;
    }

    public BigDecimal getSpecialitySubsidy() {
        return specialitySubsidy;
    }

    public void setSpecialitySubsidy(BigDecimal specialitySubsidy) {
        this.specialitySubsidy = specialitySubsidy;
    }

    public BigDecimal getExampleAllowance() {
        return exampleAllowance;
    }

    public void setExampleAllowance(BigDecimal exampleAllowance) {
        this.exampleAllowance = exampleAllowance;
    }

    public BigDecimal getOutsideSubsidy() {
        return outsideSubsidy;
    }

    public void setOutsideSubsidy(BigDecimal outsideSubsidy) {
        this.outsideSubsidy = outsideSubsidy;
    }

    public BigDecimal getColdSubsidy() {
        return coldSubsidy;
    }

    public void setColdSubsidy(BigDecimal coldSubsidy) {
        this.coldSubsidy = coldSubsidy;
    }

    public BigDecimal getMonitorAllowance() {
        return monitorAllowance;
    }

    public void setMonitorAllowance(BigDecimal monitorAllowance) {
        this.monitorAllowance = monitorAllowance;
    }

    public BigDecimal getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(BigDecimal overtimePay) {
        this.overtimePay = overtimePay;
    }

    public BigDecimal getNightAllowance() {
        return nightAllowance;
    }

    public void setNightAllowance(BigDecimal nightAllowance) {
        this.nightAllowance = nightAllowance;
    }

    public BigDecimal getOtherPay() {
        return otherPay;
    }

    public void setOtherPay(BigDecimal otherPay) {
        this.otherPay = otherPay;
    }

    public BigDecimal getGoodPay() {
        return goodPay;
    }

    public void setGoodPay(BigDecimal goodPay) {
        this.goodPay = goodPay;
    }

    public BigDecimal getAttendanceDeduction() {
        return attendanceDeduction;
    }

    public void setAttendanceDeduction(BigDecimal attendanceDeduction) {
        this.attendanceDeduction = attendanceDeduction;
    }

    public BigDecimal getHeatstrokePay() {
        return heatstrokePay;
    }

    public void setHeatstrokePay(BigDecimal heatstrokePay) {
        this.heatstrokePay = heatstrokePay;
    }

    public BigDecimal getFemaleAllowance() {
        return femaleAllowance;
    }

    public void setFemaleAllowance(BigDecimal femaleAllowance) {
        this.femaleAllowance = femaleAllowance;
    }

    public BigDecimal getHeatingAllowance() {
        return heatingAllowance;
    }

    public void setHeatingAllowance(BigDecimal heatingAllowance) {
        this.heatingAllowance = heatingAllowance;
    }

    public BigDecimal getDifficultySubsidy() {
        return difficultySubsidy;
    }

    public void setDifficultySubsidy(BigDecimal difficultySubsidy) {
        this.difficultySubsidy = difficultySubsidy;
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

    public BigDecimal getBasicMedicalGrBu() {
        return basicMedicalGrBu;
    }

    public void setBasicMedicalGrBu(BigDecimal basicMedicalGrBu) {
        this.basicMedicalGrBu = basicMedicalGrBu;
    }

    public BigDecimal getLargeMedicalGrBu() {
        return largeMedicalGrBu;
    }

    public void setLargeMedicalGrBu(BigDecimal largeMedicalGrBu) {
        this.largeMedicalGrBu = largeMedicalGrBu;
    }

    public BigDecimal getBasicOldGrBu() {
        return basicOldGrBu;
    }

    public void setBasicOldGrBu(BigDecimal basicOldGrBu) {
        this.basicOldGrBu = basicOldGrBu;
    }

    public BigDecimal getLoseWorkGrBu() {
        return loseWorkGrBu;
    }

    public void setLoseWorkGrBu(BigDecimal loseWorkGrBu) {
        this.loseWorkGrBu = loseWorkGrBu;
    }

    public BigDecimal getHouseFundGrBu() {
        return houseFundGrBu;
    }

    public void setHouseFundGrBu(BigDecimal houseFundGrBu) {
        this.houseFundGrBu = houseFundGrBu;
    }

    public BigDecimal getCompanyAnnuityGrBu() {
        return companyAnnuityGrBu;
    }

    public void setCompanyAnnuityGrBu(BigDecimal companyAnnuityGrBu) {
        this.companyAnnuityGrBu = companyAnnuityGrBu;
    }

    public BigDecimal getTelephoneSumJs() {
        return telephoneSumJs;
    }

    public void setTelephoneSumJs(BigDecimal telephoneSumJs) {
        this.telephoneSumJs = telephoneSumJs;
    }

    public BigDecimal getFareSumJs() {
        return fareSumJs;
    }

    public void setFareSumJs(BigDecimal fareSumJs) {
        this.fareSumJs = fareSumJs;
    }

    public BigDecimal getCateringJs() {
        return cateringJs;
    }

    public void setCateringJs(BigDecimal cateringJs) {
        this.cateringJs = cateringJs;
    }

    public BigDecimal getWelfareJs() {
        return welfareJs;
    }

    public void setWelfareJs(BigDecimal welfareJs) {
        this.welfareJs = welfareJs;
    }

    public BigDecimal getOtherSumJs() {
        return otherSumJs;
    }

    public void setOtherSumJs(BigDecimal otherSumJs) {
        this.otherSumJs = otherSumJs;
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

    public BigDecimal getDeductionSum() {
        return deductionSum;
    }

    public void setDeductionSum(BigDecimal deductionSum) {
        this.deductionSum = deductionSum;
    }

    public BigDecimal getActualHairSum() {
        return actualHairSum;
    }

    public void setActualHairSum(BigDecimal actualHairSum) {
        this.actualHairSum = actualHairSum;
    }

    public BigDecimal getBasicMedicalDwFd() {
        return basicMedicalDwFd;
    }

    public void setBasicMedicalDwFd(BigDecimal basicMedicalDwFd) {
        this.basicMedicalDwFd = basicMedicalDwFd;
    }

    public BigDecimal getLargeMedicalDwFd() {
        return largeMedicalDwFd;
    }

    public void setLargeMedicalDwFd(BigDecimal largeMedicalDwFd) {
        this.largeMedicalDwFd = largeMedicalDwFd;
    }

    public BigDecimal getBasicOldDwFd() {
        return basicOldDwFd;
    }

    public void setBasicOldDwFd(BigDecimal basicOldDwFd) {
        this.basicOldDwFd = basicOldDwFd;
    }

    public BigDecimal getLoseWorkDwFd() {
        return loseWorkDwFd;
    }

    public void setLoseWorkDwFd(BigDecimal loseWorkDwFd) {
        this.loseWorkDwFd = loseWorkDwFd;
    }

    public BigDecimal getHouseFundDwFd() {
        return houseFundDwFd;
    }

    public void setHouseFundDwFd(BigDecimal houseFundDwFd) {
        this.houseFundDwFd = houseFundDwFd;
    }

    public BigDecimal getBirthDwFd() {
        return birthDwFd;
    }

    public void setBirthDwFd(BigDecimal birthDwFd) {
        this.birthDwFd = birthDwFd;
    }

    public BigDecimal getInjuryDwFd() {
        return injuryDwFd;
    }

    public void setInjuryDwFd(BigDecimal injuryDwFd) {
        this.injuryDwFd = injuryDwFd;
    }

    public BigDecimal getBasicOldDwBj() {
        return basicOldDwBj;
    }

    public void setBasicOldDwBj(BigDecimal basicOldDwBj) {
        this.basicOldDwBj = basicOldDwBj;
    }

    public BigDecimal getLoseWorkDwBj() {
        return loseWorkDwBj;
    }

    public void setLoseWorkDwBj(BigDecimal loseWorkDwBj) {
        this.loseWorkDwBj = loseWorkDwBj;
    }

    public BigDecimal getHouseFundDwBj() {
        return houseFundDwBj;
    }

    public void setHouseFundDwBj(BigDecimal houseFundDwBj) {
        this.houseFundDwBj = houseFundDwBj;
    }

    public BigDecimal getBirthDwBj() {
        return birthDwBj;
    }

    public void setBirthDwBj(BigDecimal birthDwBj) {
        this.birthDwBj = birthDwBj;
    }

    public BigDecimal getInjuryDwBj() {
        return injuryDwBj;
    }

    public void setInjuryDwBj(BigDecimal injuryDwBj) {
        this.injuryDwBj = injuryDwBj;
    }

    public BigDecimal getBasicMedicalDwBj() {
        return basicMedicalDwBj;
    }

    public void setBasicMedicalDwBj(BigDecimal basicMedicalDwBj) {
        this.basicMedicalDwBj = basicMedicalDwBj;
    }

    public BigDecimal getLargeMedicalDwBj() {
        return largeMedicalDwBj;
    }

    public void setLargeMedicalDwBj(BigDecimal largeMedicalDwBj) {
        this.largeMedicalDwBj = largeMedicalDwBj;
    }

    public BigDecimal getBasicMedicalGrBj() {
        return basicMedicalGrBj;
    }

    public void setBasicMedicalGrBj(BigDecimal basicMedicalGrBj) {
        this.basicMedicalGrBj = basicMedicalGrBj;
    }

    public BigDecimal getLargeMedicalGrBj() {
        return largeMedicalGrBj;
    }

    public void setLargeMedicalGrBj(BigDecimal largeMedicalGrBj) {
        this.largeMedicalGrBj = largeMedicalGrBj;
    }

    public BigDecimal getBasicOldGrBj() {
        return basicOldGrBj;
    }

    public void setBasicOldGrBj(BigDecimal basicOldGrBj) {
        this.basicOldGrBj = basicOldGrBj;
    }

    public BigDecimal getLoseWorkGrBj() {
        return loseWorkGrBj;
    }

    public void setLoseWorkGrBj(BigDecimal loseWorkGrBj) {
        this.loseWorkGrBj = loseWorkGrBj;
    }

    public BigDecimal getHouseFundGrBj() {
        return houseFundGrBj;
    }

    public void setHouseFundGrBj(BigDecimal houseFundGrBj) {
        this.houseFundGrBj = houseFundGrBj;
    }
}