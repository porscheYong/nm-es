package xyz.wongs.es.mpw.post.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.post.entity.LdapmMpwOmPostseries;

@MyBatisDao
public interface LdapmMpwOmPostseriesDao extends CrudDao<LdapmMpwOmPostseries> {
    int insert(LdapmMpwOmPostseries record);

    int insertSelective(LdapmMpwOmPostseries record);
}