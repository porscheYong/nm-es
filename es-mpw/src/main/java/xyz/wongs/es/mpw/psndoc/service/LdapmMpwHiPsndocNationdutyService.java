package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocLangabiliDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocNationdutyDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocLangabili;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocNationduty;
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
public class LdapmMpwHiPsndocNationdutyService extends CrudService<LdapmMpwHiPsndocNationdutyDao, LdapmMpwHiPsndocNationduty> {


}
