package xyz.wongs.es.workflow.oa.service;

import org.activiti.engine.delegate.DelegateTask;
import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateHistory;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 节点任务监听器继承此类
 * @author liuxiaodong
 * @date 2018/5/7
 */
@Service
public class OaBaseTaskListenerService {

    @Resource
    private AtiDelegateService atiDelegateService;
    @Resource
    private AtiActCategoryService atiActCategoryService;
    @Resource
    private UserService userService;


    public void addNames(List<AtiUser> users, List<String> names, DelegateTask delegateTask) {
        for(AtiUser user : users) {
            names.add(String.valueOf(user.getAtiUserId()));
        }
       delegateTask.addCandidateUsers(names);
    }

    public void addAssignNames(List<AtiUser> users, List<String> names, DelegateTask delegateTask) {
        for(AtiUser user : users) {
            names.add(user.getNo());
        }
        delegateTask.addCandidateUsers(names);
    }


    /**
     * 有任务委托，则添加委托人
     * @param users
     * @param delegateTask
     */
    public void addDelegateNames(List<AtiUser> users,DelegateTask delegateTask) {
        String processDefinitionId = delegateTask.getProcessDefinitionId();

        String assignee;
        String attorney = "";
        for(AtiUser atiUser : users) {
            assignee = String.valueOf(atiUser.getAtiUserId());

            List<AtiDelegateInfo> delegateInfos = atiDelegateService.getDelegateInfo(assignee);
            for(AtiDelegateInfo delegateInfo : delegateInfos) {
                if(delegateInfo != null) {

                    //设置一个流程委托
                    if(processDefinitionId.equals(delegateInfo.getProcDefId())) {
                        attorney = setDelegateForTask(delegateInfo,assignee,delegateTask,users);
                        continue;
                    }

                    //设置一类流程委托
                    if("0".equals(delegateInfo.getProcDefId()) || ((String) delegateInfo.getProcDefId()).length()<5) {
                        String atiActCategoryId = delegateInfo.getAtiActCategoryId();
                        List<Map<String,Object>> list = atiActCategoryService.getProcessDefinitionByCategoryId(atiActCategoryId);
                        for(Map<String,Object> map : list) {
                            if(map.get("ID_").equals(processDefinitionId)) {
                                setDelegateForTask(delegateInfo,assignee,delegateTask,users);
                            }
                        }
                    }
                }
            }

        }

        if(!"".equals(attorney)) {
            users.add(userService.getUserByUserId(Long.valueOf(attorney)));
        }

    }


    /**
     * 任务节点设置委托
     * @param delegateInfo
     * @param assignee
     * @param delegateTask
     */
    public String setDelegateForTask(AtiDelegateInfo delegateInfo, String assignee, DelegateTask delegateTask,List<AtiUser> users) {
        String attorney = (String) delegateInfo.getAttorney();
        delegateTask.addCandidateUser(attorney);

        AtiDelegateHistory delegateHistory = new AtiDelegateHistory(assignee,attorney,new Date(),
                delegateTask.getProcessInstanceId(),delegateTask.getId(),delegateTask.getTaskDefinitionKey(),
                delegateInfo.getDelegateReason(),delegateInfo.getStatus());

        atiDelegateService.saveDelegateHistory(delegateHistory);

        return attorney;
    }


}
