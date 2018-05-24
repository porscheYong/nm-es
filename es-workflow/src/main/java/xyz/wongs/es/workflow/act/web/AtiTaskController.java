/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.web;

import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ActUtils;
import xyz.wongs.es.modules.act.utils.ProcessDefCache;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.oa.entity.AtiActCategory;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.oa.service.AtiActCategoryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 流程个人任务相关Controller
 * @author WCNGS@QQ.COM
 * @version 2013-11-03
 */
@Controller
@RequestMapping(value = "/act/task")
public class AtiTaskController extends BaseController {

	@Autowired
	private AtiTaskService atiTaskService;
	@Autowired
	private AtiActCategoryService categoryService;
	@Autowired
	private TaskService taskService;


	/**
	 * 获取流程列表
	 * @param category 流程分类
	 */
	@RequestMapping(value = "process")
	public String processList(String category, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Object[]> page = new Page<Object[]>(request, response);
		page = atiTaskService.processList(page, category);
		model.addAttribute("page", page);
		List<AtiActCategory> categories = categoryService.findAllCategory();
		model.addAttribute("categories",categories);
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
	 * 待办列表传入userId参数
	 *
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
	 */
	@RequestMapping(value = "claim")
	@ResponseBody
	public String claim(Act act,String userId) {
		//需要传入一个userId参数,String
		userId = "34";
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
	 * 待办任务测试
	 * @param assignName
	 * @return
	 */
	@RequestMapping(value = "/actTaskTodo",method = RequestMethod.GET)
	@ResponseBody
	public ResponseResult<List<Act>> testActTodo(String assignName) {
		ResponseResult<List<Act>> result = new ResponseResult<List<Act>>();
		List<Act> acts = new ArrayList<>();
		if(assignName==null || assignName.isEmpty()) {
			return null;
		}

		TaskQuery toClaimQuery = taskService.createTaskQuery().taskCandidateUser(assignName)
				.includeProcessVariables().active().orderByTaskCreateTime().desc();
		List<Task> toClaimList = toClaimQuery.list();
		for (Task task : toClaimList) {
			Act e = new Act();
			e.setTask(task);
			e.setVars(task.getProcessVariables());
			e.setProcDef(ProcessDefCache.get(task.getProcessDefinitionId()));
			e.setStatus("claim");
			acts.add(e);
		}

		TaskQuery todoTaskQuery = taskService.createTaskQuery().taskAssignee(assignName).active()
				.includeProcessVariables().orderByTaskCreateTime().desc();
		List<Task> todoList = todoTaskQuery.list();
		for (Task task : todoList) {
			Act e = new Act();
			e.setTask(task);
			e.setVars(task.getProcessVariables());
			e.setProcDef(ProcessDefCache.get(task.getProcessDefinitionId()));
			e.setStatus("todo");
			acts.add(e);
		}

		result.setData(acts);
		result.setState(ResponseResult.STATE_OK);
		result.setMessage("success");
		return result;


	}




}
