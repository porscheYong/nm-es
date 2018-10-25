package xyz.wongs.es.zbdata.pay.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @Author Wang Yiren
 * @Description //TODO 中博提供的数据：薪酬外包-月度薪酬
 * @Date 14:04 2018/10/25
 * @Param 
 * @return 
 **/
public class JxOutsourceMonthWages extends DataEntity<JxOutsourceMonthWages>{

    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxMonthWagesId;

    @CsvBindByName(column = "give_period")
    private String givePeriod;

    @CsvBindByName(column = "login_name")
    private String loginName;

    @CsvBindByName(column = "user_name")
    private String userName;

    @CsvBindByName(column = "personnel_type")
    private String personnelType;

    @CsvBindByName(column = "company_name")
    private String companyName;

    @CsvBindByName(column = "dept_name")
    private String deptName;

    @CsvBindByName(column = "post_name")
    private String postName;

    @CsvBindByName(column = "job_rank")
    private String jobRank;

    @CsvBindByName(column = "job_level")
    private String jobLevel;

    @CsvBindByName(column = "bank_number")
    private String bankNumber;

    @CsvBindByName(column = "job_wages")
    private BigDecimal jobWages;

    @CsvBindByName(column = "bf_job_wages")
    private BigDecimal bfJobWages;

    @CsvBindByName(column = "bk_job_wages")
    private BigDecimal bkJobWages;

    @CsvBindByName(column = "month_wages")
    private BigDecimal monthWages;

    @CsvBindByName(column = "bfbk_month_wages")
    private BigDecimal bfbkMonthWages;

    @CsvBindByName(column = "subsidies_sum")
    private BigDecimal subsidiesSum;

    @CsvBindByName(column = "year_end_allowance")
    private BigDecimal yearEndAllowance;

    @CsvBindByName(column = "monitor_allowance")
    private BigDecimal monitorAllowance;

    @CsvBindByName(column = "night_allowance")
    private BigDecimal nightAllowance;

    @CsvBindByName(column = "outside_allowance")
    private BigDecimal outsideAllowance;

    @CsvBindByName(column = "talent_allowance")
    private BigDecimal talentAllowance;

    @CsvBindByName(column = "overtime_allowance")
    private BigDecimal overtimeAllowance;

    @CsvBindByName(column = "year_end_allowances")
    private BigDecimal yearEndAllowances;

    @CsvBindByName(column = "other_allowance")
    private BigDecimal otherAllowance;

    @CsvBindByName(column = "b_other_allowance")
    private BigDecimal bOtherAllowance;

    @CsvBindByName(column = "check_button")
    private BigDecimal checkButton;

    @CsvBindByName(column = "female_protection")
    private BigDecimal femaleProtection;

    @CsvBindByName(column = "supply_heating")
    private BigDecimal supplyHeating;

    @CsvBindByName(column = "cooling_subsidy")
    private BigDecimal coolingSubsidy;

    @CsvBindByName(column = "difficulty_subsidy")
    private BigDecimal difficultySubsidy;

    @CsvBindByName(column = "due_sum")
    private BigDecimal dueSum;

    @CsvBindByName(column = "basic_old_gr")
    private BigDecimal basicOldGr;

    @CsvBindByName(column = "basic_medical_gr")
    private BigDecimal basicMedicalGr;

    @CsvBindByName(column = "large_medical_gr")
    private BigDecimal largeMedicalGr;

    @CsvBindByName(column = "lose_work_gr")
    private BigDecimal loseWorkGr;

    @CsvBindByName(column = "house_fund_gr")
    private BigDecimal houseFundGr;

    @CsvBindByName(column = "basic_old_gr_bk")
    private BigDecimal basicOldGrBk;

    @CsvBindByName(column = "basic_medical_gr_bk")
    private BigDecimal basicMedicalGrBk;

    @CsvBindByName(column = "large_medical_gr_bk")
    private BigDecimal largeMedicalGrBk;

    @CsvBindByName(column = "lose_work_gr_bk")
    private BigDecimal loseWorkGrBk;

    @CsvBindByName(column = "house_fund_gr_bk")
    private BigDecimal houseFundGrBk;

