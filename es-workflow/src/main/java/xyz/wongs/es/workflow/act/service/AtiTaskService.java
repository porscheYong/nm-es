/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.workflow.act.service;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.activiti.engine.*;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricTaskInstanceQuery;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.repository.ProcessDefinitionQuery;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
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
import xyz.wongs.es.modules.sys.entity.User;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.workflow.act.dao.AtiActDao;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;
import xyz.wongs.es.workflow.oa.entity.JumpCmd;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

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
	private AtiActDao atiActDao;
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
	@Autowired
	private HistoryService historyService;
	@Autowired
	private ManagementService managementService;
	@Autowired
	private UserService userService;


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
	@Transactional(readOnly = false,rollbackFor = Exception.class)
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
		Long userId = atiBaseForm.getFormSender();
		identityService.setAuthenticatedUserId(String.valueOf(userId));
		
		// 设置流程变量
		if (vars == null){
			vars = Maps.newHashMap();
		}
		
		// 设置流程标题
		if (StringUtils.isNotBlank(title)){
			vars.put("title", title);
			//添加申请人
			vars.put("applyUser",userId);
			//添加工单内容
			vars.put("content",atiBaseForm.getFormContent());
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
		atiActDao.updateProcInstIdByBaseFormId(act.getProcInsId(),atiBaseForm.getAtiBaseFormId());
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

		if (StringUtils.isNotBlank(act.getProcDefKey())){
			toClaimQuery.processDefinitionKey(act.getProcDefKey());
		}
		if (act.getBeginDate() != null){
			toClaimQuery.taskCreatedAfter(act.getBeginDate());
		}
		if (act.getEndDate() != null){
			toClaimQuery.taskCreatedBefore(act.getEndDate());
		}
		// 设置查询条件

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
	@Transactional(readOnly = false,rollbackFor = Exception.class)
	public ProcessInstance getProcIns(String procInsId) {
		return runtimeService.createProcessInstanceQuery().processInstanceId(procInsId).singleResult();
	}


	/**
	 * 获取已办任务
	 * @param page
	 * @param act .procDefKey 流程定义标识
	 * @return
	 */
	public Page<Act> historicList(Page<Act> page, Act act,String userId){

		HistoricTaskInstanceQuery histTaskQuery = historyService.createHistoricTaskInstanceQuery().taskAssignee(userId).finished()
				.includeProcessVariables().orderByHistoricTaskInstanceEndTime().desc();

		// 设置查询条件
		if (StringUtils.isNotBlank(act.getProcDefKey())){
			histTaskQuery.processDefinitionKey(act.getProcDefKey());
		}
		if (act.getBeginDate() != null){
			histTaskQuery.taskCompletedAfter(act.getBeginDate());
		}
		if (act.getEndDate() != null){
			histTaskQuery.taskCompletedBefore(act.getEndDate());
		}

		// 查询总数
		page.setCount(histTaskQuery.count());

		// 查询列表
		List<HistoricTaskInstance> histList = histTaskQuery.listPage(page.getFirstResult(), page.getMaxResults());
		//处理分页问题
		List<Act> actList= Lists.newArrayList();
		for (HistoricTaskInstance histTask : histList) {
			Act e = new Act();
			e.setHistTask(histTask);
			e.setVars(histTask.getProcessVariables());
			e.setProcDef(ProcessDefCache.get(histTask.getProcessDefinitionId()));
			e.setStatus("finish");
			actList.add(e);
		}
		page.setList(actList);
		return page;
	}




	/**
	 * 获取流转历史列表
	 * @param procInsId 流程实例
	 * @param startAct 流程开始节点
	 * @param endAct 流程结束节点
	 * @return
	 */
	public List<Act> histoicFlowList(String procInsId, String startAct, String endAct){
		List<Act> actList = Lists.newArrayList();
		List<HistoricActivityInstance> list = historyService.createHistoricActivityInstanceQuery().processInstanceId(procInsId)
				.orderByHistoricActivityInstanceStartTime().asc().orderByHistoricActivityInstanceEndTime().asc().list();

		boolean start = false;
		Map<String, Integer> actMap = Maps.newHashMap();

		for (int i=0; i<list.size(); i++){

			HistoricActivityInstance histIns = list.get(i);

			// 过滤开始节点前的节点
			if (StringUtils.isNotBlank(startAct) && startAct.equals(histIns.getActivityId())){
				start = true;
			}
			if (StringUtils.isNotBlank(startAct) && !start){
				continue;
			}

			// 只显示开始节点和结束节点，并且执行人不为空的任务
			if (StringUtils.isNotBlank(histIns.getAssignee())
					|| "startEvent".equals(histIns.getActivityType())
					|| "endEvent".equals(histIns.getActivityType())){

				// 给节点增加一个序号
				Integer actNum = actMap.get(histIns.getActivityId());
				if (actNum == null){
					actMap.put(histIns.getActivityId(), actMap.size());
				}

				Act e = new Act();
				e.setHistIns(histIns);
				// 获取流程发起人名称
				if ("startEvent".equals(histIns.getActivityType())){
					List<HistoricProcessInstance> il = historyService.createHistoricProcessInstanceQuery().processInstanceId(procInsId).orderByProcessInstanceStartTime().asc().list();
					if (il.size() > 0){
						if (StringUtils.isNotBlank(il.get(0).getStartUserId())){
							AtiUser user = userService.getUserByUserId(Long.valueOf(il.get(0).getStartUserId()));
							if (user != null){
								e.setAssignee(histIns.getAssignee());
								e.setAssigneeName((String) user.getName());
							}
						}
					}
				}
				// 获取任务执行人名称
				if (StringUtils.isNotEmpty(histIns.getAssignee())){
					AtiUser user = userService.getAtiUserByName(histIns.getAssignee());
					if (user != null){
						e.setAssignee(histIns.getAssignee());
						e.setAssigneeName((String) user.getName());
					}
				}
				// 获取意见评论内容
				if (StringUtils.isNotBlank(histIns.getTaskId())){
					List<Comment> commentList = taskService.getTaskComments(histIns.getTaskId());
					if (commentList.size()>0){
						e.setComment(commentList.get(0).getFullMessage());
					}
				}
				actList.add(e);
			}

			// 过滤结束节点后的节点
			if (StringUtils.isNotBlank(endAct) && endAct.equals(histIns.getActivityId())){
				boolean bl = false;
				Integer actNum = actMap.get(histIns.getActivityId());
				// 该活动节点，后续节点是否在结束节点之前，在后续节点中是否存在
				for (int j=i+1; j<list.size(); j++){
					HistoricActivityInstance hi = list.get(j);
					Integer actNumA = actMap.get(hi.getActivityId());
					if ((actNumA != null && actNumA < actNum) || StringUtils.equals(hi.getActivityId(), histIns.getActivityId())){
						bl = true;
					}
				}
				if (!bl){
					break;
				}
			}
		}
		return actList;
	}




	/**
	 * 获取上一个节点的taskId
	 * @param procInstId
	 * @return
	 */
	public String getPreTaskId(String procInstId) {

		//通过流程实例获取相应procDefKey

		String preTaskDefKey = "";
		//当前任务
		Task currentTask = taskService.createTaskQuery().processInstanceId(procInstId).active().singleResult();
		//流程定义
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(currentTask.getProcessDefinitionId()).singleResult();
		//获取相应taskDefKey数组
		String[] actDefKeys = (String[]) ProcDefKey.map.get(processDefinition.getKey());
		for(int i = 1; i< actDefKeys.length; i++) {
			if(actDefKeys[i].equals(currentTask.getTaskDefinitionKey())) {
				preTaskDefKey = actDefKeys[i-1];
				break;
			}
		}
		String taskId = "";
		List<HistoricTaskInstance> historicTaskInstances = historyService.createHistoricTaskInstanceQuery().processInstanceId(procInstId).list();
		for(HistoricTaskInstance historicTaskInstance : historicTaskInstances) {
			if(preTaskDefKey.equals(historicTaskInstance.getTaskDefinitionKey())) {
				taskId = historicTaskInstance.getId();
				break;
			}
		}
		return taskId;
	}


	/**
	 * 根据taskId 跳转到指定节点
	 * @param taskId
	 */
	public void jumpByTaskId(String taskId) {

		//根据要跳转的任务ID获取其任务
		HistoricTaskInstance hisTask = historyService
				.createHistoricTaskInstanceQuery().taskId(taskId)
				.singleResult();
		//进而获取流程实例
		ProcessInstance instance = runtimeService
				.createProcessInstanceQuery()
				.processInstanceId(hisTask.getProcessInstanceId())
				.singleResult();
		//取得流程定义
		ProcessDefinitionEntity definition = (ProcessDefinitionEntity) repositoryService.getProcessDefinition(hisTask.getProcessDefinitionId());
		//获取历史任务的Activity
		ActivityImpl hisActivity = definition.findActivity(hisTask.getTaskDefinitionKey());
		//实现跳转
		managementService.executeCommand(new JumpCmd(instance.getId(), hisActivity.getId()));
	}


	public String[] getTaskDefKeyByProcInstId(String procInstId) {

		//通过流程实例获取相应procDefKey

		String preTaskDefKey = "";
		//当前任务
		Task currentTask = taskService.createTaskQuery().processInstanceId(procInstId).active().singleResult();
		//流程定义
		ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery().processDefinitionId(currentTask.getProcessDefinitionId()).singleResult();
		//获取相应taskDefKey数组
		String[] actDefKeys = (String[]) ProcDefKey.map.get(processDefinition.getKey());

		return actDefKeys;
	}




}
