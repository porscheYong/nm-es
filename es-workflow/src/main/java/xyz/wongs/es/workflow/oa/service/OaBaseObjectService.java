package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiSpecificForm;
import xyz.wongs.es.workflow.oa.entity.OaBaseObject;
import xyz.wongs.es.workflow.oa.entity.ProcDefKey;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通用流程Service
 * @author liuxiaodong
 * @date 2018/5/25
 */

@Service
public class OaBaseObjectService {


    @Resource
    private AtiBaseFormDao atiBaseFormDao;
    @Resource
    private AtiSpecificFormDao atiSpecificFormDao;
    @Resource
    private AtiTaskService atiTaskService;

    /**
     * 发起流程或重新申请
     * @param baseObject
     * @param procDefKey 流程定义key如 "staffEntry"
     * @param primaryKey 主键如 "STAFF_ID"
     */
    @Transactional(readOnly = false,rollbackFor = Exception.class)
    public void save(OaBaseObject baseObject,String procDefKey,String primaryKey) {

        List<AtiSpecificForm> specificForms = getSpecificForms(baseObject,primaryKey);

        // 申请发起

        //添加procDefId到通用配置表单
        if(baseObject.getProcDefId() == null){
            baseObject.setProcDefId(baseObject.getAct().getProcDefId());
        }

        atiBaseFormDao.addAtiBaseForm(baseObject);

        Long currentBaseFormId = baseObject.getAtiBaseFormId();
        baseObject.setAtiBaseFormId(currentBaseFormId);

        for(AtiSpecificForm atiSpecificForm : specificForms) {
            atiSpecificFormDao.insert(atiSpecificForm);
        }

        //使用ATI_BASE_FORM_ID 作为 businessId
        String businessId = String.valueOf(currentBaseFormId);

        // 启动流程
        atiTaskService.startProcess(procDefKey, ProcDefKey.ATI_BASE_FORM_KEY,
                businessId, (String) baseObject.getFormTheme(),baseObject);


    }

    /**
     * 通过虚拟对象oaBaseObject获取atiSpecificForm对象集合
     * @param oaBaseObject
     * @param primaryKey
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(OaBaseObject oaBaseObject,String primaryKey) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        AtiSpecificForm specificFormPrimaryKey = getSpecificForm(oaBaseObject);
        specificFormPrimaryKey.setParameter(primaryKey);
        specificFormPrimaryKey.setParamValue(String.valueOf(oaBaseObject.getPrimaryId()));
        specificForms.add(specificFormPrimaryKey);


        return specificForms;
    }


    public AtiSpecificForm getSpecificForm(OaBaseObject baseObject) {
        AtiSpecificForm atiSpecificForm= new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(baseObject.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(baseObject.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(baseObject.getAtiActCategoryId());
        return  atiSpecificForm;
    }
}
