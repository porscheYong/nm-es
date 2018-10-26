package xyz.wongs;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.SecurityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.wongs.es.common.utils.DateUtils;
import xyz.wongs.es.common.utils.SpringContextHolder;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.DocumentService;
import xyz.wongs.es.core.file.service.InsertDataService;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;
import xyz.wongs.es.core.task.service.FtpDownloadService;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author WCNGS@QQ.COm
 * @date 2018/1/15 9:10
 **/
public class DocUnitCase extends BaseUnit {
    private static Logger logger = LoggerFactory.getLogger(DocUnitCase.class);

    //批量测试：true；单例测试：false
    private final static Boolean FLAG = true;

    //public static final String SUFFIX="G:\\UECC/";
    public static final String SUFFIX="F:\\FTP";
    @Autowired
    DocumentService documentService;

    @Autowired
    Tab2BeanCorresRefService tab2BeanCorresRefService;

    @Autowired
    FtpDownloadService ftpDownloadService;

    @Autowired
    private InsertDataService insertDataService;

    private List<Document> documents = new ArrayList<Document>(70);

    /**
     * //测试用，用于验证Bean Service
     * @method      docCase
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param
     * @return      void
     * @exception
     * @date        2018/1/15 15:28
     */
    @Test
    public void docCase(){
//        documentService = (DocumentService) ctx.getBean("documentService");
//        assertNotNull(documentService);
        File file = new File(SUFFIX);
        readFile(file,".DAT.gz");
        if(!FLAG){
            if(CollectionUtils.isNotEmpty(documents))   {
                documentService.batchInsert(documents) ;
            }
        }
    }

    /**
     * 根据文件所在位置，导入数据至数据库
     * @method      docInsertData
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param
     * @return      void
     *
     * @exception
     * @date        2018/1/17 17:47
     */
    @Test
    public void docInsertData(){

        org.apache.shiro.mgt.SecurityManager securityManager =SpringContextHolder.getBean("securityManager");
        SecurityUtils.setSecurityManager(securityManager);

        List<Document> docs;
        if(!FLAG){
            logger.error(" Begin 单例模式");
            Document document = makeInfoDoc();
            docs = documentService.findList(document);
        } else{
            docs = readFile(new File(SUFFIX),".DAT.gz");
        }
        if(!CollectionUtils.isNotEmpty(docs))   {
            return;
        }
        
        for (Document doc : docs) {
            logger.error("开始导入："+doc.getShortName());
            Tab2BeanCorresRef t2C = tab2BeanCorresRefService.find(doc.getShortName());
            int returnCns = insertDataService.readGzDate(t2C.getServiceName(),doc.getPath(), t2C.getEntityName());
            doc.setFlag((short)1);
            doc.setExuCounts(new Long(returnCns));
            logger.error(doc.getShortName()+" ,导入完毕共入库数据量："+returnCns);
            documentService.updateByPrimaryKeySelective(doc);
        }
    }

    /**
     * 测试用，组装Document
     * @method      makeInfoDoc
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param
     * @return      xyz.wongs.es.core.file.entity.Document
     * @exception
     * @date        2018/1/19 15:10
     */
    public Document makeInfoDoc(){
        Document document = new Document();
        document.setFlag((short)0);
        return  document;
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
     * @date        2018/1/18 22:32
     */
    public List<Document> readFile(File file,String format){

        File[] files =  file.listFiles();
        if(null == files){
            return null;
        }
        for (File f : files) {
             if(f.isDirectory()){
                 readFile(f,format);
             } else{
                 final String fileName = f.getName();
                 if(!fileName.endsWith(format)) {
                     continue;
                 }
                 final String shortName = fileName.substring(0,fileName.indexOf("."));
                 final String monthId =   (fileName.split("\\."))[2];
                 Document doc = new Document(shortName,fileName,monthId,f.getPath(),(short)0, DateUtils.formatDateTime(new Date()));
//                 logger.error(doc.toString());
                 documents.add(doc);
//                 documentService.save(doc);
             }
        }

//        if(!FLAG){
//            if(CollectionUtils.isNotEmpty(documents))   {
//                documentService.batchInsert(documents) ;
//            }
//        }
        return documents;
    }


    @Test
    public void testDownLoad(){
        String day = "20171221";
        String year =  day.substring(0,4);
        String month =  day.substring(4,6);
        String localPath = SUFFIX+"DayData"+ File.separator+year+ File.separator+month+ File.separator+day+File.separator;
        String remotePath = "DayData";
        String contains="."+day+".";
        List<Document> documents = ftpDownloadService.getData(localPath,remotePath,contains,true);
//        logger.error("Local Path:"+localPath+"; gz files counts is "+documents.size());
        if(CollectionUtils.isNotEmpty(documents)){
            logger.error("Local Path:"+localPath+"; gz files counts is "+documents.size());
            ftpDownloadService.compareToTables(true,documents.get(0).getMonthId());
        }
    }

    /**
     * @Author Wang Yiren
     * @Description //TODO 测试.csv格式数据写入
     * @Date 17:59 2018/10/22
     * @Param []
     * @return void
     **/
    @Test
    public void testZbdata(){
        org.apache.shiro.mgt.SecurityManager securityManager =SpringContextHolder.getBean("securityManager");
        SecurityUtils.setSecurityManager(securityManager);

        List<Document> docs;
        docs = readFile(new File(SUFFIX),".csv");
        if(!CollectionUtils.isNotEmpty(docs))   {
            return;
        }
        for (Document doc : docs) {
            logger.error("开始导入："+doc.getShortName());
            Tab2BeanCorresRef t2C = tab2BeanCorresRefService.find(doc.getShortName());
            int returnCns = insertDataService.readCsvDate(t2C.getServiceName(),doc.getPath(), t2C.getEntityName());
            doc.setFlag((short)1);
            doc.setExuCounts(new Long(returnCns));
            logger.error(doc.getShortName()+" ,导入完毕共入库数据量："+returnCns);
            documentService.updateByPrimaryKeySelective(doc);
        }
    }

}
