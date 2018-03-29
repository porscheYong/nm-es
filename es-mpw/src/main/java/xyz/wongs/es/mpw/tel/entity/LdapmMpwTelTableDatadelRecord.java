package xyz.wongs.es.mpw.tel.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwTelTableDatadelRecord extends DataEntity<LdapmMpwTelTableDatadelRecord> {
    private Integer monthId;

    private String unitId;

    private String tableCode;

    private String tablePk;

    private String deleteTs;

    private String delFlag;

    private String pkTableDelete;

    private String pkOrg;

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getTableCode() {
        return tableCode;
    }

    public void setTableCode(String tableCode) {
        this.tableCode = tableCode == null ? null : tableCode.trim();
    }

    public String getTablePk() {
        return tablePk;
    }

    public void setTablePk(String tablePk) {
        this.tablePk = tablePk == null ? null : tablePk.trim();
    }

    public String getDeleteTs() {
        return deleteTs;
    }

    public void setDeleteTs(String deleteTs) {
        this.deleteTs = deleteTs == null ? null : deleteTs.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getPkTableDelete() {
        return pkTableDelete;
    }

    public void setPkTableDelete(String pkTableDelete) {
        this.pkTableDelete = pkTableDelete == null ? null : pkTableDelete.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }
}