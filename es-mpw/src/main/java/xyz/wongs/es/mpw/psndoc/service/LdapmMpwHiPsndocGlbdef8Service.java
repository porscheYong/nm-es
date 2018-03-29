package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef7Dao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef8Dao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef7;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef8;
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
public class LdapmMpwHiPsndocGlbdef8Service extends CrudService<LdapmMpwHiPsndocGlbdef8Dao, LdapmMpwHiPsndocGlbdef8> {


}
