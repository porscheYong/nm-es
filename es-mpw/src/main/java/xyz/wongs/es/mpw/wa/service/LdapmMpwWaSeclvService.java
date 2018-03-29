package xyz.wongs.es.mpw.wa.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaPrmlvDao;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaSeclvDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPrmlv;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaSeclv;
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
public class LdapmMpwWaSeclvService extends CrudService<LdapmMpwWaSeclvDao, LdapmMpwWaSeclv> {


}
