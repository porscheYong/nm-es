package xyz.wongs.es.zbdata.welfare.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbdata.welfare.dao.JxWelfareProductDao;
import xyz.wongs.es.zbdata.welfare.entity.JxWelfareProduct;

/**
 * @ClassName: JxWelfareProductService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/25 16:56
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class JxWelfareProductService extends CrudService<JxWelfareProductDao,JxWelfareProduct>{
}
