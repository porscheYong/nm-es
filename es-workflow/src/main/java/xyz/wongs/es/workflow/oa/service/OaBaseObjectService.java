package xyz.wongs.es.workflow.oa.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricTaskInstanceQuery;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Comment;
import org.activiti.engine.task.Task;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.modules.act.entity.Act;
import xyz.wongs.es.modules.act.utils.ProcessDefCache;
import xyz.wongs.es.workflow.act.dao.ActHiActinstDao;
import xyz.wongs.es.workflow.act.entity.ActHiActinst;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.modifystaffinfo.entity.AtiStaffEntry;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.*;
import xyz.wongs.es.workflow.user.dao.AtiRoleDao;
import xyz.wongs.es.workflow.user.entity.AtiRole;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通用流程Service
 *
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
    @Resource
    private HistoryService historyService;
    @Resource
    private RepositoryService repositoryService;
    @Resource
    private TaskService taskService;
    @Resource
    private AtiSpecificFormService atiSpecificFormService;
    @Resource
    private RuntimeService runtimeService;
    @Resource
    private ActHiActinstDao actHiActinstDao;
    @Resource
    private AtiRoleDao atiRoleDao;


    /**
     * 发起流程或重新申请
     *
     * @param baseObject
     */
    @Transactional(readOnly = false, rollbackFor = Exception.class)
    public String save(OaBaseObject baseObject) {

        List<AtiSpecificForm> specificForms = getSpecificForms(baseObject);

        // 申请发起

        //添加procDefId到通用配置表单
        if (baseObject.getProcDefId() == null) {
            baseObject.setProcDefId(baseObject.getAct().getProcDefId());
        }

        atiBaseFormDao.addAtiBaseForm(baseObject);

        Long currentBaseFormId = baseObject.getAtiBaseFormId();
        baseObject.setAtiBaseFormId(currentBaseFormId);

        for (AtiSpecificForm atiSpecificForm : specificForms) {
            atiSpecificFormDao.insert(atiSpecificForm);
        }

        //使用ATI_BASE_FORM_ID 作为 businessId
        String businessId = String.valueOf(currentBaseFormId);

        // 启动流程
        String procInstId = atiTaskService.startProcess(baseObject.getProcDefKey(), ProcDefKey.ATI_BASE_FORM_KEY,
                businessId, baseObject.getAtiActCategoryId(), baseObject);
        return procInstId;

    }

    /**
     * 通过虚拟对象oaBaseObject获取atiSpecificForm对象集合
     *
     * @param oaBaseObject
     * @return
     */
    public List<AtiSpecificForm> getSpecificForms(OaBaseObject oaBaseObject) {

        List<AtiSpecificForm> specificForms = Lists.newArrayList();

        if (null != oaBaseObject.getStaffId() && !oaBaseObject.getStaffId().isEmpty()) {
            AtiSpecificForm specificFormStaffInfo = getSpecificForm(oaBaseObject);
            specificFormStaffInfo.setParameter("STAFF_ID");
            specificFormStaffInfo.setParamValue(String.valueOf(oaBaseObject.getStaffId()));
            specificForms.add(specificFormStaffInfo);
        }

        if (null != oaBaseObject.getStaffIdHis() && !oaBaseObject.getStaffIdHis().isEmpty()) {
            AtiSpecificForm specificFormStaffInfo = getSpecificForm(oaBaseObject);
            specificFormStaffInfo.setParameter("STAFF_ID_HIS");
            specificFormStaffInfo.setParamValue(String.valueOf(oaBaseObject.getStaffIdHis()));
            specificForms.add(specificFormStaffInfo);
        }

        if (null != oaBaseObject.getOutStaffId() && !oaBaseObject.getOutStaffId().isEmpty()) {
            AtiSpecificForm specificFormOutStaffInfo = getSpecificForm(oaBaseObject);
            specificFormOutStaffInfo.setParameter("OUT_STAFF_ID");
            specificFormOutStaffInfo.setParamValue(String.valueOf(oaBaseObject.getOutStaffId()));
            specificForms.add(specificFormOutStaffInfo);
        }
        if (null != oaBaseObject.getOutStaffIdHis() && !oaBaseObject.getOutStaffIdHis().isEmpty()) {
            AtiSpecificForm specificFormOutStaffInfo = getSpecificForm(oaBaseObject);
            specificFormOutStaffInfo.setParameter("OUT_STAFF_ID_HIS");
            specificFormOutStaffInfo.setParamValue(String.valueOf(oaBaseObject.getOutStaffIdHis()));
            specificForms.add(specificFormOutStaffInfo);
        }
        if (null != oaBaseObject.getTrialId() && !oaBaseObject.getTrialId().isEmpty()) {
            AtiSpecificForm specificFormTrial = getSpecificForm(oaBaseObject);
            specificFormTrial.setParameter("TRIAL_ID");
            specificFormTrial.setParamValue(String.valueOf(oaBaseObject.getTrialId()));
            specificForms.add(specificFormTrial);
        }
        if (null != oaBaseObject.getTrialIdHis() && !oaBaseObject.getTrialIdHis().isEmpty()) {
            AtiSpecificForm specificFormTrial = getSpecificForm(oaBaseObject);
            specificFormTrial.setParameter("TRIAL_ID_HIS");
            specificFormTrial.setParamValue(String.valueOf(oaBaseObject.getTrialIdHis()));
            specificForms.add(specificFormTrial);
        }
        if (null != oaBaseObject.getPsnjobIdModify() && !oaBaseObject.getPsnjobIdModify().isEmpty()) {
            AtiSpecificForm specificFormPsnjob = getSpecificForm(oaBaseObject);
            specificFormPsnjob.setParameter("PSNJOB_ID_MODIFY");
            specificFormPsnjob.setParamValue(String.valueOf(oaBaseObject.getPsnjobIdModify()));
            specificForms.add(specificFormPsnjob);
        }
        if (null != oaBaseObject.getPsnjobIdAdd() && !oaBaseObject.getPsnjobIdAdd().isEmpty()) {
            AtiSpecificForm specificFormPsnjob = getSpecificForm(oaBaseObject);
            specificFormPsnjob.setParameter("PSNJOB_ID_ADD");
            specificFormPsnjob.setParamValue(String.valueOf(oaBaseObject.getPsnjobIdAdd()));
            specificForms.add(specificFormPsnjob);
        }
        if (null != oaBaseObject.getPsnjobIdHis() && !oaBaseObject.getPsnjobIdHis().isEmpty()) {
            AtiSpecificForm specificFormPsnjob = getSpecificForm(oaBaseObject);
            specificFormPsnjob.setParameter("PSNJOB_ID_HIS");
            specificFormPsnjob.setParamValue(String.valueOf(oaBaseObject.getPsnjobIdHis()));
            specificForms.add(specificFormPsnjob);
        }
        if (null != oaBaseObject.getRetireId() && !oaBaseObject.getRetireId().isEmpty()) {
            AtiSpecificForm specificFormRetire = getSpecificForm(oaBaseObject);
            specificFormRetire.setParameter("RETIRE_ID");
            specificFormRetire.setParamValue(String.valueOf(oaBaseObject.getRetireId()));
            specificForms.add(specificFormRetire);
        }
        if (null != oaBaseObject.getRetireIdHis() && !oaBaseObject.getRetireIdHis().isEmpty()) {
            AtiSpecificForm specificFormRetire = getSpecificForm(oaBaseObject);
            specificFormRetire.setParameter("RETIRE_ID_HIS");
            specificFormRetire.setParamValue(String.valueOf(oaBaseObject.getRetireIdHis()));
            specificForms.add(specificFormRetire);
        }
        if (null != oaBaseObject.getEncId() && !oaBaseObject.getEncId().isEmpty()) {
            AtiSpecificForm specificFormEnc = getSpecificForm(oaBaseObject);
            specificFormEnc.setParameter("ENC_ID");
            specificFormEnc.setParamValue(String.valueOf(oaBaseObject.getEncId()));
            specificForms.add(specificFormEnc);
        }
        if (null != oaBaseObject.getEncIdHis() && !oaBaseObject.getEncIdHis().isEmpty()) {
            AtiSpecificForm specificFormEnc = getSpecificForm(oaBaseObject);
            specificFormEnc.setParameter("ENC_ID_HIS");
            specificFormEnc.setParamValue(String.valueOf(oaBaseObject.getEncIdHis()));
            specificForms.add(specificFormEnc);
        }
        if (null != oaBaseObject.getPunishId() && !oaBaseObject.getPunishId().isEmpty()) {
            AtiSpecificForm specificFormPunish = getSpecificForm(oaBaseObject);
            specificFormPunish.setParameter("PUNISH_ID");
            specificFormPunish.setParamValue(String.valueOf(oaBaseObject.getPunishId()));
            specificForms.add(specificFormPunish);
        }
        if (null != oaBaseObject.getPunishIdHis() && !oaBaseObject.getPunishIdHis().isEmpty()) {
            AtiSpecificForm specificFormPunish = getSpecificForm(oaBaseObject);
            specificFormPunish.setParameter("PUNISH_ID_HIS");
            specificFormPunish.setParamValue(String.valueOf(oaBaseObject.getPunishIdHis()));
            specificForms.add(specificFormPunish);
        }
        if (null != oaBaseObject.getTalentTeamId() && !oaBaseObject.getTalentTeamId().isEmpty()) {
            AtiSpecificForm specificFormTalentTeam = getSpecificForm(oaBaseObject);
            specificFormTalentTeam.setParameter("TALENT_TEAM_ID");
            specificFormTalentTeam.setParamValue(String.valueOf(oaBaseObject.getTalentTeamId()));
            specificForms.add(specificFormTalentTeam);
        }
        if (null != oaBaseObject.getTalentTeamIdHis() && !oaBaseObject.getTalentTeamIdHis().isEmpty()) {
            AtiSpecificForm specificFormTalentTeam = getSpecificForm(oaBaseObject);
            specificFormTalentTeam.setParameter("TALENT_TEAM_ID_HIS");
            specificFormTalentTeam.setParamValue(String.valueOf(oaBaseObject.getTalentTeamIdHis()));
            specificForms.add(specificFormTalentTeam);
        }
        if (null != oaBaseObject.getEduId() && !oaBaseObject.getEduId().isEmpty()) {
            AtiSpecificForm specificFormEdu = getSpecificForm(oaBaseObject);
            specificFormEdu.setParameter("EDU_ID");
            specificFormEdu.setParamValue(String.valueOf(oaBaseObject.getEduId()));
            specificForms.add(specificFormEdu);
        }
        if (null != oaBaseObject.getEduIdHis() && !oaBaseObject.getEduIdHis().isEmpty()) {
            AtiSpecificForm specificFormEdu = getSpecificForm(oaBaseObject);
            specificFormEdu.setParameter("EDU_ID_HIS");
            specificFormEdu.setParamValue(String.valueOf(oaBaseObject.getEduIdHis()));
            specificForms.add(specificFormEdu);
        }
        if (null != oaBaseObject.getFamilyId() && !oaBaseObject.getFamilyId().isEmpty()) {
            AtiSpecificForm specificFormFamily = getSpecificForm(oaBaseObject);
            specificFormFamily.setParameter("FAMILY_ID");
            specificFormFamily.setParamValue(String.valueOf(oaBaseObject.getFamilyId()));
            specificForms.add(specificFormFamily);
        }
        if (null != oaBaseObject.getFamilyIdHis() && !oaBaseObject.getFamilyIdHis().isEmpty()) {
            AtiSpecificForm specificFormFamily = getSpecificForm(oaBaseObject);
            specificFormFamily.setParameter("FAMILY_ID_HIS");
            specificFormFamily.setParamValue(String.valueOf(oaBaseObject.getFamilyIdHis()));
            specificForms.add(specificFormFamily);
        }
        if (null != oaBaseObject.getTitleId() && !oaBaseObject.getTitleId().isEmpty()) {
            AtiSpecificForm specificFormTitle = getSpecificForm(oaBaseObject);
            specificFormTitle.setParameter("TITLE_ID");
            specificFormTitle.setParamValue(String.valueOf(oaBaseObject.getTitleId()));
            specificForms.add(specificFormTitle);
        }
        if (null != oaBaseObject.getTitleIdHis() && !oaBaseObject.getTitleIdHis().isEmpty()) {
            AtiSpecificForm specificFormTitle = getSpecificForm(oaBaseObject);
            specificFormTitle.setParameter("TITLE_ID_HIS");
            specificFormTitle.setParamValue(String.valueOf(oaBaseObject.getTitleIdHis()));
            specificForms.add(specificFormTitle);
        }
        if (null != oaBaseObject.getPartyLogId() && !oaBaseObject.getPartyLogId().isEmpty()) {
            AtiSpecificForm specificFormPartyLog = getSpecificForm(oaBaseObject);
            specificFormPartyLog.setParameter("PARTY_LOG_ID");
            specificFormPartyLog.setParamValue(String.valueOf(oaBaseObject.getPartyLogId()));
            specificForms.add(specificFormPartyLog);
        }
        if (null != oaBaseObject.getPartyLogIdHis() && !oaBaseObject.getPartyLogIdHis().isEmpty()) {
            AtiSpecificForm specificFormPartyLog = getSpecificForm(oaBaseObject);
            specificFormPartyLog.setParameter("PARTY_LOG_ID_HIS");
            specificFormPartyLog.setParamValue(String.valueOf(oaBaseObject.getPartyLogIdHis()));
            specificForms.add(specificFormPartyLog);
        }
        if (null != oaBaseObject.getWadocId() && !oaBaseObject.getWadocId().isEmpty()) {
            AtiSpecificForm specificFormWaDoc = getSpecificForm(oaBaseObject);
            specificFormWaDoc.setParameter("WADOC_ID");
            specificFormWaDoc.setParamValue(String.valueOf(oaBaseObject.getWadocId()));
            specificForms.add(specificFormWaDoc);
        }
        if (null != oaBaseObject.getWadocIdHis() && !oaBaseObject.getWadocIdHis().isEmpty()) {
            AtiSpecificForm specificFormWaDoc = getSpecificForm(oaBaseObject);
            specificFormWaDoc.setParameter("WADOC_ID_HIS");
            specificFormWaDoc.setParamValue(String.valueOf(oaBaseObject.getWadocIdHis()));
            specificForms.add(specificFormWaDoc);
        }
        if (null != oaBaseObject.getAssId() && !oaBaseObject.getAssId().isEmpty()) {
            AtiSpecificForm specificFormAss = getSpecificForm(oaBaseObject);
            specificFormAss.setParameter("ASS_ID");
            specificFormAss.setParamValue(oaBaseObject.getAssId());
            specificForms.add(specificFormAss);
        }
        if (null != oaBaseObject.getAssIdHis() && !oaBaseObject.getAssIdHis().isEmpty()) {
            AtiSpecificForm specificFormAss = getSpecificForm(oaBaseObject);
            specificFormAss.setParameter("ASS_ID_HIS");
            specificFormAss.setParamValue(oaBaseObject.getAssIdHis());
            specificForms.add(specificFormAss);
        }
        if (null != oaBaseObject.getNationdutyId() && !oaBaseObject.getNationdutyId().isEmpty()) {
            AtiSpecificForm specificFormNationduty = getSpecificForm(oaBaseObject);
            specificFormNationduty.setParameter("NATIONDUTY_ID");
            specificFormNationduty.setParamValue(oaBaseObject.getNationdutyId());
            specificForms.add(specificFormNationduty);
        }
        if (null != oaBaseObject.getNationdutyIdHis() && !oaBaseObject.getNationdutyIdHis().isEmpty()) {
            AtiSpecificForm specificFormNationdutyHis = getSpecificForm(oaBaseObject);
            specificFormNationdutyHis.setParameter("NATIONDUTY_ID_HIS");
            specificFormNationdutyHis.setParamValue(oaBaseObject.getNationdutyIdHis());
            specificForms.add(specificFormNationdutyHis);
        }

        AtiSpecificForm specificFormPrimaryKeyHis = getSpecificForm(oaBaseObject);
        specificFormPrimaryKeyHis.setParameter("PRIMARY_ID_HIS");
        specificFormPrimaryKeyHis.setParamValue(String.valueOf(oaBaseObject.getPrimaryIdHis()));
        specificForms.add(specificFormPrimaryKeyHis);

        AtiSpecificForm specificFormFirstText = getSpecificForm(oaBaseObject);
        specificFormFirstText.setParameter("FIRST_TEXT");
        specificFormFirstText.setParamValue(oaBaseObject.getFifthText());
        specificForms.add(specificFormFirstText);

        AtiSpecificForm specificFormSecondText = getSpecificForm(oaBaseObject);
        specificFormSecondText.setParameter("SECOND_TEXT");
        specificFormSecondText.setParamValue(oaBaseObject.getSecondText());
        specificForms.add(specificFormSecondText);

        AtiSpecificForm specificFormThirdText = getSpecificForm(oaBaseObject);
        specificFormThirdText.setParameter("THIRD_TEXT");
        specificFormThirdText.setParamValue(oaBaseObject.getThirdText());
        specificForms.add(specificFormThirdText);

        AtiSpecificForm specificFormFourthText = getSpecificForm(oaBaseObject);
        specificFormFourthText.setParameter("FOURTH_TEXT");
        specificFormFourthText.setParamValue(oaBaseObject.getFourthText());
        specificForms.add(specificFormFourthText);

        AtiSpecificForm specificFormFifthText = getSpecificForm(oaBaseObject);
        specificFormFifthText.setParameter("FIFTH_TEXT");
        specificFormFifthText.setParamValue(oaBaseObject.getFifthText());
        specificForms.add(specificFormFifthText);


        return specificForms;
    }


    public AtiSpecificForm getSpecificForm(OaBaseObject baseObject) {
        AtiSpecificForm atiSpecificForm = new AtiSpecificForm();
        atiSpecificForm.setAtiSpecificFormId(baseObject.getAtiSpecificFormId());
        atiSpecificForm.setAtiBaseFormId(baseObject.getAtiBaseFormId());
        atiSpecificForm.setAtiActCategoryId(baseObject.getAtiActCategoryId());
        return atiSpecificForm;
    }


    public List<HistoricTask> getHistToricTaskList(String assignName, String categoryId, String startTime, String endTime) {

        List<HistoricTask> historicTasks = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        AtiRole atiRole = atiRoleDao.getRoleByNo(assignName);
        // 非发起人
        try {
            if (!"4000".equals(atiRole.getRoleCode())) {
                HistoricTaskInstanceQuery histTaskQuery = historyService.createHistoricTaskInstanceQuery()
                        .taskAssignee(assignName).finished().includeProcessVariables()
                        .orderByHistoricTaskInstanceEndTime().desc();

                if (null == categoryId || categoryId.isEmpty()) {
                    if ((null == startTime || startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                    if ((null == startTime || startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.taskCompletedBefore(sdf.parse(endTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                if (taskInstance.getEndTime().getTime() <= sdf.parse(endTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.taskCompletedAfter(sdf.parse(startTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                if (taskInstance.getStartTime().getTime() >= sdf.parse(startTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.taskCompletedAfter(sdf.parse(startTime))
                                .taskCompletedBefore(sdf.parse(endTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                }
                if (null != categoryId && !categoryId.isEmpty()) {
                    if ((null == startTime || startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.processVariableValueEquals("categoryId", Long.valueOf(categoryId)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                    if ((null == startTime || startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.processVariableValueEquals("categoryId", Long.valueOf(categoryId))
                                .taskCompletedBefore(sdf.parse(endTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.processVariableValueEquals("categoryId", Long.valueOf(categoryId))
                                .taskCompletedAfter(sdf.parse(startTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        List<HistoricTaskInstance> histList = histTaskQuery.processVariableValueEquals("categoryId", Long.valueOf(categoryId))
                                .taskCompletedAfter(sdf.parse(startTime)).taskCompletedBefore(sdf.parse(endTime)).list();
                        if (null == histList || histList.size() == 0) {
                            return null;
                        }
                        for (HistoricTaskInstance taskInstance : histList) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(taskInstance.getProcessInstanceId());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(taskInstance, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                }

            } else {
                List<ActHiActinst> hiActinsts = actHiActinstDao.findAllActHiActinstByAssignee(assignName);
                if (null == hiActinsts || hiActinsts.size() == 0) {
                    return null;
                }
                if (null == categoryId || categoryId.isEmpty()) {
                    if ((null == startTime || startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                historicTasks.add(historicTask);
                            }
                        }
                    }
                    if ((null == startTime || startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (actHiActinst.getEndTime().getTime() <= sdf.parse(endTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (actHiActinst.getStartTime().getTime() >= sdf.parse(startTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (actHiActinst.getStartTime().getTime() >= sdf.parse(startTime).getTime() && actHiActinst.getEndTime().getTime() <= sdf.parse(endTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                }
                if (null != categoryId && !categoryId.isEmpty()) {
                    if ((null == startTime || startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (categoryId.equals(baseObject.getAtiActCategoryId().toString())) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null == startTime || startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (categoryId.equals(baseObject.getAtiActCategoryId().toString()) && actHiActinst.getEndTime().getTime() <= sdf.parse(endTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null == endTime || endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (categoryId.equals(baseObject.getAtiActCategoryId().toString()) && actHiActinst.getStartTime().getTime() >= sdf.parse(startTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                    if ((null != startTime && !startTime.isEmpty()) && (null != endTime && !endTime.isEmpty())) {
                        for (ActHiActinst actHiActinst : hiActinsts) {
                            OaBaseObject baseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(actHiActinst.getProcInstId().toString());
                            if (null != baseObject) {
                                if (categoryId.equals(baseObject.getAtiActCategoryId().toString()) && actHiActinst.getStartTime().getTime() >= sdf.parse(startTime).getTime() && actHiActinst.getEndTime().getTime() <= sdf.parse(endTime).getTime()) {
                                    HistoricTask historicTask = setHistoricTask(actHiActinst, baseObject);
                                    historicTasks.add(historicTask);
                                }
                            }
                        }
                    }
                }

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return historicTasks;
    }

    private HistoricTask setHistoricTask(HistoricTaskInstance taskInstance, OaBaseObject baseObject) {
        HistoricTask historicTask = new HistoricTask();
        historicTask.setProcessDefinitionId(taskInstance.getProcessDefinitionId());
        historicTask.setProcessInstanceId(taskInstance.getProcessInstanceId());
        historicTask.setAssignee(taskInstance.getAssignee());
        historicTask.setDurationInMillis(taskInstance.getDurationInMillis());
        historicTask.setStartTime(taskInstance.getStartTime());
        historicTask.setEndTime(taskInstance.getEndTime());
        historicTask.setName(taskInstance.getName());

        historicTask.setFormSender(baseObject.getFormSender());
        historicTask.setFormTheme(baseObject.getFormTheme());
        historicTask.setFormContent(baseObject.getFormContent());
        historicTask.setAtiCategoryId(baseObject.getAtiActCategoryId());

        List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().
                processDefinitionId(taskInstance.getProcessDefinitionId()).list();
        historicTask.setProcDefName(list.get(0).getName());

        String procInstId = baseObject.getProcInstId();
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(procInstId).singleResult();
        if (null != processInstance) {
            Map<String, Object> map = getCurrentTaskAssignNames(procInstId);
            List<String> names = (List<String>) map.get("name");
            historicTask.setCurrentCandidate(names.get(0));
        }

        return historicTask;
    }

    private HistoricTask setHistoricTask(ActHiActinst actHiActinst, OaBaseObject baseObject) {
        HistoricTask historicTask = new HistoricTask();
        historicTask.setProcessDefinitionId(actHiActinst.getProcDefId().toString());
        historicTask.setProcessInstanceId(actHiActinst.getProcInstId().toString());
        historicTask.setAssignee(actHiActinst.getAssignee().toString());
        if(null != actHiActinst.getDuration()) {
            historicTask.setDurationInMillis(actHiActinst.getDuration().longValue());
        }
        historicTask.setStartTime(actHiActinst.getStartTime());
        historicTask.setEndTime(actHiActinst.getEndTime());
        historicTask.setName(actHiActinst.getActName().toString());

        historicTask.setFormSender(baseObject.getFormSender());
        historicTask.setFormTheme(baseObject.getFormTheme());
        historicTask.setFormContent(baseObject.getFormContent());
        historicTask.setAtiCategoryId(baseObject.getAtiActCategoryId());

        List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().
                processDefinitionId(actHiActinst.getProcDefId().toString()).list();
        historicTask.setProcDefName(list.get(0).getName());

        String procInstId = baseObject.getProcInstId();
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(procInstId).singleResult();
        if (null != processInstance) {
            Map<String, Object> map = getCurrentTaskAssignNames(procInstId);
            List<String> names = (List<String>) map.get("names");
            historicTask.setCurrentCandidate(names.get(0));
        }

        return historicTask;
    }


    /**
     * 流程审批环节
     *
     * @param flag
     * @param taskId
     * @param procInstId
     * @param comment
     */
    public void saveAudit(String comment, String flag, String taskId, String procInstId) {
        List<Task> task = taskService.createTaskQuery().taskId(taskId).list();
        String taskDefKey = task.get(0).getTaskDefinitionKey();
        OaBaseObject oaBaseObject = atiSpecificFormService.getOabaseObjectByPorcInstId(procInstId);
        //只针对通用流程，固定的审批环节，即modify,deptLeader,hr,hrLeader,admin
        switch (taskDefKey) {
            case "deptLeaderAudit":
                oaBaseObject.setSecondText(comment);
                atiSpecificFormService.updateSecondText(oaBaseObject);
                break;
            case "hrAudit":
                oaBaseObject.setThirdText(comment);
                atiSpecificFormService.updateThridText(oaBaseObject);
                break;
            case "hrLeaderAudit":
                oaBaseObject.setFourthText(comment);
                atiSpecificFormService.updateFourthText(oaBaseObject);
                break;
            case "admin":
                break;
            case "modify":
                break;
            default:
                return;

        }
        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", flag);
        atiTaskService.complete(taskId, procInstId, comment, vars);
    }


    /**
     * 流程历史流转
     *
     * @param procInsId
     * @return
     */
    public List<HistoricFlow> histoicFlowList(String procInsId) {
        List<HistoricFlow> actList = Lists.newArrayList();
        List<HistoricActivityInstance> list = historyService.createHistoricActivityInstanceQuery().processInstanceId(procInsId)
                .orderByHistoricActivityInstanceStartTime().asc().orderByHistoricActivityInstanceEndTime().asc().list();

        boolean start = false;
        Map<String, Integer> actMap = Maps.newHashMap();

        for (int i = 0; i < list.size(); i++) {

            HistoricActivityInstance histIns = list.get(i);

            // 过滤开始节点前的节点
            if (StringUtils.isNotBlank("startEvent") && "startEvent".equals(histIns.getActivityId())) {
                start = true;
            }
            if (StringUtils.isNotBlank("startEvent") && !start) {
                continue;
            }


            // 只显示开始节点和结束节点，并且执行人不为空的任务
            //只显示开始节点，结束节点，用户任务节点
            if ("userTask".equals(histIns.getActivityType())
                    || "startEvent".equals(histIns.getActivityType())
                    || "endEvent".equals(histIns.getActivityType())) {

                // 给节点增加一个序号
                Integer actNum = actMap.get(histIns.getId());
                if (actNum == null) {
                    actMap.put(histIns.getId(), actMap.size() + 1);
                }

                HistoricFlow historicFlow = new HistoricFlow();
                historicFlow.setActNum(actMap.get(histIns.getId()));
                historicFlow.setStartTime(histIns.getStartTime());
                historicFlow.setEndTime(histIns.getEndTime());
                historicFlow.setDuringTime(String.valueOf(histIns.getDurationInMillis()));

                historicFlow.setTaskDefKey(histIns.getActivityName());

                if ("startEvent".equals(histIns.getActivityId())) {
                    OaBaseObject oaBaseObject = atiSpecificFormDao.getOaBaseObjectByProcInstId(procInsId);
                    historicFlow.setAssignee(oaBaseObject.getFormSender());
                } else {
                    historicFlow.setAssignee(histIns.getAssignee());
                }

//                // 获取意见评论内容
                if (StringUtils.isNotBlank(histIns.getTaskId())) {
                    List<Comment> commentList = taskService.getTaskComments(histIns.getTaskId());
                    if (commentList.size() > 0) {
                        historicFlow.setComment(commentList.get(0).getFullMessage());
                    }
                }

                actList.add(historicFlow);
            }


        }
        return actList;
    }

    /**
     * 用户名获取其中code值
     *
     * @param currentUserName
     * @return
     */
    public String getCode(String currentUserName) {
        return currentUserName.substring(1);
    }

    /**
     * 校验用户有效性
     *
     * @param assignName
     * @return
     */
    public boolean isAssignName(String assignName) {
        List<ProcessInstance> instances = runtimeService.createProcessInstanceQuery().list();
        boolean isAssignName = false;
        for (ProcessInstance instance : instances) {
            Task task = taskService.createTaskQuery().processInstanceId(instance.getId()).singleResult();
            List<AtiUser> users = (List<AtiUser>) taskService.getVariable(task.getId(), task.getTaskDefinitionKey());
            if (null != users && users.size() > 0) {
                for (AtiUser user : users) {
                    if (assignName.equals(user.getNo())) {
                        isAssignName = true;
                        break;
                    }
                }
                if (isAssignName) {
                    break;
                }
            }

        }
        return isAssignName;
    }

    /**
     * 当前任务与候选人
     * @param procInstId
     * @return
     */
    public Map<String, Object> getCurrentTaskAssignNames(String procInstId) {
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
            String name = user.getNo();
            names.add(name);
        }
        map.put("names", names);

        return map;
    }
}
