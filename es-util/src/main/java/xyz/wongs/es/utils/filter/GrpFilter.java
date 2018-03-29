package xyz.wongs.es.utils.filter;

import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;
import xyz.wongs.es.utils.CommonUtil;

/**
 * @Description : FTP文件下载的过滤器，可指定需要过滤名称
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/21 9:41
 * @Modified By :
 **/
public class GrpFilter implements FTPFileFilter {

    private String contains;

    public GrpFilter() {
    }

    public GrpFilter(String contains) {
        this.contains=contains;
    }

    @Override
    public boolean accept(FTPFile ftpFile) {
//        if(ftpFile.isDirectory()){
//            return false;
//        }
        String filename = ftpFile.getName();
        if(filename.contains(contains+ CommonUtil.PERFIX)){
            return true;
        }
        return false;
    }
}