    @CsvBindByName(column = "gr_insurance_sum")
    private BigDecimal grInsuranceSum;

    @CsvBindByName(column = "call_js_amount")
    private BigDecimal callJsAmount;

    @CsvBindByName(column = "traffic_js_amount")
    private BigDecimal trafficJsAmount;

    @CsvBindByName(column = "other_js_amount")
    private BigDecimal otherJsAmount;

    @CsvBindByName(column = "wages_tax")
    private BigDecimal wagesTax;

    @CsvBindByName(column = "year_end_tax")
    private BigDecimal yearEndTax;

    @CsvBindByName(column = "yk_tax")
    private BigDecimal ykTax;

    @CsvBindByName(column = "this_tax")
    private BigDecimal thisTax;

    @CsvBindByName(column = "button_sum")
    private BigDecimal buttonSum;

    @CsvBindByName(column = "after_tax")
    private BigDecimal afterTax;

    @CsvBindByName(column = "mis_eating")
    private BigDecimal misEating;

    @CsvBindByName(column = "festival_benefits")
    private BigDecimal festivalBenefits;

    @CsvBindByName(column = "other_benefits")
    private BigDecimal otherBenefits;

    @CsvBindByName(column = "birthday_cost")
    private BigDecimal birthdayCost;

    @CsvBindByName(column = "check_cost")
    private BigDecimal checkCost;

    @CsvBindByName(column = "canteen_welfare")
    private BigDecimal canteenWelfare;

    @CsvBindByName(column = "appease_reward")
    private BigDecimal appeaseReward;

    @CsvBindByName(column = "charges_reward")
    private BigDecimal chargesReward;

    @CsvBindByName(column = "traffic_reward")
    private BigDecimal trafficReward;

    @CsvBindByName(column = "warm_cost")
    private BigDecimal warmCost;

    @CsvBindByName(column = "retirement_cost")
    private BigDecimal retirementCost;

    @CsvBindByName(column = "compensation")
    private BigDecimal compensation;

    @CsvBindByName(column = "compensation_tax")
    private BigDecimal compensationTax;

    @CsvBindByName(column = "this_tax_deduction")
    private BigDecimal thisTaxDeduction;

    @CsvBindByName(column = "already_button_amount")
    private BigDecimal alreadyButtonAmount;

    @CsvBindByName(column = "treat_add")
    private BigDecimal treatAdd;

    @CsvBindByName(column = "trade_union_cost")
    private BigDecimal tradeUnionCost;

    @CsvBindByName(column = "business_cost")
    private BigDecimal businessCost;

    @CsvBindByName(column = "training_cost")
    private BigDecimal trainingCost;

    @CsvBindByName(column = "sy_system_cost")
    private BigDecimal sySystemCost;

    @CsvBindByName(column = "basic_old_dw")
    private BigDecimal basicOldDw;

    @CsvBindByName(column = "basic_medical_dw")
    private BigDecimal basicMedicalDw;

    @CsvBindByName(column = "large_medical_dw")
    private BigDecimal largeMedicalDw;

    @CsvBindByName(column = "lose_work_dw")
    private BigDecimal loseWorkDw;

    @CsvBindByName(column = "injury_dw")
    private BigDecimal injuryDw;

    @CsvBindByName(column = "birth_dw")
    private BigDecimal birthDw;

    @CsvBindByName(column = "house_fund_dw")
    private BigDecimal houseFundDw;

    @CsvBindByName(column = "basic_old_dw_bj")
    private BigDecimal basicOldDwBj;

    @CsvBindByName(column = "basic_medical_dw_bj")
    private BigDecimal basicMedicalDwBj;

    @CsvBindByName(column = "large_medical_dw_bj")
    private BigDecimal largeMedicalDwBj;

    @CsvBindByName(column = "lose_work_dw_bj")
    private BigDecimal loseWorkDwBj;

    @CsvBindByName(column = "injury_dw_bj")
    private BigDecimal injuryDwBj;

    @CsvBindByName(column = "birth_dw_bj")
    private BigDecimal birthDwBj;

    @CsvBindByName(column = "house_fund_dw_bj")
    private BigDecimal houseFundDwBj;

