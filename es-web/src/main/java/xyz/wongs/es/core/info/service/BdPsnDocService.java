package xyz.wongs.es.core.info.service;

import xyz.wongs.es.core.info.dao.BdPsnDocDao;
import xyz.wongs.es.core.info.entity.BdPsnDoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class BdPsnDocService {

    @Autowired
    BdPsnDocDao bdPsnDocDao;


    public List<BdPsnDoc> findList(){
        return bdPsnDocDao.findList();
    }

    @Transactional(readOnly = false)
    public int batchUpdate(List<BdPsnDoc> list){
        return bdPsnDocDao.batchUpdate(list);
    }
}
