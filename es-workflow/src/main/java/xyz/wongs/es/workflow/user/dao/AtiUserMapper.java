package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 用户Dao接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiUserMapper extends CrudDao<AtiUser> {

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

}