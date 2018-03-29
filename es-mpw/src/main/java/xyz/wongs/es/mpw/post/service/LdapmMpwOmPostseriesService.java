package xyz.wongs.es.mpw.post.service;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.mpw.post.dao.LdapmMpwOmPostDao;
import xyz.wongs.es.mpw.post.dao.LdapmMpwOmPostseriesDao;
import xyz.wongs.es.mpw.post.entity.LdapmMpwOmPost;
import xyz.wongs.es.mpw.post.entity.LdapmMpwOmPostseries;
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
public class LdapmMpwOmPostseriesService extends CrudService<LdapmMpwOmPostseriesDao, LdapmMpwOmPostseries> {


}
