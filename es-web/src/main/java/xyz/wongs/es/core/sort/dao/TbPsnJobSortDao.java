//package xyz.wongs.es.core.sort.dao;
//
//
//import xyz.wongs.es.common.persistence.CrudDao;
//import xyz.wongs.es.common.persistence.annotation.MyBatisDao;
//import xyz.wongs.es.core.sort.entity.TbPsnJobSort;
//
//import java.util.List;
//
//@MyBatisDao
//public interface TbPsnJobSortDao extends CrudDao<TbPsnJobSort> {
//
//    @Override
//    List<TbPsnJobSort> findList(TbPsnJobSort tbPsnJobSort);
//
//    List<String> findListPk();
//
//    int updateByPrimaryKeySelective(TbPsnJobSort tbPsnJobSort);
//
//    int insertSelective(TbPsnJobSort tbPsnJobSort);
//
//    int batchUpdate(List<TbPsnJobSort> list);
//}