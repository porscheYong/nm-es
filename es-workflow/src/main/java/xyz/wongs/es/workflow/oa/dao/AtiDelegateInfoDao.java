package xyz.wongs.es.workflow.oa.dao;

import org.apache.ibatis.annotations.Param;
import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;

import java.util.List;

/**
 * 委托信息接口
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiDelegateInfoDao extends CrudDao<AtiDelegateInfo> {

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

    /**
     * 根据委托人查找委托信息
     * @param leaver
     * @return
     */
    List<AtiDelegateInfo> getDelegateInfoByLeaver(String leaver);

    /**
     * 更改委托人
     * @param assignee
     * @param attorney
     * @return
     */
    int updateDelegateAssignee(@Param("assignee") String assignee,@Param("attorney") String attorney);


    /**
     * 更改代理人
     * @param assignee
     * @param attorney
     * @return
     */
    int updateDelegateAttorney(@Param("assignee") String assignee, @Param("attorney") String attorney);

}