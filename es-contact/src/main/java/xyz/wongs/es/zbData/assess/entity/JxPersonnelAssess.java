package xyz.wongs.es.zbdata.assess.entity;

import com.opencsv.bean.CsvBindByName;
import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

/**
 * @Author Wang Yiren
 * @Description //TODO 人员考核
 * @Date 17:06 2018/10/25
 * @Param 
 * @return 
 **/
public class JxPersonnelAssess  extends DataEntity<JxPersonnelAssess>{
    /**
     * 主键
     **/
    @CsvBindByName(column = "id")
    private Integer jxAssessId;

    @CsvBindByName(column = "company_id")
    private Integer companyId;

    @CsvBindByName(column = "company_name")
    private String companyName;

    @CsvBindByName(column = "login_name")
    private String loginName;

    @CsvBindByName(column = "user_name")
    private String userName;

    @CsvBindByName(column = "assess_name")
    private String assessName;

    @CsvBindByName(column = "sel_assessfrequency_type")
    private String selAssessfrequencyType;

    @CsvBindByName(column = "sel_assessfrequency")
    private String selAssessfrequency;

    @CsvBindByName(column = "assess_score")
    private BigDecimal assessScore;

    @CsvBindByName(column = "assess_grade")
    private String assessGrade;

    @CsvBindByName(column = "assess_date")
    private String assessDate;

    @CsvBindByName(column = "yg_zqx_coefficient_score")
    private BigDecimal ygZqxCoefficientScore;

    @CsvBindByName(column = "yg_zqx_pri_work_score")
    private BigDecimal ygZqxPriWorkScore;

    @CsvBindByName(column = "yg_zqx_assess_score")
    private BigDecimal ygZqxAssessScore;

    @CsvBindByName(column = "yg_zqx_assess_grade")
    private String ygZqxAssessGrade;

    @CsvBindByName(column = "yg_nd_per_score_s")
    private BigDecimal ygNdPerScoreS;

    @CsvBindByName(column = "yg_nd_evaluate")
    private BigDecimal ygNdEvaluate;

    @CsvBindByName(column = "yg_nd_assess_score")
    private BigDecimal ygNdAssessScore;

    @CsvBindByName(column = "yg_nd_assess_grade")
    private String ygNdAssessGrade;

    @CsvBindByName(column = "qbb_fzr_zqx_per_score")
    private BigDecimal qbbFzrZqxPerScore;

    @CsvBindByName(column = "qbb_fzr_zqx_ldl_score")
    private BigDecimal qbbFzrZqxLdlScore;

    @CsvBindByName(column = "qbb_fzr_zqx_assess_score")
    private BigDecimal qbbFzrZqxAssessScore;

    @CsvBindByName(column = "qbb_fzr_zqx_assess_grade")
    private String qbbFzrZqxAssessGrade;

    @CsvBindByName(column = "qbb_fzr_nd_per_score_s")
    private BigDecimal qbbFzrNdPerScoreS;

    @CsvBindByName(column = "qbb_fzr_nd_nj_score")
    private BigDecimal qbbFzrNdNjScore;

    @CsvBindByName(column = "qbb_fzr_nd_gr_score")
    private BigDecimal qbbFzrNdGrScore;

    @CsvBindByName(column = "qbb_fzr_nd_assess_score")
    private BigDecimal qbbFzrNdAssessScore;

    @CsvBindByName(column = "qbb_fzr_nd_assess_grade")
    private String qbbFzrNdAssessGrade;

    @CsvBindByName(column = "qbb_qt_zqx_per_score")
    private BigDecimal qbbQtZqxPerScore;

    @CsvBindByName(column = "qbb_qt_zqx_ldl_score")
    private BigDecimal qbbQtZqxLdlScore;

    @CsvBindByName(column = "qbb_qt_zqx_fzr_score")
    private BigDecimal qbbQtZqxFzrScore;

    @CsvBindByName(column = "qbb_qt_zqx_assess_score")
    private BigDecimal qbbQtZqxAssessScore;

    @CsvBindByName(column = "qbb_qt_zqx_assess_grade")
    private String qbbQtZqxAssessGrade;

