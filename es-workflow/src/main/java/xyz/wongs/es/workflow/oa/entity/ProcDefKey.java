package xyz.wongs.es.workflow.oa.entity;

import com.google.common.collect.Lists;
import xyz.wongs.es.workflow.user.entity.AtiUser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 流程TaskDefKey
 * 约定流程中taskDefKey的顺序,流程回退使用
 * @author liuxiaodong
 * @date 2018/4/25
 */
public class ProcDefKey {

    public static final String ATI_BASE_FORM_KEY = "ati_base_form";

    public static Map<String,Object> map = new HashMap<String, Object>();

    public static final String LEAVE_PROC_DEF_KEY = "leave";
    public static final String[] LEAVE_TASK_DEF_KEY = {"startEvent","modifyApply","deptLeaderAudit","hrAudit","reportBack","endEvent"};



    public static final String MODIFY_PROC_DEF_KEY = "modifyStaffInfo";
    public static final String[] MODIFY_TASK_DEF_KEY = {"startEvent","modify","hrAudit","hrLeaderAudit","admin","endEvent"};

    public static void init() {
        map.put(LEAVE_PROC_DEF_KEY,LEAVE_TASK_DEF_KEY);
        map.put(MODIFY_PROC_DEF_KEY,MODIFY_TASK_DEF_KEY);
    }
}
