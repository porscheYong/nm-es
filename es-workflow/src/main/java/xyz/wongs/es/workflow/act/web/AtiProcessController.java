package xyz.wongs.es.workflow.act.web;

import com.google.common.collect.Lists;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowElement;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.act.service.AtiProcessService;
import xyz.wongs.es.workflow.oa.entity.AtiActCategory;
import xyz.wongs.es.workflow.oa.service.AtiActCategoryService;
import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.dao.AtiUserDao;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLStreamException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程定义相关Controller
 * @author liuxiaodong
 * @date 2018/4/23
 */
@Controller
@RequestMapping(value = "/workflow/act/process")
public class AtiProcessController extends BaseController {

    @Autowired
    private AtiProcessService atiProcessService;
    @Autowired
    private AtiActCategoryService categoryService;
    @Autowired
    private UserService userService;



    /**
     * 流程定义列表
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = {"list", ""})
    public String processList(String category, HttpServletRequest request, HttpServletResponse response, Model model) {
		/*
		 * 保存两个对象，一个是ProcessDefinition（流程定义），一个是Deployment（流程部署）
		 */
        Page<Object[]> page = atiProcessService.processList(new Page<Object[]>(request, response), category);
        model.addAttribute("page", page);
        List<AtiActCategory> categories = categoryService.findAllCategory();
        model.addAttribute("categories", categories);
        return "workflow/act/actProcessList";
    }



    /**
     * 运行中的实例列表
     */
//    @RequiresPermissions("act:process:edit")
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

        List<Map<String ,Object>> list = atiProcessService.getTaskDefKeys(procInstId);
        model.addAttribute("list",list);

        List<AtiUser> user = userService.getUsers();
        model.addAttribute("users",user);

        return "workflow/act/actTaskAlterAssignee";
    }


    /**
     * 改派流程实例节点办理人
     * @param procInstId 流程实例ID
     * @param taskDefKey 例如deptLeaderAudit
     * @return
     */
    @RequestMapping(value = "/saveTaskAlterAssignee")
    public String saveAlterAssignee(String procInstId, String taskDefKey,HttpServletRequest request) {

        List<AtiUser> users = Lists.newArrayList();
        //临时测试数据
//        AtiRole atiRole = atiRoleMapper.getRoleByRoleCode("3000");
//        users = atiUserMapper.getUsersByRoleId(atiRole.getAtiRoleId());

        Map map = request.getParameterMap();
        String[] atiUserIds = (String[])map.get("atiUserId");
        for(String atiUserId : atiUserIds) {
            AtiUser user = userService.getUserByUserId(Long.valueOf(atiUserId));
            users.add(user);
        }

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


    /**
     * 部署流程
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "/deploy", method= RequestMethod.GET)
    public String deploy(Model model, AtiActCategory category) {
        model.addAttribute("category",category);
        return "workflow/act/actProcessDeploy";
    }

    /**
     * 部署流程 - 保存
     * @param file
     * @return
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "/deploy", method=RequestMethod.POST)
    public String deploy(@Value("#{APP_PROP['activiti.export.diagram.path']}") String exportDir,
                         String category, MultipartFile file, RedirectAttributes redirectAttributes) {

        String fileName = file.getOriginalFilename();

        if (StringUtils.isBlank(fileName)){
            redirectAttributes.addFlashAttribute("message", "请选择要部署的流程文件");
        }else{
            String message = atiProcessService.deploy(exportDir, category, file);
            redirectAttributes.addFlashAttribute("message", message);
        }

        return "redirect:" + adminPath + "/workflow/act/process";
    }


    /**
     * 读取流程资源
     * @param procDefId
     * @param proInsId
     * @param resType
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "resource/read")
    public void resourceRead(String procDefId, String proInsId, String resType, HttpServletResponse response) throws Exception {
        InputStream resourceAsStream = atiProcessService.resourceRead(procDefId, proInsId, resType);
        byte[] b = new byte[1024];
        int len = -1;
        while ((len = resourceAsStream.read(b, 0, 1024)) != -1) {
            response.getOutputStream().write(b, 0, len);
        }
    }


    /**
     * 挂起、激活流程实例
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "update/{state}")
    public String updateState(@PathVariable("state") String state, String procDefId, RedirectAttributes redirectAttributes) {
        String message = atiProcessService.updateState(state, procDefId);
        redirectAttributes.addFlashAttribute("message", message);
        return "redirect:" + adminPath + "/workflow/act/process";
    }


    /**
     * 删除部署的流程，级联删除流程实例
     * @param deploymentId 流程部署ID
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "delete")
    public String delete(String deploymentId) {
        atiProcessService.deleteDeployment(deploymentId);
        return "redirect:" + adminPath + "/workflow/act/process";
    }


    /**
     * 将部署的流程转换为模型
     * @param procDefId
     * @param redirectAttributes
     * @return
     * @throws UnsupportedEncodingException
     * @throws XMLStreamException
     */
    @RequiresPermissions("act:process:edit")
    @RequestMapping(value = "convert/toModel")
    public String convertToModel(String procDefId, RedirectAttributes redirectAttributes) throws UnsupportedEncodingException, XMLStreamException {
        org.activiti.engine.repository.Model modelData = atiProcessService.convertToModel(procDefId);
        redirectAttributes.addFlashAttribute("message", "转换模型成功，模型ID="+modelData.getId());
        return "redirect:" + adminPath + "/workflow/act/model";
    }


}
