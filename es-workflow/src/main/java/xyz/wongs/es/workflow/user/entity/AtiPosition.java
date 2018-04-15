package xyz.wongs.es.workflow.user.entity;

import java.io.Serializable;

/**
 * 人员岗位Entity
 * @author liuxiaodong
 */
public class AtiPosition implements Serializable {

    private static final long serialVersionUID = -140921261632189579L;

    private Long atiPositionId;

    private Object positionName;

    private String positionCde;

    public Long getAtiPositionId() {
        return atiPositionId;
    }

    public void setAtiPositionId(Long atiPositionId) {
        this.atiPositionId = atiPositionId;
    }

    public Object getPositionName() {
        return positionName;
    }

    public void setPositionName(Object positionName) {
        this.positionName = positionName;
    }

    public String getPositionCde() {
        return positionCde;
    }

    public void setPositionCde(String positionCde) {
        this.positionCde = positionCde;
    }
}