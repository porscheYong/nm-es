package xyz.wongs.es.workflow.modifystaffinfo.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 人员入职Service
 * @author liuxiaodong
 * @date 2018/5/22
 */

@Service
public class AtiStaffEntryService {

    @Resource
    private AtiBaseFormDao atiBaseFormDao;
    @Resource
    private AtiSpecificFormDao atiSpecificFormDao;
    @Resource
    private AtiTaskService atiTaskService;

    /**
     * 发起流程或重新申请
     * @param staffEntry
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void save(AtiStaffEntry staffEntry) {

        List<AtiSpecificForm> specificForms = getSpecificForms(staffEntry);

        // 申请发起
        if (StringUtils.isBlank(staffEntry.getId())){

            //判断流程是启动还是重申的依据
            staffEntry.preInsert();

            //添加procDefId到通用配置表单
            if(staffEntry.getProcDefId() == null){
                staffEntry.setProcDefId(staffEntry.getAct().getProcDefId());
            }

            atiBaseFormDao.addAtiBaseForm(staffEntry);

            Long currentBaseFormId = staffEntry.getAtiBaseFormId();
            staffEntry.setAtiBaseFormId(currentBaseFormId);

            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormDao.insert(atiSpecificForm);
            }

            //使用ATI_BASE_FORM_ID 作为 businessId
            String businessId = String.valueOf(currentBaseFormId);

            // 启动流程
            atiTaskService.startProcess(ProcDefKey.ENTRY_PROC_DEF_KEY, ProcDefKey.ATI_BASE_FORM_KEY,
                    businessId, (String) staffEntry.getFormTheme(),staffEntry);
        }
        // 重新编辑申请
        else{

            for(AtiSpecificForm atiSpecificForm : specificForms) {
                atiSpecificFormDao.update(atiSpecificForm);
            }

            staffEntry.getAct().setComment("[重申] "+staffEntry.getAct().getComment());

            // 完成流程任务
            atiTaskService.complete(staffEntry.getAct().getTaskId(), staffEntry.getAct().getProcInsId(),
                    staffEntry.getAct().getComment(), (String) staffEntry.getFormTheme(), null);
        }
    }



    /**
     * 审核审批保存
     * @param staffEntry
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void auditSave(AtiStaffEntry staffEntry) {

        List<AtiSpecificForm> specificForms = getSpecificForms(staffEntry);

        // 设置意见
        staffEntry.getAct().setComment(("yes".equals(staffEntry.getAct().getFlag())?"[同意] ":"[驳回] ")+staffEntry.getAct().getComment());

        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", "yes".equals(staffEntry.getAct().getFlag())? "1" : "0");
        atiTaskService.complete(staffEntry.getAct().getTaskId(), staffEntry.getAct().getProcInsId(), staffEntry.getAct().getComment(), vars);
    }


    /**
     * 通过虚拟对象modifyStaffInfo获取atiBaseForm对象集合
     * @param staffInfoEntry
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(AtiStaffEntry staffInfoEntry) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        AtiSpecificForm specificFormStaffId = getSpecificForm(staffInfoEntry);
        specificFormStaffId.setParameter("STAFF_ID");
        specificFormStaffId.setParamValue(String.valueOf(staffInfoEntry.getStaffId()));
        specificForms.add(specificFormStaffId);


        return specificForms;
    }

    public AtiSpecificForm getSpecificForm(AtiStaffEntry staffEntry) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(staffEntry.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(staffEntry.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(staffEntry.getAtiActCategoryId());
        return  atiSpecificForm;
    }
}
