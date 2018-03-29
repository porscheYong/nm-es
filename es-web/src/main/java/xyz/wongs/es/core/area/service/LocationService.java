package xyz.wongs.es.core.area.service;

import xyz.wongs.es.common.service.TreeService;
import xyz.wongs.es.core.area.AreaUtil;
import xyz.wongs.es.core.area.dao.LocationDao;
import xyz.wongs.es.core.area.entity.Location;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author
 * @create 2017-12-10 9:29
 **/
@Service
@Transactional(readOnly = true)
public class LocationService  extends TreeService<LocationDao, Location> {

    public List<Location> findList(Location location){
//        if (isAll != null && isAll){
//            return UserUtils.getOfficeAllList();
//        }else{
//            return UserUtils.getOfficeList();
//        }
//        if(isAll){
//
//        }

        return AreaUtil.getLocationList(location);
    }
}
