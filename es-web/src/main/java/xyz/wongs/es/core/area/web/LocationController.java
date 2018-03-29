package xyz.wongs.es.core.area.web;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import xyz.wongs.es.common.config.Global;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.core.area.entity.Location;
import xyz.wongs.es.core.area.service.LocationService;
import xyz.wongs.es.utils.CommonUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @create 2017-12-10 9:31
 **/
@Controller
@RequestMapping(value = "${adminPath}/core/location")
public class LocationController extends BaseController {

    @Autowired
    private LocationService locationService;

    @ModelAttribute("location")
    public Location get(@RequestParam(required=false) String id) {
        if (StringUtils.isNotBlank(id)){
            return locationService.get(id);
        }else{
            return new Location();
        }
    }

    @RequiresPermissions("area:location:view")
    @RequestMapping(value = {""})
    public String index(Location location, Model model) {
        return "core/area/locationIndex";
    }

    @RequiresPermissions("area:location:view")
    @RequestMapping(value = {"list"})
    public String list(Location location, Model model) {
        model.addAttribute("list", locationService.findList(location));
        return "core/area/locationList";
    }


    @RequiresPermissions("area:location:view")
    @RequestMapping(value = "form")
    public String form(Location location, Model model) {
        location.setParent(locationService.get(location.getParent().getId()));
        // 自动获取排序号
        if (StringUtils.isBlank(location.getId())&&location.getParent()!=null){
            int size = 0;
            List<Location> list = locationService.findList(location);
            for (int i=0; i<list.size(); i++){
                Location e = list.get(i);
                if (e.getParent()!=null && e.getParent().getId()!=null
                        && e.getParent().getId().equals(location.getParent().getId())){
                    size++;
                }
            }

        }
        model.addAttribute("location", location);
        return "core/area/locationForm";
    }

    @RequiresPermissions("area:location:edit")
    @RequestMapping(value = "save")
    public String save(Location location, Model model, RedirectAttributes redirectAttributes) {
        if(Global.isDemoMode()){
            addMessage(redirectAttributes, "演示模式，不允许操作！");
            return "redirect:" + adminPath + "/core/location/";
        }
        if (!beanValidator(model, location)){
            return form(location, model);
        }
        locationService.save(location);



        addMessage(redirectAttributes, "保存机构'" + location.getName() + "'成功");
        String id = "0".equals(location.getParentId()) ? "" : location.getParentId();
        return "redirect:" + adminPath + "/core/location/list?id="+id+"&parentIds="+location.getParentIds();
    }

    /**
     * 获取机构JSON数据。
     * @param response
     * @return
     */
    @RequiresPermissions("user")
    @ResponseBody
    @RequestMapping(value = "treeData")
    public List<Map<String, Object>> treeData(Location location,HttpServletRequest request,HttpServletResponse response) {
        List<Map<String, Object>> mapList = Lists.newArrayList();
        String rootId = location.getId();

        if(org.apache.commons.lang3.StringUtils.isEmpty(rootId)){
            location.setId("0");
        }
        List<Location> list = locationService.findList(location);
        if(!CommonUtil.valiList(list)){
            return mapList;
        }
        for (int i=0; i<list.size(); i++){
            Location e = list.get(i);

            Map<String, Object> map = Maps.newHashMap();
            map.put("id", e.getId());
            map.put("pId", e.getParentId());
            map.put("pIds", e.getParentIds());
            map.put("isParent", e.getIsParent());
            map.put("name", e.getName());
            mapList.add(map);
        }
        return mapList;
    }
}
