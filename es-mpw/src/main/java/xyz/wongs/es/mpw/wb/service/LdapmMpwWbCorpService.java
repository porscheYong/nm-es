package xyz.wongs.es.mpw.wb.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psnorg.dao.LdapmMpwHiPsnorgDao;
import xyz.wongs.es.mpw.psnorg.entity.LdapmMpwHiPsnorg;
import xyz.wongs.es.mpw.wb.dao.LdapmMpwWbCorpDao;
import xyz.wongs.es.mpw.wb.entity.LdapmMpwWbCorp;
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
public class LdapmMpwWbCorpService extends CrudService<LdapmMpwWbCorpDao, LdapmMpwWbCorp> {


}
