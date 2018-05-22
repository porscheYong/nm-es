package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.activiti.engine.delegate.DelegateTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.wongs.es.workflow.oa.dao.AtiDelegateHistoryDao;
import xyz.wongs.es.workflow.oa.dao.AtiDelegateInfoDao;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 任务委托 Service
 * @author liuxiaodong
 * @date 2018/4/20
 */
@Service
public class AtiDelegateService {

    @Resource
    private AtiDelegateInfoDao atiDelegateInfoDao;
    @Resource
    private AtiDelegateHistoryDao atiDelegateHistoryDao;

    /**
     * 获取列表
     * @param assignee
     * @return
     */
    public List<AtiDelegateInfo> getDelegateInfoList(String assignee) {
        return atiDelegateInfoDao.getDelegateInfoList(assignee);

    }


    /**
     * 增
     * @param atiDelegateInfo
     * @return
     */
    public int saveDelegateInfo(AtiDelegateInfo atiDelegateInfo) {

        return atiDelegateInfoDao.addDelegateInfo(atiDelegateInfo);
    }


    /**
     * 改
     * @param atiDelegateInfo
     * @return
     */
    public int updateDelegateInfo(AtiDelegateInfo atiDelegateInfo) {
        return atiDelegateInfoDao.updateDelegateInfo(atiDelegateInfo);
    }


    /**
     * 删
     * @param atiDelegateInfo
     * @return
     */
    public int updateDelegateInfoStatus(AtiDelegateInfo atiDelegateInfo) {
        return atiDelegateInfoDao.updateDelegateInfoStatus(atiDelegateInfo);
    }



    /**
     * 获取用户流程的委托任务信息
     * @param targetAssignee
     * @return
     */
    public List<AtiDelegateInfo> getDelegateInfo(String targetAssignee) {

        List<AtiDelegateInfo> list = atiDelegateInfoDao.getDelegateInfoList(targetAssignee);
        List<AtiDelegateInfo> delegateInfos = Lists.newArrayList();
        for (AtiDelegateInfo delegateInfo : list) {

            Date startTime = delegateInfo.getStartTime();
            Date endTime = delegateInfo.getEndTime();

            //判断代理时间的有效性
            if (timeNotBetweenNow(startTime, endTime)) {
                continue;
            }

            delegateInfos.add(delegateInfo);
        }

        return delegateInfos;
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
        atiDelegateHistoryDao.saveDelegateHistory(atiDelegateHistory);
    }



}
