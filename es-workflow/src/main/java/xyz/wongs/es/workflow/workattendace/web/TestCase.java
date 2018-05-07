package xyz.wongs.es.workflow.workattendace.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.workflow.user.entity.AtiUser;
import xyz.wongs.es.workflow.user.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by liuxiaodong on 2018/5/3.
 */
@Controller
@RequestMapping(value = "${adminPath}/testCase/")
public class TestCase {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/treeCheckBox")
    public String  testTreeCheckBox() {
        return "workflow/tree";
    }

    @RequestMapping(value = "/userCheckBox")
    public String testUserCheckBox(Model model) {
        List<AtiUser> users = userService.getUsers();
        model.addAttribute("users",users);
        return "workflow/userCheckBox";
    }

    @ResponseBody
    @RequestMapping(value = "getUsers")
    public String[] testGetUserList(HttpServletRequest request) {
        Map map = request.getParameterMap();

        String[] items = (String[])map.get("atiUserId");

        return items;
    }

}
