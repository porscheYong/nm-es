package xyz.wongs.es.mpw.bd.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bd.entity.LdapmMpwBdRegion;

/**
 * @ClassName: LdapmMpwBdRegionDao
 * @Description: TODO
 * @author: wyr
 * @Date: 2018/12/23 14:33
 * @Vesion 1.0
 */
@MyBatisDao
public interface LdapmMpwBdRegionDao extends CrudDao<LdapmMpwBdRegion> {
    /**
     * 方法实现说明
     * @method      insert
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param record
     * @return      int
     * @exception
     * @date        2018/3/11 17:56
     */
    @Override
    int insert(LdapmMpwBdRegion record);

    /**
     * 方法实现说明
     * @method      insertSelective
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param record
     * @return      int
     * @exception
     * @date        2018/3/11 17:56
     */
    int insertSelective(LdapmMpwBdRegion record);
}
