package xyz.wongs.es.mpw.tel.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.tel.dao.LdapmMpwTelTableDatadelRecordDao;
import xyz.wongs.es.mpw.tel.entity.LdapmMpwTelTableDatadelRecord;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class LdapmMpwTelTableDatadelRecordService extends CrudService<LdapmMpwTelTableDatadelRecordDao, LdapmMpwTelTableDatadelRecord> {


}
