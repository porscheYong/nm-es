/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.web;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ActUtils;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 流程个人任务相关Controller
 * @author WCNGS@QQ.COM
 * @version 2013-11-03
 */
@Controller
@RequestMapping(value = "${adminPath}/act/task")
public class AtiTaskController extends BaseController {

	@Autowired
	private AtiTaskService atiTaskService;


	/**
	 * 获取流程列表
	 * @param category 流程分类
	 */
	@RequestMapping(value = "process")
	public String processList(String category, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Object[]> page = new Page<Object[]>(request, response);
		page = atiTaskService.processList(page, category);
		model.addAttribute("page", page);
		model.addAttribute("category", category);
		return "modules/act/actTaskProcessList";
	}



	
	/**
	 * 获取流程外置表单
	 * @param act .taskId 		任务ID
	 * @param act .taskName  	任务名称
	 * @param act .taskDefKey	任务环节标识
	 * @param act .procInsId 	流程实例ID
	 * @param act .procDefId 	流程定义ID
	 */
	@RequestMapping(value = "form")
	public String form(Act act, HttpServletRequest request, Model model){

		// 获取流程XML上的表单KEY
		String formKey = atiTaskService.getFormKey(act.getProcDefId(), act.getTaskDefKey());

		// 获取流程实例对象
		if (act.getProcInsId() != null){
			act.setProcIns(atiTaskService.getProcIns(act.getProcInsId()));
		}
		
		return "redirect:" + ActUtils.getFormUrl(formKey, act);
	}



	/**
	 * 获取待办列表
	 * @param act .procDefKey 流程定义标识
	 * @return
	 */
	@RequestMapping(value = "/todoNeedName")
	public String todoListNeedParam(Act act, HttpSession session) throws Exception {
		session.setAttribute("act",act);
		return "modules/act/actTaskTodoListNeedName";
	}

	/**
	 * 获取待办列表
	 * @param act .procDefKey 流程定义标识
	 * @return
	 */
	@RequestMapping(value = {"todo", ""})
	public String todoList(Act act, Model model, String userId,HttpSession session) throws Exception {
		act = (Act) session.getAttribute("act");
		//需要传入一个UserId参数,String
		List<Act> list = atiTaskService.todoList(act,userId);
		model.addAttribute("list", list);
		return "modules/act/actTaskTodoList";
	}


	/**
	 * 签收任务
	 * @param act .taskId 任务ID
	 */
	@RequestMapping(value = "claim")
	@ResponseBody
	public String claim(Act act) {
		//需要传入一个userId参数,String
		String userId = "38";
		atiTaskService.claim(act.getTaskId(), userId);
		return "true";
	}
	
	/**
	 * 完成任务
	 * @param act .taskId 任务ID
	 * @param act .procInsId 流程实例ID，如果为空，则不保存任务提交意见
	 * @param act .comment 任务提交意见的内容
	 * @param act .vars 任务流程变量，如下
	 * 		vars.keys=flag,pass
	 * 		vars.values=1,true
	 * 		vars.types=S,B  @see xyz.wongs.es.modules.act.utils.PropertyType
	 */
	@RequestMapping(value = "complete")
	@ResponseBody
	public String complete(Act act) {
		atiTaskService.complete(act.getTaskId(), act.getProcInsId(), act.getComment(), act.getVars().getVariableMap());
		return "true";
	}


	/**
	 * 获取已办任务
	 * @param act
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "historic")
	public String historicList(Act act, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
		Page<Act> page = new Page<Act>(request, response);
		//需要传入一个参数
		String userId = "刘小东-人事";
		page = atiTaskService.historicList(page, act,userId);
		model.addAttribute("page", page);
		if (UserUtils.getPrincipal().isMobileLogin()){
			return renderString(response, page);
		}
		return "modules/act/actTaskHistoricList";
	}


	/**
	 * 获取流转历史列表
	 * @param act
	 * @param startAct
	 * @param endAct
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "histoicFlow")
	public String histoicFlow(Act act, String startAct, String endAct, Model model){
		if (StringUtils.isNotBlank(act.getProcInsId())){
			List<Act> histoicFlowList = atiTaskService.histoicFlowList(act.getProcInsId(), startAct, endAct);
			model.addAttribute("histoicFlowList", histoicFlowList);
		}
		return "modules/act/actTaskHistoricFlow";
	}


	/**
	 * 跳转到上一个节点
	 * @param procInstId
	 * @return
	 */
	@RequestMapping(value = "/taskBack")
	public String taskRollback(String procInstId){

		//获取上一步的taskId
		String preTaskId = atiTaskService.getPreTaskId(procInstId);

		//根据taskId 跳转到流程任意节点
		atiTaskService.jumpByTaskId(preTaskId);

		return "redirect:" + adminPath + "/workflow/act/process/running";
	}









	//////////////以下为测试接口部分

	/**
	 * 签收接口测试
	 */
	@RequestMapping(value = "/testClaimTask")
	@ResponseBody
	public String testClaimTask(String taskId,String assignName) {

		if(taskId==null || taskId.isEmpty()) {
			return "taskId==null || taskId.isEmpty() ->false";
		}

		if(assignName==null || assignName.isEmpty()) {
			return "assignName==null || assignName.isEmpty() ->false";
		}

		atiTaskService.claim(taskId,assignName);
		return "success";

	}


	/**
	 * 待办任务测试接口
	 * @param act
	 * @param assignName
	 * @return
	 */
	@RequestMapping(value = "/testActTodo")
	public String testActTodo(Act act,String assignName,Model model) {

		if(assignName==null || assignName.isEmpty()) {
			return "assignName==null || assignName.isEmpty() ->false";
		}

		List<Act> list = atiTaskService.todoList(act,assignName);
		model.addAttribute("list",list);
		return "modules/act/actTaskTodoList";
	}




}
