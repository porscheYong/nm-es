package xyz.wongs.es.core.area;

import xyz.wongs.es.common.utils.SpringContextHolder;
import xyz.wongs.es.core.area.dao.LocationDao;
import xyz.wongs.es.core.area.entity.Location;
import xyz.wongs.es.modules.sys.utils.UserUtils;

import java.util.List;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/29 13:07
 * @Modified By :
 **/
public class AreaUtil extends UserUtils {

    private static LocationDao locationDao = SpringContextHolder.getBean(LocationDao.class);


    public static List<Location> getLocationList(Location location){
//		List<Location> locationList = (List<Location>)getCache("LO");
        List<Location> locationList = null;
        if(null==locationList || locationList.size()==0){
            locationList =locationDao.findList(location);
//			User user = getUser();
//			if(user.isAdmin())
//			else{
//
//			}
        }

        putCache(CACHE_LOCATION_ALL_LIST, locationList);
        return locationList;
    }
}
