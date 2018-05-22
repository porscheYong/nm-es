package xyz.wongs.es.workflow.modifystaffinfo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.modifystaffinfo.service.AtiStaffEntryService;
import xyz.wongs.es.workflow.oa.service.AtiSpecificFormService;
import xyz.wongs.es.workflow.workattendace.entity.AtiLeave;

import javax.annotation.Resource;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/22
 */
@Controller
@RequestMapping(value = "${adminPath}/oa/staffEntry")
public class AtiStaffEntryController extends BaseController {

    @Resource
    private AtiSpecificFormService specificFormService;
    @Resource
    private AtiStaffEntryService atiStaffEntryService;

    /**
     * 先获取虚拟对象 staffInfoEntry
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
     *
     * 发起流程接口测试
     * @param staffEntry
     */
    @RequestMapping(value = "/StartAtiStaffEntry",method = RequestMethod.POST)
    @ResponseBody
    public String testStartAtiLeave(AtiStaffEntry staffEntry) {

        String procDefId = (String) staffEntry.getProcDefId();
        if(procDefId == null || procDefId.isEmpty()) {
            return "fail";
        }

        String formSender = String.valueOf(staffEntry.getFormSender());
        if(formSender == null || formSender.isEmpty()){
            return "fail";
        }

        String formTheme = (String) staffEntry.getFormTheme();
        if(formTheme == null || formTheme.isEmpty()) {
            return  "fail";
        }

        String urgent = staffEntry.getUrgent();
        if(urgent == null || urgent.isEmpty()) {
            return "fail";
        }

        String formContent = (String) staffEntry.getFormContent();
        if(formContent == null || formContent.isEmpty()) {
            return "fail";
        }

        String staffId = String.valueOf(staffEntry.getStaffId());
        if(staffId == null || staffId.isEmpty()) {
            return "fail";
        }

        String atiCategoryId = String.valueOf(staffEntry.getAtiActCategoryId());
        if(atiCategoryId == null || atiCategoryId.isEmpty()){
            return  "fail";
        }
        atiStaffEntryService.save(staffEntry);
        return "success";
    }
}
