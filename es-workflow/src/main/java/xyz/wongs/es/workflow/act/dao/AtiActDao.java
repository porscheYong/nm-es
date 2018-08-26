package xyz.wongs.es.workflow.act.dao;

import org.apache.ibatis.annotations.Param;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;

/**
 * @author liuxiaodong
 * @date 2018/4/14
 */
@MyBatisDao
public interface AtiActDao {

    /**
     * 更新通用表单流程实例ID
     *
     * @param procInstId
     * @param atiBaseFormId
     */
    void updateProcInstIdByBaseFormId(@Param("procInstId") String procInstId,
                                      @Param("atiBaseFormId") Long atiBaseFormId);

    void setAssigneeForActHiActinst(@Param("procInstId") String procInstId,
                                    @Param("assignee") String assignee);

}
