//package xyz.wongs.es.core.sort.entity;
//
//import xyz.wongs.es.common.persistence.DataEntity;
//
//public class TbPsnJobSort extends DataEntity<TbPsnJobSort> {
//
//    /**
//     * Oracle 伪列
//     */
//    private String id;
//
//    private String pkPsndoc;
//
//    private String psndocName;
//
//    private String pkPsnjob;
//
//    private String beginDate;
//
//    private String endDate;
//
//    private String errorMsg;
//
//    private String flag;
//
//    @Override
//    public String getId() {
//        return id;
//    }
//
//    @Override
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getPkPsndoc() {
//        return pkPsndoc;
//    }
//
//    public void setPkPsndoc(String pkPsndoc) {
//        this.pkPsndoc = pkPsndoc == null ? null : pkPsndoc.trim();
//    }
//
//    public String getPsndocName() {
//        return psndocName;
//    }
//
//    public void setPsndocName(String psndocName) {
//        this.psndocName = psndocName == null ? null : psndocName.trim();
//    }
//
//    public String getPkPsnjob() {
//        return pkPsnjob;
//    }
//
//    public void setPkPsnjob(String pkPsnjob) {
//        this.pkPsnjob = pkPsnjob == null ? null : pkPsnjob.trim();
//    }
//
//    public String getBeginDate() {
//        return beginDate;
//    }
//
//    public void setBeginDate(String beginDate) {
//        this.beginDate = beginDate == null ? null : beginDate.trim();
//    }
//
//    public String getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) {
//        this.endDate = endDate == null ? null : endDate.trim();
//    }
//
//    public String getErrorMsg() {
//        return errorMsg;
//    }
//
//    public void setErrorMsg(String errorMsg) {
//        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
//    }
//
//    public String getFlag() {
//        return flag;
//    }
//
//    public void setFlag(String flag) {
//        this.flag = flag == null ? null : flag.trim();
//    }
//}