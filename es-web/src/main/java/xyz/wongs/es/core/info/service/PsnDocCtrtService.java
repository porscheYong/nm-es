package xyz.wongs.es.core.info.service;

import xyz.wongs.es.core.info.dao.PsnDocCtrtDao;
import xyz.wongs.es.core.info.dao.PsnDocRetireDao;
import xyz.wongs.es.core.info.entity.PsnDocCtrt;
import xyz.wongs.es.core.info.entity.PsnDocRetire;
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
public class PsnDocCtrtService {

    @Autowired
    PsnDocCtrtDao psnDocCtrtDao;


    public List<PsnDocCtrt> findList(){
        return psnDocCtrtDao.findList();
    }


    @Transactional(readOnly = false)
    public int batchUpdate(List<PsnDocCtrt> list){
        return psnDocCtrtDao.batchUpdate(list);
    }
}
