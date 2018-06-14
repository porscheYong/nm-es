package xyz.wongs.es.workflow.salaryadjustment.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.salaryadjustment.entity.OutSalaryment;

import java.util.List;

/**
 * 薪资Dao
 * @author liuxiaodong
 * @date 2018/6/12
 */
@MyBatisDao
public interface OutSalarymentDao extends CrudDao<OutSalaryment> {

    List<OutSalaryment> getSalaryment();
}
