package xyz.wongs.es.workflow.user.entity;

import java.io.Serializable;

/**
 * 角色Entity
 * @author liuxiaodong
 */
public class AtiRole implements Serializable {

    private static final long serialVersionUID = 8471486244728209388L;

    private Long atiRoleId;

    private Object roleName;

    private String roleCode;

    private String roleType;

    public Long getAtiRoleId() {
        return atiRoleId;
    }

    public void setAtiRoleId(Long atiRoleId) {
        this.atiRoleId = atiRoleId;
    }

    public Object getRoleName() {
        return roleName;
    }

    public void setRoleName(Object roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}