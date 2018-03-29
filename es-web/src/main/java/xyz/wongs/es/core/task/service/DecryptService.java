package xyz.wongs.es.core.task.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.wongs.es.core.info.entity.BdPsnDoc;
import xyz.wongs.es.core.info.entity.BmData;
import xyz.wongs.es.core.info.entity.PsnDocCtrt;
import xyz.wongs.es.core.info.entity.PsnDocRetire;
import xyz.wongs.es.core.info.service.BdPsnDocService;
import xyz.wongs.es.core.info.service.BmDataService;
import xyz.wongs.es.core.info.service.PsnDocCtrtService;
import xyz.wongs.es.core.info.service.PsnDocRetireService;
import xyz.wongs.es.modules.sys.service.DictService;
import xyz.wongs.es.modules.sys.utils.DictUtils;
import xyz.wongs.es.utils.CommonUtil;
import xyz.wongs.es.utils.DecryptStrUtil;

import java.util.List;


/**
 * @Author: WCNGS
 * @Description :
 * @Date : CEATED In  2017/12/18 10:29
 * @Modified By :
 *
 **/
@Service
@Lazy(false)
@Transactional(readOnly = true)
public class DecryptService {

    Logger logger = LoggerFactory.getLogger(DecryptService.class);

    private static String DECRYPT_KEYS="decrypt_key";

    @Autowired
    DictService dictService;

    @Autowired
    private BdPsnDocService bdPsnDocService;

    @Autowired
    private BmDataService bmDataService;

    @Autowired
    private PsnDocRetireService psnDocRetireService;

    @Autowired
    private PsnDocCtrtService psnDocCtrtService;

    /**
     *
     * @return
     */
//    private String getDecryptKeys(){
//        Object obj = CacheUtils.get(DECRYPT_KEYS);
//        String keys = null;
//        if(null==obj){
//            List<Dict> dicts = dictService.findList(DictUtils.getDict(DECRYPT_KEYS));
//            CommonUtils.assertNotEmpty(dicts, " Get DecryptKeys is faild!");
//            keys = dicts.get(0).getValue();
//            //写入缓存
//            CacheUtils.put(DECRYPT_KEYS, keys);
//        } else{
//            keys=obj.toString();
//        }
//        return keys;
//    }

    /**
     * 人员合同信息解密
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void excuPsnDocCtrt(){
        List<PsnDocCtrt> list = psnDocCtrtService.findList();
        if(!CommonUtil.valiList(list)){
            return;
        }
        String key =DictUtils.getValue(DECRYPT_KEYS);
        for(PsnDocCtrt b:list){
            try {
                b.setContModel(DecryptStrUtil.decryptOut(key,b.getContModel()));
            } catch (Exception e) {
                logger.error(b.toString());
                continue;
            }
        }

        psnDocCtrtService.batchUpdate(list);
    }

    /**
     * 离退信息解密
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void excuPsnDocRetire(){
        List<PsnDocRetire> list = psnDocRetireService.findList();
        if(!CommonUtil.valiList(list)){
            return;
        }
        String key =DictUtils.getValue(DECRYPT_KEYS);
        for(PsnDocRetire b:list){
            try {
                b.setGlbdef4(DecryptStrUtil.decryptOut(key,b.getGlbdef4()));
                b.setGlbdef5(DecryptStrUtil.decryptOut(key,b.getGlbdef5()));
                b.setMemo(DecryptStrUtil.decryptOut(key,b.getMemo()));
            } catch (Exception e) {
                logger.error(b.toString());
                continue;
            }
        }

        psnDocRetireService.batchUpdate(list);


    }


    /**
     * 社保信息解密
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void excuBmData(){
        List<BmData> list = bmDataService.findList();
        if(!CommonUtil.valiList(list)){
            return;
        }
        String key =DictUtils.getValue(DECRYPT_KEYS);
        for(BmData b:list){
            try {
                b.setBmAccountNo(DecryptStrUtil.decryptOut(key,b.getBmAccountNo()));
            } catch (Exception e) {
                logger.error(b.toString());
                continue;
            }
        }

        bmDataService.batchUpdate(list);

    }

    /**
     * 个人信息解密任务
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void excuBdPsnDoc(){

        List<BdPsnDoc> list = bdPsnDocService.findList();

        if(!CommonUtil.valiList(list)){
            return;
        }
        String key =DictUtils.getValue(DECRYPT_KEYS);
        for(BdPsnDoc b:list){
            try {
                b.setCertId(DecryptStrUtil.decryptOut(key,b.getCertId()));
                b.setCountry(DecryptStrUtil.decryptOut(key,b.getCountry()));
                b.setMobile(DecryptStrUtil.decryptOut(key,b.getMobile()));
                b.setGlbdef7(DecryptStrUtil.decryptOut(key,b.getGlbdef7()));
                b.setGlbdef8(DecryptStrUtil.decryptOut(key,b.getGlbdef8()));
                b.setGlbdef12(DecryptStrUtil.decryptOut(key,b.getGlbdef12()));
                b.setGlbdef13(DecryptStrUtil.decryptOut(key,b.getGlbdef13()));
                b.setName(DecryptStrUtil.decryptOut(key,b.getName()));
                b.setIdType(DecryptStrUtil.decryptOut(key,b.getIdType()));
                b.setFileAddress(DecryptStrUtil.decryptOut(key,b.getFileAddress()));
                b.setHomephone(DecryptStrUtil.decryptOut(key,b.getHomephone()));
                b.setShortName(DecryptStrUtil.decryptOut(key,b.getShortName()));
                b.setUsedName(DecryptStrUtil.decryptOut(key,b.getUsedName()));
                b.setOfficePhone(DecryptStrUtil.decryptOut(key,b.getOfficePhone()));
            } catch (Exception e) {
                logger.error(b.toString());
                continue;
            }
        }

        bdPsnDocService.batchUpdate(list);

    }




}
