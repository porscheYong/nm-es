package xyz.wongs.es.mpw.bd.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.bd.dao.LdapmMpwBdRegionDao;
import xyz.wongs.es.mpw.bd.entity.LdapmMpwBdRegion;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: LdapmMpwBdRegionService
 * @Description: TODO
 * @author: wyr
 * @Date: 2018/12/23 14:36
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class LdapmMpwBdRegionService extends CrudService<LdapmMpwBdRegionDao, LdapmMpwBdRegion> {

}
