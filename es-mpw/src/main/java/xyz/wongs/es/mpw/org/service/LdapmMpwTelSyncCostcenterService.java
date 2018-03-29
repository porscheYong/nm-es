package xyz.wongs.es.mpw.org.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.org.dao.LdapmMpwTelDeptCostConDao;
import xyz.wongs.es.mpw.org.dao.LdapmMpwTelSyncCostcenterDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelDeptCostCon;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelSyncCostcenter;
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
public class LdapmMpwTelSyncCostcenterService extends CrudService<LdapmMpwTelSyncCostcenterDao, LdapmMpwTelSyncCostcenter> {


}
