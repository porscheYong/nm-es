/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.workflow.oa.web;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.oa.entity.AtiLeave;
import xyz.wongs.es.workflow.oa.service.AtiLeaveService;

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


	@RequestMapping(value = "/startAtiLeave",method = RequestMethod.POST)
	public void startAtiLeave(AtiLeave leave) {

	}



}