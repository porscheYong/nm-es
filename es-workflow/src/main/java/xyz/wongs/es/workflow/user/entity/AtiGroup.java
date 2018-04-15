package xyz.wongs.es.workflow.user.entity;

import java.io.Serializable;

/**
 * 用户组 Entity
 * @author liuxiaodong
 */
public class AtiGroup implements Serializable {

    private static final long serialVersionUID = -4487574279016766973L;

    private Long atiGroupId;

    private Object groupName;

    private String groupType;

    private String groupDataRange;

    private Long atiPositionId;

    private String isPriPosi;

    public Long getAtiGroupId() {
        return atiGroupId;
    }

    public void setAtiGroupId(Long atiGroupId) {
        this.atiGroupId = atiGroupId;
    }

    public Object getGroupName() {
        return groupName;
    }

    public void setGroupName(Object groupName) {
        this.groupName = groupName;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getGroupDataRange() {
        return groupDataRange;
    }

    public void setGroupDataRange(String groupDataRange) {
        this.groupDataRange = groupDataRange;
    }

    public Long getAtiPositionId() {
        return atiPositionId;
    }

    public void setAtiPositionId(Long atiPositionId) {
        this.atiPositionId = atiPositionId;
    }

    public String getIsPriPosi() {
        return isPriPosi;
    }

    public void setIsPriPosi(String isPriPosi) {
        this.isPriPosi = isPriPosi;
    }
}