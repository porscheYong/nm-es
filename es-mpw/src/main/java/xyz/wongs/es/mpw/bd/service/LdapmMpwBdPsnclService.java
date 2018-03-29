package xyz.wongs.es.mpw.bd.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.bd.dao.LdapmMpwBdPsnclDao;
import xyz.wongs.es.mpw.bd.entity.LdapmMpwBdPsncl;
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
public class LdapmMpwBdPsnclService extends CrudService<LdapmMpwBdPsnclDao, LdapmMpwBdPsncl> {


}
