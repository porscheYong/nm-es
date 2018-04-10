package xyz.wongs.es.core.file.service;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import xyz.wongs.es.core.file.FileDocUtil;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.core.file.entity.Examination2Document;

import java.io.File;
import java.io.IOException;

/**
 * @author WCNGS@QQ.CO
 * @version V1.0
 * @Title:
 * @Package nm-es xyz.wongs.es.core.file.service
 * @Description: TODO
 * @date 2018/4/9 9:52
 **/
@Service
public class Examination2DocumentService {

    private static final String TARGET = "DAT.gz";
    private static final String REPLACE_MENENT = "VAL";
    /**
     * 方法实现说明
     * @method      excuExamination
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param document
     * @return      void
     * @exception
     * @date        2018/4/9 10:07
     */
    public Examination2Document excuExamination(Document document){
        //按照规则重新获取校验文件的绝对路径
        String path = document.getPath().replace(TARGET,REPLACE_MENENT);
        Examination2Document exam = new Examination2Document();
        try {
            String content = FileUtils.readFileToString(new File(path));
            /**
            BufferedReader br= new BufferedReader(new FileReader(path));
            String str;
            //判断是否是最后一行
            while((str=br.readLine())!=null) {
                Examination2Document exam = new Examination2Document();
                FileDocUtil.repalceEnterKey(str);
                FileDocUtil.compBean(exam,str);
                System.out.println(exam.toString());
            }
            **/
            FileDocUtil.repalceEnterKey(content);
            FileDocUtil.compBean(exam,content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exam;

    }




    public static void main(String[] args) {
        Examination2DocumentService ob = new Examination2DocumentService();
        Document document = new   Document();
        String path1 = "G:\\UECC\\DayData\\LDAPM_MPW_BD_DEFDOCLIST.20171106.201711.00.001.001.815.VAL";
        document.setPath(path1);
        ob.excuExamination(document);

//        String path = path1.replace("DAT.gz","VAL");

    }
}
