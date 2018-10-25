package xyz.wongs.es.zbdata.assess.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.zbdata.assess.dao.JxPersonnelAssessDao;
import xyz.wongs.es.zbdata.assess.entity.JxPersonnelAssess;

/**
 * @ClassName: JxPersonnelAssessService
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/25 17:02
 * @Vesion 1.0
 */
@Service
@Transactional(readOnly = true)
public class JxPersonnelAssessService extends CrudService<JxPersonnelAssessDao,JxPersonnelAssess>{
}
