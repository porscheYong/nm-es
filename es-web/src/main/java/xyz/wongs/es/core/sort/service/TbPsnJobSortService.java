//package xyz.wongs.es.core.sort.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import xyz.wongs.es.core.sort.dao.TbPsnJobSortDao;
//import xyz.wongs.es.core.sort.entity.TbPsnJobSort;
//
//import java.util.List;
//
///**
// * @Author: WCNGS
// * @Description :
// * @Date : CEATED In  2017/12/18 15:10
// * @Modified By :
// **/
//@Service
//@Transactional(readOnly = true,rollbackFor = Exception.class)
//public class TbPsnJobSortService {
//
//    @Autowired
//    TbPsnJobSortDao tbPsnJobSortDao;
//
//
//    public List<TbPsnJobSort> findList(TbPsnJobSort tbPsnJobSort){
//        return tbPsnJobSortDao.findList(tbPsnJobSort);
//    }
//
//
//    public int updateByPrimaryKeySelective(TbPsnJobSort tbPsnJobSort){
//        return tbPsnJobSortDao.updateByPrimaryKeySelective(tbPsnJobSort);
//    }
//
//    public List<String> findListPk(){
//        return  tbPsnJobSortDao.findListPk();
//    }
//
//    public int insertSelective(TbPsnJobSort tbPsnJobSort){
//         return tbPsnJobSortDao.insertSelective(tbPsnJobSort);
//    }
//
//
//    @Transactional(readOnly = false)
//    public int batchUpdate(List<TbPsnJobSort> list){
//        return tbPsnJobSortDao.batchUpdate(list);
//    }
//}
