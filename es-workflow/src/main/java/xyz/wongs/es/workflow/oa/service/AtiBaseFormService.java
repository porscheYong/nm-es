package xyz.wongs.es.workflow.oa.service;

import org.springframework.stereotype.Service;
import xyz.wongs.es.workflow.oa.dao.AtiBaseFormDao;
import xyz.wongs.es.workflow.oa.entity.AtiBaseForm;

import javax.annotation.Resource;

/**
 * 通用表单Service
 *
 * @author liuxiaodong
 * @date 2018/5/31
 */
@Service
public class AtiBaseFormService {

    @Resource
    private AtiBaseFormDao atiBaseFormDao;

    public AtiBaseForm getBaseFormByProcInstId(String procInstId) {
        return  atiBaseFormDao.getBaseFormByProcInstId(procInstId);
    }
}
