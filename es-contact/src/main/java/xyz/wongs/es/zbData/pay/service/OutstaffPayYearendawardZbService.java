package xyz.wongs.es.zbData.pay.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbData.pay.dao.OutstaffPayYearendawardZbDao;
import xyz.wongs.es.zbData.pay.entity.OutstaffPayYearendawardZb;


/**
 * @ClassName: OutStaffPayYearEndAwardZbService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/19 16:32
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class OutstaffPayYearendawardZbService extends CrudService<OutstaffPayYearendawardZbDao, OutstaffPayYearendawardZb> {


}
