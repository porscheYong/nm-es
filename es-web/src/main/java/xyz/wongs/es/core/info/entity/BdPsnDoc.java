package xyz.wongs.es.core.info.entity;

import xyz.wongs.es.common.persistence.BaseEntity;
import org.hibernate.validator.constraints.Length;

/**
 *
 */
public class BdPsnDoc extends BaseEntity {

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }

    /**
     * Oracle 伪列
     */
    private String id;

    /**
     * 紧急联系人姓名
     */
    private String glbdef7;


    /**
     *紧急联系人电话
     */
    private String glbdef8;


    /**
     * 本人户口地址
     */
    private String glbdef12;

    /**
     *家庭地址
     */
    private String glbdef13;
    /**
     * 家庭电话
     */
    private String homephone;

    /**
     *证件号码
     */
    private String certId;


    /**
     * 证件类型
     */
    private String idType;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 姓名
     */
    private String name;

    /**
     * 办公电话
     */
    private String officePhone;


    /**
     * 曾用名
     */
    private String usedName;

    /**
     * 国籍/地区
     */
    private String country;


    /**
     *档案所在地
     */
    private String fileAddress;

    /**
     * 姓名简拼
     */
    private String shortName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Length(min=1, max=128)
    public String getGlbdef7() {
        return glbdef7;
    }

    public void setGlbdef7(String glbdef7) {
        this.glbdef7 = glbdef7;
    }

    @Length(min=1, max=128)
    public String getGlbdef8() {
        return glbdef8;
    }

    public void setGlbdef8(String glbdef8) {
        this.glbdef8 = glbdef8;
    }

    @Length(min=1, max=250)
    public String getGlbdef12() {
        return glbdef12;
    }

    public void setGlbdef12(String glbdef12) {
        this.glbdef12 = glbdef12;
    }

    @Length(min=1, max=250)
    public String getGlbdef13() {
        return glbdef13;
    }

    public void setGlbdef13(String glbdef13) {
        this.glbdef13 = glbdef13;
    }

    @Length(min=1, max=30)
    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    @Length(min=1, max=50)
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    @Length(min=1, max=100)
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    @Length(min=1, max=34)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Length(min=1, max=300)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Length(min=1, max=30)
    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    @Length(min=1, max=300)
    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }


    @Length(min=1, max=50)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Length(min=1, max=192)
    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }


    @Length(min=1, max=200)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "BdPsnDoc{" +
                "id='" + id + '\'' +
                ", glbdef7='" + glbdef7 + '\'' +
                ", glbdef8='" + glbdef8 + '\'' +
                ", glbdef12='" + glbdef12 + '\'' +
                ", glbdef13='" + glbdef13 + '\'' +
                ", homephone='" + homephone + '\'' +
                ", certId='" + certId + '\'' +
                ", idType='" + idType + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", usedName='" + usedName + '\'' +
                ", country='" + country + '\'' +
                ", fileAddress='" + fileAddress + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}