    @CsvBindByName(column = "qbb_qt_nd_per_score_s")
    private BigDecimal qbbQtNdPerScoreS;

    @CsvBindByName(column = "qbb_qt_nd_nj_score")
    private BigDecimal qbbQtNdNjScore;

    @CsvBindByName(column = "qbb_qt_nd_gr_score")
    private BigDecimal qbbQtNdGrScore;

    @CsvBindByName(column = "qbb_qt_nd_assess_score")
    private BigDecimal qbbQtNdAssessScore;

    @CsvBindByName(column = "qbb_qt_nd_assess_grade")
    private String qbbQtNdAssessGrade;

    @CsvBindByName(column = "zy_fzr_zqx_per_score")
    private BigDecimal zyFzrZqxPerScore;

    @CsvBindByName(column = "zy_fzr_zqx_ldl_score")
    private BigDecimal zyFzrZqxLdlScore;

    @CsvBindByName(column = "zy_fzr_zqx_assess_score")
    private BigDecimal zyFzrZqxAssessScore;

    @CsvBindByName(column = "zy_fzr_zqx_assess_grade")
    private String zyFzrZqxAssessGrade;

    @CsvBindByName(column = "zy_fzr_nd_per_score_s")
    private BigDecimal zyFzrNdPerScoreS;

    @CsvBindByName(column = "zy_fzr_nd_nj_score")
    private BigDecimal zyFzrNdNjScore;

    @CsvBindByName(column = "zy_fzr_nd_gr_score")
    private BigDecimal zyFzrNdGrScore;

    @CsvBindByName(column = "zy_fzr_nd_assess_score")
    private BigDecimal zyFzrNdAssessScore;

    @CsvBindByName(column = "zy_fzr_nd_assess_grade")
    private String zyFzrNdAssessGrade;

    @CsvBindByName(column = "zy_qt_zqx_per_score")
    private BigDecimal zyQtZqxPerScore;

    @CsvBindByName(column = "zy_qt_zqx_ldl_score")
    private BigDecimal zyQtZqxLdlScore;

    @CsvBindByName(column = "zy_qt_zqx_fzr_score")
    private BigDecimal zyQtZqxFzrScore;

    @CsvBindByName(column = "zy_qt_zqx_assess_score")
    private BigDecimal zyQtZqxAssessScore;

    @CsvBindByName(column = "zy_qt_zqx_assess_grade")
    private String zyQtZqxAssessGrade;

    @CsvBindByName(column = "zy_qt_nd_per_score_s")
    private BigDecimal zyQtNdPerScoreS;

    @CsvBindByName(column = "zy_qt_nd_nj_score")
    private BigDecimal zyQtNdNjScore;

    @CsvBindByName(column = "zy_qt_nd_gr_score")
    private BigDecimal zyQtNdGrScore;

    @CsvBindByName(column = "zy_qt_nd_assess_score")
    private BigDecimal zyQtNdAssessScore;

    @CsvBindByName(column = "zy_qt_nd_assess_grade")
    private String zyQtNdAssessGrade;

    @CsvBindByName(column = "ms_zjl_zqx_per_score")
    private BigDecimal msZjlZqxPerScore;

    @CsvBindByName(column = "ms_zjl_zqx_cz_score")
    private BigDecimal msZjlZqxCzScore;

    @CsvBindByName(column = "ms_zjl_zqx_assess_score")
    private BigDecimal msZjlZqxAssessScore;

    @CsvBindByName(column = "ms_zjl_zqx_assess_grade")
    private String msZjlZqxAssessGrade;

    @CsvBindByName(column = "ms_zjl_nd_per_score_s")
    private BigDecimal msZjlNdPerScoreS;

    @CsvBindByName(column = "ms_zjl_nd_nj_score")
    private BigDecimal msZjlNdNjScore;

    @CsvBindByName(column = "ms_zjl_nd_gr_score")
    private BigDecimal msZjlNdGrScore;

    @CsvBindByName(column = "ms_zjl_nd_assess_score")
    private BigDecimal msZjlNdAssessScore;

    @CsvBindByName(column = "ms_zjl_nd_assess_grade")
    private String msZjlNdAssessGrade;

