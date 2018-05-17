package xyz.wongs.es.core.task.service;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.utils.DateUtils;
import xyz.wongs.es.common.utils.SpringContextHolder;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.DocumentService;
import xyz.wongs.es.core.file.service.InsertDataService;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Title:
 * @Description: 集团下发数据解析入库
 * @author Wang Yiren
 * @版权 FFCS（C） 2017
 * @date 2018-01-27
 */
@Service
@Lazy(false)
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class DataParseIntoDBService {

    private static Logger logger = LoggerFactory.getLogger(DataParseIntoDBService.class);

    @Autowired
    private DocumentService documentService;

    @Autowired
    private Tab2BeanCorresRefService tab2BeanCorresRefService;

    @Autowired
    private InsertDataService insertDataService;

    private List<Document> documents = new ArrayList<Document>(70);
    /**
     * 生产环境
     */
    private static String SUFFIX="/weblogic/bea/data/";

    /**
     * 开发环境，本地数据解析入库地址E:\UECC
     */
//    public static final String SUFFIX="E:\\UECC/";

    /**
     * @Description: 定时任务：定时向数据库导入当月数据：每月6日20点30分进行数据写库
     * @method      dataInsertDataBase
     * @author      Wang Yiren
     * @version
     * @see
     * @date        2018/1/28 17:47
     */
//    @Scheduled(cron = "0 30 20 7 * ?")
    public void DataParseInputTimeByMonth(){
        //month:为每月的账期
        String month = DateUtils.getMonth(0);
        String year =  month.substring(0,4);
        //数据解析入库路径地址格式（必须明确）
        String localPath = SUFFIX+"MonthData"+File.separator+year+File.separator+month+ File.separator;
        //此处判断数据库中表：tb_document中是否有本月的数据
        Document document = new Document();
        List<Document> list = null;
        document.setMonthId(month);
        list = documentService.findList(document);
        if(null != list && list.size() > 0){
            //解析开始
            this.dataInsertDataBase(new File(localPath),month);
        }
    }

    /**
     * @Description: 定时任务：定时向数据库导入当天数据：每天14点10分
     * @method      dataInsertDataBase
     * @author      Wang Yiren
     * @version
     * @see
     * @date        2018/1/28 17:47
     */
    //@Scheduled(cron = "0 15 14 * * ?")
    public void DataParseInputTimeByDay(){
        String day = DateUtils.getDaySimple(-1);
        String year =  day.substring(0,4);
        String month =  day.substring(4,6);
        String localPath = SUFFIX+"DayData"+ File.separator+year+ File.separator+month+ File.separator+day+File.separator;
        //此处判断数据库中表：tb_document中是否有今日的数据
        Document document = new Document();
        List<Document> list = null;
        document.setMonthId(day);
        list = documentService.findList(document);
        if(null != list && list.size() > 0){
            //解析开始
            this.dataInsertDataBase(new File(localPath),day);
        }
    }

    /**
     * @Description: 根据每天下发数据文件所在的具体位置，将下发数据导入至数据库
     * @method      dataInsertDataBase
     * @author      Wang Yiren
     * @version
     * @see
     * @param file: ftp抓取下来的文件路径
     * @param monthId: 账期：分为日账期：20180102、月账期：201801
     * @return      void
     * @exception
     * @date        2018/1/28 17:47
     */
    public void dataInsertDataBase(File file,String monthId){
        org.apache.shiro.mgt.SecurityManager securityManager =SpringContextHolder.getBean("securityManager");
        SecurityUtils.setSecurityManager(securityManager);

        List<Document> docs = null;
        if(null != file){
            docs = readFile(file);
            if(!CollectionUtils.isNotEmpty(docs))   {
                return;
            }
            for (Document doc : docs) {
                logger.error("开始导入："+doc.getShortName());
                Tab2BeanCorresRef t2C = tab2BeanCorresRefService.find(doc.getShortName());
                //此处要判断下数据库中表：tb_document 中对应的记录，其中flag=1:表示数据已经导入过，
                // flag=0：表示数据仅仅是从ftp下抓取下来的
                Document findDocument = new Document();
                findDocument.setMonthId(monthId);
                findDocument.setShortName(doc.getShortName());
                List<Document> listDocuments = documentService.findList(findDocument);
                if(null !=listDocuments && listDocuments.size()>0){
                    findDocument = listDocuments.get(0);
                    if(findDocument.getFlag() != (short)1){
                        int returnCns = insertDataService.readGzDate(t2C.getServiceName(),doc.getPath(), t2C.getEntityName());
                        findDocument.setFlag((short)1);
                        findDocument.setExuCounts(new Long(returnCns));
                        logger.error(doc.getShortName()+" ,导入完毕共入库数据量："+returnCns);
                        documentService.updateByPrimaryKeySelective(findDocument);
                    }
                }
            }
            docs.clear();
        }
    }

    /**
     * 根据路径获取所有原始数据文件
     * @method      readFile
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param file
     * @return      List<Document>
     * @exception
     * @date        2018/1/28 17:47
     */
    public List<Document> readFile(File file){
        File[] files =  file.listFiles();
        if(null == files){
            return null;
        }
        for (File f : files) {
            if(f.isDirectory()){
                readFile(f);
            } else{
                final String fileName = f.getName();
                if(!fileName.endsWith("DAT.gz")) {
                    continue;
                }
                final String shortName = fileName.substring(0,fileName.indexOf("."));
                final String monthId =   (fileName.split("\\."))[2];
                Document doc = new Document(shortName,fileName,monthId,f.getPath(),(short)0, DateUtils.formatDateTime(new Date()));
                documents.add(doc);
            }
        }
        return documents;
    }
}
