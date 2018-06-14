package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiGroup;
import xyz.wongs.es.workflow.user.entity.UecStaffInfo;

/**
 * 内蒙主数据平台人员基本信息
 * 调用接口验证用户名
 * @author liuxiaodong
 */
@MyBatisDao
public interface UecStaffInfoDao extends CrudDao<AtiGroup>  {

    /**
     * 获取用户
     * @param code
     * @return
     */
    UecStaffInfo getStaffByCode(String code);
}