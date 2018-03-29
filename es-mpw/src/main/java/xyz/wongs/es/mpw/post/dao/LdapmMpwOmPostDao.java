package xyz.wongs.es.mpw.post.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.post.entity.LdapmMpwOmPost;

@MyBatisDao
public interface LdapmMpwOmPostDao extends CrudDao<LdapmMpwOmPost> {
    int insert(LdapmMpwOmPost record);

    int insertSelective(LdapmMpwOmPost record);
}