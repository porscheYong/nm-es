package xyz.wongs.es.mpw.org.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.org.dao.LdapmMpwOrgOrgsDao;
import xyz.wongs.es.mpw.org.dao.LdapmMpwTelDeptCostConDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwOrgOrgs;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelDeptCostCon;
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
public class LdapmMpwTelDeptCostConService extends CrudService<LdapmMpwTelDeptCostConDao, LdapmMpwTelDeptCostCon> {


}
