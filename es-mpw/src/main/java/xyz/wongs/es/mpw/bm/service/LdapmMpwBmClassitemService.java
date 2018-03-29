package xyz.wongs.es.mpw.bm.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.bm.dao.LdapmMpwBmClassitemDao;
import xyz.wongs.es.mpw.bm.entity.LdapmMpwBmClassitem;
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
public class LdapmMpwBmClassitemService extends CrudService<LdapmMpwBmClassitemDao, LdapmMpwBmClassitem> {


}
