package xyz.wongs.es.mpw.defdoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.defdoc.dao.LdapmMpwBdDefdocDao;
import xyz.wongs.es.mpw.defdoc.dao.LdapmMpwDdDefdoclistDao;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwBdDefdoc;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwDdDefdoclist;
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
public class LdapmMpwBdDefdocService extends CrudService<LdapmMpwBdDefdocDao, LdapmMpwBdDefdoc> {

    @Autowired
    LdapmMpwBdDefdocDao ldapmMpwBdDefdocDao;


    @Transactional(readOnly = false)
    public int insertBatch(List<LdapmMpwBdDefdoc> list){
        return ldapmMpwBdDefdocDao.insertBatch(list);
    }
}
