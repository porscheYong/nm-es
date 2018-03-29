package xyz.wongs.es.core.file.web;

import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.core.file.entity.Tab2BeanCorresRef;
import xyz.wongs.es.core.file.service.Tab2BeanCorresRefService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description :
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/26 11:09
 * @Modified By :
 **/
@Controller
@RequestMapping(value = "${adminPath}/mpw/bean")
public class Tab2BeanCorresRefController extends BaseController {

    @Autowired
    private Tab2BeanCorresRefService tab2BeanCorresRefService;


    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"/",""})
    public String index() {
        return "mpw/setting/beanList";
    }


    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"list"})
    public String list(Tab2BeanCorresRef tab2BeanCorresRef, HttpServletRequest request, HttpServletResponse response, Model model) {
        String url = "mpw/setting/beanList";
        if(tab2BeanCorresRef==null) {
            return url;
        }
        Page<Tab2BeanCorresRef> page = tab2BeanCorresRefService.findPage(new Page<Tab2BeanCorresRef>(request, response), tab2BeanCorresRef);
        model.addAttribute("page", page);
        return url;
    }

    @RequiresPermissions("mpw:setting:view")
    @RequestMapping(value = {"form"})
    public String form(Tab2BeanCorresRef tab2BeanCorresRef, Model model) {


        return "redirect:" + adminPath + "/mpw/bean/";
    }

    @RequiresPermissions("mpw:setting:edit")
    @RequestMapping(value = {"delete"})
    public void delete(Tab2BeanCorresRef tab2BeanCorresRef, Model model) {


    }

    @RequiresPermissions("mpw:setting:edit")
    @RequestMapping(value = {"save"})
    public void save(Tab2BeanCorresRef tab2BeanCorresRef, Model model) {


    }
}
