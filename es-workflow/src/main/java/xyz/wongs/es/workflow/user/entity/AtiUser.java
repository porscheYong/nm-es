package xyz.wongs.es.workflow.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

/**
 * ATI_USER用户信息
 * @author liuxiaodong
 */
public class AtiUser implements Serializable {

    private static final long serialVersionUID = 3006448358205754636L;

    private Long atiUserId;

    private Object name;

    private String identityId;

    private String phone;

    private String mail;

    private String no;

    private String password;

    /**  拥有角色列表 */
    private List<AtiRole> roleList = Lists.newArrayList();

    public AtiUser() {
    }

    public AtiUser(Long atiUserId, Object name) {
        this.atiUserId = atiUserId;
        this.name = name;
    }

    public Long getAtiUserId() {
        return atiUserId;
    }

    public void setAtiUserId(Long atiUserId) {
        this.atiUserId = atiUserId;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AtiRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<AtiRole> roleList) {
        this.roleList = roleList;
    }

    @JsonIgnore
    public List<Long> getRoleIdList() {
        List<Long> roleIdList = Lists.newArrayList();
        for (AtiRole role : roleList) {
            roleIdList.add(role.getAtiRoleId());
        }
        return roleIdList;
    }

    public void setRoleIdList(List<Long> roleIdList) {
        roleList = Lists.newArrayList();
        for (Long roleId : roleIdList) {
            AtiRole role = new AtiRole();
            role.setAtiRoleId(roleId);
            roleList.add(role);
        }
    }

}