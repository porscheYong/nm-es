/**
 * Copyright &copy; 2012-2016 <a href="https://wongs.xyz">UECC</a> All rights reserved.
 */
package xyz.wongs.es.modules.gen.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import xyz.wongs.es.common.persistence.Page;
import xyz.wongs.es.common.utils.StringUtils;
import xyz.wongs.es.common.web.BaseController;
import xyz.wongs.es.modules.sys.entity.User;
import xyz.wongs.es.modules.sys.utils.UserUtils;
import xyz.wongs.es.modules.gen.entity.GenTemplate;
import xyz.wongs.es.modules.gen.service.GenTemplateService;

/**
 * 代码模板Controller
 * @author WCNGS@QQ.COM
 * @version 2013-10-15
 */
@Controller
@RequestMapping(value = "${adminPath}/gen/genTemplate")
public class GenTemplateController extends BaseController {

	@Autowired
	private GenTemplateService genTemplateService;
	
	@ModelAttribute
	public GenTemplate get(@RequestParam(required=false) String id) {
		if (StringUtils.isNotBlank(id)){
			return genTemplateService.get(id);
		}else{
			return new GenTemplate();
		}
	}
	
	@RequiresPermissions("gen:genTemplate:view")
	@RequestMapping(value = {"list", ""})
	public String list(GenTemplate genTemplate, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user = UserUtils.getUser();
		if (!user.isAdmin()){
			genTemplate.setCreateBy(user);
		}
        Page<GenTemplate> page = genTemplateService.find(new Page<GenTemplate>(request, response), genTemplate); 
        model.addAttribute("page", page);
		return "modules/gen/genTemplateList";
	}

	@RequiresPermissions("gen:genTemplate:view")
	@RequestMapping(value = "form")
	public String form(GenTemplate genTemplate, Model model) {
		model.addAttribute("genTemplate", genTemplate);
		return "modules/gen/genTemplateForm";
	}

	@RequiresPermissions("gen:genTemplate:edit")
	@RequestMapping(value = "save")
	public String save(GenTemplate genTemplate, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, genTemplate)){
			return form(genTemplate, model);
		}
		genTemplateService.save(genTemplate);
		addMessage(redirectAttributes, "保存代码模板'" + genTemplate.getName() + "'成功");
		return "redirect:" + adminPath + "/gen/genTemplate/?repage";
	}
	
	@RequiresPermissions("gen:genTemplate:edit")
	@RequestMapping(value = "delete")
	public String delete(GenTemplate genTemplate, RedirectAttributes redirectAttributes) {
		genTemplateService.delete(genTemplate);
		addMessage(redirectAttributes, "删除代码模板成功");
		return "redirect:" + adminPath + "/gen/genTemplate/?repage";
	}

}
