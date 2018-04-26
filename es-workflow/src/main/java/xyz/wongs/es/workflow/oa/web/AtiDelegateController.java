package xyz.wongs.es.workflow.oa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.oa.entity.AtiDelegateInfo;
import xyz.wongs.es.workflow.oa.service.AtiDelegateService;

import java.util.List;

/**
 * 任务委托 Controller
 * @author liuxiaodong
 * @date 2018/4/20
 */
@Controller
@RequestMapping(value = "/${adminPath}/oa/delegate")
public class AtiDelegateController extends BaseController {

    @Autowired
    private AtiDelegateService atiDelegateService;

    /**
     * 获取任务委托列表
     * @param assignee
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String getDelegateList(Object assignee,Model model) {
        assignee = "34";
        List<AtiDelegateInfo> delegateInfoList = atiDelegateService.getDelegateInfoList(assignee);
        model.addAttribute("delegateInfoList",delegateInfoList);
        return "modules/oa/atiDelegateList";
    }


    /**
     * 添加页面
     * @param delegateInfo
     * @param model
     * @return
     */
    @RequestMapping(value = "/add")
    public String addDelegateInfo(AtiDelegateInfo delegateInfo,Model model) {
        model.addAttribute("delegateInfo",delegateInfo);
        return "modules/oa/atiDelegate";
    }


    /**
     * 添加任务委托
     * @param atiDelegateInfo
     * @return
     */
    @RequestMapping(value = "/save")
    public String saveDelegateInfo(AtiDelegateInfo atiDelegateInfo) {

        atiDelegateService.saveDelegateInfo(atiDelegateInfo);

        return "redirect:" + adminPath + "/act/task/todo";

    }


    /**
     * 修改页面
     * @param delegateInfo
     * @param model
     * @return
     */
    @RequestMapping(value = "/modify")
    public String modify(AtiDelegateInfo delegateInfo,Model model) {
        model.addAttribute("delegateInfo",delegateInfo);
        return "modules/oa/atiDelegateUpdate";
    }

    /**
     * 更新委托信息
     * @param atiDelegateInfo
     * @return
     */
    @RequestMapping(value = "/modifyDelegateInfo")
    public String updateDelegateInfo(AtiDelegateInfo atiDelegateInfo) {

        atiDelegateService.updateDelegateInfo(atiDelegateInfo);

        return "modules/oa/atiDelegateList";
    }


    /**
     * 删除委托信息
     * @param atiDelegateInfo
     * @return
     */
    @RequestMapping(value = "/deleteDelegateInfo")
    public String updateDelegateInfoStatus(AtiDelegateInfo atiDelegateInfo) {

        atiDelegateService.updateDelegateInfoStatus(atiDelegateInfo);

        return "modules/oa/atiDelegateList";
    }


}
