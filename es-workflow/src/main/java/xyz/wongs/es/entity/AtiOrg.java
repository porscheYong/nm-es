package xyz.wongs.es.entity;

import java.io.Serializable;

/**
 * @author liuxiaodong
 */
public class AtiOrg implements Serializable {

    private static final long serialVersionUID = 5007078971378409532L;

    private Long atiOrgId;

    private Long parentId;

    private String orgName;

    public Long getAtiOrgId() {
        return atiOrgId;
    }

    public void setAtiOrgId(Long atiOrgId) {
        this.atiOrgId = atiOrgId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}