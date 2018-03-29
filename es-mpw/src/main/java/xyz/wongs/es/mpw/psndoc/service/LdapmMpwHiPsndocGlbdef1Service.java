package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocFamilyDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef1Dao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocFamily;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef1;
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
public class LdapmMpwHiPsndocGlbdef1Service extends CrudService<LdapmMpwHiPsndocGlbdef1Dao, LdapmMpwHiPsndocGlbdef1> {


}
