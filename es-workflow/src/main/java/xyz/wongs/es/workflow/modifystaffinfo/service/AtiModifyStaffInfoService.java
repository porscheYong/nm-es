package xyz.wongs.es.workflow.modifystaffinfo.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;

import java.util.List;
import java.util.Map;

/**
 * 人员信息修改Service
 * @author liuxiaodong
 * @date 2018/4/12
 */
@Service
public class AtiModifyStaffInfoService {

    @Autowired
    private AtiBaseFormDao atiBaseFormMapper;
    @Autowired
    private AtiSpecificFormDao atiSpecificFormMapper;
    @Autowired
    private AtiTaskService atiTaskService;


    /**
     * 发起流程或重新申请
     * @param modifyStaffInfo
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void save(AtiModifyStaffInfo modifyStaffInfo) {

        List<AtiSpecificForm> specificForms = getSpecificForms(modifyStaffInfo);

        // 申请发起
        if (StringUtils.isBlank(modifyStaffInfo.getId())){

            //判断流程是启动还是重申的依据
            modifyStaffInfo.preInsert();

            //添加procDefId到通用配置表单
            modifyStaffInfo.setProcDefId(modifyStaffInfo.getAct().getProcDefId());

            atiBaseFormMapper.addAtiBaseForm(modifyStaffInfo);

            Long currentBaseFormId = modifyStaffInfo.getAtiBaseFormId();
            modifyStaffInfo.setAtiBaseFormId(currentBaseFormId);

            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormMapper.insert(atiSpecificForm);
            }

            //使用ATI_BASE_FORM_ID 作为 businessId
            String atiBaseFormId = String.valueOf(currentBaseFormId);

            // 启动流程
            atiTaskService.startProcess(ProcDefKey.MODIFY_PROC_DEF_KEY, ProcDefKey.ATI_BASE_FORM_KEY,
                    atiBaseFormId, (String) modifyStaffInfo.getFormTheme(),modifyStaffInfo);
        }
        // 重新编辑申请
        else{

            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormMapper.update(atiSpecificForm);
            }

            modifyStaffInfo.getAct().setComment("[重申] "+modifyStaffInfo.getAct().getComment());

            // 完成流程任务
            atiTaskService.complete(modifyStaffInfo.getAct().getTaskId(), modifyStaffInfo.getAct().getProcInsId(),
                    modifyStaffInfo.getAct().getComment(), (String) modifyStaffInfo.getFormTheme(), null);
        }
    }


    /**
     * 不同节点对应页面
     * @param modifyStaffInfo
     * @return
     */
    public String getFormKey(AtiModifyStaffInfo modifyStaffInfo) {

        String view = "modifyStaffInfoForm";

        // 查看审批申请单
        if (StringUtils.isNotBlank(modifyStaffInfo.getId())){

            // 环节编号
            String taskDefKey = modifyStaffInfo.getAct().getTaskDefKey();

            // 修改环节
            if (ProcDefKey.MODIFY_TASK_DEF_KEY[1].equals(taskDefKey)){
                view = "modifyStaffInfoModifyForm";
            }
            // 人力资源审核环节
            else if (ProcDefKey.MODIFY_TASK_DEF_KEY[2].equals(taskDefKey)){
                view = "modifyStaffInfoAudit";
            }
            // 人力分管领导审核环节
            else if (ProcDefKey.MODIFY_TASK_DEF_KEY[3].equals(taskDefKey)){
                view = "modifyStaffInfoAudit";
            }
            //系统管理员环节
            else if(ProcDefKey.MODIFY_TASK_DEF_KEY[4].equals(taskDefKey)) {
                view = "modifyStaffInfoAudit";
            }

        }
        return view;
    }

    /**
     * 审核审批保存
     * @param modifyStaffInfo
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void auditSave(AtiModifyStaffInfo modifyStaffInfo) {

        // 设置意见
        modifyStaffInfo.getAct().setComment(("yes".equals(modifyStaffInfo.getAct().getFlag())?"[同意] ":"[驳回] ")+modifyStaffInfo.getAct().getComment());

        // 对不同环节的业务逻辑进行操作
        String taskDefKey = modifyStaffInfo.getAct().getTaskDefKey();

        // 人力资源审核环节
        if (ProcDefKey.MODIFY_TASK_DEF_KEY[2].equals(taskDefKey)){
            modifyStaffInfo.setHrText(modifyStaffInfo.getAct().getComment());
//            atiSpecificFormMapper.updateText(modifyStaffInfo);
        }
        // 分管领导审核环节
        else if (ProcDefKey.MODIFY_TASK_DEF_KEY[3].equals(taskDefKey)){
            modifyStaffInfo.setHrLeaderText( modifyStaffInfo.getAct().getComment());
//           atiSpecificFormMapper.updateText(modifyStaffInfo);
        }
        //系统管理员环节
        else if (ProcDefKey.MODIFY_TASK_DEF_KEY[4].equals(taskDefKey)){

        }

        // 未知环节，直接返回
        else{
            return;
        }

        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", "yes".equals(modifyStaffInfo.getAct().getFlag())? "1" : "0");
        atiTaskService.complete(modifyStaffInfo.getAct().getTaskId(), modifyStaffInfo.getAct().getProcInsId(), modifyStaffInfo.getAct().getComment(), vars);
    }



    /**
     * 通过虚拟对象modifyStaffInfo获取atiBaseForm对象集合
     * @param modifyStaffInfo
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(AtiModifyStaffInfo modifyStaffInfo) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        AtiSpecificForm specificFormNewName = getSpecificForm(modifyStaffInfo);
        specificFormNewName.setParameter("NEW_NAME");
        specificFormNewName.setParamValue(modifyStaffInfo.getNewName());
        specificForms.add(specificFormNewName);

        AtiSpecificForm specificFormNewPhone = getSpecificForm(modifyStaffInfo);
        specificFormNewPhone.setParameter("NEW_PHONE");
        specificFormNewPhone.setParamValue(modifyStaffInfo.getNewPhone());
        specificForms.add(specificFormNewPhone);

        AtiSpecificForm specificFormNewEmail = getSpecificForm(modifyStaffInfo);
        specificFormNewEmail.setParameter("NEW_EMAIL");
        specificFormNewEmail.setParamValue(modifyStaffInfo.getNewEmail());
        specificForms.add(specificFormNewEmail);

        AtiSpecificForm specificFormNewPassword = getSpecificForm(modifyStaffInfo);
        specificFormNewPassword.setParameter("NEW_PASSWORD");
        specificFormNewPassword.setParamValue(modifyStaffInfo.getNewPassword());
        specificForms.add(specificFormNewPassword);

        return specificForms;
    }

    public AtiSpecificForm getSpecificForm(AtiModifyStaffInfo modifyStaffInfo) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(modifyStaffInfo.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(modifyStaffInfo.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(modifyStaffInfo.getAtiActCategoryId());
        return  atiSpecificForm;
    }


}
