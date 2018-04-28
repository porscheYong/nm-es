package xyz.wongs.es.workflow.modifystaffinfo.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.List;

/**
 * 人力资源节点添加候选人
 * @author liuxiaodong
 * @date 2018/4/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ModifyStaffInfoHrAssignProcessor implements TaskListener {

    private static final long serialVersionUID = 7499738744879695134L;

    @Autowired
    private AtiUserDao atiUserMapper;
    @Autowired
    private RuntimeService runtimeService;

    @Override
    public void notify(DelegateTask delegateTask) {

        List<AtiUser> users = (List<AtiUser>) runtimeService.getVariable(delegateTask.getProcessInstanceId(),"hr");
        if(users!=null) {
            for(AtiUser atiUser : users) {
                delegateTask.addCandidateUser(String.valueOf(atiUser.getAtiUserId()));
            }
            return;
        }
        Long  atiUserId = (Long) delegateTask.getVariable("applyUser");
        List<AtiUser> hrUsers = atiUserMapper.getHrUsersByAtiUserId(atiUserId);

        for(AtiUser atiUser : hrUsers) {
            delegateTask.addCandidateUser(String.valueOf(atiUser.getAtiUserId()));
        }

    }
}
