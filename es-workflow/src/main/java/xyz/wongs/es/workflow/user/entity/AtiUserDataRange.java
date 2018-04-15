package xyz.wongs.es.workflow.user.entity;

import java.io.Serializable;

/**
 * 人员数据权Entity
 * @author liuxiaodong
 */
public class AtiUserDataRange implements Serializable {

    private static final long serialVersionUID = 1383605175965487003L;

    private Long atiUserDataRangeId;

    private Long atiUserId;

    private String dataRangeType;

    private String dataNumber;

    public Long getAtiUserDataRangeId() {
        return atiUserDataRangeId;
    }

    public void setAtiUserDataRangeId(Long atiUserDataRangeId) {
        this.atiUserDataRangeId = atiUserDataRangeId;
    }

    public Long getAtiUserId() {
        return atiUserId;
    }

    public void setAtiUserId(Long atiUserId) {
        this.atiUserId = atiUserId;
    }

    public String getDataRangeType() {
        return dataRangeType;
    }

    public void setDataRangeType(String dataRangeType) {
        this.dataRangeType = dataRangeType;
    }

    public String getDataNumber() {
        return dataNumber;
    }

    public void setDataNumber(String dataNumber) {
        this.dataNumber = dataNumber;
    }
}