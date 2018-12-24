package xyz.wongs.es.core.task.service;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.DateUtils;
import xyz.wongs.es.contact.msg.service.ASmsWaitSendService;
import xyz.wongs.es.core.EnumEvn;
import xyz.wongs.es.core.file.FileDocUtil;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.DocumentService;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;
import xyz.wongs.es.modules.sys.utils.DictUtils;
import xyz.wongs.es.utils.pojo.Ftp;

import java.io.File;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description : 定时任务FTP下载文件，应用下载的目录后台应改为后台可配置
 * 集团月表每月6日20点下发
 * 集团日表每天14点下发
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/21 11:27
 * @Modified By : wyong
 **/
@Service
@Lazy(false)
@Transactional(readOnly = true)
public class FtpDownloadService {

    /**
     * 生产Linux环境地址
     */
    private static String SUFFFIX = "/weblogic/bea/data/";

    /**
     * 开发环境
     */
//    private static String SUFFFIX="E:\\UECC/";

    //测试Linux 存储集团文件的地址前缀
//    private static String SUFFFIX="/home/kms/ftp_files/";

    private static Logger logger = LoggerFactory.getLogger(FtpDownloadService.class);

    @Autowired
    private DocumentService documentService;

    @Autowired
    private Tab2BeanCorresRefService tab2BeanCorresRefService;

    @Autowired
    private ASmsWaitSendService aSmsWaitSendService;

    private static final String ENVIRONMENT="environment";

    /**
     * 保证线程安全，暂时未用
     */
    @Deprecated
    ReadWriteLock readWriteLock= new ReentrantReadWriteLock();


    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/21 11:28
     * @Description: 每月7号12点从ftp抓取数据
     * @Mod:
     */
    @Scheduled(cron = "0 00 12 7 * ?")
    public void monthData(){
        String month = DateUtils.getMonth(0);
        String year =  month.substring(0,4);
        String localPath = SUFFFIX+"MonthData"+File.separator+year+File.separator+month+ File.separator;
        String remotePath = "MonthData";
        String contains="."+month+".";

        List<Document> documents = getData(localPath,remotePath,contains,true);
        if(CollectionUtils.isNotEmpty(documents)){
            logger.error("Local Path:"+localPath+"; gz files counts is "+documents.size());
            compareToTables(false,documents.get(0).getMonthId());
        }
    }

    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/21 11:28
     * @Description: 每日14点
     * @Mod:
     */
    @Scheduled(cron = "0 00 16 * * ?")
    public void dayData(){
        String day = DateUtils.getDaySimple(-1);
        String year =  day.substring(0,4);
        String month =  day.substring(4,6);
        String localPath = SUFFFIX+"DayData"+ File.separator+year+ File.separator+month+ File.separator+day+File.separator;
        String remotePath = "DayData";
        String contains="."+day+".";
        List<Document> documents = getData(localPath,remotePath,contains,true);
        if(CollectionUtils.isNotEmpty(documents)){
            logger.error("Local Path:"+localPath+"; gz files counts is "+documents.size());
            compareToTables(true,documents.get(0).getMonthId());
        }
    }


    /**
     * 检查下载的文件是否有确实，并且具备通知相关管理员处理
     * @method      compareToTables
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param isDataType   是否是日表数据 ，是：true；否：false,规则为：取反
     * @param monthId       账期
     * @return      void
     * @exception
     * @date        2018/1/23 10:08
     */
    public void compareToTables(Boolean isDataType,String monthId){
        Tab2BeanCorresRef tab2BeanCorresRef = new Tab2BeanCorresRef();
        if(isDataType)  {
            tab2BeanCorresRef.setDayData("Y");
        } else{
            tab2BeanCorresRef.setMonthData("Y");
        }
        tab2BeanCorresRef.setMonthId(monthId);
        List<Tab2BeanCorresRef> Tab2BeanCorresRefs = tab2BeanCorresRefService.findNotExists(tab2BeanCorresRef);
        if(CollectionUtils.isNotEmpty(Tab2BeanCorresRefs)){
            StringBuilder sb = new StringBuilder();
            for (Tab2BeanCorresRef bean : Tab2BeanCorresRefs) {
                sb.append(bean.getTableDesc()).append(";");
            }
            String content =  "集团人力宽表:"+monthId+ "的账期缺失"+Tab2BeanCorresRefs.size()+"张表,分别为: "+sb.toString();
//            logger.error(content);
            aSmsWaitSendService.insert(content);
        }
    }


    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/22 9:19
     * @Description:
     * @param localPath    本地存储的目录
     * @param remotePath   远程目录
     * @param contains 过滤器中使用文件名匹配的字符
     * @param flag 用于决定是否最终下载文件本体
     * @Mod:
     */
    public List<Document> getData(String localPath, String remotePath, String contains,Boolean flag){
        logger.error("获取文件中 ，本地路径 "+localPath+" 远程路径 "+remotePath);
        Ftp fp = getEnvironment();
        List<Document> documents = null;
        try {
            documents = FileDocUtil.getFileAndDownload(fp, contains, localPath, remotePath,flag);
            if(CollectionUtils.isEmpty(documents)){
                return null;
            }
            //下载文件后将文件保存路径以及状态入库，共文件解析模块调用轮询
            documentService.batchInsert(documents);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documents;
    }

    /**
     * 根据环境变量不同，连接不同的FTP
     * @method      getEnvironment
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param
     * @return      xyz.wongs.es.utils.pojo.Ftp
     * @exception
     * @date        2018/1/23 13:09
     */
    public Ftp getEnvironment(){
//        Ftp fp = new Ftp("132.63.10.96", 21, "ds_ftp_815", "ds_ftp_815", ".");
//        Ftp fp = new Ftp("134.64.53.52", 21, "kms", "Kms123456", ".");
//        Ftp fp = new Ftp("123.206.118.219", 21, "uac", "AbcL0ve$%", ".");
        Ftp fp = null;
        String env = DictUtils.getValue(ENVIRONMENT);
        Boolean flag = EnumEvn.getName(env);
        if(flag){
            //目前内蒙ftp IP
            fp = new Ftp("132.63.10.96", 21, "ds_ftp_815", "ds_ftp_815", ".");
            //内蒙计划更换的ftp IP
//            fp = new Ftp("10.254.173.122", 21, "ds_ftp_815", "ds_ftp_815", ".");
        } else{
            fp = new Ftp("123.206.118.219", 21, "uac", "AbcL0ve$%", ".");
        }
        return fp;
    }


    public static void main(String[] args) {
//        System.out.println("JAVA_API_1.7中文.chm".substring(0,"JAVA_API_1.7中文.chm".indexOf(".")));

//        new DownloadService().tet();
//        new DownloadService().readGzDate5("D:/data/MonthData/201712/LDAPM_MPW_BD_DEFDOCLIST.20171206.201712.00.001.001.815.DAT.gz");
//        new DownloadService().readGzDate4("D:\\data\\LDAPM_MPW_BD_DEFDOCLIST.20171206.201712.00.001.001.815.DAT");

//        new DownloadService().getFieldValueMap(new LdapmMpwDdDefdoclist());
    }

}