    @CsvBindByName(column = "dw_insurance_sum")
    private BigDecimal dwInsuranceSum;

    @CsvBindByName(column = "enterprise_month_sum")
    private BigDecimal enterpriseMonthSum;

    @CsvBindByName(column = "personnel_cost")
    private BigDecimal personnelCost;

    @CsvBindByName(column = "management_tax")
    private BigDecimal managementTax;

    @CsvBindByName(column = "management_tax_x")
    private BigDecimal managementTaxX;

    @CsvBindByName(column = "enterprise_tax_sum")
    private BigDecimal enterpriseTaxSum;

    @CsvBindByName(column = "remarks")
    private String remarks;

    @CsvBindByName(column = "wages_sum")
    private BigDecimal wagesSum;

    @CsvBindByName(column = "management_sum")
    private BigDecimal managementSum;

    @CsvBindByName(column = "welfare_sum")
    private BigDecimal welfareSum;

    @CsvBindByName(column = "basic_old_gr_js")
    private BigDecimal basicOldGrJs;

    @CsvBindByName(column = "basic_old_dw_js")
    private BigDecimal basicOldDwJs;

    @CsvBindByName(column = "medical_js")
    private BigDecimal medicalJs;

    @CsvBindByName(column = "lose_work_js")
    private BigDecimal loseWorkJs;

    @CsvBindByName(column = "injury_js")
    private BigDecimal injuryJs;

    @CsvBindByName(column = "birth_js")
    private BigDecimal birthJs;

    @CsvBindByName(column = "house_fund_js")
    private BigDecimal houseFundJs;

    @CsvBindByName(column = "compensator_month")
    private BigDecimal compensatorMonth;

    public Integer getJxMonthWagesId() {
        return jxMonthWagesId;
    }

    public void setJxMonthWagesId(Integer jxMonthWagesId) {
        this.jxMonthWagesId = jxMonthWagesId;
    }

    public String getGivePeriod() {
        return givePeriod;
    }

