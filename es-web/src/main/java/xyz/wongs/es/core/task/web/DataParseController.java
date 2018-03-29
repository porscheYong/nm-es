package xyz.wongs.es.core.task.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.DocumentService;
import xyz.wongs.es.core.file.service.InsertDataService;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;
import xyz.wongs.es.core.task.service.DataParseIntoDBService;
import xyz.wongs.es.core.task.service.FtpDownloadService;
import xyz.wongs.es.utils.GetEveryDaysOrMonthsUtil;

import java.io.File;
import java.util.List;

/**
 * @author Wang Yiren
 * @Title:
 * @Description:
 * @版权 FFCS（C） 2017
 * @date 2018/1/28 17:47
 */
@Controller
@RequestMapping(value = "${adminPath}/mpw/parse")
public class DataParseController extends BaseController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private InsertDataService insertDataService;

    @Autowired
    private FtpDownloadService ftpDownloadService;

    @Autowired
    private Tab2BeanCorresRefService tab2BeanCorresRefService;

    @Autowired
    private DataParseIntoDBService dataParseIntoDBService;

    /**
     * 生产环境
     */
    private static String SUFFIX="/weblogic/bea/data/";

    /**
     * 开发环境，本地数据解析入库地址
     */
//    public static final String SUFFIX = "E:\\UECC/";

    @RequiresPermissions("mpw:parse:view")
    @RequestMapping(value = {"/",""})
    public String index() {
        return "mpw/parse/parseList";
    }

    /**
     * @Author: Wang Yiren
     * @Date: 2018/1/28 17:47
     * @Description:  根据条件下载文件
     * @param document
     * @param model
     * @Mod:
     */
    @RequiresPermissions("mpw:parse:view")
    @RequestMapping(value = {"file"})
    public String getFile(Document document, Model model) throws Exception {

        String url = "mpw/parse/parseList";
        List<Document> list = null;
        if(document==null) {
            return url;
        }
        //账期开始
        String monthIdBegin = document.getMonthId();
        //账期结束，使用shortName来代替结束账期
        String monthIdEnd = document.getShortName();
        if(!"".equals(monthIdBegin) && !"".equals(monthIdEnd)){
            //根据日账期
            if(monthIdBegin.length() == 8 && monthIdEnd.length() == 8
                    && Integer.parseInt(monthIdEnd) > Integer.parseInt(monthIdBegin)){
                List<String> dayMonthIds = GetEveryDaysOrMonthsUtil.getDayBetween(monthIdBegin,monthIdEnd);
                List<Document> docList = null;
                for (String dayMonthId : dayMonthIds) {
                    //分解账期：年、月
                    String year =  dayMonthId.substring(0,4);
                    String month =  dayMonthId.substring(4,6);
                    String localPath = SUFFIX+"DayData"+ File.separator+year+ File.separator+month+ File.separator+dayMonthId+File.separator;
                    //此处判断数据库中表：tb_document中是否有今日的数据
                    Document doc = new Document();
                    doc.setMonthId(dayMonthId);
                    docList = documentService.findList(doc);
                    list = docList;
                    if(null != docList){
                        //解析开始
                        dataParseIntoDBService.dataInsertDataBase(new File(localPath),dayMonthId);
                    }
                }
            }
            //月账期
            if(monthIdBegin.length() == 6 && monthIdEnd.length() == 6
                    && Integer.parseInt(monthIdEnd) > Integer.parseInt(monthIdBegin)){
                List<String> monthMonthIds = GetEveryDaysOrMonthsUtil.getMonthBetween(monthIdBegin,monthIdEnd);
                List<Document> docList = null;
                for (String monthMonthId : monthMonthIds) {
                    System.out.println(monthMonthId);
                    //分解账期：年、月
                    String year =  monthMonthId.substring(0,4);
                    String month =  monthMonthId.substring(4,6);
                    String localPath = SUFFIX+"MonthData"+File.separator+year+File.separator+monthMonthId+ File.separator;
                    //此处判断数据库中表：tb_document中是否有本月的数据
                    Document doc = new Document();
                    doc.setMonthId(monthMonthId);
                    docList = documentService.findList(doc);
                    list = docList;
                    if(null != docList && docList.size() > 0){
                        //解析开始
                        dataParseIntoDBService.dataInsertDataBase(new File(localPath),monthMonthId);
                    }

                }
            }
        }
        model.addAttribute("list", list);
        return url;
    }


    /**
     * @Author: Wang Yiren
     * @Date: 2018/1/28 17:47
     * @Description: 向用户提供可视化导入数据库的功能
     * @param document
     * @param model
     * @Mod:
     */
    @RequiresPermissions("mpw:parse:view")
    @RequestMapping(value = {"form"})
    public String form(Document document, Model model) {
        if(document!=null){
            Document doc = documentService.findList(document).get(0);
            Tab2BeanCorresRef t2C = tab2BeanCorresRefService.find(doc.getShortName());
            insertDataService.readGzDate(t2C.getServiceName(),doc.getPath(), t2C.getEntityName());

            doc.setFlag((short)1);
            documentService.updateByPrimaryKeySelective(doc);
        }

        return "redirect:" + adminPath + "/mpw/parse/";
    }

    @RequiresPermissions("mpw:parse:edit")
    @RequestMapping(value = {"delete"})
    public void delete(Document document, Model model) {


    }
}
