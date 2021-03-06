package xyz.wongs.es.workflow.workattendace.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.modules.oa.dao.LeaveDao;
import xyz.wongs.es.modules.oa.entity.Leave;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 调整请假内容处理器
 * 已经在完成重申任务前更新了
 * @author liuj
 */
@Service
@Transactional
public class LeaveModifyProcessor implements TaskListener {
	
	private static final long serialVersionUID = 1L;

	@Resource
	private AtiSpecificFormDao atiSpecificFormMapper;
	@Resource
	private AtiBaseFormDao AtiBaseFormDao;

	@Override
	public void notify(DelegateTask delegateTask) {

		String procInstId = delegateTask.getProcessInstanceId();
		Long currentBaseFormId = AtiBaseFormDao.getBaseFormByProcInstId(procInstId).getAtiBaseFormId();
//
//		String leaveType = (String) delegateTask.getVariable("leaveType");
//		AtiSpecificForm specificFormLeaveType = new AtiSpecificForm(currentBaseFormId,"LEAVE_TYPE",leaveType);
//		atiSpecificFormMapper.update(specificFormLeaveType);
//
//		String startTime = (String) delegateTask.getVariable("startTime");
//		AtiSpecificForm specificFormStartTime = new AtiSpecificForm(currentBaseFormId,"START_TIME",startTime);
//		atiSpecificFormMapper.update(specificFormStartTime);
//
//		String endTime = (String) delegateTask.getVariable("endTime");
//		AtiSpecificForm specificFormEndTime = new AtiSpecificForm(currentBaseFormId,"END_TIME",endTime);
//		atiSpecificFormMapper.update(specificFormEndTime);
//
//		String reason = (String) delegateTask.getVariable("reason");
//		AtiSpecificForm specificFormReason = new AtiSpecificForm(currentBaseFormId,"REASON",reason);
//		atiSpecificFormMapper.update(specificFormReason);


	}

}
