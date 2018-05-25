package xyz.wongs.es.workflow.oa.web;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.act.service.AtiTaskService;
import xyz.wongs.es.workflow.oa.entity.OaBaseObject;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.oa.service.OaBaseObjectService;

import javax.annotation.Resource;
import java.util.Map;

/**
 *
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

    /**
     *
     * 发起流程接口测试
     * @param baseObject
     */
    @RequestMapping(value = "/startOaBase",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> testStartAtiLeave(OaBaseObject baseObject,
                                                    String procDefKey, String key) {

        ResponseResult<String> result = new ResponseResult<String>();
        String procDefId = (String) baseObject.getProcDefId();
        if(procDefId == null || procDefId.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formSender = String.valueOf(baseObject.getFormSender());
        if(formSender == null || formSender.isEmpty()){
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formTheme = (String) baseObject.getFormTheme();
        if(formTheme == null || formTheme.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String urgent = baseObject.getUrgent();
        if(urgent == null || urgent.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String formContent = (String) baseObject.getFormContent();
        if(formContent == null || formContent.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String primaryId = String.valueOf(baseObject.getPrimaryId());
        if(primaryId == null || primaryId.isEmpty()) {
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }

        String atiCategoryId = String.valueOf(baseObject.getAtiActCategoryId());
        if(atiCategoryId == null || atiCategoryId.isEmpty()){
            result.setMessage("fail");
            result.setState(ResponseResult.STATE_ERROR);
            return result;
        }
        oaBaseObjectService.save(baseObject,procDefKey,key);

        result.setMessage("success");
        result.setState(ResponseResult.STATE_OK);
        return result;
    }


    /**
     * 审批任务测试接口
     * @param flag
     * @param taskId
     * @param procInstId
     */
    @RequestMapping(value = "/approvalOaBase",method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult<String> approvalStaffEntry(String flag,String taskId,String procInstId) {
        ResponseResult<String> result = new ResponseResult<>();
        // 提交流程任务
        Map<String, Object> vars = Maps.newHashMap();
        vars.put("pass", flag);
        atiTaskService.complete(taskId, procInstId, null, vars);

        result.setState(ResponseResult.STATE_OK);
        result.setMessage("success");

        return result;
    }
}
