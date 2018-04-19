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
    private AtiSpecificFormMapper atiSpecificFormMapper;

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

            //判断流程是启动还是重申的依据
            leave.preInsert();

            //添加procDefId到通用配置表单
            leave.setProcDefId(leave.getAct().getProcDefId());
            AtiBaseForm atiBaseForm = leave;

            atiBaseFormMapper.addAtiBaseForm(atiBaseForm);

            Long currentBaseFormId = leave.getAtiBaseFormId();
            leave.setAtiBaseFormId(currentBaseFormId);

            //TODO
            //Mybatis批量插入，提高效率
//            atiSpecificFormMapper.insertSpecificForms(specificForms);
            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormMapper.insert(atiSpecificForm);
            }

            //这里暂使用ATI_BASE_FORM_ID 作为 businessId
            String atiBaseFormId = String.valueOf(currentBaseFormId);


            // 启动流程
            atiTaskService.startProcess("leave", "ati_base_form", atiBaseFormId, leave.getReason(),leave);


        }
        // 重新编辑申请
        else{

            //todo validate
            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormMapper.update(atiSpecificForm);
            }

            leave.getAct().setComment(("yes".equals(leave.getAct().getFlag())?"[重申] ":"[销毁] ")+leave.getAct().getComment());

            // 完成流程任务
            Map<String, Object> vars = Maps.newHashMap();
            vars.put("pass", "yes".equals(leave.getAct().getFlag())? "1" : "0");
            atiTaskService.complete(leave.getAct().getTaskId(), leave.getAct().getProcInsId(), leave.getAct().getComment(), leave.getReason(), vars);
        }
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
            atiSpecificFormMapper.updateDeptLeaderText(leave);
        }
        else if ("hrAudit".equals(taskDefKey)){
            leave.setHrText(leave.getAct().getComment());
           atiSpecificFormMapper.updateHrText(leave);
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



    /**
     * 通过虚拟对象leave获取atiBaseForm对象集合
     * @param leave
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(AtiLeave leave) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        AtiSpecificForm atiSpecificFormReason = getSpecificForm(leave);
        atiSpecificFormReason.setParameter("REASON");
        atiSpecificFormReason.setParamValue(leave.getReason());
        specificForms.add(atiSpecificFormReason);

        AtiSpecificForm atiSpecificFormStartTime = getSpecificForm(leave);
        atiSpecificFormStartTime.setParameter("START_TIME");
        atiSpecificFormStartTime.setParamValue(String.valueOf(leave.getStartTime()));
        specificForms.add(atiSpecificFormStartTime);

        AtiSpecificForm atiSpecificFormEndTime = getSpecificForm(leave);
        atiSpecificFormEndTime.setParameter("END_TIME");
        atiSpecificFormEndTime.setParamValue(String.valueOf(leave.getEndTime()));
        specificForms.add(atiSpecificFormEndTime);

        AtiSpecificForm atiSpecificFormLeaveType = getSpecificForm(leave);
        atiSpecificFormLeaveType.setParameter("LEAVE_TYPE");
        atiSpecificFormLeaveType.setParamValue(leave.getLeaveType());
        specificForms.add(atiSpecificFormLeaveType);

        AtiSpecificForm atiSpecificFormDeptLeaderText = getSpecificForm(leave);
        atiSpecificFormDeptLeaderText.setParameter("DEPTLEADER_TEXT");
        atiSpecificFormDeptLeaderText.setParamValue(leave.getDeptLeaderText());
        specificForms.add(atiSpecificFormDeptLeaderText);

        AtiSpecificForm atiSpecificFormHrText = getSpecificForm(leave);
        atiSpecificFormHrText.setParameter("HR_TEXT");
        atiSpecificFormHrText.setParamValue(leave.getHrText());
        specificForms.add(atiSpecificFormHrText);

        AtiSpecificForm atiSpecificFormRealStartTime = getSpecificForm(leave);
        atiSpecificFormRealStartTime.setParameter("REALITY_START_TIME");
        atiSpecificFormRealStartTime.setParamValue(String.valueOf(leave.getRealityStartTime()));
        specificForms.add(atiSpecificFormRealStartTime);

        AtiSpecificForm atiSpecificFormRealEndTime = getSpecificForm(leave);
        atiSpecificFormRealEndTime.setParameter("REALITY_END_TIME");
        atiSpecificFormRealEndTime.setParamValue(String.valueOf(leave.getRealityEndTime()));
        specificForms.add(atiSpecificFormRealEndTime);

        return specificForms;
    }

    public AtiSpecificForm getSpecificForm(AtiLeave leave) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(leave.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(leave.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(leave.getAtiActCategoryId());
        return  atiSpecificForm;
    }




}
