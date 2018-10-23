package xyz.wongs.es.zbData.pay.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbData.pay.entity.OutstaffPayYearendawardZb;


@MyBatisDao
public interface OutstaffPayYearendawardZbDao extends CrudDao<OutstaffPayYearendawardZb> {

    int insert(OutstaffPayYearendawardZb record);

    int insertSelective(OutstaffPayYearendawardZb record);
}
