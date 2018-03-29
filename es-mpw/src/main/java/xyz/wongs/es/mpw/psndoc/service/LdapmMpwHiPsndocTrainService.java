package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocTrainDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocTrialDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocTrain;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocTrial;
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
public class LdapmMpwHiPsndocTrainService extends CrudService<LdapmMpwHiPsndocTrainDao, LdapmMpwHiPsndocTrain> {


}
