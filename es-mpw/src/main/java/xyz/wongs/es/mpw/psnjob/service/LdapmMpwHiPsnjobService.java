package xyz.wongs.es.mpw.psnjob.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocWorkDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocWork;
import xyz.wongs.es.mpw.psnjob.dao.LdapmMpwHiPsnjobDao;
import xyz.wongs.es.mpw.psnjob.entity.LdapmMpwHiPsnjob;
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
public class LdapmMpwHiPsnjobService extends CrudService<LdapmMpwHiPsnjobDao, LdapmMpwHiPsnjob> {


}
