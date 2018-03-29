package xyz.wongs.es.mpw.defdoc.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwDdDefdoclist extends DataEntity<LdapmMpwDdDefdoclist> {

    private Integer monthId;

    private String unitId;

    private String pkDefdoclist;

    private String pkOrg;

    private String pkGroup;

    private String docclass;

    private String code;

    private String name;

    private BigDecimal doctype;

    private String isgrade;

    private String coderule;

    private BigDecimal codectlgrade;

    private BigDecimal mngctlmode;

    private String isrelease;

    private BigDecimal doclevel;

    private String associatename;

    private String creator;

    private String creationtime;

    private String modifier;

    private String modifiedtime;

    private String funcode;

    private BigDecimal dataoriginflag;

    private String componentid;

    private String bpfcomponentid;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private String name6;

    private String ts;

    private Long dr;

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId == null ? null : unitId.trim();
    }

    public String getPkDefdoclist() {
        return pkDefdoclist;
    }

    public void setPkDefdoclist(String pkDefdoclist) {
        this.pkDefdoclist = pkDefdoclist == null ? null : pkDefdoclist.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
    }

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getDocclass() {
        return docclass;
    }

    public void setDocclass(String docclass) {
        this.docclass = docclass == null ? null : docclass.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getDoctype() {
        return doctype;
    }

    public void setDoctype(BigDecimal doctype) {
        this.doctype = doctype;
    }

    public String getIsgrade() {
        return isgrade;
    }

    public void setIsgrade(String isgrade) {
        this.isgrade = isgrade == null ? null : isgrade.trim();
    }

    public String getCoderule() {
        return coderule;
    }

    public void setCoderule(String coderule) {
        this.coderule = coderule == null ? null : coderule.trim();
    }

    public BigDecimal getCodectlgrade() {
        return codectlgrade;
    }

    public void setCodectlgrade(BigDecimal codectlgrade) {
        this.codectlgrade = codectlgrade;
    }

    public BigDecimal getMngctlmode() {
        return mngctlmode;
    }

    public void setMngctlmode(BigDecimal mngctlmode) {
        this.mngctlmode = mngctlmode;
    }

    public String getIsrelease() {
        return isrelease;
    }

    public void setIsrelease(String isrelease) {
        this.isrelease = isrelease == null ? null : isrelease.trim();
    }

    public BigDecimal getDoclevel() {
        return doclevel;
    }

    public void setDoclevel(BigDecimal doclevel) {
        this.doclevel = doclevel;
    }

    public String getAssociatename() {
        return associatename;
    }

    public void setAssociatename(String associatename) {
        this.associatename = associatename == null ? null : associatename.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getFuncode() {
        return funcode;
    }

    public void setFuncode(String funcode) {
        this.funcode = funcode == null ? null : funcode.trim();
    }

    public BigDecimal getDataoriginflag() {
        return dataoriginflag;
    }

    public void setDataoriginflag(BigDecimal dataoriginflag) {
        this.dataoriginflag = dataoriginflag;
    }

    public String getComponentid() {
        return componentid;
    }

    public void setComponentid(String componentid) {
        this.componentid = componentid == null ? null : componentid.trim();
    }

    public String getBpfcomponentid() {
        return bpfcomponentid;
    }

    public void setBpfcomponentid(String bpfcomponentid) {
        this.bpfcomponentid = bpfcomponentid == null ? null : bpfcomponentid.trim();
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2 == null ? null : name2.trim();
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3 == null ? null : name3.trim();
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4 == null ? null : name4.trim();
    }

    public String getName5() {
        return name5;
    }

    public void setName5(String name5) {
        this.name5 = name5 == null ? null : name5.trim();
    }

    public String getName6() {
        return name6;
    }

    public void setName6(String name6) {
        this.name6 = name6 == null ? null : name6.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }

    @Override
    public String toString() {
        return "LdapmMpwDdDefdoclist{" +
                "monthId=" + monthId +
                ", unitId='" + unitId + '\'' +
                ", pkDefdoclist='" + pkDefdoclist + '\'' +
                ", pkOrg='" + pkOrg + '\'' +
                ", pkGroup='" + pkGroup + '\'' +
                ", docclass='" + docclass + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", doctype=" + doctype +
                ", isgrade='" + isgrade + '\'' +
                ", coderule='" + coderule + '\'' +
                ", codectlgrade=" + codectlgrade +
                ", mngctlmode=" + mngctlmode +
                ", isrelease='" + isrelease + '\'' +
                ", doclevel=" + doclevel +
                ", associatename='" + associatename + '\'' +
                ", creator='" + creator + '\'' +
                ", creationtime='" + creationtime + '\'' +
                ", modifier='" + modifier + '\'' +
                ", modifiedtime='" + modifiedtime + '\'' +
                ", funcode='" + funcode + '\'' +
                ", dataoriginflag=" + dataoriginflag +
                ", componentid='" + componentid + '\'' +
                ", bpfcomponentid='" + bpfcomponentid + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", name4='" + name4 + '\'' +
                ", name5='" + name5 + '\'' +
                ", name6='" + name6 + '\'' +
                ", ts='" + ts + '\'' +
                ", dr=" + dr +
                '}';
    }
}