package xyz.wongs.es.mpw.wa.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaPeriodDao;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaPeriodstateDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPeriod;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaPeriodstate;
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
public class LdapmMpwWaPeriodstateService extends CrudService<LdapmMpwWaPeriodstateDao, LdapmMpwWaPeriodstate> {


}
