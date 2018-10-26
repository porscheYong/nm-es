package xyz.wongs.es.zbdata.pay.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbdata.pay.dao.JxOutsourceMonthWagesDao;
import xyz.wongs.es.zbdata.pay.entity.JxOutsourceMonthWages;

/**
 * @ClassName: JxOutsourceMonthWagesService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/25 13:44
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class JxOutsourceMonthWagesService extends CrudService<JxOutsourceMonthWagesDao,JxOutsourceMonthWages> {
}
