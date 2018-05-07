package xyz.wongs.es.workflow.oa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiModifyStaffInfo;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.workattendace.entity.AtiLeave;

/**
 * 个性表类Service
 * @author liuxiaodong
 * @date 2018/4/28
 */
@Service
public class AtiSpecificFormService {

    @Autowired
    private AtiSpecificFormDao atiSpecificFormMapper;


    /**
     * 获取虚拟对象 leave
     * @param id
     * @return
     */
    public AtiLeave getAtiLeaveByBaseFormId(Long id) {
        return atiSpecificFormMapper.getAtiLeaveByBaseFormId(id);
    }

    /**
     * 获取虚拟对象 modifyStaffInfo
     * @param id
     * @return
     */
    public AtiModifyStaffInfo getAtiModifyStaffInfoByBaseFormId(Long id) {
        return atiSpecificFormMapper.getAtiModifyStaffInfoByBaseFormId(id);
    }
}
