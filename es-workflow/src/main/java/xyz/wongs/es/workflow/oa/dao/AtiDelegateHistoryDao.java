package xyz.wongs.es.workflow.oa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;

/**
 * 委托历史接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiDelegateHistoryDao extends CrudDao<AtiDelegateHistory> {

    /**
     * 办理委托后保存
     * @param atiDelegateHistory
     * @return
     */
    int saveDelegateHistory(AtiDelegateHistory atiDelegateHistory);
}