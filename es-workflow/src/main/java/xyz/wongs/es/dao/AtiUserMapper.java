package xyz.wongs.es.dao;

import groovy.util.logging.Commons;
import org.springframework.stereotype.Component;
import xyz.wongs.es.entity.AtiUser;
import xyz.wongs.es.common.persistence.CrudDao;
import xyz.wongs.es.common.persistence.annotation.MyBatisDao;

/**
 * @author liuxiaodong
 */
@MyBatisDao
public interface AtiUserMapper extends CrudDao<AtiUser> {

    /**
     * 通过用户名查找用户
     * @param name
     * @return
     */
    public AtiUser getUserByName(String name);
}