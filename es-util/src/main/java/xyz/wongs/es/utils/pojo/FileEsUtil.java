package xyz.wongs.es.utils.pojo;

import java.io.File;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/22 11:09
 * @Modified By :
 **/
public class FileEsUtil {

    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/21 14:48
     * @Description: 判断路径是否存在，不存在则创建
     * @param localPath
     * @Mod:
     */
    public static void createDir(String localPath) {
        File entryDir = new File(localPath);
        //如果文件夹路径不存在，则创建文件夹
        if (!entryDir.exists() || !entryDir.isDirectory()) {
            entryDir.mkdirs();
        }
    }
}
