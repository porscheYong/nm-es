package xyz.wongs.es.mpw.bd.dao;


import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.mpw.bd.entity.LdapmMpwBdPsncl;


@MyBatisDao
public interface LdapmMpwBdPsnclDao extends CrudDao<LdapmMpwBdPsncl> {

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
    int insert(LdapmMpwBdPsncl record);

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
    int insertSelective(LdapmMpwBdPsncl record);
}