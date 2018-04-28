package xyz.wongs.es.workflow.user.service;

import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.modules.sys.entity.Role;
import xyz.wongs.es.workflow.user.dao.AtiOrgDao;
import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiOrg;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 *
 * @author liuxiaodong
 * @date 2018/4/14
 */
@Service
public class UserService {

    @Autowired
    private AtiUserDao atiUserMapper;
    @Autowired
    private AtiRoleDao atiRoleMapper;
    @Autowired
    private AtiOrgDao atiOrgMapper;


    /**
     * 修改为查找自定义用户
     * @param name
     * @return
     */
    public AtiUser getAtiUserByName(String name) {
        return  atiUserMapper.getUserByName(name);
    }

    /**
     * 修改为查找自定义用户组
     * @param userId
     * @return
     */
    public List<AtiRole> getRolesByUserId(String userId) {
        return atiRoleMapper.getRolesByUserId(userId);
    }


    public GroupEntity toActivitiGroup(AtiRole role){
        if (role == null){
            return null;
        }
        GroupEntity groupEntity = new GroupEntity();
        groupEntity.setId(String.valueOf(role.getAtiRoleId()));
        groupEntity.setName((String) role.getRoleName());
        groupEntity.setType(role.getRoleType());
        groupEntity.setRevision(1);
        return groupEntity;
    }


    public AtiUser getUserByUserId(Long atiUserId) {
        return atiUserMapper.getUserById(atiUserId);
    }

    public AtiOrg getOrgByUserId(Long atiUserId) {
        return atiOrgMapper.getOrgByUserId(atiUserId);
    }


}
