package xyz.wongs.es.workflow.modifystaffinfo.service;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 分管领导节点添加候选人
 * @author liuxiaodong
 * @date 2018/4/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ModifyStaffInfoHrLeaderAssignProcessor implements TaskListener {

    private static final long serialVersionUID = 5127703148435598370L;

    @Override
    public void notify(DelegateTask delegateTask) {

        delegateTask.setAssignee("uac");
    }
}
