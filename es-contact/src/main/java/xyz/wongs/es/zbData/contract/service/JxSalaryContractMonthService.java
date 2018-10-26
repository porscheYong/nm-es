package xyz.wongs.es.zbdata.contract.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbdata.contract.dao.JxSalaryContractMonthDao;
import xyz.wongs.es.zbdata.contract.entity.JxSalaryContractMonth;

/**
 * @ClassName: JxSalaryContractMonthService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/25 16:46
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class JxSalaryContractMonthService extends CrudService<JxSalaryContractMonthDao,JxSalaryContractMonth> {
}
