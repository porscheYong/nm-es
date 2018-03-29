package xyz.wongs.es.mpw.psn.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.psn.dao.LdapmMpwWbPsnMsgDao;
import xyz.wongs.es.mpw.psn.entity.LdapmMpwWbPsnMsg;
import xyz.wongs.es.mpw.psnorg.dao.LdapmMpwHiPsnorgDao;
import xyz.wongs.es.mpw.psnorg.entity.LdapmMpwHiPsnorg;
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
public class LdapmMpwWbPsnMsgService extends CrudService<LdapmMpwWbPsnMsgDao, LdapmMpwWbPsnMsg> {


}
