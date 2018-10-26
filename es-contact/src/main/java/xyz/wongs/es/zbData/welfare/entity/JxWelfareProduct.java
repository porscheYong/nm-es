package xyz.wongs.es.zbdata.welfare.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @Author Wang Yiren
 * @Description //TODO 福利积分--购买的产品项目
 * @Date 17:06 2018/10/25
 * @Param 
 * @return 
 **/
public class JxWelfareProduct extends DataEntity<JxWelfareProduct>{
    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxProductId;

    @CsvBindByName(column = "login_name")
    private String loginName;

    @CsvBindByName(column = "user_name")
    private String userName;

    @CsvBindByName(column = "branch_company")
    private String branchCompany;

    @CsvBindByName(column = "house_fund")
    private BigDecimal houseFund;

    @CsvBindByName(column = "basic_old")
    private BigDecimal basicOld;

    @CsvBindByName(column = "basic_medical")
    private BigDecimal basicMedical;

    @CsvBindByName(column = "birth")
    private BigDecimal birth;

    @CsvBindByName(column = "injury")
    private BigDecimal injury;

    @CsvBindByName(column = "lose_work")
    private BigDecimal loseWork;

    @CsvBindByName(column = "medical")
    private BigDecimal medical;

    @CsvBindByName(column = "company_annuity")
    private BigDecimal companyAnnuity;

    @CsvBindByName(column = "vacation_paid")
    private BigDecimal vacationPaid;

    @CsvBindByName(column = "cooling_subsidy")
    private BigDecimal coolingSubsidy;

    @CsvBindByName(column = "cooling_goods")
    private BigDecimal coolingGoods;

    @CsvBindByName(column = "medical_kit")
    private BigDecimal medicalKit;

    @CsvBindByName(column = "girl_health_goods")
    private BigDecimal girlHealthGoods;

    @CsvBindByName(column = "add_vacation_paid")
    private BigDecimal addVacationPaid;

    @CsvBindByName(column = "year_greet")
    private BigDecimal yearGreet;

    @CsvBindByName(column = "birthday_greet")
    private BigDecimal birthdayGreet;

    @CsvBindByName(column = "march_eight_greet")
    private BigDecimal marchEightGreet;

    @CsvBindByName(column = "commercial_medical")
    private BigDecimal commercialMedical;

    @CsvBindByName(column = "heating_greet")
    private BigDecimal heatingGreet;

    @CsvBindByName(column = "prevention_heat")
    private BigDecimal preventionHeat;

    @CsvBindByName(column = "health_upgrade")
    private BigDecimal healthUpgrade;

    @CsvBindByName(column = "relative_medical")
    private BigDecimal relativeMedical;

    @CsvBindByName(column = "psychology_goods")
    private BigDecimal psychologyGoods;

    @CsvBindByName(column = "lunch_subsidy")
    private BigDecimal lunchSubsidy;

    @CsvBindByName(column = "health_products")
    private BigDecimal healthProducts;

    @CsvBindByName(column = "education_products")
    private BigDecimal educationProducts;

    @CsvBindByName(column = "elasticity_products")
    private BigDecimal elasticityProducts;

    public Integer getJxProductId() {
        return jxProductId;
    }

