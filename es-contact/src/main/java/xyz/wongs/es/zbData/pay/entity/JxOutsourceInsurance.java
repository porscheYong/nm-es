package xyz.wongs.es.zbData.pay.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
/**
 * @Author Wang Yiren
 * @Description //TODO 中博提供的数据：外包薪酬-保险
 * @Date 15:59 2018/10/24
 * @Param
 * @return
 **/
public class JxOutsourceInsurance extends DataEntity<JxOutsourceInsurance>{
    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxInsuranceId;
    /**
     * 人员姓名
     **/
    @CsvBindByName(column = "user_name")
    private String userName;
    /**
     * 人员编码
     **/
    @CsvBindByName(column = "login_name")
    private String loginName;
    /**
     * 身份证
     **/
    @CsvBindByName(column = "identity_card")
    private String identityCard;
    /**
     * 年度
     **/
    @CsvBindByName(column = "sel_year")
    private String selYear;
    /**
     * 期间
     **/
    @CsvBindByName(column = "period")
    private String period;
    /**
     * 单位编码
     **/
    @CsvBindByName(column = "company_id")
    private String companyId;
    /**
     * 单位名称
     **/
    @CsvBindByName(column = "company_name")
    private String companyName;
    /**
     * 外包人员薪酬收入
     **/
    @CsvBindByName(column = "outsource_pay")
    private BigDecimal outsourcePay;
    /**
     * 外包人员岗位工资
     **/
    @CsvBindByName(column = "wb_post_salary")
    private BigDecimal wbPostSalary;
    /**
     * 外包人员绩效工资
     **/
    @CsvBindByName(column = "wb_performance_pay")
    private BigDecimal wbPerformancePay;
    /**
     * 各项津补贴
     **/
    @CsvBindByName(column = "benefits")
    private BigDecimal benefits;
    /**
     * 其他（随销）收入
     **/
    @CsvBindByName(column = "other_income")
    private BigDecimal otherIncome;
    /**
     * 外包人员其他费用（个人）
     **/
    @CsvBindByName(column = "wb_other_cost_gr")
    private BigDecimal wbOtherCostGr;
    /**
     * 外包其他费用（公司分摊）
     **/
    @CsvBindByName(column = "wb_other_cost_gs")
    private BigDecimal wbOtherCostGs;
    /**
     * 外包人员养老保险
     **/
    @CsvBindByName(column = "wb_basic_old")
    private BigDecimal wbBasicOld;
    /**
     * 外包人员医疗保险
     **/
    @CsvBindByName(column = "wb_basic_medical")
    private BigDecimal wbBasicMedical;
    /**
     * 外包人员失业保险
     **/
    @CsvBindByName(column = "wb_lose_work")
    private BigDecimal wbLoseWork;
    /**
     * 外包人员工伤保险
     **/
    @CsvBindByName(column = "wb_injury")
    private BigDecimal wbInjury;
    /**
     * 外包人员生育保险
     **/
    @CsvBindByName(column = "wb_birth")
    private BigDecimal wbBirth;
    /**
     * 外包人员公积金
     **/
    @CsvBindByName(column = "wb_fund")
    private BigDecimal wbFund;
    /**
     * 其他险种
     **/
    @CsvBindByName(column = "other_risks")
    private BigDecimal otherRisks;

    public Integer getJxInsuranceId() {
        return jxInsuranceId;
    }

    public void setJxInsuranceId(Integer jxInsuranceId) {
        this.jxInsuranceId = jxInsuranceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getSelYear() {
        return selYear;
    }

    public void setSelYear(String selYear) {
        this.selYear = selYear;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getOutsourcePay() {
        return outsourcePay;
    }

    public void setOutsourcePay(BigDecimal outsourcePay) {
        this.outsourcePay = outsourcePay;
    }

    public BigDecimal getWbPostSalary() {
        return wbPostSalary;
    }

    public void setWbPostSalary(BigDecimal wbPostSalary) {
        this.wbPostSalary = wbPostSalary;
    }

    public BigDecimal getWbPerformancePay() {
        return wbPerformancePay;
    }

    public void setWbPerformancePay(BigDecimal wbPerformancePay) {
        this.wbPerformancePay = wbPerformancePay;
    }

    public BigDecimal getBenefits() {
        return benefits;
    }

    public void setBenefits(BigDecimal benefits) {
        this.benefits = benefits;
    }

    public BigDecimal getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(BigDecimal otherIncome) {
        this.otherIncome = otherIncome;
    }

    public BigDecimal getWbOtherCostGr() {
        return wbOtherCostGr;
    }

    public void setWbOtherCostGr(BigDecimal wbOtherCostGr) {
        this.wbOtherCostGr = wbOtherCostGr;
    }

    public BigDecimal getWbOtherCostGs() {
        return wbOtherCostGs;
    }

    public void setWbOtherCostGs(BigDecimal wbOtherCostGs) {
        this.wbOtherCostGs = wbOtherCostGs;
    }

    public BigDecimal getWbBasicOld() {
        return wbBasicOld;
    }

    public void setWbBasicOld(BigDecimal wbBasicOld) {
        this.wbBasicOld = wbBasicOld;
    }

    public BigDecimal getWbBasicMedical() {
        return wbBasicMedical;
    }

    public void setWbBasicMedical(BigDecimal wbBasicMedical) {
        this.wbBasicMedical = wbBasicMedical;
    }

    public BigDecimal getWbLoseWork() {
        return wbLoseWork;
    }

    public void setWbLoseWork(BigDecimal wbLoseWork) {
        this.wbLoseWork = wbLoseWork;
    }

    public BigDecimal getWbInjury() {
        return wbInjury;
    }

    public void setWbInjury(BigDecimal wbInjury) {
        this.wbInjury = wbInjury;
    }

    public BigDecimal getWbBirth() {
        return wbBirth;
    }

    public void setWbBirth(BigDecimal wbBirth) {
        this.wbBirth = wbBirth;
    }

    public BigDecimal getWbFund() {
        return wbFund;
    }

    public void setWbFund(BigDecimal wbFund) {
        this.wbFund = wbFund;
    }

    public BigDecimal getOtherRisks() {
        return otherRisks;
    }

    public void setOtherRisks(BigDecimal otherRisks) {
        this.otherRisks = otherRisks;
    }
}