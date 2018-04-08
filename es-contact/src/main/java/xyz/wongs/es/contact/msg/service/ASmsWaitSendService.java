package xyz.wongs.es.contact.msg.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.contact.msg.dao.ASmsWaitSendDao;
import xyz.wongs.es.contact.msg.entity.ASmsWaitSend;
import xyz.wongs.es.modules.sys.service.DictService;
import xyz.wongs.es.modules.sys.service.LogService;
import xyz.wongs.es.modules.sys.utils.DictUtils;

/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 15:10
 * @Modified By :
 **/
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class ASmsWaitSendService{

//    public class ASmsWaitSendService extends CrudService<ASmsWaitSendDao, ASmsWaitSend> {
    @Autowired
    private ASmsWaitSendDao aSmsWaitSendDao;

    @Autowired
    private DictService dictService;

    @Autowired
    private LogService logService;

    private static String CONTACT="contact";

    private static Logger logger = LoggerFactory.getLogger(ASmsWaitSendService.class);

    /**
     * 实现向短信待发表插入短信信息，目前仅实现单个插入，支持批量插入
     * @method      insert
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param content
     * @return      void
     * @exception
     * @date        2018/1/23 10:24
     */
    public void insert(String content) {
        ASmsWaitSend aSmsWaitSend;

        String[] contact = getContact();
        for (String s : contact) {
            aSmsWaitSend = new ASmsWaitSend();
            aSmsWaitSend.setMsgContent(content);
            aSmsWaitSend.setDestTermid(s);
            aSmsWaitSend.setFeeUserTermid(s);
            aSmsWaitSendDao.insert(aSmsWaitSend);
            logger.error(aSmsWaitSend.toString());
        }
    }


    /**
     * 从数据字典中获取联系人信息，并以;分割
     * @method      getContact
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param
     * @return      java.lang.String[]
     * @exception
     * @date        2018/1/23 12:47
     */
    private String[] getContact(){
        String contact = DictUtils.getValue(CONTACT);
        return contact.split(";");
    }

    public static void main(String[] args) {

    }
}
