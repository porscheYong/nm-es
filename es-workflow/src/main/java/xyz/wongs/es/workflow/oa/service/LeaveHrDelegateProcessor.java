package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.user.dao.AtiUserMapper;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 请假流程，部门经理环节委托处理器
 * @author liuxiaodong
 * @date 2018/4/20
 */
@Service
@Transactional
public class LeaveHrDelegateProcessor implements TaskListener {


    private static final long serialVersionUID = 2440459667358147720L;

    @Autowired
    private AtiDelegateService atiDelegateService;
    @Autowired
    private AtiUserMapper atiUserMapper;

    @Override
    public void notify(DelegateTask delegateTask) {

        //如果有委托，设置委托人
        String assignee = delegateTask.getAssignee();
        String processDefinitionId = delegateTask.getProcessDefinitionId();

        AtiUser atiUser = atiUserMapper.getUserByName(assignee);
        AtiDelegateInfo delegateInfo = atiDelegateService.getDelegateInfo(String.valueOf(atiUser.getAtiUserId()),processDefinitionId);

        if (delegateInfo == null) {
            return;
        }

        String attorney = (String) delegateInfo.getAttorney();

        delegateTask.setAssignee(attorney);

        AtiDelegateHistory delegateHistory = new AtiDelegateHistory(assignee,attorney,new Date(),
                delegateTask.getProcessInstanceId(),delegateTask.getId(),delegateTask.getTaskDefinitionKey(),
                delegateInfo.getDelegateReason(),delegateInfo.getStatus());

        atiDelegateService.saveDelegateHistory(delegateHistory);

    }
}
