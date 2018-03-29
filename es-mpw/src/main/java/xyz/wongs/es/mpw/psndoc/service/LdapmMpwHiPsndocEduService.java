package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocCtrtDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocEduDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocCtrt;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocEdu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class LdapmMpwHiPsndocEduService extends CrudService<LdapmMpwHiPsndocEduDao, LdapmMpwHiPsndocEdu> {


}
