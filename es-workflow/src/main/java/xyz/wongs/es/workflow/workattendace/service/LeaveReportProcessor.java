package xyz.wongs.es.workflow.workattendace.service;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;

import javax.annotation.Resource;

/**
 * 销假后处理器
 * @author liuj
 */
@Service
@Transactional
public class LeaveReportProcessor implements TaskListener {

	private static final long serialVersionUID = 1L;

	@Resource
	private AtiBaseFormDao atiBaseFormDao;
	@Resource
	private AtiSpecificFormDao atiSpecificFormDao;
	/**
	 * 关联具体流程图规则
	 * 销假完成后执行，保存实际开始和结束时间
	 */
	@Override
	public void notify(DelegateTask delegateTask) {

		//todo validate
		String procInstId = delegateTask.getProcessInstanceId();
		Long currentBaseFormId = atiBaseFormDao.getBaseFormByProcInstId(procInstId).getAtiBaseFormId();

		String realStartTime = (String) delegateTask.getVariable("realityStartTime");
		AtiSpecificForm specificFormRealStartTime = new AtiSpecificForm(currentBaseFormId,"REALITY_START_TIME",realStartTime);
		atiSpecificFormDao.update(specificFormRealStartTime);

		String realEndTime = (String) delegateTask.getVariable("realityEndTime");
		AtiSpecificForm atiSpecificFormEndTime = new AtiSpecificForm(currentBaseFormId,"REALITY_END_TIME",realEndTime);
		atiSpecificFormDao.update(atiSpecificFormEndTime);

	}

}
