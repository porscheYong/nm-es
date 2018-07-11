package xyz.wongs.es.workflow.oa.web;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import groovy.json.StringEscapeUtils;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ProcessDefCache;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.oa.entity.HistoricFlow;
import xyz.wongs.es.workflow.oa.entity.HistoricTask;
import xyz.wongs.es.workflow.oa.entity.OaBaseObject;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.oa.service.OaBaseObjectService;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.entity.UecOutStaffInfo;
import xyz.wongs.es.workflow.user.entity.UecStaffInfo;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuxiaodong
 * @date 2018/5/25
 */
@Controller
@RequestMapping(value = "/oa/oaBaseObject")
public class OaBaseObjectController extends BaseController {

    @Resource
    private OaBaseObjectService oaBaseObjectService;
    @Resource
    private AtiTaskService atiTaskService;
    @Resource
    private UserService userService;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private TaskService taskService;


    /**
     * 发起流程接口测试
     *
     * @param startFlowJson
     */
    @RequestMapping(value = "/startOaBase", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> testStartAtiLeave(String startFlowJson) {

        OaBaseObject baseObject = JSON.parseObject(startFlowJson, OaBaseObject.class);

        String primaryId = baseObject.getPrimaryId() + "'}";
        primaryId = primaryId.replaceAll(":", ":'");
        primaryId = primaryId.replaceAll(",", "',");
        JSONObject jsonPrimaryId = JSONObject.parseObject(primaryId);
        if (null != jsonPrimaryId) {
            String outStaffId = jsonPrimaryId.getString("uec_out_staff_info");
            if (null != outStaffId && !outStaffId.isEmpty()) {
                baseObject.setOutStaffId(outStaffId);
            }
            String trialId = jsonPrimaryId.getString("uec_trial");
            if (null != trialId && !trialId.isEmpty()) {
                baseObject.setTrialId(trialId);
            }
            String psnjobId = jsonPrimaryId.getString("uec_psnjob");
            if (null != psnjobId && !psnjobId.isEmpty()) {
                baseObject.setPsnjobId(psnjobId);
            }
            String retireId = jsonPrimaryId.getString("uec_retire");
            if (null != retireId && !retireId.isEmpty()) {
                baseObject.setRetireId(retireId);
            }
            String encId = jsonPrimaryId.getString("uec_enc");
            if (null != encId && !encId.isEmpty()) {
                baseObject.setEduId(encId);
            }
            String punishId = jsonPrimaryId.getString("uec_punish");
            if (null != punishId && !punishId.isEmpty()) {
                baseObject.setPunishId(punishId);
            }
            String talentTeamId = jsonPrimaryId.getString("uec_talent_team");
            if (null != talentTeamId && !talentTeamId.isEmpty()) {
                baseObject.setTalentTeamId(talentTeamId);
            }
            String eduId = jsonPrimaryId.getString("uec_doc_edu");
            if (null != eduId && !eduId.isEmpty()) {
                baseObject.setEduId(eduId);
            }
            String familyId = jsonPrimaryId.getString("uec_family");
            if (null != familyId && !familyId.isEmpty()) {
                baseObject.setFamilyId(familyId);
            }
            String titleId = jsonPrimaryId.getString("uec_title");
            if (null != titleId && !titleId.isEmpty()) {
                baseObject.setTitleId(titleId);
            }
            String partyLogId = jsonPrimaryId.getString("uec_partylog");
            if (null != partyLogId && !partyLogId.isEmpty()) {
                baseObject.setPartyLogId(partyLogId);
            }
            String wadocId = jsonPrimaryId.getString("uec_psndoc_wadoc");
            if (null != wadocId && !wadocId.isEmpty()) {
                baseObject.setWadocId(wadocId);
            }
        }

        ResponseResult<String> result = new ResponseResult<>();
        String procDefId = (String) baseObject.getProcDefId();
        if (procDefId == null || procDefId.isEmpty()) {
            result.setMessage("流程定义ID不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }

        String formSender = baseObject.getFormSender();
        if (formSender == null || formSender.isEmpty()) {
            result.setMessage("用户不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }

        String code = oaBaseObjectService.getCode(formSender);
        UecStaffInfo uecStaffInfo = userService.getStaffByCode(code);
        UecOutStaffInfo uecOutStaffInfo = userService.getOutStaffByCode(code);
        if (uecStaffInfo == null && uecOutStaffInfo == null) {
            result.setMessage("用户不存在！");
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            return result;
        }


        String formTheme = (String) baseObject.getFormTheme();
        if (formTheme == null || formTheme.isEmpty()) {
            result.setMessage("工单主题不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }

        String urgent = baseObject.getUrgent();
        if (urgent == null || urgent.isEmpty()) {
            result.setMessage("紧急程度不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }

        String formContent = (String) baseObject.getFormContent();
        if (formContent == null || formContent.isEmpty()) {
            result.setMessage("工单内容不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }

        String atiCategoryId = String.valueOf(baseObject.getAtiActCategoryId());
        if (atiCategoryId == null || atiCategoryId.isEmpty()) {
            result.setMessage("流程分类ID不允许为空！");
            result.setState(ResponseResult.PARAM_REQUIRED_ERROR);
            return result;
        }
        String procInstId = oaBaseObjectService.save(baseObject);

        result.setMessage("工作流程启动成功！");
        result.setState(ResponseResult.STATE_OK);
        result.setData(procInstId);
        return result;
    }


    /**
     * 任务签收
     *
     * @param taskId
     * @param assignName
     * @return
     */
    @RequestMapping(value = "/claim", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<Void> claim(String taskId, String assignName) {
        ResponseResult<Void> result = new ResponseResult<>();

        if (assignName == null || assignName.isEmpty()) {
            result.setMessage("用户不能为空！");
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            return result;
        }

        String code = oaBaseObjectService.getCode(assignName);
        UecStaffInfo uecStaffInfo = userService.getStaffByCode(code);
        UecOutStaffInfo uecOutStaffInfo = userService.getOutStaffByCode(code);
        if (uecStaffInfo == null && uecOutStaffInfo == null) {
            result.setMessage("用户不存在！");
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            return result;
        }

        //校验当前活动节点候选人中是否有assignName

        Boolean isAssignName = oaBaseObjectService.isAssignName(assignName);
        if (!isAssignName) {
            result.setMessage("用户名不存在！");
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            return result;
        }

        atiTaskService.claim(taskId, assignName);
        result.setState(ResponseResult.STATE_OK);
        result.setMessage("签收成功!");
        return result;
    }


    /**
     * 审批任务测试接口
     *
     * @param flag
     * @param taskId
     * @param procInstId
     */
    @RequestMapping(value = "/approvalOaBase", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> approvalStaffEntry(String comment, String flag, String taskId, String procInstId) {
        ResponseResult<String> result = new ResponseResult<>();

        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(procInstId)
                .singleResult();
        if (null == processInstance) {
            result.setState(ResponseResult.STATE_ERROR);
            result.setMessage("任务不存在或已处理完毕！");
            return result;
        }
        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        if (null == task) {
            result.setState(ResponseResult.STATE_ERROR);
            result.setMessage("任务不存在或已处理完毕！");
            return result;
        }


        if (!"0".equals(flag) && !"1".equals(flag)) {
            result.setState(ResponseResult.STATE_ERROR);
            result.setMessage("参数非法！");
            return result;
        }

        oaBaseObjectService.saveAudit(comment, flag, taskId, procInstId);

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("任务已处理完毕！");

        return result;
    }


    /**
     * 获取已办任务测试接口
     *
     * @param assignName
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/taskHistoric", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<HistoricTask>> historicList(String assignName) throws Exception {
        ResponseResult<List<HistoricTask>> result = new ResponseResult<>();

        if (null == assignName || assignName.isEmpty()) {
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            result.setMessage("用户不允许为空！");
            return result;
        }

        String code = oaBaseObjectService.getCode(assignName);
        UecStaffInfo uecStaffInfo = userService.getStaffByCode(code);
        UecOutStaffInfo uecOutStaffInfo = userService.getOutStaffByCode(code);
        if (uecStaffInfo == null && uecOutStaffInfo == null) {
            result.setMessage("用户不存在！");
            result.setState(ResponseResult.USER_NOT_EXISTED_ERROR);
            return result;
        }

        List<HistoricTask> historicTasks = oaBaseObjectService.getHistToricTaskList(assignName);

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("success");
        result.setData(historicTasks);
        return result;

    }


    /**
     * 流程流转信息接口
     *
     * @param procInstId
     * @return
     */
    @RequestMapping(value = "/historicFlows", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<HistoricFlow>> historicFlows(String procInstId) {
        ResponseResult<List<HistoricFlow>> result = new ResponseResult<>();
        List<HistoricFlow> historicFlowList = oaBaseObjectService.histoicFlowList(procInstId);

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("success");
        result.setData(historicFlowList);
        return result;
    }


    /*@RequestMapping(value = "/historicFlows",method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<Map<String,Object>>> historicFlows(String procInstId, String startAct, String endAct) {
        ResponseResult<List<Map<String,Object>>> result = new ResponseResult<>();
        List<Act> historicFlowList = oaBaseObjectService.histoicFlowList(procInstId, startAct, endAct);

        List<Map<String,Object>> list = new ArrayList<>(20);
        for (Act e:historicFlowList){
            Map<String,Object> map = new HashMap<>(2);
            map.put("act",e);
            map.put("histIns",e.getHistIns());
            list.add(map);
        }

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("success");
        result.setData(list);
        return result;
    }*/


    /**
     * 当前任务候选人
     *
     * @param procInstId
     * @return
     */
    @RequestMapping(value = "/currentTaskAssignNames", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<Map<String, Object>> getCurrentTaskAssignNames(String procInstId) {
        ResponseResult<Map<String, Object>> result = new ResponseResult<>();
        Map<String, Object> map = new HashMap<>();

        Task currentTask = taskService.createTaskQuery().processInstanceId(procInstId).singleResult();
        Act e = new Act();
        e.setTask(currentTask);
        e.setProcDef(ProcessDefCache.get(currentTask.getProcessDefinitionId()));
        map.put("task", e);

        //获取在监听器中设置的用户变量
        List<AtiUser> currentUsers = (List<AtiUser>) taskService
                .getVariable(currentTask.getId(), currentTask.getTaskDefinitionKey());
        List<String> names = Lists.newArrayList();
        for (AtiUser user : currentUsers) {
            String name = (String) user.getName();
            names.add(name);
        }
        map.put("names", names);
        result.setState(ResponseResult.STATE_OK);
        result.setMessage("获取当前任务候选人成功！");
        result.setData(map);
        return result;
    }


}
