package xyz.wongs.es.zbData.pay.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbData.pay.dao.OutstaffPayInsuranceZbDao;
import xyz.wongs.es.zbData.pay.entity.OutstaffPayInsuranceZb;

/**
 * @ClassName: OutstaffPayInsuranceZbService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/24 16:28
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class OutstaffPayInsuranceZbService extends CrudService<OutstaffPayInsuranceZbDao,OutstaffPayInsuranceZb> {
}
