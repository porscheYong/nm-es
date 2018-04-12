//package xyz.wongs.sort;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import xyz.wongs.BaseUnit;
//import xyz.wongs.es.common.utils.DateUtils;
//import xyz.wongs.es.core.sort.entity.TbPsnJobSort;
//import xyz.wongs.es.core.sort.service.TbPsnJobSortService;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author WCNGS@QQ.CO
// * @version V1.0
// * @Title:
// * @Package nm-es xyz.wongs.sort
// * @Description: TODO
// * @date 2018/4/12 19:41
// **/
//public class TbPsnJobSortCase extends BaseUnit {
//
//    private static Logger logger = LoggerFactory.getLogger(TbPsnJobSortCase.class);
//
//    private static final String PATTERN="yyyy-MM-dd";
//    @Autowired
//    private TbPsnJobSortService tbPsnJobSortService;
//
//    public List<String> getAllTbPsnJobSort(){
//        return tbPsnJobSortService.findListPk();
//    }
//
//    @Test
//    public void tbPsnJobSortVal(){
//        int i =0;
//        List<TbPsnJobSort> resultBatchUpdate = new ArrayList<>(100);
//
//        List<String> strs=this.getAllTbPsnJobSort();
//        for (String st:strs){
//            TbPsnJobSort obj = new TbPsnJobSort();
//            obj.setPkPsndoc(st);
//
//            List<TbPsnJobSort> tbPsnJobSorts = tbPsnJobSortService.findList(obj);
//            if(tbPsnJobSorts.size()==1){
//             continue;
//            }
//            for(int j=0;j<tbPsnJobSorts.size();j++){
//
//                if(j!=tbPsnJobSorts.size()-1) {
//                    if(tbPsnJobSorts.get(j).getEndDate()==null){
//                        tbPsnJobSorts.get(j).setErrorMsg("结束日期为空");
//                        tbPsnJobSorts.get(j).setFlag("2");
////                            this.valstatus(tbPsnJobSorts.get(j));
//                        resultBatchUpdate.add(tbPsnJobSorts.get(j));
//                        i++;
//                        logger.error(i+ " 结束日期为空==============="+tbPsnJobSorts.get(j).getPkPsndoc());
//                        continue;
//                    }
//                    int con = DateUtils.dateVali(DateUtils.getDatebystr(tbPsnJobSorts.get(j).getEndDate(),PATTERN),DateUtils.getDatebystr(tbPsnJobSorts.get(j+1).getBeginDate(),PATTERN));
//                    if(con>1){
//                        tbPsnJobSorts.get(j).setErrorMsg(" 日期间隔不一致");
//                        tbPsnJobSorts.get(j).setFlag("1");
//                        i++;
//                        logger.error(i+ " 日期间隔不一致==============="+tbPsnJobSorts.get(j).getPkPsndoc());
////                            this.valstatus(tbPsnJobSorts.get(j));
//                        resultBatchUpdate.add(tbPsnJobSorts.get(j));
//                    }
//                }
//            }
//
//
//
//            if(i==100){
//                tbPsnJobSortService.batchUpdate(resultBatchUpdate);
//                resultBatchUpdate.clear();
//                i=0;
//            }
//        }
//        if(resultBatchUpdate.size()!=0){
//            tbPsnJobSortService.batchUpdate(resultBatchUpdate);
//        }
//    }
//
//    public void valstatus(TbPsnJobSort tbPsnJobSort){
//        tbPsnJobSortService.updateByPrimaryKeySelective(tbPsnJobSort);
//    }
//}
