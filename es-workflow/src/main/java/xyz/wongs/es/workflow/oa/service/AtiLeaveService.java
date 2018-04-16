package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormMapper;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormMapper;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;
import xyz.wongs.es.workflow.oa.entity.AtiLeave;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import java.util.List;
import java.util.Map;

/**
 *
 * @author liuxiaodong
 * @date 2018/4/12
 */
@Service
public class AtiLeaveService {

    @Autowired
    private AtiBaseFormMapper atiBaseFormMapper;
    @Autowired
    private AtiSpecificFormMapper dao;

    @Autowired
    private AtiTaskService atiTaskService;


    /**
     * 审核新增或编辑
     * @param leave
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void save(AtiLeave leave) {

        List<AtiSpecificForm> specificForms = getSpecificForms(leave);

        // 申请发起
        if (StringUtils.isBlank(leave.getId())){

            //添加procDefId到通用配置表单
            AtiBaseForm atiBaseForm = leave;
            atiBaseForm.setProcDefId(leave.getAct().getProcDefId());

            atiBaseFormMapper.insert(atiBaseForm);
            long currentBaseFormId = atiBaseFormMapper.getCurrentBaseFormId();
            //添加currentBaseFormId ,用来更新ATI_BASE_FORM  字段proc_inst_id 用
            leave.setAtiBaseFormId(currentBaseFormId);

            //TODO
            //Mybatis批量插入，提高效率
//            dao.insertSpecificForms(specificForms);
            for(AtiSpecificForm atiSpecificForm : specificForms) {
                dao.insert(atiSpecificForm);
            }

            //这里暂使用ATI_BASE_FORM_ID 作为 businessId
            String atiBaseFormId = String.valueOf(currentBaseFormId);


            // 启动流程
            atiTaskService.startProcess("leave", "ati_base_form", atiBaseFormId, leave.getReason(),leave);


        }
        // 重新编辑申请
        else{

            for(AtiSpecificForm atiSpecificForm : specificForms) {
                dao.update(atiSpecificForm);
            }

            leave.getAct().setComment(("yes".equals(leave.getAct().getFlag())?"[重申] ":"[销毁] ")+leave.getAct().getComment());

            // 完成流程任务
            Map<String, Object> vars = Maps.newHashMap();
            vars.put("pass", "yes".equals(leave.getAct().getFlag())? "1" : "0");
            atiTaskService.complete(leave.getAct().getTaskId(), leave.getAct().getProcInsId(), leave.getAct().getComment(), leave.getReason(), vars);
        }
    }

    /**
     * 通过虚拟对象leave获取atiBaseForm对象集合
     * @param leave
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(AtiLeave leave) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        if(leave.getReason()!=null || !"".equals(leave.getReason())) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("REASON");
            atiSpecificForm.setParamValue(leave.getReason());
            specificForms.add(atiSpecificForm);
        }

        if(leave.getStartTime()!=null || "".equals(leave.getStartTime())) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("START_TIME");

            atiSpecificForm.setParamValue(String.valueOf(leave.getStartTime()));
            specificForms.add(atiSpecificForm);
        }

        if(leave.getEndTime()!=null || "".equals(leave.getEndTime())) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("END_TIME");
            atiSpecificForm.setParamValue(String.valueOf(leave.getEndTime()));
            specificForms.add(atiSpecificForm);
        }

        if(leave.getLeaveType()!=null || !leave.getLeaveType().isEmpty()) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("LEAVE_TYPE");
            atiSpecificForm.setParamValue(leave.getLeaveType());
            specificForms.add(atiSpecificForm);
        }

        if(leave.getDeptLeaderText()!=null || !leave.getDeptLeaderText().isEmpty()) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("DEPTLEADER_TEXT");
            atiSpecificForm.setParamValue(leave.getDeptLeaderText());
            specificForms.add(atiSpecificForm);
        }

        if(leave.getHrText()!=null || !leave.getHrText().isEmpty()) {
            AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
            atiSpecificForm.setParameter("HR_TEXT");
            atiSpecificForm.setParamValue(leave.getHrText());
            specificForms.add(atiSpecificForm);
        }

        AtiSpecificForm atiSpecificForm = getSpecificForm(leave);
        atiSpecificForm.setParameter("PROC_INST_ID");
        atiSpecificForm.setParamValue(leave.getProcInstId());
        specificForms.add(atiSpecificForm);

            return specificForms;
    }

    public AtiSpecificForm getSpecificForm(AtiLeave leave) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(leave.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(leave.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(leave.getAtiActCategoryId());
        return  atiSpecificForm;
    }

    /**
     * 审核审批保存
     * @param leave
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void auditSave(AtiLeave leave) {

        // 设置意见
        leave.getAct().setComment(("yes".equals(leave.getAct().getFlag())?"[同意] ":"[驳回] ")+leave.getAct().getComment());

        // 对不同环节的业务逻辑进行操作
        String taskDefKey = leave.getAct().getTaskDefKey();

        // 审核环节
        if ("deptLeaderAudit".equals(taskDefKey)){
            leave.setDeptLeaderText(leave.getAct().getComment());
            //todo dao.updateDeptLeaderTxt(leave);
        }
        else if ("hrAudit".equals(taskDefKey)){
            leave.setHrText(leave.getAct().getComment());
           //todo dao.updateHrTxt(leave);
        }
        else if ("reportBack".equals(taskDefKey)){

        }

        // 未知环节，直接返回
        else{
            return;
        }

        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", "yes".equals(leave.getAct().getFlag())? "1" : "0");
        atiTaskService.complete(leave.getAct().getTaskId(), leave.getAct().getProcInsId(), leave.getAct().getComment(), vars);
    }


}
