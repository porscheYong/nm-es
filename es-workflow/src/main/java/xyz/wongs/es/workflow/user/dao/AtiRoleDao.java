package xyz.wongs.es.workflow.user.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiRole;

import java.util.List;

/**
 * 角色Dao接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiRoleDao extends CrudDao<AtiRole> {


    /**
     * 根据角色编码查找角色对象
     * @param roleCode
     * @return
     */
    AtiRole getRoleByRoleCode(String roleCode);

    /**
     *根据UserId查找List<AtiRole>
     * @param UserId
     * @return
     */
    List<AtiRole> getRolesByUserId(String UserId);

    /**
     * 获取用户角色
     * @param no
     * @return
     */
    AtiRole getRoleByNo(String no);

}