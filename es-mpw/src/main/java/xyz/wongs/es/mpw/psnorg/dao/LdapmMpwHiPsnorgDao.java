package xyz.wongs.es.mpw.psnorg.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.psnorg.entity.LdapmMpwHiPsnorg;

@MyBatisDao
public interface LdapmMpwHiPsnorgDao extends CrudDao<LdapmMpwHiPsnorg> {
    int insert(LdapmMpwHiPsnorg record);

    int insertSelective(LdapmMpwHiPsnorg record);
}