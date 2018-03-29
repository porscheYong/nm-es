package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef3Dao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef5Dao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef3;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef5;
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
public class LdapmMpwHiPsndocGlbdef5Service extends CrudService<LdapmMpwHiPsndocGlbdef5Dao, LdapmMpwHiPsndocGlbdef5> {


}
