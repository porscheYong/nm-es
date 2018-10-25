package xyz.wongs.es.zbdata.welfare.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author Wang Yiren
 * @Description //TODO 福利积分--积分项目
 * @Date 17:06 2018/10/25
 * @Param 
 * @return 
 **/
public class JxWelfarePoints extends DataEntity<JxWelfarePoints>{
    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxPointsId;

    @CsvBindByName(column = "login_name")
    private Integer loginName;

    @CsvBindByName(column = "user_name")
    private String userName;

    @CsvBindByName(column = "branch_company")
    private String branchCompany;

    /**
     * 积分开始日期
     **/
    @CsvBindByName(column = "start_date")
    @CsvDate("yyyy-MM-dd")
    private Date startDate;

    /**
     * 积分截止日期
     **/
    @CsvBindByName(column = "end_date")
    @CsvDate("yyyy-MM-dd")
    private Date endDate;

    @CsvBindByName(column = "house_fund_ins")
    private BigDecimal houseFundIns;

    @CsvBindByName(column = "basic_old_ins")
    private BigDecimal basicOldIns;

    @CsvBindByName(column = "basic_medical_ins")
    private BigDecimal basicMedicalIns;

    @CsvBindByName(column = "birth_ins")
    private BigDecimal birthIns;

    @CsvBindByName(column = "injury_ins")
    private BigDecimal injuryIns;

    @CsvBindByName(column = "lose_work_ins")
    private BigDecimal loseWorkIns;

    @CsvBindByName(column = "medical_ins")
    private BigDecimal medicalIns;

    @CsvBindByName(column = "company_annuity_ins")
    private BigDecimal companyAnnuityIns;

    @CsvBindByName(column = "vacation_paid_ins")
    private BigDecimal vacationPaidIns;

    @CsvBindByName(column = "hygiene_health_ins")
    private BigDecimal hygieneHealthIns;

    @CsvBindByName(column = "distribution_ins_sum")
    private BigDecimal distributionInsSum;

    @CsvBindByName(column = "used_ins")
    private BigDecimal usedIns;

    @CsvBindByName(column = "remain_ins")
    private BigDecimal remainIns;

    @CsvBindByName(column = "sel_year")
    private String selYear;

    @CsvBindByName(column = "esl_month")
    private String eslMonth;

    public Integer getJxPointsId() {
        return jxPointsId;
    }

    public void setJxPointsId(Integer jxPointsId) {
        this.jxPointsId = jxPointsId;
    }

    public Integer getLoginName() {
        return loginName;
    }

    public void setLoginName(Integer loginName) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getHouseFundIns() {
        return houseFundIns;
    }

    public void setHouseFundIns(BigDecimal houseFundIns) {
        this.houseFundIns = houseFundIns;
    }

    public BigDecimal getBasicOldIns() {
        return basicOldIns;
    }

    public void setBasicOldIns(BigDecimal basicOldIns) {
        this.basicOldIns = basicOldIns;
    }

    public BigDecimal getBasicMedicalIns() {
        return basicMedicalIns;
    }

    public void setBasicMedicalIns(BigDecimal basicMedicalIns) {
        this.basicMedicalIns = basicMedicalIns;
    }

    public BigDecimal getBirthIns() {
        return birthIns;
    }

    public void setBirthIns(BigDecimal birthIns) {
        this.birthIns = birthIns;
    }

    public BigDecimal getInjuryIns() {
        return injuryIns;
    }

    public void setInjuryIns(BigDecimal injuryIns) {
        this.injuryIns = injuryIns;
    }

    public BigDecimal getLoseWorkIns() {
        return loseWorkIns;
    }

    public void setLoseWorkIns(BigDecimal loseWorkIns) {
        this.loseWorkIns = loseWorkIns;
    }

    public BigDecimal getMedicalIns() {
        return medicalIns;
    }

    public void setMedicalIns(BigDecimal medicalIns) {
        this.medicalIns = medicalIns;
    }

    public BigDecimal getCompanyAnnuityIns() {
        return companyAnnuityIns;
    }

    public void setCompanyAnnuityIns(BigDecimal companyAnnuityIns) {
        this.companyAnnuityIns = companyAnnuityIns;
    }

    public BigDecimal getVacationPaidIns() {
        return vacationPaidIns;
    }

    public void setVacationPaidIns(BigDecimal vacationPaidIns) {
        this.vacationPaidIns = vacationPaidIns;
    }

    public BigDecimal getHygieneHealthIns() {
        return hygieneHealthIns;
    }

    public void setHygieneHealthIns(BigDecimal hygieneHealthIns) {
        this.hygieneHealthIns = hygieneHealthIns;
    }

    public BigDecimal getDistributionInsSum() {
        return distributionInsSum;
    }

    public void setDistributionInsSum(BigDecimal distributionInsSum) {
        this.distributionInsSum = distributionInsSum;
    }

    public BigDecimal getUsedIns() {
        return usedIns;
    }

    public void setUsedIns(BigDecimal usedIns) {
        this.usedIns = usedIns;
    }

    public BigDecimal getRemainIns() {
        return remainIns;
    }

    public void setRemainIns(BigDecimal remainIns) {
        this.remainIns = remainIns;
    }

    public String getSelYear() {
        return selYear;
    }

    public void setSelYear(String selYear) {
        this.selYear = selYear;
    }

    public String getEslMonth() {
        return eslMonth;
    }

    public void setEslMonth(String eslMonth) {
        this.eslMonth = eslMonth;
    }
}