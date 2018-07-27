package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiGroup;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 用户Dao接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiUserDao extends CrudDao<AtiUser> {

    /**
     * 通过用户名查找用户
     * @param name
     * @return
     */
    AtiUser getUserByName(String name);


    /**
     * 通过RoleId查找用户
     * @param atiRoleId
     * @return
     */
    List<AtiUser> getUsersByRoleId(Long atiRoleId);

    /**
     * 取出组中人员
     * @param atiGroupId
     * @return
     */
    List<AtiUser> getUsersByGroup(Long atiGroupId);

    /**
     * 流程发起人所在组织的主管用户
     * @param no
     * @return
     */
    List<AtiUser> getDeptLeaderUsersByNo(String no);

    /**
     * 流程发起人所在组织的人事用户
     * @param no
     * @return
     */
    List<AtiUser> getHrUsersByNo(String no);

    /**
     * 流程发起人所在组织的人事用户
     * @param no
     * @return
     */
    List<AtiUser> getHrLeaderUsersByNo(String no);


    /**
     * 流程发起人所在组织的人事用户
     * @param atiUserId
     * @return
     */
    List<AtiUser> getHrUsersByAtiUserId(Long atiUserId);

    /**
     * 通过uerId查找用户
     * @param atiUserId
     * @return
     */
    AtiUser getUserById(Long atiUserId);

    /**
     * 获取所有用户，测试用
     * @return
     */
    List<AtiUser> getUsers();

}