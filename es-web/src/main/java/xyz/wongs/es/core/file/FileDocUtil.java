package xyz.wongs.es.core.file;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.wongs.es.common.utils.DateUtils;
import xyz.wongs.es.core.file.entity.Document;
import xyz.wongs.es.utils.filter.GrpFilter;
import xyz.wongs.es.utils.pojo.FileEsUtil;
import xyz.wongs.es.utils.pojo.Ftp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/29 13:12
 * @Modified By :
 **/
public class FileDocUtil {

    private static Logger logger = LoggerFactory.getLogger(FileDocUtil.class);



    private static FTPClient ftpClinet;

    /**
     * 流缓冲区存放的大小
     */
    private final static int UPLOAD_BUFFER_SIZE = 1024 * 1024;

    /**
     *
     */
    public static final int SCAN_NUMBER = 5 * 60;

    public static final int ONE_SECOND = 1000;


    /**
     * 每次休眠时间
     */
    public static final int SCAN_SECOND = 10;


    /**
     * 获取ftp连接
     * @param f
     * @return
     * @throws Exception
     */
    public static boolean connectFtp(Ftp f) throws Exception{
        ftpClinet=new FTPClient();
        boolean flag=false;
        int reply;
        try{
            if (f.getPort()==null) {
                ftpClinet.connect(f.getIpAddr(),21);
            }else{
                ftpClinet.connect(f.getIpAddr(),f.getPort());
            }
            //ftp登陆
            ftpClinet.login(f.getUserName(), f.getPwd());
            //设置文件传输类型
            ftpClinet.setFileType(FTPClient.BINARY_FILE_TYPE);
            //检查延时
            reply = ftpClinet.getReplyCode();
            //如果延时不在200到300之间，就关闭连接
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClinet.disconnect();
                return flag;
            }
            ftpClinet.changeWorkingDirectory(f.getPath());
            flag = true;
            return flag;
        }catch(Exception e){
            logger.error(" FTP Connect faild "+f.toString());
            throw new Exception(e.getMessage());
        }
    }

    /**
     * 关闭ftp连接
     * @Title: closeFtp
     * @Description: TODO void
     */
    public static void closeFtp(){
        if (ftpClinet!=null && ftpClinet.isConnected()) {
            try {
                ftpClinet.logout();
                ftpClinet.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param f             ftp详细配置
     * @param contains      文件名的匹配过滤条件
     * @param localPath     下载到本地的目录
     * @param remoteBaseDir 远程访问的目录
     * @throws Exception
     */
    public static List<Document> getFileAndDownload(Ftp f, String contains, String localPath, String remoteBaseDir) throws Exception {

        List<Document> documents = null;
        try {
            connectFtp(f);
            boolean changedir = ftpClinet.changeWorkingDirectory(remoteBaseDir);
            if (!changedir) {
                logger.error("FTP切换目录失败");
                return documents;
            }

            //主动模式
            ftpClinet.enterLocalActiveMode();

            //被动模式 FTPClient连接前调用FTPClient.enterLocalPassiveMode();
            // 此方法的为了再每次数据连接之前，ftp client告诉ftp server开通一个端口来传输数据。
            // 因为ftp server可能每次开启不同的端口来传输数据，但再linux上，由于安全限制，
            // 可能某些端口没有开启，所以就出现阻塞。
//            ftpClinet.enterLocalPassiveMode();

            //过滤文件
            FTPFile[] files = ftpClinet.listFiles(".", new GrpFilter(contains));
            if (null == files || files.length == 0) {
                return documents;
            }
            documents = new ArrayList<Document>(files.length);

            FileEsUtil.createDir(localPath);

            for (FTPFile ftpf : files) {
                File locaFile = new File(localPath + ftpf.getName());
                //判断文件是否存在，存在则继续
                if (locaFile.exists()) {
//                    locaFile.delete();
                    continue;
                }

                String fileName = ftpf.getName();
                String shortName = fileName.substring(0,fileName.indexOf("."));
                OutputStream outputStream = new FileOutputStream(localPath + fileName);
                ftpClinet.retrieveFile(ftpf.getName(), outputStream);
                //下载完成，写入存量表
//                if(ok){
                String[] str = fileName.split("\\.");
                String monthId = str[2];
                if(fileName.endsWith("gz")){
//                        Document doc = new Document(shortName,fileName,localPath + fileName,DateUtils.formatDateTime(new Date()),1);
                    Document doc = new Document(shortName,fileName,monthId.replaceAll("\\.",""),localPath + fileName,(short)0, DateUtils.formatDateTime(new Date()));
                    documents.add(doc);
                }
//                }

                outputStream.flush();
                outputStream.close();
            }
        } catch (IOException e) {
            logger.error("文件读取错误。");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }  finally {
            closeFtp();
        }
        return documents;
    }
}
