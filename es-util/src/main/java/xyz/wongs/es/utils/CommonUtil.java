package xyz.wongs.es.utils;

import java.util.List;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/20 16:50
 * @Modified By :
 **/
public class CommonUtil {

    public static String PERFIX="00";

    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/20 17:49
     * @Description: 判断List集合非空
     * @param list
     * @Mod:
     */
    public static boolean valiList(List<?> list){
        if(null==list || list.size()==0)
            return false;

        return true;
    }

//    public static void main(String[] args) {
//        if("LDAPM_MPW_BD_DEFDOC.20171106.201711.00.001.001.815.DAT.gz".endsWith("gz")){
//            System.out.println("mmmm");
//        }
//    }
}
