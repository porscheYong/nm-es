package xyz.wongs.es.mpw.ct.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.ct.dao.LdapmMpwWbCtManageDao;
import xyz.wongs.es.mpw.ct.entity.LdapmMpwWbCtManage;
import xyz.wongs.es.mpw.psnorg.dao.LdapmMpwHiPsnorgDao;
import xyz.wongs.es.mpw.psnorg.entity.LdapmMpwHiPsnorg;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class LdapmMpwWbCtManageService extends CrudService<LdapmMpwWbCtManageDao, LdapmMpwWbCtManage> {


}
