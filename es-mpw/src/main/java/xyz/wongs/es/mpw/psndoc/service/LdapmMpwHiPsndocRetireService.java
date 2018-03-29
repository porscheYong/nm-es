package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocPunDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocRetireDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocPun;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocRetire;
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
public class LdapmMpwHiPsndocRetireService extends CrudService<LdapmMpwHiPsndocRetireDao, LdapmMpwHiPsndocRetire> {


}
