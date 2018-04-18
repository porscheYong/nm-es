/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service;
import com.google.common.collect.Maps;
import org.activiti.engine.*;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.BaseService;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ProcessDefCache;
import xyz.wongs.es.modules.oa.entity.Leave;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.workflow.act.dao.ActMapper;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;
import xyz.wongs.es.workflow.oa.entity.AtiLeave;

import java.util.*;

/**
 * 流程定义相关Service
 * @author liuxiaodong
 * @version 2018年4月14日
 */
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class AtiTaskService extends BaseService {

	@Autowired
	private ActMapper actMapper;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private FormService formService;
	@Autowired
	private RepositoryService repositoryService;



	/**
	 * 获取流程列表
	 * @param category 流程分类
	 */
	public Page<Object[]> processList(Page<Object[]> page, String category) {
		/*
		 * 保存两个对象，一个是ProcessDefinition（流程定义），一个是Deployment（流程部署）
		 */
		ProcessDefinitionQuery processDefinitionQuery = repositoryService.createProcessDefinitionQuery()
				.latestVersion().active().orderByProcessDefinitionKey().asc();

		if (StringUtils.isNotEmpty(category)){
			processDefinitionQuery.processDefinitionCategory(category);
		}

		page.setCount(processDefinitionQuery.count());

		List<ProcessDefinition> processDefinitionList = processDefinitionQuery.listPage(page.getFirstResult(), page.getMaxResults());
		for (ProcessDefinition processDefinition : processDefinitionList) {
			String deploymentId = processDefinition.getDeploymentId();
			Deployment deployment = repositoryService.createDeploymentQuery().deploymentId(deploymentId).singleResult();
			page.getList().add(new Object[]{processDefinition, deployment});
		}
		return page;
	}




	/**
	 * 启动流程
	 * @param procDefKey 流程定义KEY
	 * @param businessTable 业务表表名
	 * @param businessId	业务表编号
	 * @param title			流程标题，显示在待办任务标题
	 * @return 流程实例ID
	 */
	@Transactional(readOnly = false)
	public String startProcess(String procDefKey, String businessTable, String businessId, String title, AtiBaseForm atiBaseForm) {
		Map<String, Object> vars = Maps.newHashMap();
		return startProcess(procDefKey, businessTable, businessId, title, vars,atiBaseForm);
	}
	
	/**
	 * 启动流程
	 * @param procDefKey 流程定义KEY
	 * @param businessTable 业务表表名
	 * @param businessId	业务表编号
	 * @param title			流程标题，显示在待办任务标题
	 * @param vars			流程变量
	 * @return 流程实例ID
	 */
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public String startProcess(String procDefKey, String businessTable, String businessId, String title, Map<String, Object> vars,AtiBaseForm atiBaseForm) {


		// 用来设置启动流程的人员ID，引擎会自动把用户ID保存到activiti:initiator中
		String userId = String.valueOf(atiBaseForm.getFormSender());
		identityService.setAuthenticatedUserId(userId);
		
		// 设置流程变量
		if (vars == null){
			vars = Maps.newHashMap();
		}
		
		// 设置流程标题
		if (StringUtils.isNotBlank(title)){
			vars.put("title", title);
		}
		
		// 启动流程
		ProcessInstance procIns = runtimeService.startProcessInstanceByKey(procDefKey, businessTable+":"+businessId, vars);
		
		// 更新业务表流程实例ID
		Act act = new Act();
		//业务表名
		act.setBusinessTable(businessTable);
		act.setBusinessId(businessId);
		act.setProcInsId(procIns.getId());

		//更新ATI_BASE_FORM 字段procInstId的值
		actMapper.updateProcInstIdByBaseFormId(act.getProcInsId(),atiBaseForm.getAtiBaseFormId());
		return act.getProcInsId();
	}



	/**
	 * 获取待办列表
	 * @param act .procDefKey 流程定义标识
	 * @return
	 */
	public List<Act> todoList(Act act,String name){

		List<Act> result = new ArrayList<Act>();

		// =============== 已经签收的任务  ===============
		TaskQuery todoTaskQuery = taskService.createTaskQuery().taskAssignee(name).active()
				.includeProcessVariables().orderByTaskCreateTime().desc();

		// 设置查询条件
		if (StringUtils.isNotBlank(act.getProcDefKey())){
			todoTaskQuery.processDefinitionKey(act.getProcDefKey());
		}
		if (act.getBeginDate() != null){
			todoTaskQuery.taskCreatedAfter(act.getBeginDate());
		}
		if (act.getEndDate() != null){
			todoTaskQuery.taskCreatedBefore(act.getEndDate());
		}

		// 查询列表
		List<Task> todoList = todoTaskQuery.list();
		for (Task task : todoList) {
			Act e = new Act();
			e.setTask(task);
			e.setVars(task.getProcessVariables());
			e.setProcDef(ProcessDefCache.get(task.getProcessDefinitionId()));
			e.setStatus("todo");
			result.add(e);
		}

		// =============== 等待签收的任务  ===============
		TaskQuery toClaimQuery = taskService.createTaskQuery().taskCandidateUser(name)
				.includeProcessVariables().active().orderByTaskCreateTime().desc();

		// 设置查询条件
		if (StringUtils.isNotBlank(act.getProcDefKey())){
			toClaimQuery.processDefinitionKey(act.getProcDefKey());
		}
		if (act.getBeginDate() != null){
			toClaimQuery.taskCreatedAfter(act.getBeginDate());
		}
		if (act.getEndDate() != null){
			toClaimQuery.taskCreatedBefore(act.getEndDate());
		}

		// 查询列表
		List<Task> toClaimList = toClaimQuery.list();
		for (Task task : toClaimList) {
			Act e = new Act();
			e.setTask(task);
			e.setVars(task.getProcessVariables());
			e.setProcDef(ProcessDefCache.get(task.getProcessDefinitionId()));
			e.setStatus("claim");
			result.add(e);
		}
		return result;
	}





	/**
	 * 签收任务
	 * @param taskId 任务ID
	 * @param userId 签收用户ID（用户登录名）
	 */
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void claim(String taskId, String userId){
		taskService.claim(taskId, userId);
	}

	
	/**
	 * 提交任务, 并保存意见
	 * @param taskId 任务ID
	 * @param procInsId 流程实例ID，如果为空，则不保存任务提交意见
	 * @param comment 任务提交意见的内容
	 * @param vars 任务变量
	 */
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void complete(String taskId, String procInsId, String comment, Map<String, Object> vars){
		complete(taskId, procInsId, comment, "", vars);
	}

	
	/**
	 * 提交任务, 并保存意见
	 * @param taskId 任务ID
	 * @param procInsId 流程实例ID，如果为空，则不保存任务提交意见
	 * @param comment 任务提交意见的内容
	 * @param title			流程标题，显示在待办任务标题
	 * @param vars 任务变量
	 */
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public void complete(String taskId, String procInsId, String comment, String title, Map<String, Object> vars){
		// 添加意见
		if (StringUtils.isNotBlank(procInsId) && StringUtils.isNotBlank(comment)){
			taskService.addComment(taskId, procInsId, comment);
		}
		
		// 设置流程变量
		if (vars == null){
			vars = Maps.newHashMap();
		}
		
		// 设置流程标题
		if (StringUtils.isNotBlank(title)){
			vars.put("title", title);
		}
		
		// 提交任务
		taskService.complete(taskId, vars);
	}



	/**
	 * 获取流程外置表单（首先获取任务节点表单KEY，如果没有则取流程开始节点表单KEY）
	 * @return
	 */
	public String getFormKey(String procDefId, String taskDefKey){
		String formKey = "";
		if (StringUtils.isNotBlank(procDefId)){
			if (StringUtils.isNotBlank(taskDefKey)){
				try{
					formKey = formService.getTaskFormKey(procDefId, taskDefKey);
				}catch (Exception e) {
					formKey = "";
				}
			}
			if (StringUtils.isBlank(formKey)){
				formKey = formService.getStartFormKey(procDefId);
			}
			if (StringUtils.isBlank(formKey)){
				formKey = "/404";
			}
		}
		logger.debug("getFormKey: {}", formKey);
		return formKey;
	}

	/**
	 * 获取流程实例对象
	 * @param procInsId
	 * @return
	 */
	@Transactional(readOnly = false)
	public ProcessInstance getProcIns(String procInsId) {
		return runtimeService.createProcessInstanceQuery().processInstanceId(procInsId).singleResult();
	}

}
