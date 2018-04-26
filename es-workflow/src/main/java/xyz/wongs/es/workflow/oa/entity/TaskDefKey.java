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
public class TaskDefKey {

    public static final String[] LEAVE_TASK_DEF_KEY = {"startEvent","modifyApply","deptLeaderAudit","hrAudit","reportBack","endEvent"};


}
