package xyz.wongs.es.mpw.hi.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.hi.entity.LdapmMpwHiContractmng;

@MyBatisDao
public interface LdapmMpwHiContractmngDao extends CrudDao<LdapmMpwHiContractmng>{
    int insert(LdapmMpwHiContractmng ldapmMpwHiContractmng);

    int insertSelective(LdapmMpwHiContractmng ldapmMpwHiContractmng);
}