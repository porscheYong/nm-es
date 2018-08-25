package xyz.wongs.es.workflow.act.dao;

import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.act.entity.ActHiActinst;

import java.util.List;
@MyBatisDao
public interface ActHiActinstDao {

    List<ActHiActinst> findAllActHiActinstByAssignee(String assignee);
}