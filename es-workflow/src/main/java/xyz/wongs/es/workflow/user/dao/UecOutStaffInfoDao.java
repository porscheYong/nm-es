package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiGroup;
import xyz.wongs.es.workflow.user.entity.UecOutStaffInfo;


/**
 * 外包人员基本信息
 * @author liuxiaodong
 */
@MyBatisDao
public interface UecOutStaffInfoDao extends CrudDao<AtiGroup> {

    /**
     * 获取外包人员信息
     * @param psncode
     * @return
     */
    UecOutStaffInfo getOutStaffByCode(String psncode);
}