    @CsvBindByName(column = "ms_qt_zqx_per_score")
    private BigDecimal msQtZqxPerScore;

    @CsvBindByName(column = "ms_qt_zqx_cz_score")
    private BigDecimal msQtZqxCzScore;

    @CsvBindByName(column = "ms_qt_zqx_zjl_score")
    private BigDecimal msQtZqxZjlScore;

    @CsvBindByName(column = "ms_qt_zqx_assess_score")
    private BigDecimal msQtZqxAssessScore;

    @CsvBindByName(column = "ms_qt_zqx_assess_grade")
    private String msQtZqxAssessGrade;

    @CsvBindByName(column = "ms_qt_nd_per_score_s")
    private BigDecimal msQtNdPerScoreS;

    @CsvBindByName(column = "ms_qt_nd_nj_score")
    private BigDecimal msQtNdNjScore;

    @CsvBindByName(column = "ms_qt_nd_gr_score")
    private BigDecimal msQtNdGrScore;

    @CsvBindByName(column = "ms_qt_nd_assess_score")
    private BigDecimal msQtNdAssessScore;

    @CsvBindByName(column = "ms_qt_nd_assess_grade")
    private String msQtNdAssessGrade;

    public Integer getJxAssessId() {
        return jxAssessId;
    }

    public void setJxAssessId(Integer jxAssessId) {
        this.jxAssessId = jxAssessId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getAssessName() {
        return assessName;
    }

    public void setAssessName(String assessName) {
        this.assessName = assessName;
    }

    public String getSelAssessfrequencyType() {
        return selAssessfrequencyType;
    }

    public void setSelAssessfrequencyType(String selAssessfrequencyType) {
        this.selAssessfrequencyType = selAssessfrequencyType;
    }

    public String getSelAssessfrequency() {
        return selAssessfrequency;
    }

    public void setSelAssessfrequency(String selAssessfrequency) {
        this.selAssessfrequency = selAssessfrequency;
    }

    public BigDecimal getAssessScore() {
        return assessScore;
    }

    public void setAssessScore(BigDecimal assessScore) {
        this.assessScore = assessScore;
    }

    public String getAssessGrade() {
        return assessGrade;
    }

    public void setAssessGrade(String assessGrade) {
        this.assessGrade = assessGrade;
    }

    public String getAssessDate() {
        return assessDate;
    }

    public void setAssessDate(String assessDate) {
        this.assessDate = assessDate;
    }

    public BigDecimal getYgZqxCoefficientScore() {
        return ygZqxCoefficientScore;
    }

    public void setYgZqxCoefficientScore(BigDecimal ygZqxCoefficientScore) {
        this.ygZqxCoefficientScore = ygZqxCoefficientScore;
    }

    public BigDecimal getYgZqxPriWorkScore() {
        return ygZqxPriWorkScore;
    }

    public void setYgZqxPriWorkScore(BigDecimal ygZqxPriWorkScore) {
        this.ygZqxPriWorkScore = ygZqxPriWorkScore;
    }

    public BigDecimal getYgZqxAssessScore() {
        return ygZqxAssessScore;
    }

    public void setYgZqxAssessScore(BigDecimal ygZqxAssessScore) {
        this.ygZqxAssessScore = ygZqxAssessScore;
    }

    public String getYgZqxAssessGrade() {
        return ygZqxAssessGrade;
    }

    public void setYgZqxAssessGrade(String ygZqxAssessGrade) {
        this.ygZqxAssessGrade = ygZqxAssessGrade;
    }

    public BigDecimal getYgNdPerScoreS() {
        return ygNdPerScoreS;
    }

    public void setYgNdPerScoreS(BigDecimal ygNdPerScoreS) {
        this.ygNdPerScoreS = ygNdPerScoreS;
    }

    public BigDecimal getYgNdEvaluate() {
        return ygNdEvaluate;
    }

    public void setYgNdEvaluate(BigDecimal ygNdEvaluate) {
        this.ygNdEvaluate = ygNdEvaluate;
    }

    public BigDecimal getYgNdAssessScore() {
        return ygNdAssessScore;
    }

    public void setYgNdAssessScore(BigDecimal ygNdAssessScore) {
        this.ygNdAssessScore = ygNdAssessScore;
    }

    public String getYgNdAssessGrade() {
        return ygNdAssessGrade;
    }

    public void setYgNdAssessGrade(String ygNdAssessGrade) {
        this.ygNdAssessGrade = ygNdAssessGrade;
    }

    public BigDecimal getQbbFzrZqxPerScore() {
        return qbbFzrZqxPerScore;
    }

    public void setQbbFzrZqxPerScore(BigDecimal qbbFzrZqxPerScore) {
        this.qbbFzrZqxPerScore = qbbFzrZqxPerScore;
    }

    public BigDecimal getQbbFzrZqxLdlScore() {
        return qbbFzrZqxLdlScore;
    }

    public void setQbbFzrZqxLdlScore(BigDecimal qbbFzrZqxLdlScore) {
        this.qbbFzrZqxLdlScore = qbbFzrZqxLdlScore;
    }

    public BigDecimal getQbbFzrZqxAssessScore() {
        return qbbFzrZqxAssessScore;
    }

    public void setQbbFzrZqxAssessScore(BigDecimal qbbFzrZqxAssessScore) {
        this.qbbFzrZqxAssessScore = qbbFzrZqxAssessScore;
    }

    public String getQbbFzrZqxAssessGrade() {
        return qbbFzrZqxAssessGrade;
    }

    public void setQbbFzrZqxAssessGrade(String qbbFzrZqxAssessGrade) {
        this.qbbFzrZqxAssessGrade = qbbFzrZqxAssessGrade;
    }

    public BigDecimal getQbbFzrNdPerScoreS() {
        return qbbFzrNdPerScoreS;
    }

    public void setQbbFzrNdPerScoreS(BigDecimal qbbFzrNdPerScoreS) {
        this.qbbFzrNdPerScoreS = qbbFzrNdPerScoreS;
    }

    public BigDecimal getQbbFzrNdNjScore() {
        return qbbFzrNdNjScore;
    }

    public void setQbbFzrNdNjScore(BigDecimal qbbFzrNdNjScore) {
        this.qbbFzrNdNjScore = qbbFzrNdNjScore;
    }

    public BigDecimal getQbbFzrNdGrScore() {
        return qbbFzrNdGrScore;
    }

    public void setQbbFzrNdGrScore(BigDecimal qbbFzrNdGrScore) {
        this.qbbFzrNdGrScore = qbbFzrNdGrScore;
    }

    public BigDecimal getQbbFzrNdAssessScore() {
        return qbbFzrNdAssessScore;
    }

    public void setQbbFzrNdAssessScore(BigDecimal qbbFzrNdAssessScore) {
        this.qbbFzrNdAssessScore = qbbFzrNdAssessScore;
    }

    public String getQbbFzrNdAssessGrade() {
        return qbbFzrNdAssessGrade;
    }

    public void setQbbFzrNdAssessGrade(String qbbFzrNdAssessGrade) {
        this.qbbFzrNdAssessGrade = qbbFzrNdAssessGrade;
    }

    public BigDecimal getQbbQtZqxPerScore() {
        return qbbQtZqxPerScore;
    }

    public void setQbbQtZqxPerScore(BigDecimal qbbQtZqxPerScore) {
        this.qbbQtZqxPerScore = qbbQtZqxPerScore;
    }

    public BigDecimal getQbbQtZqxLdlScore() {
        return qbbQtZqxLdlScore;
    }

    public void setQbbQtZqxLdlScore(BigDecimal qbbQtZqxLdlScore) {
        this.qbbQtZqxLdlScore = qbbQtZqxLdlScore;
    }

    public BigDecimal getQbbQtZqxFzrScore() {
        return qbbQtZqxFzrScore;
    }

    public void setQbbQtZqxFzrScore(BigDecimal qbbQtZqxFzrScore) {
        this.qbbQtZqxFzrScore = qbbQtZqxFzrScore;
    }

    public BigDecimal getQbbQtZqxAssessScore() {
        return qbbQtZqxAssessScore;
    }

    public void setQbbQtZqxAssessScore(BigDecimal qbbQtZqxAssessScore) {
        this.qbbQtZqxAssessScore = qbbQtZqxAssessScore;
    }

    public String getQbbQtZqxAssessGrade() {
        return qbbQtZqxAssessGrade;
    }

    public void setQbbQtZqxAssessGrade(String qbbQtZqxAssessGrade) {
        this.qbbQtZqxAssessGrade = qbbQtZqxAssessGrade;
    }

    public BigDecimal getQbbQtNdPerScoreS() {
        return qbbQtNdPerScoreS;
    }

    public void setQbbQtNdPerScoreS(BigDecimal qbbQtNdPerScoreS) {
        this.qbbQtNdPerScoreS = qbbQtNdPerScoreS;
    }

    public BigDecimal getQbbQtNdNjScore() {
        return qbbQtNdNjScore;
    }

    public void setQbbQtNdNjScore(BigDecimal qbbQtNdNjScore) {
        this.qbbQtNdNjScore = qbbQtNdNjScore;
    }

    public BigDecimal getQbbQtNdGrScore() {
        return qbbQtNdGrScore;
    }

    public void setQbbQtNdGrScore(BigDecimal qbbQtNdGrScore) {
        this.qbbQtNdGrScore = qbbQtNdGrScore;
    }

    public BigDecimal getQbbQtNdAssessScore() {
        return qbbQtNdAssessScore;
    }

    public void setQbbQtNdAssessScore(BigDecimal qbbQtNdAssessScore) {
        this.qbbQtNdAssessScore = qbbQtNdAssessScore;
    }

    public String getQbbQtNdAssessGrade() {
        return qbbQtNdAssessGrade;
    }

    public void setQbbQtNdAssessGrade(String qbbQtNdAssessGrade) {
        this.qbbQtNdAssessGrade = qbbQtNdAssessGrade;
    }

    public BigDecimal getZyFzrZqxPerScore() {
        return zyFzrZqxPerScore;
    }

    public void setZyFzrZqxPerScore(BigDecimal zyFzrZqxPerScore) {
        this.zyFzrZqxPerScore = zyFzrZqxPerScore;
    }

    public BigDecimal getZyFzrZqxLdlScore() {
        return zyFzrZqxLdlScore;
    }

    public void setZyFzrZqxLdlScore(BigDecimal zyFzrZqxLdlScore) {
        this.zyFzrZqxLdlScore = zyFzrZqxLdlScore;
    }

    public BigDecimal getZyFzrZqxAssessScore() {
        return zyFzrZqxAssessScore;
    }

    public void setZyFzrZqxAssessScore(BigDecimal zyFzrZqxAssessScore) {
        this.zyFzrZqxAssessScore = zyFzrZqxAssessScore;
    }

    public String getZyFzrZqxAssessGrade() {
        return zyFzrZqxAssessGrade;
    }

    public void setZyFzrZqxAssessGrade(String zyFzrZqxAssessGrade) {
        this.zyFzrZqxAssessGrade = zyFzrZqxAssessGrade;
    }

    public BigDecimal getZyFzrNdPerScoreS() {
        return zyFzrNdPerScoreS;
    }

    public void setZyFzrNdPerScoreS(BigDecimal zyFzrNdPerScoreS) {
        this.zyFzrNdPerScoreS = zyFzrNdPerScoreS;
    }

    public BigDecimal getZyFzrNdNjScore() {
        return zyFzrNdNjScore;
    }

    public void setZyFzrNdNjScore(BigDecimal zyFzrNdNjScore) {
        this.zyFzrNdNjScore = zyFzrNdNjScore;
    }

    public BigDecimal getZyFzrNdGrScore() {
        return zyFzrNdGrScore;
    }

    public void setZyFzrNdGrScore(BigDecimal zyFzrNdGrScore) {
        this.zyFzrNdGrScore = zyFzrNdGrScore;
    }

    public BigDecimal getZyFzrNdAssessScore() {
        return zyFzrNdAssessScore;
    }

    public void setZyFzrNdAssessScore(BigDecimal zyFzrNdAssessScore) {
        this.zyFzrNdAssessScore = zyFzrNdAssessScore;
    }

    public String getZyFzrNdAssessGrade() {
        return zyFzrNdAssessGrade;
    }

    public void setZyFzrNdAssessGrade(String zyFzrNdAssessGrade) {
        this.zyFzrNdAssessGrade = zyFzrNdAssessGrade;
    }

    public BigDecimal getZyQtZqxPerScore() {
        return zyQtZqxPerScore;
    }

    public void setZyQtZqxPerScore(BigDecimal zyQtZqxPerScore) {
        this.zyQtZqxPerScore = zyQtZqxPerScore;
    }

    public BigDecimal getZyQtZqxLdlScore() {
        return zyQtZqxLdlScore;
    }

    public void setZyQtZqxLdlScore(BigDecimal zyQtZqxLdlScore) {
        this.zyQtZqxLdlScore = zyQtZqxLdlScore;
    }

    public BigDecimal getZyQtZqxFzrScore() {
        return zyQtZqxFzrScore;
    }

    public void setZyQtZqxFzrScore(BigDecimal zyQtZqxFzrScore) {
        this.zyQtZqxFzrScore = zyQtZqxFzrScore;
    }

    public BigDecimal getZyQtZqxAssessScore() {
        return zyQtZqxAssessScore;
    }

    public void setZyQtZqxAssessScore(BigDecimal zyQtZqxAssessScore) {
        this.zyQtZqxAssessScore = zyQtZqxAssessScore;
    }

    public String getZyQtZqxAssessGrade() {
        return zyQtZqxAssessGrade;
    }

    public void setZyQtZqxAssessGrade(String zyQtZqxAssessGrade) {
        this.zyQtZqxAssessGrade = zyQtZqxAssessGrade;
    }

    public BigDecimal getZyQtNdPerScoreS() {
        return zyQtNdPerScoreS;
    }

    public void setZyQtNdPerScoreS(BigDecimal zyQtNdPerScoreS) {
        this.zyQtNdPerScoreS = zyQtNdPerScoreS;
    }

    public BigDecimal getZyQtNdNjScore() {
        return zyQtNdNjScore;
    }

    public void setZyQtNdNjScore(BigDecimal zyQtNdNjScore) {
        this.zyQtNdNjScore = zyQtNdNjScore;
    }

    public BigDecimal getZyQtNdGrScore() {
        return zyQtNdGrScore;
    }

    public void setZyQtNdGrScore(BigDecimal zyQtNdGrScore) {
        this.zyQtNdGrScore = zyQtNdGrScore;
    }

    public BigDecimal getZyQtNdAssessScore() {
        return zyQtNdAssessScore;
    }

    public void setZyQtNdAssessScore(BigDecimal zyQtNdAssessScore) {
        this.zyQtNdAssessScore = zyQtNdAssessScore;
    }

    public String getZyQtNdAssessGrade() {
        return zyQtNdAssessGrade;
    }

    public void setZyQtNdAssessGrade(String zyQtNdAssessGrade) {
        this.zyQtNdAssessGrade = zyQtNdAssessGrade;
    }

    public BigDecimal getMsZjlZqxPerScore() {
        return msZjlZqxPerScore;
    }

    public void setMsZjlZqxPerScore(BigDecimal msZjlZqxPerScore) {
        this.msZjlZqxPerScore = msZjlZqxPerScore;
    }

    public BigDecimal getMsZjlZqxCzScore() {
        return msZjlZqxCzScore;
    }

    public void setMsZjlZqxCzScore(BigDecimal msZjlZqxCzScore) {
        this.msZjlZqxCzScore = msZjlZqxCzScore;
    }

    public BigDecimal getMsZjlZqxAssessScore() {
        return msZjlZqxAssessScore;
    }

    public void setMsZjlZqxAssessScore(BigDecimal msZjlZqxAssessScore) {
        this.msZjlZqxAssessScore = msZjlZqxAssessScore;
    }

    public String getMsZjlZqxAssessGrade() {
        return msZjlZqxAssessGrade;
    }

    public void setMsZjlZqxAssessGrade(String msZjlZqxAssessGrade) {
        this.msZjlZqxAssessGrade = msZjlZqxAssessGrade;
    }

    public BigDecimal getMsZjlNdPerScoreS() {
        return msZjlNdPerScoreS;
    }

    public void setMsZjlNdPerScoreS(BigDecimal msZjlNdPerScoreS) {
        this.msZjlNdPerScoreS = msZjlNdPerScoreS;
    }

    public BigDecimal getMsZjlNdNjScore() {
        return msZjlNdNjScore;
    }

    public void setMsZjlNdNjScore(BigDecimal msZjlNdNjScore) {
        this.msZjlNdNjScore = msZjlNdNjScore;
    }

    public BigDecimal getMsZjlNdGrScore() {
        return msZjlNdGrScore;
    }

    public void setMsZjlNdGrScore(BigDecimal msZjlNdGrScore) {
        this.msZjlNdGrScore = msZjlNdGrScore;
    }

    public BigDecimal getMsZjlNdAssessScore() {
        return msZjlNdAssessScore;
    }

    public void setMsZjlNdAssessScore(BigDecimal msZjlNdAssessScore) {
        this.msZjlNdAssessScore = msZjlNdAssessScore;
    }

    public String getMsZjlNdAssessGrade() {
        return msZjlNdAssessGrade;
    }

    public void setMsZjlNdAssessGrade(String msZjlNdAssessGrade) {
        this.msZjlNdAssessGrade = msZjlNdAssessGrade;
    }

    public BigDecimal getMsQtZqxPerScore() {
        return msQtZqxPerScore;
    }

    public void setMsQtZqxPerScore(BigDecimal msQtZqxPerScore) {
        this.msQtZqxPerScore = msQtZqxPerScore;
    }

    public BigDecimal getMsQtZqxCzScore() {
        return msQtZqxCzScore;
    }

    public void setMsQtZqxCzScore(BigDecimal msQtZqxCzScore) {
        this.msQtZqxCzScore = msQtZqxCzScore;
    }

    public BigDecimal getMsQtZqxZjlScore() {
        return msQtZqxZjlScore;
    }

    public void setMsQtZqxZjlScore(BigDecimal msQtZqxZjlScore) {
        this.msQtZqxZjlScore = msQtZqxZjlScore;
    }

    public BigDecimal getMsQtZqxAssessScore() {
        return msQtZqxAssessScore;
    }

    public void setMsQtZqxAssessScore(BigDecimal msQtZqxAssessScore) {
        this.msQtZqxAssessScore = msQtZqxAssessScore;
    }

    public String getMsQtZqxAssessGrade() {
        return msQtZqxAssessGrade;
    }

    public void setMsQtZqxAssessGrade(String msQtZqxAssessGrade) {
        this.msQtZqxAssessGrade = msQtZqxAssessGrade;
    }

    public BigDecimal getMsQtNdPerScoreS() {
        return msQtNdPerScoreS;
    }

    public void setMsQtNdPerScoreS(BigDecimal msQtNdPerScoreS) {
        this.msQtNdPerScoreS = msQtNdPerScoreS;
    }

    public BigDecimal getMsQtNdNjScore() {
        return msQtNdNjScore;
    }

    public void setMsQtNdNjScore(BigDecimal msQtNdNjScore) {
        this.msQtNdNjScore = msQtNdNjScore;
    }

    public BigDecimal getMsQtNdGrScore() {
        return msQtNdGrScore;
    }

    public void setMsQtNdGrScore(BigDecimal msQtNdGrScore) {
        this.msQtNdGrScore = msQtNdGrScore;
    }

    public BigDecimal getMsQtNdAssessScore() {
        return msQtNdAssessScore;
    }

    public void setMsQtNdAssessScore(BigDecimal msQtNdAssessScore) {
        this.msQtNdAssessScore = msQtNdAssessScore;
    }

    public String getMsQtNdAssessGrade() {
        return msQtNdAssessGrade;
    }

    public void setMsQtNdAssessGrade(String msQtNdAssessGrade) {
        this.msQtNdAssessGrade = msQtNdAssessGrade;
    }
}