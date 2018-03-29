package xyz.wongs.es.core.task.web;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wongs.es.common.utils.DateUtils;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.DocumentService;
import xyz.wongs.es.core.file.service.InsertDataService;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;
import xyz.wongs.es.core.task.FindDates;
import xyz.wongs.es.core.task.service.FtpDownloadService;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/26 11:09
 * @Modified By :
 **/
@Controller
@RequestMapping(value = "${adminPath}/mpw/setting")
public class SettingController extends BaseController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private InsertDataService insertDataService;

    @Autowired
    private FtpDownloadService ftpDownloadService;

    @Autowired
    Tab2BeanCorresRefService tab2BeanCorresRefService;

    /**
     * 开发环境
     */
//    private static String SUFIX="E:\\UECC/";

    /**生产Linux
     *
     */
    private static String SUFIX="/weblogic/bea/data/";

    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"/",""})
    public String index() {
        return "mpw/setting/docList";
    }


    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/27 20:59
     * @Description:  根据条件下载文件
     * @param document
     * @param model
     * @Mod:
     */
    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"file"})
    public String getFile(Document document,String endmonthId, Model model) {

        String url = "mpw/setting/docList";
        List<Document> list = null;
        if(document==null) {
            return url;
        }

        String monthId = document.getMonthId();

        System.out.println(endmonthId);
        //由于基数太多，没有账期标识不允许查询
        if (null != monthId && !monthId.equals("")) {
            SimpleDateFormat sdf = null;
            if (monthId.length() == 8){
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            }else if (monthId.length() == 6){
                sdf = new SimpleDateFormat("yyyy-MM");
            }

            Set<String> datesStr = new HashSet<String>();
            if (endmonthId == null || "".equals(endmonthId)){
                datesStr.add(monthId);
            } else {
                Date beginDate = FindDates.strToDate(monthId);
                Date endDate = FindDates.strToDate(endmonthId);
                List<Date> dates = FindDates.findDates(beginDate,endDate);
                for (int i=0; i<dates.size();i++){
                    String dateStr = sdf.format(dates.get(i)).toString();
                    String newStr = dateStr.replace("-","");
                    datesStr.add(newStr);
                }
            }
            for (String str : datesStr){
                String remotePath = null;
                String localPath = null;
                String contains = null;
                //第一次根据账期和简称查询
                document.setMonthId(str);
                list = documentService.findList(document);
                if(null==list || list.size()==0){
                    if (str.length() == 8){
                        String day = str.substring(6,8);
                        String month =  str.substring(4,6);
                        String year =  str.substring(0,4);
                        remotePath = "DayData";
                        localPath = SUFIX+"DayData"+ File.separator+year+ File.separator+month+ File.separator+str+File.separator;
                        contains = "."+str+".00.";
                    } else {
                        String month =  str.substring(4,6);
                        String year =  str.substring(0,4);
                        remotePath = "MonthData";
                        localPath = SUFIX+"MonthData"+ File.separator+year+ File.separator+str+File.separator;
                        contains = "."+str+".00.";
                    }

                    //下载文件
                    ftpDownloadService.getData(localPath, remotePath, contains);
                    list = documentService.findList(document);
                }
            }
        }

        model.addAttribute("list", list);
        return url;
    }


    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/27 20:55
     * @Description: 向用户提供可视化导入数据库的功能
     * @param document
     * @param model
     * @Mod:
     */
    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"form"})
    public String form(Document document, Model model) {
        if(document!=null){
            Document doc = documentService.findList(document).get(0);
            Tab2BeanCorresRef t2C = tab2BeanCorresRefService.find(doc.getShortName());
            insertDataService.readGzDate(t2C.getServiceName(),doc.getPath(), t2C.getEntityName());

            doc.setFlag((short)1);
            documentService.updateByPrimaryKeySelective(doc);
        }

        return "redirect:" + adminPath + "/mpw/setting/";
    }

    @RequiresPermissions("mpw:setting:edit")
    @RequestMapping(value = {"delete"})
    public void delete(Document document, Model model) {


    }

    public static void main(String[] args) {
        System.out.println(DateUtils.isValidDate("201711", "YYYYMMDD") ? "DayData" : "MonthData");
    }

    public String getRemotePath(String monthId){
        String ydm = monthId.length()==4?"YYYYMM":"YYYYMMDD";
        String remotePath = DateUtils.isValidDate(monthId, ydm) ? "DayData" : "MonthData";
        return remotePath;
    }

}
