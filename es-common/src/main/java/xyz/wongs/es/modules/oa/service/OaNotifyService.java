/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.oa.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.modules.oa.entity.OaNotify;
import xyz.wongs.es.modules.oa.entity.OaNotifyRecord;
import xyz.wongs.es.modules.oa.dao.OaNotifyDao;
import xyz.wongs.es.modules.oa.dao.OaNotifyRecordDao;

/**
 * 通知通告Service
 * @author WCNGS@QQ.COM
 * @version 2014-05-16
 */
@Service
@Transactional(readOnly = true)
public class OaNotifyService extends CrudService<OaNotifyDao, OaNotify> {

	@Autowired
	private OaNotifyRecordDao oaNotifyRecordDao;

	public OaNotify get(String id) {
		OaNotify entity = dao.get(id);
		return entity;
	}
	
	/**
	 * 获取通知发送记录
	 * @param oaNotify
	 * @return
	 */
	public OaNotify getRecordList(OaNotify oaNotify) {
		oaNotify.setOaNotifyRecordList(oaNotifyRecordDao.findList(new OaNotifyRecord(oaNotify)));
		return oaNotify;
	}
	
	public Page<OaNotify> find(Page<OaNotify> page, OaNotify oaNotify) {
		oaNotify.setPage(page);
		page.setList(dao.findList(oaNotify));
		return page;
	}
	
	/**
	 * 获取通知数目
	 * @param oaNotify
	 * @return
	 */
	public Long findCount(OaNotify oaNotify) {
		return dao.findCount(oaNotify);
	}
	
	@Transactional(readOnly = false)
	public void save(OaNotify oaNotify) {
		super.save(oaNotify);
		
		// 更新发送接受人记录
		oaNotifyRecordDao.deleteByOaNotifyId(oaNotify.getId());
		if (oaNotify.getOaNotifyRecordList().size() > 0){
			oaNotifyRecordDao.insertAll(oaNotify.getOaNotifyRecordList());
		}
	}
	
	/**
	 * 更新阅读状态
	 */
	@Transactional(readOnly = false)
	public void updateReadFlag(OaNotify oaNotify) {
		OaNotifyRecord oaNotifyRecord = new OaNotifyRecord(oaNotify);
		oaNotifyRecord.setUser(oaNotifyRecord.getCurrentUser());
		oaNotifyRecord.setReadDate(new Date());
		oaNotifyRecord.setReadFlag("1");
		oaNotifyRecordDao.update(oaNotifyRecord);
	}
}