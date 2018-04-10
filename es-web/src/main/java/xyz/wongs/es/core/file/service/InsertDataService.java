package xyz.wongs.es.core.file.service;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.common.persistence.DataEntity;
import xyz.wongs.es.common.service.CrudService;
import xyz.wongs.es.common.utils.SpringContextHolder;
import xyz.wongs.es.contact.msg.service.ASmsWaitSendService;
import xyz.wongs.es.core.file.FileDocUtil;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/**
 * @author WCNGS@QQ.CO
 * @version V1.0
 * @Title:
 * @Package
 * @Description: TODO
 * @date
 **/
@Service
@Transactional(readOnly = true,rollbackFor = Exception.class)
public class InsertDataService {
    private static Logger logger = LoggerFactory.getLogger(InsertDataService.class);

    public static final String ENCODING="GBK";

    @Autowired
    ASmsWaitSendService aSmsWaitSendService;

    @Autowired
    Tab2BeanCorresRefService tab2BeanCorresRefService;

    /**
     * 由于薪酬类数据量偏大，设置每次处理的阈值
     */
    private static String EQ_BEAN_NAME="ldapmMpwWaDataService";

    /**
     * @method      readGzDate
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param beanName   Spring容器中serviceBean的名称，用于依赖注入</br>
     * @param pathName   存储文件的本地路径名称
     * @param clazzName   实体Bean的类名称，所在包路径，例如：xyz.wongs.es.mpw.psndoc.entity.LdapmMpwBdPsndoc
     * @return      int   返回实际导入库中数据的总量
     * @exception
     * @date        2017/12/26 23:02
     */
    public int readGzDate(String beanName,String pathName,String clazzName) {

        int returnCns=0;

        //获取文件流
        File fr=new File(pathName);
        GZIPInputStream ungzip=null;
        BufferedReader br=null;
        CrudService crudService = SpringContextHolder.getBean(beanName);
        try {
            ungzip = new GZIPInputStream(new FileInputStream(fr));
            //将流整体读取。
            br = new BufferedReader(new InputStreamReader(ungzip,ENCODING));
            String str;
            //每次记录数，可根据实际情况修改
            int size =returnCommitCounts(beanName);
            List list = new ArrayList(size);

            boolean firstSendMsg = true;
            int it=0;
            //判断是否是最后一行
            while((str=br.readLine())!=null) {
                it++;
                Class<?> clazz = Class.forName(clazzName);
                DataEntity bean =  (DataEntity)clazz.newInstance();
//                this.compBean(bean,str);
                int num = FileDocUtil.compBean(bean,str,true);

                //字段有变化次一次轮询，短信通知，且只发送一次
                if(firstSendMsg){
                    fieldCheck(num,clazzName);
                    firstSendMsg=false;
                }

                list.add(bean);
                if(it==size){
                    returnCns+=size;
                    crudService.insertBatch(list);
                    list.clear();
                    it=0;
                }

            }
            //当集合不为空，再提交一次
            if(CollectionUtils.isNotEmpty(list)){
                //最终反馈的
                returnCns+=list.size();
                crudService.insertBatch(list);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            logger.error("文件："+beanName+"未找到！");
        } catch (IOException e) {
            logger.error("文件："+beanName+" IO异常");
        } catch (ClassNotFoundException e) {
            logger.error("文件："+beanName+" 类没有找到");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if(br!=null && ungzip!=null){
                try {
                    br.close();
                    ungzip.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return returnCns;
    }

    /**
     * 方法实现说明
     * @method      fieldCheck
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param nums
     * @param className
     * @return      void
     * @exception
     * @date        2018/4/9 14:51
     */
    public void fieldCheck(int nums,String className){
        Tab2BeanCorresRef tab2BeanCorresRef = tab2BeanCorresRefService.findByEntityName(className);
        if(tab2BeanCorresRef != null){
            String tableDesc = tab2BeanCorresRef.getTableDesc();
            aSmsWaitSendService.insert("集团人力宽表: "+tableDesc + " 字段增加:" + nums + " 个");
        }
    }


    /**
     * 因不同的业务模型设置不同的提交数量，主要因为 31薪酬数据表 LDAPM_MPW_BM_DATA 超过200的时候有：ORA-01745，目前无法定位
     *  默认提交数量未400
     * @method      returnCommitCounts
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param beanName
     * @return      int
     * @exception
     * @date        2018/1/20 12:22
     */
    public static int returnCommitCounts(String beanName){
        //默认提交数量
        int counts =400;
        if(EQ_BEAN_NAME.equals(beanName)){
            counts=100;
        }
        return counts;

    }

//    /**
//     * @Author: WCNGS@QQ.COM
//     * @Date: 2017/12/26 10:41
//     * @Description:
//     * @param bean 组装的Bean
//     * @param str   字符
//     * @Mod:
//     */
//    public void compBean(Object bean,String str){
//
//        //字符之间的分割符
//        byte[] b2 = {0x05};
//        String str1 = new String(b2);
//        //分割字符
//        String[] s = str.split(str1);
//        this.getFieldValueMap(s,bean);
//    }
//
//
//    /**
//     * @Author: WCNGS@QQ.COM
//     * @Date: 2017/12/26 10:45
//     * @Description:
//     * @param s
//     * @param bean
//     * @Mod:
//     */
//    public void getFieldValueMap(String[] s,Object bean){
//
//        // 取出bean里的所有方法
//        Class<?> cls = bean.getClass();
//        Field[] fields = cls.getDeclaredFields();
//        /**
//         * 此处判断下发表字段数量
//         */
//        if(s.length > fields.length){
//            int num = s.length - fields.length;
//            //获取实体类的类名
//            String entityName = bean.getClass().getName();
//            Tab2BeanCorresRef tab2BeanCorresRef = tab2BeanCorresRefService.findByEntityName(entityName);
//            if(tab2BeanCorresRef != null){
//                String tableDesc = tab2BeanCorresRef.getTableDesc();
//                aSmsWaitSendService.insert(tableDesc + "字段增加" + num + "个");
//            }
//        }
//
//        Method[] methods = cls.getDeclaredMethods();
//        for (int i=0;i<s.length;i++) {
//            Object value = null;
//            try {
//                String fieldType = fields[i].getType().getSimpleName();
//                String fieldSetName = StringUtils.parSetName(fields[i].getName());
//                //校验是否有GETTER、SETTER的方法
//                if (!StringUtils.checkGetMet(methods, fieldSetName)) {
//                    continue;
//                }
//                //Type conversion
//                if ("Integer".equals(fieldType)) {
//                    value=Integer.valueOf(s[i]);
//                } else if("BigDecimal".equals(fieldType)) {
//                    value=new BigDecimal(s[i]);
//                } else if("Long".equals(fieldType)) {
//                    value=Long.valueOf(s[i]);
//                } else if("Date".equals(fieldType)) {
//                    value = DateUtils.parseDate(s[i]);
//                } else if("int".equals(fieldType)) {
//                    value = Integer.parseInt(s[i]);
//                } else{
//                    value=s[i];
//                }
//                Method fieldSetMet = cls.getMethod(fieldSetName, new Class[] {fields[i].getType()});
//                fieldSetMet.invoke(bean, new Object[] {value});
//            } catch (Exception e) {
//                logger.error(bean.getClass().getName()+" ;动态赋值异常=>"+s[i]);
//                continue;
//            }
//        }
//    }
}
