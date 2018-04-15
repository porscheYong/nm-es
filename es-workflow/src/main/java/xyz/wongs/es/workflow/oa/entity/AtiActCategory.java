package xyz.wongs.es.workflow.oa.entity;

import java.io.Serializable;

/**
 *流程分类Entity
 * @author liuxiaodong
 * @date 2018/4/11
 */
public class AtiActCategory implements Serializable{

    private static final long serialVersionUID = 6460660250696911169L;

    private Long atiActCategoryId;

    private Long parentCategoryId;

    private String categoryCode;

    private String name;

    public Long getAtiActCategoryId() {
        return atiActCategoryId;
    }

    public void setAtiActCategoryId(Long atiActCategoryId) {
        this.atiActCategoryId = atiActCategoryId;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
