package xyz.wongs.es.mpw.bm.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.bm.dao.LdapmMpwBmDataDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmData;
import xyz.wongs.es.mpw.psndoc.dao.LdapmMpwBdPsndocDao;
import xyz.wongs.es.mpw.psndoc.entity.LdapmMpwBdPsndoc;
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
public class LdapmMpwBmDataService extends CrudService<LdapmMpwBmDataDao, LdapmMpwBmData> {

    @Autowired
    LdapmMpwBmDataDao ldapmMpwBmDataDao;


    @Transactional(readOnly = false)
    public int insertBatch(List<LdapmMpwBmData> list){
        return ldapmMpwBmDataDao.insertBatch(list);
    }
}
