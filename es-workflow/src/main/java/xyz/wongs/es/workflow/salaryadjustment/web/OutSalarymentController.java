package xyz.wongs.es.workflow.salaryadjustment.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.workflow.oa.dao.AtiSpecificFormDao;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.salaryadjustment.entity.OutSalaryment;
import xyz.wongs.es.workflow.salaryadjustment.service.OutSalarymentService;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 薪资
 * @author liuxiaodong
 * @date 2018/6/12
 */
@Controller
@RequestMapping(value = "/outSalaryment")
public class OutSalarymentController {

    @Resource
    private OutSalarymentService outSalarymentService;

    @RequestMapping(value = "/outStaffInfo",method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<List<OutSalaryment>> getSalaryStaffInfo() {

        ResponseResult<List<OutSalaryment>> result = new ResponseResult<>();

        List<OutSalaryment> list = outSalarymentService.getOutSalaryStaffInfo();

        result.setData(list);
        result.setState(ResponseResult.STATE_OK);
        result.setMessage("获取薪资人员信息列表成功！");

        return result;
    }



}
