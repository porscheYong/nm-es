package xyz.wongs.es.core.file.service;

import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.core.file.dao.DocumentDao;
import xyz.wongs.es.core.file.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class DocumentService extends CrudService<DocumentDao, Document> {

    @Autowired
    DocumentDao documentDao;

    /**
     * 方法实现说明
     * @method      findPage
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param page
     * @param document
     * @return      xyz.wongs.es.common.persistence.Page<xyz.wongs.es.core.file.entity.Document>
     * @exception
     * @date        2018/1/15 14:50
     */
    @Override
    public Page<Document> findPage(Page<Document> page, Document document) {

//        // 设置默认时间范围，默认当前月
//        if (log.getBeginDate() == null){
//            log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
//        }
//        if (log.getEndDate() == null){
//            log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
//        }

        return super.findPage(page, document);

    }


    @Override
    public List<Document> findList(Document document){
        return documentDao.findList(document);
    }

    @Transactional(readOnly = false)
    public int batchUpdate(List<Document> list){
        return documentDao.batchUpdate(list);
    }

    @Transactional(readOnly = false)
    public int batchInsert(List<Document> list){
        return documentDao.insertBatch(list);
    }

    @Transactional(readOnly = false)
    public int updateByPrimaryKeySelective(Document document){
        return documentDao.updateByPrimaryKeySelective(document);
    }
}
