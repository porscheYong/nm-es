package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef8Dao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocGlbdef9Dao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef8;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocGlbdef9;
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
public class LdapmMpwHiPsndocGlbdef9Service extends CrudService<LdapmMpwHiPsndocGlbdef9Dao, LdapmMpwHiPsndocGlbdef9> {


}
