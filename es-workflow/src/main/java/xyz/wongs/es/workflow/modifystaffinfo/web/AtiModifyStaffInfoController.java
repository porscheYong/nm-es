/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.workflow.modifystaffinfo.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.modifystaffinfo.service.AtiModifyStaffInfoService;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.oa.service.AtiSpecificFormService;
import xyz.wongs.es.workflow.user.entity.AtiOrg;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

/**
 * 盟市人员信息修改Controller
 * @author liuj
 * @version 2013-04-05
 */
@Controller
@RequestMapping(value = "${adminPath}/oa/modifyStaffInfo")
public class AtiModifyStaffInfoController extends BaseController {

	@Autowired
	private AtiModifyStaffInfoService modifyStaffInfoService;
	@Autowired
	private UserService userService;
	@Autowired
	private AtiSpecificFormService specificFormService;


	/**
	 * 先获取虚拟对象 modifyStaffInfo
	 * @param id
	 * @return
	 */
	@ModelAttribute
	public AtiModifyStaffInfo get(@RequestParam(required=false) Long id){
		AtiModifyStaffInfo modifyStaffInfo = null;
		if(id != null) {
			modifyStaffInfo = specificFormService.getAtiModifyStaffInfoByBaseFormId(id);
		}
		if (modifyStaffInfo == null){
			modifyStaffInfo = new AtiModifyStaffInfo();
		}
		return modifyStaffInfo;
	}



	/**
	 * 申请单填写
	 * @param modifyStaffInfo
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "form")
	public String form(AtiModifyStaffInfo modifyStaffInfo, Model model) {

		//获取流程节点对应的页面
		String view = modifyStaffInfoService.getFormKey(modifyStaffInfo);

		AtiUser applyUser = userService.getUserByUserId(modifyStaffInfo.getFormSender());
		model.addAttribute("applyUser",applyUser);
		AtiOrg org = userService.getOrgByUserId(modifyStaffInfo.getFormSender());
		model.addAttribute("org",org);

		model.addAttribute("modifyStaffInfo", modifyStaffInfo);
		return "modules/oa/" + view;
	}

	/**
	 * 申请单  保存/修改
	 * @param modifyStaffInfo
	 * @return
	 */
	@RequestMapping(value = "save")
	public String save(AtiModifyStaffInfo modifyStaffInfo) {

		modifyStaffInfoService.save(modifyStaffInfo);
		return "redirect:" + adminPath + "/act/task/todo/";
	}


	/**
	 * 工单执行（完成任务）
	 * @param modifyStaffInfo
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "saveAudit")
	public String saveAudit(AtiModifyStaffInfo modifyStaffInfo, Model model) {
		System.out.println("当前环节：" + modifyStaffInfo.getAct().getTaskName());
		//系统管理员不用添加意见
		if(!modifyStaffInfo.getAct().getTaskDefKey().equals(ProcDefKey.MODIFY_TASK_DEF_KEY[4])) {
			if (StringUtils.isBlank(modifyStaffInfo.getAct().getFlag())
					|| StringUtils.isBlank(modifyStaffInfo.getAct().getComment())){
				addMessage(model, "请填写审核意见。");
				return form(modifyStaffInfo, model);
			}
		}

		modifyStaffInfoService.auditSave(modifyStaffInfo);
		return "redirect:" + adminPath + "/act/task/todo/";
	}



}