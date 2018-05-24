package xyz.wongs.es.workflow.modifystaffinfo.web;

import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.modifystaffinfo.service.AtiStaffEntryService;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.oa.service.AtiSpecificFormService;

import javax.annotation.Resource;
import java.util.Map;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/22
 */
@Controller
@RequestMapping(value = "/oa/staffEntry")
public class AtiStaffEntryController extends BaseController {

    @Resource
    private AtiSpecificFormService specificFormService;
    @Resource
    private AtiStaffEntryService atiStaffEntryService;
    @Resource
    private AtiTaskService atiTaskService;

    /**
     * 先获取虚拟对象 staffInfoEntry
     * @param id
     * @return
     */
    @ModelAttribute
    public AtiStaffEntry get(@RequestParam(required=false) Long id){
        AtiStaffEntry staffEntry = null;
        if(id != null) {
            staffEntry = specificFormService.getAtiStaffEntryByBaseFormId(id);
        }
        if (staffEntry == null){
            staffEntry = new AtiStaffEntry();
        }
        return staffEntry;
    }


    /**
     * 申请单填写
     * @param staffEntry
     * @param model
     * @return
     */
    @RequestMapping(value = "form")
    public String form(AtiStaffEntry staffEntry, Model model) {

       return  null;
    }


    /**
     * 申请单  保存/修改
     * @param staffEntry
     * @return
     */
    @RequestMapping(value = "save")
    public String save(AtiStaffEntry staffEntry) {

        atiStaffEntryService.save(staffEntry);
        return "redirect:" + adminPath + "/act/task/todoNeedName/";
    }


    /**
     * 工单执行（完成任务）
     * @param staffEntry
     * @param model
     * @return
     */
    @RequestMapping(value = "saveAudit")
    public String saveAudit(AtiStaffEntry staffEntry, Model model) {
        System.out.println("当前环节：" + staffEntry.getAct().getTaskName());
        //系统管理员不用添加意见
        if(!staffEntry.getAct().getTaskDefKey().equals(ProcDefKey.ENTRY_TASK_DEF_KEY[4])) {
            if (StringUtils.isBlank(staffEntry.getAct().getFlag())
                    || StringUtils.isBlank(staffEntry.getAct().getComment())){
                addMessage(model, "请填写审核意见。");
                return form(staffEntry, model);
            }
        }

        atiStaffEntryService.auditSave(staffEntry);
        return "redirect:" + adminPath + "/act/task/todoNeedName/";
    }


    /**
     *
     * 发起流程接口测试
     * @param staffEntry
     */
    @RequestMapping(value = "/StartAtiStaffEntry",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> testStartAtiLeave(AtiStaffEntry staffEntry) {

        ResponseResult<String> result = new ResponseResult<String>();
        String procDefId = (String) staffEntry.getProcDefId();
        //将信息封装成json格式
//        String resultOk =  "{\"result\":\"1\",\"message\":\"success\"}";
//        String resultError =  "{\"result\":\"0\",\"message\":\"error\"}";
        if(procDefId == null || procDefId.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formSender = String.valueOf(staffEntry.getFormSender());
        if(formSender == null || formSender.isEmpty()){
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formTheme = (String) staffEntry.getFormTheme();
        if(formTheme == null || formTheme.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String urgent = staffEntry.getUrgent();
        if(urgent == null || urgent.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formContent = (String) staffEntry.getFormContent();
        if(formContent == null || formContent.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String staffId = String.valueOf(staffEntry.getStaffId());
        if(staffId == null || staffId.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String atiCategoryId = String.valueOf(staffEntry.getAtiActCategoryId());
        if(atiCategoryId == null || atiCategoryId.isEmpty()){
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }
        atiStaffEntryService.save(staffEntry);

        result.setMessage("success");
        result.setState(ResponseResult.STATE_OK);
        return result;
    }


    /**
     * 审批任务测试接口
     * @param flag
     * @param taskId
     * @param procInstId
     */
    @RequestMapping(value = "/approvalStaffEntry",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> approvalStaffEntry(String flag,String taskId,String procInstId) {
        ResponseResult<String> result = new ResponseResult<>();
        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", flag);
        atiTaskService.complete(taskId, procInstId, null, vars);

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("success");

        return result;
    }


}
