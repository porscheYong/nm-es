package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocEncDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocPartylogDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocEnc;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocPartylog;
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
public class LdapmMpwHiPsndocEncService extends CrudService<LdapmMpwHiPsndocEncDao, LdapmMpwHiPsndocEnc> {


}
