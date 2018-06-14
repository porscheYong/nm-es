package xyz.wongs.es.workflow.salaryadjustment.service;

import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.salaryadjustment.dao.OutSalarymentDao;
import xyz.wongs.es.workflow.salaryadjustment.entity.OutSalaryment;

import javax.annotation.Resource;
import java.util.List;

/**
 * 薪资Service
 * @author liuxiaodong
 * @date 2018/6/12
 */
@Service
public class OutSalarymentService {

    @Resource
    private OutSalarymentDao outSalarymentDao;

    public List<OutSalaryment> getOutSalaryStaffInfo() {
        return outSalarymentDao.getSalaryment();
    }
}
