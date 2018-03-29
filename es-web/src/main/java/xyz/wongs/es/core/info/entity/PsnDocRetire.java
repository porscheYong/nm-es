package xyz.wongs.es.core.info.entity;

import org.hibernate.validator.constraints.Length;
import xyz.wongs.es.common.persistence.BaseEntity;

/**
 * @Description : 离退情况
 * @author: WCNGS@QQ.COM
 * @create 2017-12-19 14:58
 * @Modified By :
 **/
public class PsnDocRetire extends BaseEntity {

    /**
     * Oracle 伪列
     */
    private String id;

    private String glbdef4;


    private String glbdef5;

    private String memo;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Length(min=1, max=128)
    public String getGlbdef4() {
        return glbdef4;
    }

    public void setGlbdef4(String glbdef4) {
        this.glbdef4 = glbdef4;
    }

    @Length(min=1, max=128)
    public String getGlbdef5() {
        return glbdef5;
    }

    public void setGlbdef5(String glbdef5) {
        this.glbdef5 = glbdef5;
    }


    @Length(min=1, max=1536)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
