package xyz.wongs.es.workflow.oa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.OaBaseObject;
import xyz.wongs.es.workflow.workattendace.entity.AtiLeave;

import javax.annotation.Resource;

/**
 * 个性表类Service
 * @author liuxiaodong
 * @date 2018/4/28
 */
@Service
public class AtiSpecificFormService {

    @Resource
    private AtiSpecificFormDao atiSpecificFormDao;



    /**
     * 获取虚拟对象 leave
     * @param id
     * @return
     */
    public AtiLeave getAtiLeaveByBaseFormId(Long id) {
        return atiSpecificFormDao.getAtiLeaveByBaseFormId(id);
    }

    /**
     * 获取虚拟对象 modifyStaffInfo
     * @param id
     * @return
     */
    public AtiModifyStaffInfo getAtiModifyStaffInfoByBaseFormId(Long id) {
        return atiSpecificFormDao.getAtiModifyStaffInfoByBaseFormId(id);
    }


    public AtiStaffEntry getAtiStaffEntryByBaseFormId(Long id) {
        return atiSpecificFormDao.getAtiStaffEntryByBaseFormId(id);
    }

    /**
     * 根据procInstId 获取虚拟通用对象oaBaseObject
     * @param procInstId
     * @return
     */
    public OaBaseObject getOabaseObjectByPorcInstId(String procInstId) {
        return atiSpecificFormDao.getOaBaseObjectByProcInstId(procInstId);
    }

    /**
     * 更新各环节审批意见
     * @param oaBaseObject
     */
    public void updateFirstText(OaBaseObject oaBaseObject) {
        atiSpecificFormDao.updateFirstText(oaBaseObject);
    }

    public void updateSecondText(OaBaseObject oaBaseObject) {
        atiSpecificFormDao.updateSecondText(oaBaseObject);
    }

    public void updateThridText(OaBaseObject oaBaseObject) {
        atiSpecificFormDao.updateThirdText(oaBaseObject);
    }

    public void updateFourthText(OaBaseObject oaBaseObject) {
        atiSpecificFormDao.updateFourthText(oaBaseObject);
    }

    public void updateFifthText(OaBaseObject oaBaseObject) {
        atiSpecificFormDao.updateFifthText(oaBaseObject);
    }
}
