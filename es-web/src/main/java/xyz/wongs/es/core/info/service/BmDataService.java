package xyz.wongs.es.core.info.service;

import xyz.wongs.es.core.info.dao.BdPsnDocDao;
import xyz.wongs.es.core.info.dao.BmDataDao;
import xyz.wongs.es.core.info.entity.BdPsnDoc;
import xyz.wongs.es.core.info.entity.BmData;
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
@Transactional(readOnly = true)
public class BmDataService {

    @Autowired
    BmDataDao bmDataDao;


    public List<BmData> findList(){
        return bmDataDao.findList();
    }


    @Transactional(readOnly = false)
    public int batchUpdate(List<BmData> list){
        return bmDataDao.batchUpdate(list);
    }
}
