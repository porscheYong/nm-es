package xyz.wongs.es.core.file.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.core.file.dao.Tab2BeanCorresRefDao;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.modules.sys.utils.UserUtils;

import java.util.List;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true)
public class Tab2BeanCorresRefService extends CrudService<Tab2BeanCorresRefDao, Tab2BeanCorresRef> {

    private static String KEY= "TAB2BEANCORRESREF";

    @Autowired
    Tab2BeanCorresRefDao tab2BeanCorresRefDao;


    public Page<Tab2BeanCorresRef> findPage(Page<Tab2BeanCorresRef> page, Tab2BeanCorresRef tab2BeanCorresRef) {
        return super.findPage(page, tab2BeanCorresRef);
    }

    public List<Tab2BeanCorresRef> findList(Tab2BeanCorresRef document){
        List<Tab2BeanCorresRef> list = (List<Tab2BeanCorresRef>)UserUtils.getCache(KEY);
        if(null==list || list.size()==0){
            list = tab2BeanCorresRefDao.findList(document);
            UserUtils.putCache(KEY,list);
        }
        return list;
    }

    public Tab2BeanCorresRef find(String tName){
        List<Tab2BeanCorresRef> list = findList(new Tab2BeanCorresRef());
        for(Tab2BeanCorresRef t2:list){
            if(t2.getTableName().equals(tName)){
                return t2;
            }
        }
        return null;
    }

    @Transactional(readOnly = false)
    public int batchInsert(List<Tab2BeanCorresRef> list){
        return tab2BeanCorresRefDao.insertBatch(list);
    }

    /**
     * 比对下载的文件是否与实际应下发的之间的差异
     * @method      findNotExists
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param tab2BeanCorresRef
     * @return      java.util.List<xyz.wongs.es.core.file.entity.Tab2BeanCorresRef>
     * @exception
     * @date        2018/1/23 9:50
     */
    public List<Tab2BeanCorresRef> findNotExists(Tab2BeanCorresRef tab2BeanCorresRef){
        return tab2BeanCorresRefDao.findNotExists(tab2BeanCorresRef);
    }

    public Tab2BeanCorresRef findByEntityName(String entityName){
        return tab2BeanCorresRefDao.findByEntityName(entityName);
    }


    public int getCount(){
        return tab2BeanCorresRefDao.getCount();
    }

}
