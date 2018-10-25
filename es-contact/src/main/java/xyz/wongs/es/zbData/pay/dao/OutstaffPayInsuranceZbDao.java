package xyz.wongs.es.zbData.pay.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.zbData.pay.entity.OutstaffPayInsuranceZb;

/**
 * @ClassName: OutstaffPayInsuranceZbDao
 * @Description: TODO
 * @Auther: wang Yiren
 * @Date: 2018/10/24 16:26
 * @Vesion 1.0
 */
@MyBatisDao
public interface OutstaffPayInsuranceZbDao extends CrudDao<OutstaffPayInsuranceZb> {

    int insert(OutstaffPayInsuranceZb record);

    int insertSelective(OutstaffPayInsuranceZb record);
}