    public void setJxProductId(Integer jxProductId) {
        this.jxProductId = jxProductId;
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

    public String getBranchCompany() {
        return branchCompany;
    }

    public void setBranchCompany(String branchCompany) {
        this.branchCompany = branchCompany;
    }

    public BigDecimal getHouseFund() {
        return houseFund;
    }

    public void setHouseFund(BigDecimal houseFund) {
        this.houseFund = houseFund;
    }

    public BigDecimal getBasicOld() {
        return basicOld;
    }

    public void setBasicOld(BigDecimal basicOld) {
        this.basicOld = basicOld;
    }

    public BigDecimal getBasicMedical() {
        return basicMedical;
    }

    public void setBasicMedical(BigDecimal basicMedical) {
        this.basicMedical = basicMedical;
    }

    public BigDecimal getBirth() {
        return birth;
    }

    public void setBirth(BigDecimal birth) {
        this.birth = birth;
    }

    public BigDecimal getInjury() {
        return injury;
    }

    public void setInjury(BigDecimal injury) {
        this.injury = injury;
    }

    public BigDecimal getLoseWork() {
        return loseWork;
    }

    public void setLoseWork(BigDecimal loseWork) {
        this.loseWork = loseWork;
    }

    public BigDecimal getMedical() {
        return medical;
    }

    public void setMedical(BigDecimal medical) {
        this.medical = medical;
    }

    public BigDecimal getCompanyAnnuity() {
        return companyAnnuity;
    }

    public void setCompanyAnnuity(BigDecimal companyAnnuity) {
        this.companyAnnuity = companyAnnuity;
    }

    public BigDecimal getVacationPaid() {
        return vacationPaid;
    }

    public void setVacationPaid(BigDecimal vacationPaid) {
        this.vacationPaid = vacationPaid;
    }

    public BigDecimal getCoolingSubsidy() {
        return coolingSubsidy;
    }

    public void setCoolingSubsidy(BigDecimal coolingSubsidy) {
        this.coolingSubsidy = coolingSubsidy;
    }

    public BigDecimal getCoolingGoods() {
        return coolingGoods;
    }

    public void setCoolingGoods(BigDecimal coolingGoods) {
        this.coolingGoods = coolingGoods;
    }

    public BigDecimal getMedicalKit() {
        return medicalKit;
    }

    public void setMedicalKit(BigDecimal medicalKit) {
        this.medicalKit = medicalKit;
    }

    public BigDecimal getGirlHealthGoods() {
        return girlHealthGoods;
    }

    public void setGirlHealthGoods(BigDecimal girlHealthGoods) {
        this.girlHealthGoods = girlHealthGoods;
    }

    public BigDecimal getAddVacationPaid() {
        return addVacationPaid;
    }

    public void setAddVacationPaid(BigDecimal addVacationPaid) {
        this.addVacationPaid = addVacationPaid;
    }

    public BigDecimal getYearGreet() {
        return yearGreet;
    }

    public void setYearGreet(BigDecimal yearGreet) {
        this.yearGreet = yearGreet;
    }

    public BigDecimal getBirthdayGreet() {
        return birthdayGreet;
    }

    public void setBirthdayGreet(BigDecimal birthdayGreet) {
        this.birthdayGreet = birthdayGreet;
    }

    public BigDecimal getMarchEightGreet() {
        return marchEightGreet;
    }

    public void setMarchEightGreet(BigDecimal marchEightGreet) {
        this.marchEightGreet = marchEightGreet;
    }

    public BigDecimal getCommercialMedical() {
        return commercialMedical;
    }

    public void setCommercialMedical(BigDecimal commercialMedical) {
        this.commercialMedical = commercialMedical;
    }

    public BigDecimal getHeatingGreet() {
        return heatingGreet;
    }

    public void setHeatingGreet(BigDecimal heatingGreet) {
        this.heatingGreet = heatingGreet;
    }

    public BigDecimal getPreventionHeat() {
        return preventionHeat;
    }

    public void setPreventionHeat(BigDecimal preventionHeat) {
        this.preventionHeat = preventionHeat;
    }

    public BigDecimal getHealthUpgrade() {
        return healthUpgrade;
    }

    public void setHealthUpgrade(BigDecimal healthUpgrade) {
        this.healthUpgrade = healthUpgrade;
    }

    public BigDecimal getRelativeMedical() {
        return relativeMedical;
    }

    public void setRelativeMedical(BigDecimal relativeMedical) {
        this.relativeMedical = relativeMedical;
    }

    public BigDecimal getPsychologyGoods() {
        return psychologyGoods;
    }

    public void setPsychologyGoods(BigDecimal psychologyGoods) {
        this.psychologyGoods = psychologyGoods;
    }

    public BigDecimal getLunchSubsidy() {
        return lunchSubsidy;
    }

    public void setLunchSubsidy(BigDecimal lunchSubsidy) {
        this.lunchSubsidy = lunchSubsidy;
    }

    public BigDecimal getHealthProducts() {
        return healthProducts;
    }

    public void setHealthProducts(BigDecimal healthProducts) {
        this.healthProducts = healthProducts;
    }

    public BigDecimal getEducationProducts() {
        return educationProducts;
    }

    public void setEducationProducts(BigDecimal educationProducts) {
        this.educationProducts = educationProducts;
    }

    public BigDecimal getElasticityProducts() {
        return elasticityProducts;
    }

    public void setElasticityProducts(BigDecimal elasticityProducts) {
        this.elasticityProducts = elasticityProducts;
    }
}