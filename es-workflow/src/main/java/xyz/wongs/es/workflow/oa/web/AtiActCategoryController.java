package xyz.wongs.es.workflow.oa.web;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.workflow.oa.entity.AtiActCategory;
import xyz.wongs.es.workflow.oa.entity.ResponseResult;
import xyz.wongs.es.workflow.oa.service.AtiActCategoryService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 *
 * @author liuxiaodong
 * @date 2018/5/2
 */
@Controller
@RequestMapping(value = "${adminPath}/oa/category")
public class AtiActCategoryController extends BaseController {

    @Resource
    private AtiActCategoryService atiActCategoryService;
    @Resource
    private RepositoryService repositoryService;


    /**
     * 获取所有流程分类
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/findAllCategory")
    public ResponseResult<List<AtiActCategory>> findAllCategory() {
        ResponseResult<List<AtiActCategory>> list = new ResponseResult<List<AtiActCategory>>();
        list.setData(atiActCategoryService.findAllCategory());
        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/findAllDefinition")
    public ResponseResult<List<Map<String,Object>>> findAllDefinition(String atiActCategoryId) {
        ResponseResult<List<Map<String,Object>>> result = new ResponseResult<List<Map<String,Object>>>();
        List<Map<String,Object>> list = atiActCategoryService.getProcessDefinitionByCategoryId(atiActCategoryId);
        result.setData(list);
        return result;
    }

    /**
     * 获取分类JSON数据
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/treeData")
    public List<Map<String, Object>> treeData() {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        List<AtiActCategory> list = atiActCategoryService.findAllCategory();
        for (int i=0; i<list.size(); i++){
            AtiActCategory category = list.get(i);

            Map<String, Object> map = Maps.newHashMap();
            map.put("id", category.getAtiActCategoryId());
            map.put("pId", category.getParentCategoryId());
            map.put("pIds", atiActCategoryService.getCategoryPids(list,category));
            map.put("name", category.getName());
            map.put("isParent",true);

            mapList.add(map);

        }
        return mapList;
    }


    /**
     * 被流程树调用，显示具体流程
     * @param atiActCategoryId
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/treeDataProcDef")
    public List<Map<String, Object>> treeData(@RequestParam(required=false) String atiActCategoryId, HttpServletResponse response) {
        List<Map<String, Object>> mapList = Lists.newArrayList();
        List<ProcessDefinition> list = repositoryService.createProcessDefinitionQuery().processDefinitionCategory(atiActCategoryId).list();
        for (int i=0; i<list.size(); i++){
            ProcessDefinition p = list.get(i);
            Map<String, Object> map = Maps.newHashMap();
            map.put("id", "u_"+p.getId());
            map.put("pId", atiActCategoryId);
            map.put("name", StringUtils.replace(p.getName(), " ", ""));
            mapList.add(map);

        }
        return mapList;
    }
}
