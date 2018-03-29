package xyz.wongs.es.mpw.psn.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psn.dao.LdapmMpwWbPsnTramsgDao;
import xyz.wongs.es.mpw.psn.dao.LdapmMpwWbPsnVocquaDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnTramsg;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnVocqua;
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
public class LdapmMpwWbPsnVocquaService extends CrudService<LdapmMpwWbPsnVocquaDao, LdapmMpwWbPsnVocqua> {


}
