package xyz.wongs.es.mpw.cost.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.cost.dao.LdapmMpwWbPsnCostBDao;
import xyz.wongs.es.mpw.cost.entity.LdapmMpwWbPsnCostB;
import xyz.wongs.es.mpw.ct.dao.LdapmMpwWbCtManageDao;
import xyz.wongs.es.mpw.ct.entity.LdapmMpwWbCtManage;
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
public class LdapmMpwWbPsnCostBService extends CrudService<LdapmMpwWbPsnCostBDao, LdapmMpwWbPsnCostB> {


}
