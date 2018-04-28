package xyz.wongs.es.workflow.act.web;

import org.activiti.engine.runtime.ProcessInstance;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.act.service.AtiProcessService;
import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
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
    /**  测试用 */
    @Autowired
    private AtiUserDao atiUserMapper;
    /**  测试用 */
    @Autowired
    private AtiRoleDao atiRoleMapper;



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
     * 改派流程实例节点办理人
     * @param procInstId 流程实例ID
     * @param taskDefKey 例如deptLeaderAudit
     * @return
     */
    @RequestMapping(value = "/saveTaskAlterAssignee")
    public String saveAlterAssignee(String procInstId, String taskDefKey) {

        //需要从页面传递一个List<AtiUser>参数
        //测试用户
        List<AtiUser> users = null;
        AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("3000");
        users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());

        atiProcessService.alterAssignee(procInstId,taskDefKey,users);

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
