package xyz.wongs.es.workflow.workattendace.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * restful
 * @author liuxiaodong
 * @date 2018/5/8
 */
@Controller
@RequestMapping(value = "/repository")
public class RequestProcDefIdController {

    @RequestMapping(value = "/process-definitions/{processDefinitionId}",method = RequestMethod.GET)
    @ResponseBody
    public String getProcDefId(@PathVariable("processDefinitionId") String processDefinitionId) {
        return processDefinitionId;
    }










}
