/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.modules.oa.service;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.modules.act.service.ActTaskService;
import xyz.wongs.es.modules.act.utils.ActUtils;
import xyz.wongs.es.modules.oa.dao.LeaveDao;
import xyz.wongs.es.modules.oa.entity.Leave;
import xyz.wongs.es.modules.oa.entity.TestAudit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 请假Service
 * @author liuj
 * @version 2013-04-05
 */
@Service
@Transactional(readOnly = true)
public class LeaveService extends CrudService<LeaveDao, Leave> {

	@Autowired
	private ActTaskService actTaskService;

	public Page<Leave> findPage(Page<Leave> page, Leave leave) {
		leave.setPage(page);
		page.setList(dao.findList(leave));
		return page;
	}

	/**
	 * 审核新增或编辑
	 * @param leave
	 */
	@Transactional(readOnly = false)
	public void save(Leave leave) {

		// 申请发起
		if (StringUtils.isBlank(leave.getId())){
			leave.preInsert();
			dao.insert(leave);

			// 启动流程
			actTaskService.startProcess(ActUtils.PD_LEAVE[0], ActUtils.PD_LEAVE[1], leave.getId(), leave.getReason());

		}

		// 重新编辑申请
		else{
			leave.preUpdate();
			dao.update(leave);

			leave.getAct().setComment(("yes".equals(leave.getAct().getFlag())?"[重申] ":"[销毁] ")+leave.getAct().getComment());

			// 完成流程任务
			Map<String, Object> vars = Maps.newHashMap();
			vars.put("pass", "yes".equals(leave.getAct().getFlag())? "1" : "0");
			actTaskService.complete(leave.getAct().getTaskId(), leave.getAct().getProcInsId(), leave.getAct().getComment(), leave.getReason(), vars);
		}
	}

	/**
	 * 审核审批保存
	 * @param leave
	 */
	@Transactional(readOnly = false)
	public void auditSave(Leave leave) {

		// 设置意见
		leave.getAct().setComment(("yes".equals(leave.getAct().getFlag())?"[同意] ":"[驳回] ")+leave.getAct().getComment());

		leave.preUpdate();

		// 对不同环节的业务逻辑进行操作
		String taskDefKey = leave.getAct().getTaskDefKey();

		// 审核环节
		if ("deptLeaderAudit".equals(taskDefKey)){
			leave.setDeptLeaderText(leave.getAct().getComment());
			dao.updateDeptLeaderTxt(leave);
		}
		else if ("hrAudit".equals(taskDefKey)){
			leave.setHrText(leave.getAct().getComment());
			dao.updateHrTxt(leave);
		}
		else if ("reportBack".equals(taskDefKey)){

		}

		// 未知环节，直接返回
		else{
			return;
		}

		// 提交流程任务
		Map<String, Object> vars = Maps.newHashMap();
		vars.put("pass", "yes".equals(leave.getAct().getFlag())? "1" : "0");
		actTaskService.complete(leave.getAct().getTaskId(), leave.getAct().getProcInsId(), leave.getAct().getComment(), vars);
	}
}