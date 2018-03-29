package xyz.wongs.es.mpw.psndoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocAbroadDao;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwHiPsndocAssDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocAbroad;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwHiPsndocAss;
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
public class LdapmMpwHiPsndocAssService extends CrudService<LdapmMpwHiPsndocAssDao, LdapmMpwHiPsndocAss> {

    @Autowired
    LdapmMpwHiPsndocAssDao ldapmMpwHiPsndocAssDao;


    @Transactional(readOnly = false)
    public int insertBatch(List<LdapmMpwHiPsndocAss> list){
        return ldapmMpwHiPsndocAssDao.insertBatch(list);
    }
}
