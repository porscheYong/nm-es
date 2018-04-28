package xyz.wongs.es.workflow.user.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.user.entity.AtiPosition;

/**
 * 人员岗位Dao接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiPositionDao extends CrudDao<AtiPosition> {


}