    public void setGivePeriod(String givePeriod) {
        this.givePeriod = givePeriod;
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

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getJobRank() {
        return jobRank;
    }

    public void setJobRank(String jobRank) {
        this.jobRank = jobRank;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public BigDecimal getJobWages() {
        return jobWages;
    }

    public void setJobWages(BigDecimal jobWages) {
        this.jobWages = jobWages;
    }

    public BigDecimal getBfJobWages() {
        return bfJobWages;
    }

    public void setBfJobWages(BigDecimal bfJobWages) {
        this.bfJobWages = bfJobWages;
    }

    public BigDecimal getBkJobWages() {
        return bkJobWages;
    }

    public void setBkJobWages(BigDecimal bkJobWages) {
        this.bkJobWages = bkJobWages;
    }

    public BigDecimal getMonthWages() {
        return monthWages;
    }

    public void setMonthWages(BigDecimal monthWages) {
        this.monthWages = monthWages;
    }

    public BigDecimal getBfbkMonthWages() {
        return bfbkMonthWages;
    }

    public void setBfbkMonthWages(BigDecimal bfbkMonthWages) {
        this.bfbkMonthWages = bfbkMonthWages;
    }

    public BigDecimal getSubsidiesSum() {
        return subsidiesSum;
    }

    public void setSubsidiesSum(BigDecimal subsidiesSum) {
        this.subsidiesSum = subsidiesSum;
    }

    public BigDecimal getYearEndAllowance() {
        return yearEndAllowance;
    }

    public void setYearEndAllowance(BigDecimal yearEndAllowance) {
        this.yearEndAllowance = yearEndAllowance;
    }

    public BigDecimal getMonitorAllowance() {
        return monitorAllowance;
    }

    public void setMonitorAllowance(BigDecimal monitorAllowance) {
        this.monitorAllowance = monitorAllowance;
    }

    public BigDecimal getNightAllowance() {
        return nightAllowance;
    }

    public void setNightAllowance(BigDecimal nightAllowance) {
        this.nightAllowance = nightAllowance;
    }

    public BigDecimal getOutsideAllowance() {
        return outsideAllowance;
    }

    public void setOutsideAllowance(BigDecimal outsideAllowance) {
        this.outsideAllowance = outsideAllowance;
    }

    public BigDecimal getTalentAllowance() {
        return talentAllowance;
    }

    public void setTalentAllowance(BigDecimal talentAllowance) {
        this.talentAllowance = talentAllowance;
    }

    public BigDecimal getOvertimeAllowance() {
        return overtimeAllowance;
    }

    public void setOvertimeAllowance(BigDecimal overtimeAllowance) {
        this.overtimeAllowance = overtimeAllowance;
    }

    public BigDecimal getYearEndAllowances() {
        return yearEndAllowances;
    }

    public void setYearEndAllowances(BigDecimal yearEndAllowances) {
        this.yearEndAllowances = yearEndAllowances;
    }

    public BigDecimal getOtherAllowance() {
        return otherAllowance;
    }

    public void setOtherAllowance(BigDecimal otherAllowance) {
        this.otherAllowance = otherAllowance;
    }

    public BigDecimal getbOtherAllowance() {
        return bOtherAllowance;
    }

    public void setbOtherAllowance(BigDecimal bOtherAllowance) {
        this.bOtherAllowance = bOtherAllowance;
    }

    public BigDecimal getCheckButton() {
        return checkButton;
    }

    public void setCheckButton(BigDecimal checkButton) {
        this.checkButton = checkButton;
    }

    public BigDecimal getFemaleProtection() {
        return femaleProtection;
    }

    public void setFemaleProtection(BigDecimal femaleProtection) {
        this.femaleProtection = femaleProtection;
    }

    public BigDecimal getSupplyHeating() {
        return supplyHeating;
    }

    public void setSupplyHeating(BigDecimal supplyHeating) {
        this.supplyHeating = supplyHeating;
    }

    public BigDecimal getCoolingSubsidy() {
        return coolingSubsidy;
    }

    public void setCoolingSubsidy(BigDecimal coolingSubsidy) {
        this.coolingSubsidy = coolingSubsidy;
    }

    public BigDecimal getDifficultySubsidy() {
        return difficultySubsidy;
    }

    public void setDifficultySubsidy(BigDecimal difficultySubsidy) {
        this.difficultySubsidy = difficultySubsidy;
    }

    public BigDecimal getDueSum() {
        return dueSum;
    }

    public void setDueSum(BigDecimal dueSum) {
        this.dueSum = dueSum;
    }

    public BigDecimal getBasicOldGr() {
        return basicOldGr;
    }

    public void setBasicOldGr(BigDecimal basicOldGr) {
        this.basicOldGr = basicOldGr;
    }

    public BigDecimal getBasicMedicalGr() {
        return basicMedicalGr;
    }

    public void setBasicMedicalGr(BigDecimal basicMedicalGr) {
        this.basicMedicalGr = basicMedicalGr;
    }

    public BigDecimal getLargeMedicalGr() {
        return largeMedicalGr;
    }

    public void setLargeMedicalGr(BigDecimal largeMedicalGr) {
        this.largeMedicalGr = largeMedicalGr;
    }

    public BigDecimal getLoseWorkGr() {
        return loseWorkGr;
    }

    public void setLoseWorkGr(BigDecimal loseWorkGr) {
        this.loseWorkGr = loseWorkGr;
    }

    public BigDecimal getHouseFundGr() {
        return houseFundGr;
    }

    public void setHouseFundGr(BigDecimal houseFundGr) {
        this.houseFundGr = houseFundGr;
    }

    public BigDecimal getBasicOldGrBk() {
        return basicOldGrBk;
    }

    public void setBasicOldGrBk(BigDecimal basicOldGrBk) {
        this.basicOldGrBk = basicOldGrBk;
    }

    public BigDecimal getBasicMedicalGrBk() {
        return basicMedicalGrBk;
    }

    public void setBasicMedicalGrBk(BigDecimal basicMedicalGrBk) {
        this.basicMedicalGrBk = basicMedicalGrBk;
    }

    public BigDecimal getLargeMedicalGrBk() {
        return largeMedicalGrBk;
    }

    public void setLargeMedicalGrBk(BigDecimal largeMedicalGrBk) {
        this.largeMedicalGrBk = largeMedicalGrBk;
    }

    public BigDecimal getLoseWorkGrBk() {
        return loseWorkGrBk;
    }

    public void setLoseWorkGrBk(BigDecimal loseWorkGrBk) {
        this.loseWorkGrBk = loseWorkGrBk;
    }

    public BigDecimal getHouseFundGrBk() {
        return houseFundGrBk;
    }

    public void setHouseFundGrBk(BigDecimal houseFundGrBk) {
        this.houseFundGrBk = houseFundGrBk;
    }

    public BigDecimal getGrInsuranceSum() {
        return grInsuranceSum;
    }

    public void setGrInsuranceSum(BigDecimal grInsuranceSum) {
        this.grInsuranceSum = grInsuranceSum;
    }

    public BigDecimal getCallJsAmount() {
        return callJsAmount;
    }

    public void setCallJsAmount(BigDecimal callJsAmount) {
        this.callJsAmount = callJsAmount;
    }

    public BigDecimal getTrafficJsAmount() {
        return trafficJsAmount;
    }

    public void setTrafficJsAmount(BigDecimal trafficJsAmount) {
        this.trafficJsAmount = trafficJsAmount;
    }

    public BigDecimal getOtherJsAmount() {
        return otherJsAmount;
    }

    public void setOtherJsAmount(BigDecimal otherJsAmount) {
        this.otherJsAmount = otherJsAmount;
    }

    public BigDecimal getWagesTax() {
        return wagesTax;
    }

    public void setWagesTax(BigDecimal wagesTax) {
        this.wagesTax = wagesTax;
    }

    public BigDecimal getYearEndTax() {
        return yearEndTax;
    }

    public void setYearEndTax(BigDecimal yearEndTax) {
        this.yearEndTax = yearEndTax;
    }

    public BigDecimal getYkTax() {
        return ykTax;
    }

    public void setYkTax(BigDecimal ykTax) {
        this.ykTax = ykTax;
    }

    public BigDecimal getThisTax() {
        return thisTax;
    }

    public void setThisTax(BigDecimal thisTax) {
        this.thisTax = thisTax;
    }

    public BigDecimal getButtonSum() {
        return buttonSum;
    }

    public void setButtonSum(BigDecimal buttonSum) {
        this.buttonSum = buttonSum;
    }

    public BigDecimal getAfterTax() {
        return afterTax;
    }

    public void setAfterTax(BigDecimal afterTax) {
        this.afterTax = afterTax;
    }

    public BigDecimal getMisEating() {
        return misEating;
    }

    public void setMisEating(BigDecimal misEating) {
        this.misEating = misEating;
    }

    public BigDecimal getFestivalBenefits() {
        return festivalBenefits;
    }

    public void setFestivalBenefits(BigDecimal festivalBenefits) {
        this.festivalBenefits = festivalBenefits;
    }

    public BigDecimal getOtherBenefits() {
        return otherBenefits;
    }

    public void setOtherBenefits(BigDecimal otherBenefits) {
        this.otherBenefits = otherBenefits;
    }

    public BigDecimal getBirthdayCost() {
        return birthdayCost;
    }

    public void setBirthdayCost(BigDecimal birthdayCost) {
        this.birthdayCost = birthdayCost;
    }

    public BigDecimal getCheckCost() {
        return checkCost;
    }

    public void setCheckCost(BigDecimal checkCost) {
        this.checkCost = checkCost;
    }

    public BigDecimal getCanteenWelfare() {
        return canteenWelfare;
    }

    public void setCanteenWelfare(BigDecimal canteenWelfare) {
        this.canteenWelfare = canteenWelfare;
    }

    public BigDecimal getAppeaseReward() {
        return appeaseReward;
    }

    public void setAppeaseReward(BigDecimal appeaseReward) {
        this.appeaseReward = appeaseReward;
    }

    public BigDecimal getChargesReward() {
        return chargesReward;
    }

    public void setChargesReward(BigDecimal chargesReward) {
        this.chargesReward = chargesReward;
    }

    public BigDecimal getTrafficReward() {
        return trafficReward;
    }

    public void setTrafficReward(BigDecimal trafficReward) {
        this.trafficReward = trafficReward;
    }

    public BigDecimal getWarmCost() {
        return warmCost;
    }

    public void setWarmCost(BigDecimal warmCost) {
        this.warmCost = warmCost;
    }

    public BigDecimal getRetirementCost() {
        return retirementCost;
    }

    public void setRetirementCost(BigDecimal retirementCost) {
        this.retirementCost = retirementCost;
    }

    public BigDecimal getCompensation() {
        return compensation;
    }

    public void setCompensation(BigDecimal compensation) {
        this.compensation = compensation;
    }

    public BigDecimal getCompensationTax() {
        return compensationTax;
    }

    public void setCompensationTax(BigDecimal compensationTax) {
        this.compensationTax = compensationTax;
    }

    public BigDecimal getThisTaxDeduction() {
        return thisTaxDeduction;
    }

    public void setThisTaxDeduction(BigDecimal thisTaxDeduction) {
        this.thisTaxDeduction = thisTaxDeduction;
    }

    public BigDecimal getAlreadyButtonAmount() {
        return alreadyButtonAmount;
    }

    public void setAlreadyButtonAmount(BigDecimal alreadyButtonAmount) {
        this.alreadyButtonAmount = alreadyButtonAmount;
    }

    public BigDecimal getTreatAdd() {
        return treatAdd;
    }

    public void setTreatAdd(BigDecimal treatAdd) {
        this.treatAdd = treatAdd;
    }

    public BigDecimal getTradeUnionCost() {
        return tradeUnionCost;
    }

    public void setTradeUnionCost(BigDecimal tradeUnionCost) {
        this.tradeUnionCost = tradeUnionCost;
    }

    public BigDecimal getBusinessCost() {
        return businessCost;
    }

    public void setBusinessCost(BigDecimal businessCost) {
        this.businessCost = businessCost;
    }

    public BigDecimal getTrainingCost() {
        return trainingCost;
    }

    public void setTrainingCost(BigDecimal trainingCost) {
        this.trainingCost = trainingCost;
    }

    public BigDecimal getSySystemCost() {
        return sySystemCost;
    }

    public void setSySystemCost(BigDecimal sySystemCost) {
        this.sySystemCost = sySystemCost;
    }

    public BigDecimal getBasicOldDw() {
        return basicOldDw;
    }

    public void setBasicOldDw(BigDecimal basicOldDw) {
        this.basicOldDw = basicOldDw;
    }

    public BigDecimal getBasicMedicalDw() {
        return basicMedicalDw;
    }

    public void setBasicMedicalDw(BigDecimal basicMedicalDw) {
        this.basicMedicalDw = basicMedicalDw;
    }

    public BigDecimal getLargeMedicalDw() {
        return largeMedicalDw;
    }

    public void setLargeMedicalDw(BigDecimal largeMedicalDw) {
        this.largeMedicalDw = largeMedicalDw;
    }

    public BigDecimal getLoseWorkDw() {
        return loseWorkDw;
    }

    public void setLoseWorkDw(BigDecimal loseWorkDw) {
        this.loseWorkDw = loseWorkDw;
    }

    public BigDecimal getInjuryDw() {
        return injuryDw;
    }

    public void setInjuryDw(BigDecimal injuryDw) {
        this.injuryDw = injuryDw;
    }

    public BigDecimal getBirthDw() {
        return birthDw;
    }

    public void setBirthDw(BigDecimal birthDw) {
        this.birthDw = birthDw;
    }

    public BigDecimal getHouseFundDw() {
        return houseFundDw;
    }

    public void setHouseFundDw(BigDecimal houseFundDw) {
        this.houseFundDw = houseFundDw;
    }

    public BigDecimal getBasicOldDwBj() {
        return basicOldDwBj;
    }

    public void setBasicOldDwBj(BigDecimal basicOldDwBj) {
        this.basicOldDwBj = basicOldDwBj;
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

    public BigDecimal getLoseWorkDwBj() {
        return loseWorkDwBj;
    }

    public void setLoseWorkDwBj(BigDecimal loseWorkDwBj) {
        this.loseWorkDwBj = loseWorkDwBj;
    }

    public BigDecimal getInjuryDwBj() {
        return injuryDwBj;
    }

    public void setInjuryDwBj(BigDecimal injuryDwBj) {
        this.injuryDwBj = injuryDwBj;
    }

    public BigDecimal getBirthDwBj() {
        return birthDwBj;
    }

    public void setBirthDwBj(BigDecimal birthDwBj) {
        this.birthDwBj = birthDwBj;
    }

    public BigDecimal getHouseFundDwBj() {
        return houseFundDwBj;
    }

    public void setHouseFundDwBj(BigDecimal houseFundDwBj) {
        this.houseFundDwBj = houseFundDwBj;
    }

    public BigDecimal getDwInsuranceSum() {
        return dwInsuranceSum;
    }

    public void setDwInsuranceSum(BigDecimal dwInsuranceSum) {
        this.dwInsuranceSum = dwInsuranceSum;
    }

    public BigDecimal getEnterpriseMonthSum() {
        return enterpriseMonthSum;
    }

    public void setEnterpriseMonthSum(BigDecimal enterpriseMonthSum) {
        this.enterpriseMonthSum = enterpriseMonthSum;
    }

    public BigDecimal getPersonnelCost() {
        return personnelCost;
    }

    public void setPersonnelCost(BigDecimal personnelCost) {
        this.personnelCost = personnelCost;
    }

    public BigDecimal getManagementTax() {
        return managementTax;
    }

    public void setManagementTax(BigDecimal managementTax) {
        this.managementTax = managementTax;
    }

    public BigDecimal getManagementTaxX() {
        return managementTaxX;
    }

    public void setManagementTaxX(BigDecimal managementTaxX) {
        this.managementTaxX = managementTaxX;
    }

    public BigDecimal getEnterpriseTaxSum() {
        return enterpriseTaxSum;
    }

    public void setEnterpriseTaxSum(BigDecimal enterpriseTaxSum) {
        this.enterpriseTaxSum = enterpriseTaxSum;
    }

    @Override
    public String getRemarks() {
        return remarks;
    }

    @Override
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getWagesSum() {
        return wagesSum;
    }

    public void setWagesSum(BigDecimal wagesSum) {
        this.wagesSum = wagesSum;
    }

    public BigDecimal getManagementSum() {
        return managementSum;
    }

    public void setManagementSum(BigDecimal managementSum) {
        this.managementSum = managementSum;
    }

    public BigDecimal getWelfareSum() {
        return welfareSum;
    }

    public void setWelfareSum(BigDecimal welfareSum) {
        this.welfareSum = welfareSum;
    }

    public BigDecimal getBasicOldGrJs() {
        return basicOldGrJs;
    }

    public void setBasicOldGrJs(BigDecimal basicOldGrJs) {
        this.basicOldGrJs = basicOldGrJs;
    }

    public BigDecimal getBasicOldDwJs() {
        return basicOldDwJs;
    }

    public void setBasicOldDwJs(BigDecimal basicOldDwJs) {
        this.basicOldDwJs = basicOldDwJs;
    }

    public BigDecimal getMedicalJs() {
        return medicalJs;
    }

    public void setMedicalJs(BigDecimal medicalJs) {
        this.medicalJs = medicalJs;
    }

    public BigDecimal getLoseWorkJs() {
        return loseWorkJs;
    }

    public void setLoseWorkJs(BigDecimal loseWorkJs) {
        this.loseWorkJs = loseWorkJs;
    }

    public BigDecimal getInjuryJs() {
        return injuryJs;
    }

    public void setInjuryJs(BigDecimal injuryJs) {
        this.injuryJs = injuryJs;
    }

    public BigDecimal getBirthJs() {
        return birthJs;
    }

    public void setBirthJs(BigDecimal birthJs) {
        this.birthJs = birthJs;
    }

    public BigDecimal getHouseFundJs() {
        return houseFundJs;
    }

    public void setHouseFundJs(BigDecimal houseFundJs) {
        this.houseFundJs = houseFundJs;
    }

    public BigDecimal getCompensatorMonth() {
        return compensatorMonth;
    }

    public void setCompensatorMonth(BigDecimal compensatorMonth) {
        this.compensatorMonth = compensatorMonth;
    }
}