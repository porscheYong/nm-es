package xyz.wongs.es.workflow.act.web;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.impl.RepositoryServiceImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.pvm.process.ActivityImpl;
import org.activiti.engine.impl.task.TaskDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.workflow.act.service.AtiProcessService;
import xyz.wongs.es.workflow.oa.dao.AtiDelegateInfoMapper;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.oa.entity.TaskDefKey;
import xyz.wongs.es.workflow.user.dao.AtiRoleMapper;
import xyz.wongs.es.workflow.user.dao.AtiUserMapper;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 流程定义相关Controller
 * @author liuxiaodong
 * @date 2018/4/23
 */
@Controller
@RequestMapping(value = "/${adminPath}/workflow/act/process")
public class AtiProcessController extends BaseController {

    @Autowired
    private AtiProcessService atiProcessService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private AtiUserMapper atiUserMapper;
    @Autowired
    private AtiRoleMapper atiRoleMapper;
    @Autowired
    private RuntimeService runtimeService;

    /**
     * 运行中的实例列表
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "/running")
    public String runningList(String procInsId, String procDefKey, HttpServletRequest request, HttpServletResponse response, Model model) {
        Page<ProcessInstance> page = atiProcessService.runningList(new Page<ProcessInstance>(request, response), procInsId, procDefKey);
        model.addAttribute("page", page);
        model.addAttribute("procInsId", procInsId);
        model.addAttribute("procDefKey", procDefKey);
        return "workflow/act/actProcessRunningList";
    }


    /**
     * 修改流程节点办理人页面
     * @return
     */
    @RequestMapping(value = "alterAssignee")
    public String alterAssignee(String procInstId,Model model) {

        model.addAttribute("procInstId",procInstId);

        return "workflow/act/actTaskAlterAssignee";
    }


    /**
     * 改派流程实例中当前运行节点办理人
     * @param procInstId 流程实例ID
     * @param taskDefKey 例如deptLeaderAudit
     * @return
     */
    @RequestMapping(value = "/saveTaskAlterAssignee")
    public String saveAlterAssignee(String procInstId, String taskDefKey) {


        //需要从页面传递一个List<AtiUser>参数
        //测试
        List<AtiUser> users = null;
        AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("2000");
        users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());

        String[] taskDefKeys = TaskDefKey.LEAVE_TASK_DEF_KEY;
        //任务改派时，往流程实例中添加变量，到节点指派候选人时再取出该变量中的用户
        for(int i=0;i<taskDefKeys.length;i++) {
            if(taskDefKeys[i].equals(taskDefKey)) {
                runtimeService.setVariable(procInstId,taskDefKeys[i],users);
                break;
            }
        }

        Task currentTask = taskService.createTaskQuery().processInstanceId(procInstId).active().singleResult();
        if(taskDefKey.equals(currentTask.getTaskDefinitionKey())) {
            //1. 清空所有办理人
            if(currentTask.getAssignee() == null) {
                taskService.claim(currentTask.getId(), "user");
            }
            taskService.unclaim(currentTask.getId());
            //2. 给节点添加办理人
            for(AtiUser user : users) {
                taskService.addCandidateUser(currentTask.getId(), String.valueOf(user.getAtiUserId()));
            }
//        taskService.addCandidateUser(task.getId(),"35");
//        taskService.addCandidateUser(task.getId(),"36");
        }












        return "redirect:" + adminPath + "/workflow/act/process/running";
    }


    /**
     * 工作交接
     * @param leaver
     * @param receiver
     * @return
     */
    @RequestMapping(value = "/workHandOver")
    public String workHandOver(String leaver,String receiver) {

       atiProcessService.saveWorkHandOver(leaver,receiver);

        return "redirect:" + adminPath + "/workflow/act/process/running";
    }


}
