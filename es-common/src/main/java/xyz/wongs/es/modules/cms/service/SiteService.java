/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.cms.service;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.modules.cms.dao.SiteDao;
import xyz.wongs.es.modules.cms.entity.Site;
import xyz.wongs.es.modules.cms.utils.CmsUtils;

/**
 * 站点Service
 * @author WCNGS@QQ.COM
 * @version 2013-01-15
 */
@Service
@Transactional(readOnly = true)
public class SiteService extends CrudService<SiteDao, Site> {

	public Page<Site> findPage(Page<Site> page, Site site) {
//		DetachedCriteria dc = siteDao.createDetachedCriteria();
//		if (StringUtils.isNotEmpty(site.getName())){
//			dc.add(Restrictions.like("name", "%"+site.getName()+"%"));
//		}
//		dc.add(Restrictions.eq(Site.FIELD_DEL_FLAG, site.getDelFlag()));
//		//dc.addOrder(Order.asc("id"));
//		return siteDao.find(page, dc);
		
		site.getSqlMap().put("site", dataScopeFilter(site.getCurrentUser(), "o", "u"));
		
		return super.findPage(page, site);
	}

	@Transactional(readOnly = false)
	public void save(Site site) {
		if (site.getCopyright()!=null){
			site.setCopyright(StringEscapeUtils.unescapeHtml4(site.getCopyright()));
		}
		super.save(site);
		CmsUtils.removeCache("site_"+site.getId());
		CmsUtils.removeCache("siteList");
	}
	
	@Transactional(readOnly = false)
	public void delete(Site site, Boolean isRe) {
		//siteDao.updateDelFlag(id, isRe!=null&&isRe?Site.DEL_FLAG_NORMAL:Site.DEL_FLAG_DELETE);
		site.setDelFlag(isRe!=null&&isRe?Site.DEL_FLAG_NORMAL:Site.DEL_FLAG_DELETE);
		super.delete(site);
		//siteDao.delete(id);
		CmsUtils.removeCache("site_"+site.getId());
		CmsUtils.removeCache("siteList");
	}
	
}
