/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.workflow.oa.web;

import com.google.common.collect.Maps;
import oracle.sql.DATE;
import org.activiti.engine.FormService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.sys.entity.User;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormMapper;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormMapper;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;
import xyz.wongs.es.workflow.oa.entity.AtiLeave;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import xyz.wongs.es.workflow.oa.service.AtiLeaveService;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 示例 请假Controller
 * @author liuj
 * @version 2013-04-05
 */
@Controller
@RequestMapping(value = "${adminPath}/oa/leave")
public class AtiLeaveController extends BaseController {

	@Autowired
	private AtiLeaveService leaveService;
	//注入 AtiSpecificFormMapper ,测试重新申请接口
	@Autowired
	private AtiSpecificFormMapper atiSpecificFormMapper;
	//注入 AtiTaskService ,测试重新申请接口
	@Autowired
	private AtiTaskService atiTaskService;
	/**
	 * 申请单填写
	 * @param atiLeave
	 * @param model
	 * @return
	 */
	@RequiresPermissions("oa:leave:view")
	@RequestMapping(value = "form")
	public String form(AtiLeave atiLeave, Model model) {

		String view = "leaveForm";

		// 查看审批申请单
		if (StringUtils.isNotBlank(atiLeave.getId())){

			// 环节编号
			String taskDefKey = atiLeave.getAct().getTaskDefKey();

			// 查看工单
			if(atiLeave.getAct().isFinishTask()){
				view = "leaveTestList";
			}
			// 修改环节
			else if ("modifyApply".equals(taskDefKey)){
				view = "leaveModifyForm";
			}
			// 审核环节
			else if ("deptLeaderAudit".equals(taskDefKey)){
				view = "leaveTestAudit";
//				String formKey = "/oa/testAudit";
//				return "redirect:" + ActUtils.getFormUrl(formKey, testAudit.getAct());
			}
			// 审核环节2
			else if ("hrAudit".equals(taskDefKey)){
				view = "leaveTestAudit";
			}
			// 兑现环节
			else if ("apply_end".equals(taskDefKey)){
				view = "leaveTestAudit";
			}
		}

		model.addAttribute("leave", atiLeave);
		return "modules/oa/" + view;
	}

	/**
	 * 申请单  保存/修改
	 * @param leave
	 * @return
	 */
	@RequiresPermissions("oa:leave:edit")
	@RequestMapping(value = "save")
	public String save(AtiLeave leave) {

		leaveService.save(leave);
		return "redirect:" + adminPath + "/act/task/todo/";
	}


	/**
	 * 工单执行（完成任务）
	 * @param leave
	 * @param model
	 * @return
	 */
	@RequiresPermissions("oa:leave:edit")
	@RequestMapping(value = "saveAudit")
	public String saveAudit(AtiLeave leave, Model model) {
		System.out.println("当前环节：" + leave.getAct().getTaskName());
		if (StringUtils.isBlank(leave.getAct().getFlag())
				|| StringUtils.isBlank(leave.getAct().getComment())){
			addMessage(model, "请填写审核意见。");
			return form(leave, model);
		}
		leaveService.auditSave(leave);
		return "redirect:" + adminPath + "/act/task/todo/";
	}




	//////////////以下为测试接口部分

	/**
	 *
	 * 发起流程接口测试
	 * @param leave
	 */
	@RequestMapping(value = "/testStartAtiLeave",method = RequestMethod.POST)
	@ResponseBody
	public String testStartAtiLeave(AtiLeave leave) {

		String procDefId = leave.getAct().getProcDefId();
		if(procDefId == null || procDefId.isEmpty()) {
			return "fail";
		}

		String formSender = String.valueOf(leave.getFormSender());
		if(formSender == null || formSender.isEmpty()){
			return "fail";
		}

		String formTheme = (String) leave.getFormTheme();
		if(formTheme == null || formTheme.isEmpty()) {
			return  "fail";
		}

		String urgent = leave.getUrgent();
		if(urgent == null || urgent.isEmpty()) {
			return "fail";
		}

		String formContent = (String) leave.getFormContent();
		if(formContent == null || formContent.isEmpty()) {
			return "fail";
		}

		String leaveType = leave.getLeaveType();
		if(leaveType == null || leaveType.isEmpty()) {
			return "fail";
		}

		Date startTime = leave.getStartTime();
		if(startTime == null) {
			return "fail";
		}

		Date endTime = leave.getEndTime();
		if(endTime == null) {
			return "fail";
		}

		String reason = leave.getReason();
		if(reason == null || reason.isEmpty()) {
			return "fail";
		}

		leaveService.save(leave);
		return "success";
	}


