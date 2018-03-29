/**
 * There are <a href="https://wongs.xyz">UECC</a> code generation
 */
package xyz.wongs.es.modules.oa.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import xyz.wongs.es.common.persistence.ActEntity;
import xyz.wongs.es.common.persistence.DataEntity;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.modules.sys.entity.Office;
import xyz.wongs.es.modules.sys.entity.User;
import xyz.wongs.es.modules.sys.utils.DictUtils;

/**
 * 请假Entity
 * @author liuj
 * @version 2013-04-05
 */
public class Leave extends ActEntity<Leave> {
	
	private static final long serialVersionUID = 1L;
	private User user;					//	归属用户
	private Office office;				//	归属部门
	private String 	post;				//	岗位
	private String reason; 	// 请假原因
	private String processInstanceId; // 流程实例编号
	private Date startTime;	// 请假开始日期
	private Date endTime;	// 请假结束日期
	private Date realityStartTime;	// 实际开始时间
	private Date realityEndTime;	// 实际结束时间
	private String leaveType;	// 假种
	private String deptLeaderText; 			//部门领导意见
	private String hrText;					//人事意见
	private String ids;
	private Date createDateStart;
	private Date createDateEnd;

	//-- 临时属性 --//
	// 流程任务
	private Task task;
	private Map<String, Object> variables;
	// 运行中的流程实例
	private ProcessInstance processInstance;
	// 历史的流程实例
	private HistoricProcessInstance historicProcessInstance;
	// 流程定义
	private ProcessDefinition processDefinition;

	public Leave() {
		super();
	}

	public Leave(String id){
		super();
	}
	
	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	public String getLeaveTypeDictLabel() {
		return DictUtils.getDictLabel(leaveType, "oa_leave_type", "");
	}
	
	@Length(min=1, max=255)
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRealityStartTime() {
		return realityStartTime;
	}

	public void setRealityStartTime(Date realityStartTime) {
		this.realityStartTime = realityStartTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRealityEndTime() {
		return realityEndTime;
	}

	public void setRealityEndTime(Date realityEndTime) {
		this.realityEndTime = realityEndTime;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Map<String, Object> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Object> variables) {
		this.variables = variables;
	}

	public ProcessInstance getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(ProcessInstance processInstance) {
		this.processInstance = processInstance;
	}

	public HistoricProcessInstance getHistoricProcessInstance() {
		return historicProcessInstance;
	}

	public void setHistoricProcessInstance(HistoricProcessInstance historicProcessInstance) {
		this.historicProcessInstance = historicProcessInstance;
	}

	public ProcessDefinition getProcessDefinition() {
		return processDefinition;
	}

	public void setProcessDefinition(ProcessDefinition processDefinition) {
		this.processDefinition = processDefinition;
	}

	public String getIds() {
		List<String> idList = Lists.newArrayList();
		if (StringUtils.isNotBlank(ids)){
			String ss = ids.trim().replace("　", ",").replace(" ",",").replace("，", ",").replace("'", "");
			for(String s : ss.split(",")) {
//				if(s.matches("\\d*")) {
					idList.add("'"+s+"'");
//				}
			}
		}
		return StringUtils.join(idList, ",");
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public Date getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(Date createDateStart) {
		this.createDateStart = createDateStart;
	}

	public Date getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(Date createDateEnd) {
		this.createDateEnd = createDateEnd;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDeptLeaderText() {
		return deptLeaderText;
	}

	public void setDeptLeaderText(String deptLeaderText) {
		this.deptLeaderText = deptLeaderText;
	}

	public String getHrText() {
		return hrText;
	}

	public void setHrText(String hrText) {
		this.hrText = hrText;
	}
}


