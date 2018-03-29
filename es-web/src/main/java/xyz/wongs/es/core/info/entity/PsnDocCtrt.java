package xyz.wongs.es.core.info.entity;

import xyz.wongs.es.common.persistence.BaseEntity;
import org.hibernate.validator.constraints.Length;

/**
 * @Description : 人员合同信息
 * @author: WCNGS@QQ.COM
 * @create 2017-12-19 17:08
 * @Modified By :
 **/
public class PsnDocCtrt extends BaseEntity {


    /**
     * Oracle 伪列
     */
    private String id;

    private String contModel;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Length(min=1, max=4000)
    public String getContModel() {
        return contModel;
    }

    public void setContModel(String contModel) {
        this.contModel = contModel;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
