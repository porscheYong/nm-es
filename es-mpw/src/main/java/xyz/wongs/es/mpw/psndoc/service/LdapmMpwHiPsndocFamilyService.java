package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocEduDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocFamilyDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocEdu;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocFamily;
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
public class LdapmMpwHiPsndocFamilyService extends CrudService<LdapmMpwHiPsndocFamilyDao, LdapmMpwHiPsndocFamily> {


}
