package xyz.wongs.es.workflow.modifystaffinfo.service;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 系统管理员节点添加候选人
 * @author liuxiaodong
 * @date 2018/4/27
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ModifyStaffInfoAdminAssignProcessor implements TaskListener {

    private static final long serialVersionUID = 3539065716269596003L;

    @Override
    public void notify(DelegateTask delegateTask) {

        delegateTask.setAssignee("uac");
    }
}
