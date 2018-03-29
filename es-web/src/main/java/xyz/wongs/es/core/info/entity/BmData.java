package xyz.wongs.es.core.info.entity;

import xyz.wongs.es.common.persistence.BaseEntity;
import org.hibernate.validator.constraints.Length;

/**
 * @Description : 社保信息
 * @author: WCNGS@QQ.COM
 * @create 2017-12-19 14:27
 * @Modified By :
 **/
public class BmData  extends BaseEntity {


    /**
     * Oracle 伪列
     */
    private String id;

    private String bmAccountNo;



    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }


    @Length(min=1, max=40)
    public String getBmAccountNo() {
        return bmAccountNo;
    }


    /**
     * @Author: WCNGS@QQ.COM
     * @Date: 2017/12/20 13:48
     * @Description:
     * @param bmAccountNo
     * @Mod:
     */
    public void setBmAccountNo(String bmAccountNo) {

        this.bmAccountNo = bmAccountNo;

    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
