package xyz.wongs.vali;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.wongs.BaseUnit;
import xyz.wongs.es.common.utils.SpringContextHolder;
import xyz.wongs.es.contact.msg.service.ASmsWaitSendService;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;

import java.util.List;

/**
 * @author WCNGS@QQ.CO
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 **/
public class ValiUnitCase extends BaseUnit {
    private static Logger logger = LoggerFactory.getLogger(ValiUnitCase.class);


    @Autowired
    private Tab2BeanCorresRefService tab2BeanCorresRefService;

    @Autowired
    ASmsWaitSendService aSmsWaitSendService;

    @Test
    public void docValiTable(){
        org.apache.shiro.mgt.SecurityManager securityManager = SpringContextHolder.getBean("securityManager");
        SecurityUtils.setSecurityManager(securityManager);
        Tab2BeanCorresRef tab2BeanCorresRef = new Tab2BeanCorresRef();

        tab2BeanCorresRef.setDayData("Y");
        tab2BeanCorresRef.setMonthId("201712");
        List<Tab2BeanCorresRef> listTab = tab2BeanCorresRefService.findNotExists(tab2BeanCorresRef) ;

        if(CollectionUtils.isNotEmpty(listTab)) {
            StringBuilder sb = new StringBuilder();
            for (Tab2BeanCorresRef bean : listTab) {
                sb.append(bean.getTableDesc()).append(";");
            }
            //
//            logger.error(sb.toString());
            aSmsWaitSendService.insert(sb.toString());
        }
    }
}
