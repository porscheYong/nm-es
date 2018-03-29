/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.modules.cms.dao.ArticleDataDao;
import xyz.wongs.es.modules.cms.entity.ArticleData;

/**
 * 站点Service
 * @author WCNGS@QQ.COM
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
