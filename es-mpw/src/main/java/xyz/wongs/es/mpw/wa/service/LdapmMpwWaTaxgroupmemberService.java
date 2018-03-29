package xyz.wongs.es.mpw.wa.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaTaxgroupDao;
import xyz.wongs.es.mpw.wa.dao.LdapmMpwWaTaxgroupmemberDao;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaTaxgroup;
import xyz.wongs.es.mpw.wa.entity.LdapmMpwWaTaxgroupmember;
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
public class LdapmMpwWaTaxgroupmemberService extends CrudService<LdapmMpwWaTaxgroupmemberDao, LdapmMpwWaTaxgroupmember> {


}
