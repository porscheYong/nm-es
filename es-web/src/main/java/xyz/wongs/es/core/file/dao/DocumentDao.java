package xyz.wongs.es.core.file.dao;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.core.file.entity.Document;

import java.util.List;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:09
 * @Modified By :
 **/
@MyBatisDao
public interface DocumentDao extends CrudDao<Document> {


    /**
     * 方法实现说明
     * @method      findList
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param document
     * @return      java.util.List<xyz.wongs.es.core.file.entity.Document>
     * @exception
     * @date        2018/3/11 17:45
     */
    @Override
    List<Document> findList(Document document);



    int batchUpdate(List<Document> list);


    /**
     * 方法实现说明
     * @method
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param list
     * @return
     * @exception
     * @date        2018/3/11 17:46
     */
    @Override
    int insertBatch(List<Document> list);

    /**
     * 方法实现说明
     * @method
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param document
     * @return        int
     * @exception
     * @date        2018/3/11 17:47
     */
    int updateByPrimaryKeySelective(Document document);
}
