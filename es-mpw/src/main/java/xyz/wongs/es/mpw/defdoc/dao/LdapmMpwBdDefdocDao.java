package xyz.wongs.es.mpw.defdoc.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.defdoc.entity.LdapmMpwBdDefdoc;

@MyBatisDao
public interface LdapmMpwBdDefdocDao extends CrudDao<LdapmMpwBdDefdoc> {

    int insert(LdapmMpwBdDefdoc record);

    int insertSelective(LdapmMpwBdDefdoc record);
}