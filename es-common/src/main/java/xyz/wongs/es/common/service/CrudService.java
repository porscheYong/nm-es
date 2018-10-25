/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.common.service;

import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.DataEntity;
import xyz.wongs.es.common.persistence.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service基类
 * @author WCNGS@QQ.COM
 * @version 2014-05-16
 */
@Transactional(readOnly = true)
public abstract class CrudService<D extends CrudDao<T>, T extends DataEntity<T>> extends BaseService {
	
	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;
	
	/**
	 * 获取单条数据
	 * @param id
	 * @return
	 */
	public T get(String id) {
		return dao.get(id);
	}
	
	/**
	 * 获取单条数据
	 * @param entity
	 * @return
	 */
	public T get(T entity) {
		return dao.get(entity);
	}

	public int insertBatch(List<T> list){
		return dao.insertBatch(list);
	}

	/**
	 * @Author Wang Yiren
	 * @Description //TODO 单条语句插入
	 * @Date 16:00 2018/10/23
	 * @Param [entity]
	 * @return int
	 **/
    public int insert(T entity){
	    return dao.insert(entity);
    }
    
    /**
     * @Author Wang Yiren
     * @Description //TODO 执行merge into 操作
     * @Date 15:58 2018/10/23
     * @Param [list]
     * @return int
     **/
    public int mergeInto(List<T> list){
	    return dao.mergeInto(list);
    }
	/**
	 * 查询列表数据

	 * @param entity
	 * @return
	 */
	public List<T> findList(T entity) {
		return dao.findList(entity);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param entity
	 * @return
	 */
	public Page<T> findPage(Page<T> page, T entity) {
		entity.setPage(page);
		page.setList(dao.findList(entity));
		return page;
	}

	/**
	 * 保存数据（插入或更新）
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void save(T entity) {
		if (entity.getIsNewRecord()){
			entity.preInsert();
			dao.insert(entity);
		}else{
			entity.preUpdate();
			dao.update(entity);
		}
	}
	
	/**
	 * 删除数据
	 * @param entity
	 */
	@Transactional(readOnly = false)
	public void delete(T entity) {
		dao.delete(entity);
	}

}
