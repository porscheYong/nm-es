package xyz.wongs.es.mpw.hi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.hi.dao.LdapmMpwHiEntryapplyDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiEntryapply;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class LdapmMpwHiEntryapplyService extends CrudService<LdapmMpwHiEntryapplyDao, LdapmMpwHiEntryapply> {


}
