package xyz.wongs.es.mpw.defdoc.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.defdoc.dao.LdapmMpwDdDefdoclistDao;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwDdDefdoclist;
import xyz.wongs.es.mpw.org.dao.LdapmMpwTelSyncCostcenterDao;
import xyz.wongs.es.mpw.org.entity.LdapmMpwTelSyncCostcenter;
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
public class LdapmMpwDdDefdoclistService extends CrudService<LdapmMpwDdDefdoclistDao, LdapmMpwDdDefdoclist> {

    @Autowired
    LdapmMpwDdDefdoclistDao ldapmMpwDdDefdoclistDao;


    @Transactional(readOnly = false)
    public int insertBatch(List<LdapmMpwDdDefdoclist> list){
        return ldapmMpwDdDefdoclistDao.insertBatch(list);
    }
}
