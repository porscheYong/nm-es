package xyz.wongs.es.contact.msg.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.contact.msg.entity.ASmsWaitSend;

@MyBatisDao
public interface ASmsWaitSendDao extends CrudDao<ASmsWaitSend> {

    int insert(ASmsWaitSend aSmsWaitSend);

    int insertSelective(ASmsWaitSend aSmsWaitSend);
}