package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.task.IdentityLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.user.dao.AtiRoleMapper;
import xyz.wongs.es.workflow.user.dao.AtiUserMapper;
import xyz.wongs.es.workflow.user.entity.AtiRole;
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
    @Autowired
    private AtiRoleMapper atiRoleMapper;

    @Override
    public void notify(DelegateTask delegateTask) {

//        //人事处理环节的办理人
//        AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("3000");
//        List<AtiUser> users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());
//
//        String processDefinitionId = delegateTask.getProcessDefinitionId();
//
//        String assignee = null;
//        AtiDelegateInfo delegateInfo = null;
//        for(AtiUser atiUser : users) {
//            delegateInfo = atiDelegateService.getDelegateInfo(String.valueOf(atiUser.getAtiUserId()),processDefinitionId);
//            if(delegateInfo != null) {
//                assignee = String.valueOf(atiUser.getAtiUserId());
//                break;
//            }
//        }
//
//
//        String attorney = (String) delegateInfo.getAttorney();
//        delegateTask.addCandidateUser(attorney);
//
//        AtiDelegateHistory delegateHistory = new AtiDelegateHistory(assignee,attorney,new Date(),
//                delegateTask.getProcessInstanceId(),delegateTask.getId(),delegateTask.getTaskDefinitionKey(),
//                delegateInfo.getDelegateReason(),delegateInfo.getStatus());
//
//        atiDelegateService.saveDelegateHistory(delegateHistory);

    }
}
