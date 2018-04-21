package xyz.wongs.es.workflow.oa.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;

import java.util.List;

/**
 * 委托信息接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiDelegateInfoMapper extends CrudDao<AtiDelegateInfo> {

    /**
     * 保存代理设置
     * @param atiDelegateInfo
     * @return
     */
    int addDelegateInfo(AtiDelegateInfo atiDelegateInfo);


    /**
     * 获取代理信息列表
     * @param assignee
     * @return
     */
    List<AtiDelegateInfo> getDelegateInfoList(Object assignee);


    /**
     * 更新委托信息
     * @param atiDelegateInfo
     * @return
     */
    int updateDelegateInfo(AtiDelegateInfo atiDelegateInfo);


    /**
     * 删除委托信息
     * @param atiDelegateInfo
     * @return
     */
    int updateDelegateInfoStatus(AtiDelegateInfo atiDelegateInfo);
}