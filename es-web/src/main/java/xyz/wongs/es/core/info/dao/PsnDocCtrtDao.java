package xyz.wongs.es.core.info.dao;

import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
import xyz.wongs.es.core.info.entity.PsnDocCtrt;

import java.util.List;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:09
 * @Modified By :
 **/
@MyBatisDao
public interface PsnDocCtrtDao {

    List<PsnDocCtrt> findList();


    int batchUpdate(List<PsnDocCtrt> list);
}
