package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiGroup;

/**
 * 用户组DAO接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiGroupDao extends CrudDao<AtiGroup> {


}