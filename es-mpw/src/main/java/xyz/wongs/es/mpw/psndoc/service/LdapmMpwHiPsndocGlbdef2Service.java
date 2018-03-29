package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef1Dao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef2Dao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef1;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef2;
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
public class LdapmMpwHiPsndocGlbdef2Service extends CrudService<LdapmMpwHiPsndocGlbdef2Dao, LdapmMpwHiPsndocGlbdef2> {


}
