package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiOrg;

/**
 * 组织Dao接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiOrgDao extends CrudDao<AtiOrg> {


    /**通过userId获取组织信息
     * @param atiUserId
     * @return
     */
    AtiOrg getOrgByUserId(Long atiUserId);

    /**
     * 通过name获取组织
     * @param name
     * @return
     */
    AtiOrg getOrgByUserName(String name);
}