	/**
	 * 审批测试接口
	 * @param taskId
	 * @param procInsId
	 * @param comment
	 * @param flag
	 * @return
	 */
	@RequestMapping(value = "/testSaveAudit",method = RequestMethod.POST)
	@ResponseBody
	public String  testSaveAudit(String taskId,String procInsId,String comment,String flag,String atiBaseFormId) {

		if(taskId==null || taskId.isEmpty()) {
			return "taskId false";
		}

		if(procInsId==null || procInsId.isEmpty()) {
			return "procInsId false";
		}

		if(comment==null || comment.isEmpty()) {
			return "comment false";
		}

		if(flag==null || flag.isEmpty()) {
			return "flag false";
		}

		AtiLeave atiLeave = new AtiLeave();
		atiLeave.getAct().setTaskId(taskId);
		atiLeave.getAct().setComment(comment);
		atiLeave.setProcInstId(procInsId);
		atiLeave.getAct().setFlag(flag);
		atiLeave.getAct().setTaskDefKey("deptLeaderAudit");
		atiLeave.setAtiBaseFormId(Long.valueOf(atiBaseFormId));

		leaveService.auditSave(atiLeave);

		return "success";


	}


	/**
	 * 销假 测试接口
	 * @param taskId
	 * @param procInsId
	 * @param comment
	 * @param flag
	 * @return
	 */
	@RequestMapping(value = "/restReportBack",method = RequestMethod.POST)
	@ResponseBody
	public String  testModify(String taskId,String procInsId,String comment,String flag,
								 Date realityStartTime,Date realityEndTime) {

		if(taskId==null || taskId.isEmpty()) {
			return "taskId false";
		}

		if(procInsId==null || procInsId.isEmpty()) {
			return "procInsId false";
		}

		if(flag==null || flag.isEmpty()) {
			return "flag false";
		}

		if(realityStartTime == null) {
			return "realityStartTime false";
		}

		if(realityEndTime == null) {
			return "realityEndTime false";
		}


		AtiLeave atiLeave = new AtiLeave();
		atiLeave.getAct().setTaskId(taskId);
		atiLeave.getAct().setComment(comment);
		atiLeave.setProcInstId(procInsId);
		atiLeave.getAct().setFlag(flag);
		atiLeave.setRealityStartTime(realityStartTime);
		atiLeave.setRealityEndTime(realityEndTime);
		atiLeave.getAct().setTaskDefKey("reportBack");

		leaveService.auditSave(atiLeave);

		return "success";


	}


	/**
	 * 重申 测试接口
	 * @param leave
	 * @return
	 */
	@RequestMapping(value = "/testRestart")
	@ResponseBody
	public String testRestart(AtiLeave leave,String taskId) {

		String leaveType = leave.getLeaveType();
		if(leaveType == null || leaveType.isEmpty()) {
			return  "false";
		}

		Date startTime = leave.getStartTime();
		if(startTime == null) {
			return "false";
		}

		Date endTime = leave.getEndTime();
		if(endTime == null) {
			return "false";
		}

		String reason = leave.getReason();
		if(reason == null || reason.isEmpty()) {
			return "false";
		}

		String procInstId = leave.getProcInstId();
		if(procInstId == null || procInstId.isEmpty()) {
			return "false";
		}

		if(taskId == null || taskId.isEmpty()) {
			return "false";
		}


		AtiSpecificForm atiSpecificFormStartTime = new AtiSpecificForm(leave.getAtiBaseFormId(),"START_TIME",leave.getReason());
		atiSpecificFormMapper.update(atiSpecificFormStartTime);

		AtiSpecificForm atiSpecificFormEndTime = new AtiSpecificForm(leave.getAtiBaseFormId(),"END_TIME",String.valueOf(leave.getEndTime()));
		atiSpecificFormMapper.update(atiSpecificFormEndTime);

		AtiSpecificForm atiSpecificFormLeaveType = new AtiSpecificForm(leave.getAtiBaseFormId(),"LEAVE_TYPE",leave.getLeaveType());
		atiSpecificFormMapper.update(atiSpecificFormLeaveType);

		AtiSpecificForm atiSpecificFormReason = new AtiSpecificForm(leave.getAtiBaseFormId(),"REASON",leave.getReason());
		atiSpecificFormMapper.update(atiSpecificFormReason);

		// 完成流程任务
		Map<String, Object> vars = Maps.newHashMap();
		vars.put("pass", "1");
		atiTaskService.complete(taskId, leave.getProcInstId(), "[重申]", leave.getReason(), vars);
		return "success";
	}







}