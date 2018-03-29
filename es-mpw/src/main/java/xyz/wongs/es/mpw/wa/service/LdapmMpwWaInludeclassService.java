package xyz.wongs.es.mpw.wa.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaDataDao;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaInludeclassDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaData;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaInludeclass;
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
public class LdapmMpwWaInludeclassService extends CrudService<LdapmMpwWaInludeclassDao, LdapmMpwWaInludeclass> {


}
