/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.modules.oa.web;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xyz.wongs.es.common.mapper.JsonMapper;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.oa.entity.Leave;
import xyz.wongs.es.modules.oa.service.LeaveService;
import xyz.wongs.es.modules.sys.entity.Office;
import xyz.wongs.es.modules.sys.entity.User;
import xyz.wongs.es.modules.sys.service.OfficeService;
import xyz.wongs.es.modules.sys.service.SystemService;
import xyz.wongs.es.modules.sys.utils.UserUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请假Controller
 * @author liuj
 * @version 2013-04-05
 */
@Controller
@RequestMapping(value = "${adminPath}/oa/leave")
public class LeaveController extends BaseController {
	@Autowired
	SystemService systemService;
	@Autowired
	private LeaveService leaveService;

	/**
	 * 读取详细数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "detail/{id}")
	@ResponseBody
	public String getLeave(@PathVariable("id") String id) {
		Leave leave = leaveService.get(id);
		return JsonMapper.getInstance().toJson(leave);
	}

	@ModelAttribute
	public Leave get(@RequestParam(required=false) String id){//,
//			@RequestParam(value="act.procInsId", required=false) String procInsId) {
		Leave leave = null;
		if (StringUtils.isNotBlank(id)){
			leave = leaveService.get(id);
//		}else if (StringUtils.isNotBlank(procInsId)){
//			testAudit = testAuditService.getByProcInsId(procInsId);
		}
		if (leave == null){
			leave = new Leave();
		}
		return leave;
	}

	/**
	 * 读取所有流程
	 * @return
	 */
	@RequiresPermissions("oa:leave:view")
	@RequestMapping(value = {"list", ""})
	public String list(Leave leave, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			leave.setCreateBy(user);
		}
		Page<Leave> page = leaveService.findPage(new Page<Leave>(request, response), leave);
		model.addAttribute("page", page);
		return "modules/oa/leaveTestList";
	}

	/**
	 * 申请单填写
	 * @param leave
	 * @param model
	 * @return
	 */
	@RequiresPermissions("oa:leave:view")
	@RequestMapping(value = "form")
	public String form(Leave leave, Model model) {

		String view = "leaveForm";

		// 查看审批申请单
		if (StringUtils.isNotBlank(leave.getId())){//.getAct().getProcInsId())){

			// 环节编号
			String taskDefKey = leave.getAct().getTaskDefKey();

			// 查看工单
			if(leave.getAct().isFinishTask()){
				view = "leaveTestList";
			}
			// 修改环节
			else if ("modifyApply".equals(taskDefKey)){
				view = "leaveForm";
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
		model.addAttribute("leave", leave);
		return "modules/oa/" + view;
	}

	/**
	 * 申请单保存/修改
	 * @param leave
	 * @param model
	 * @param redirectAttributes
	 * @return
	 */
	@RequiresPermissions("oa:leave:edit")
	@RequestMapping(value = "save")
	public String save(Leave leave, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, leave)){
			return form(leave, model);
		}
		leaveService.save(leave);
		addMessage(redirectAttributes, "提交审批'" + leave.getUser().getName() + "'成功");
		return "redirect:" + adminPath + "/act/task/todo/";
	}

	@RequestMapping(value = "/startLeaveProc",method = RequestMethod.POST)
	@ResponseBody
	public String save(Leave leave) {
		// validate
		String loginName = leave.getUser().getLoginName();

		if(loginName == null || loginName.isEmpty()) {
			return "fail";
		}

		String post = leave.getPost();

		if(post == null || post.isEmpty()) {
			return "fail";
		}

		String leaveType = leave.getLeaveType();

		if(leaveType == null || leaveType.isEmpty()) {
			return "fail";
		}

		if(leave.getStartTime() == null) {
			return "fail";
		}

		if(leave.getEndTime() == null) {
			return "fail";
		}

		String reason = leave.getReason();

		if(reason == null || reason.isEmpty()) {
			return "fail";
		}

		User user = systemService.getUserByLoginName(loginName);
		leave.setUser(user);

		leaveService.save(leave);
		return "success";
	}

	/**
	 * 工单执行（完成任务）
	 * @param leave
	 * @param model
	 * @return
	 */
	@RequiresPermissions("oa:leave:edit")
	@RequestMapping(value = "saveAudit")
	public String saveAudit(Leave leave, Model model) {
		System.out.println("当前环节：" + leave.getAct().getTaskName());
		if (StringUtils.isBlank(leave.getAct().getFlag())
				|| StringUtils.isBlank(leave.getAct().getComment())){
			addMessage(model, "请填写审核意见。");
			return form(leave, model);
		}
		leaveService.auditSave(leave);
		return "redirect:" + adminPath + "/act/task/todo/";
	}

	/**
	 * 删除工单
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequiresPermissions("oa:leave:edit")
	@RequestMapping(value = "delete")
	public String delete(Leave leave, RedirectAttributes redirectAttributes) {
		leaveService.delete(leave);
		addMessage(redirectAttributes, "删除审批成功");
		return "redirect:" + adminPath + "/oa/leave/?repage";
	}

}