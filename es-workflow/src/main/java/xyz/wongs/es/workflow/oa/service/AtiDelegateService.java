package xyz.wongs.es.workflow.oa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wongs.es.workflow.oa.dao.AtiDelegateHistoryDao;
import xyz.wongs.es.workflow.oa.dao.AtiDelegateInfoDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;

import java.util.Date;
import java.util.List;

/**
 * 任务委托 Service
 * @author liuxiaodong
 * @date 2018/4/20
 */
@Service
public class AtiDelegateService {

    @Autowired
    private AtiDelegateInfoDao atiDelegateInfoMapper;
    @Autowired
    private AtiDelegateHistoryDao atiDelegateHistoryMapper;

    /**
     * 获取列表
     * @param assignee
     * @return
     */
    public List<AtiDelegateInfo> getDelegateInfoList(Object assignee) {
        return atiDelegateInfoMapper.getDelegateInfoList(assignee);

    }


    /**
     * 增
     * @param atiDelegateInfo
     * @return
     */
    public int saveDelegateInfo(AtiDelegateInfo atiDelegateInfo) {

        return atiDelegateInfoMapper.addDelegateInfo(atiDelegateInfo);
    }


    /**
     * 改
     * @param atiDelegateInfo
     * @return
     */
    public int updateDelegateInfo(AtiDelegateInfo atiDelegateInfo) {
        return atiDelegateInfoMapper.updateDelegateInfo(atiDelegateInfo);
    }


    /**
     * 删
     * @param atiDelegateInfo
     * @return
     */
    public int updateDelegateInfoStatus(AtiDelegateInfo atiDelegateInfo) {
        return atiDelegateInfoMapper.updateDelegateInfoStatus(atiDelegateInfo);
    }



    /**
     * 获取用户流程的委托任务信息
     * @param targetAssignee
     * @param targetProcDefinitionId
     * @return
     */
    public AtiDelegateInfo getDelegateInfo(String targetAssignee,String targetProcDefinitionId) {

        List<AtiDelegateInfo> list = atiDelegateInfoMapper.getDelegateInfoList(targetAssignee);
        for (AtiDelegateInfo delegateInfo : list) {

            String procDefId = (String) delegateInfo.getProcDefId();
            Date startTime = delegateInfo.getStartTime();
            Date endTime = delegateInfo.getEndTime();

            //判断代理时间的有效性
            if (timeNotBetweenNow(startTime, endTime)) {
                continue;
            }

            if (procDefId.equals(targetProcDefinitionId)) {
                return delegateInfo;
            }
        }

        return null;
    }



    public boolean timeNotBetweenNow(Date startTime,Date endTime) {
        Date now = new Date();

        if(startTime != null) {
            return now.before(startTime);
        }

        if(endTime != null) {
            return now.after(endTime);
        }

        return false;
    }


    public void saveDelegateHistory(AtiDelegateHistory atiDelegateHistory) {
        atiDelegateHistoryMapper.saveDelegateHistory(atiDelegateHistory);
    }



}
