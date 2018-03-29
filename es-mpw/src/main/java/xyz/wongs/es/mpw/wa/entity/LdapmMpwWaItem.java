package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaItem extends DataEntity<LdapmMpwWaItem> {
    private Integer monthId;

    private String unitId;

    private BigDecimal npsnceil;

    private String psnfloorflag;

    private BigDecimal npsnfloor;

    private BigDecimal ifldwidth;

    private String totalitem;

    private String intotalitem;

    private BigDecimal idisplayseq;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private String name6;

    private String pkWaItem;

    private String code;

    private String name;

    private String pkGroup;

    private String pkOrg;

    private String creator;

    private String creationtime;

    private String modifier;

    private String modifiedtime;

    private String categoryId;

    private String mid;

    private String itemkey;

    private BigDecimal iitemtype;

    private String defaultflag;

    private BigDecimal iproperty;

    private BigDecimal iflddecimal;

    private BigDecimal iprivil;

    private String isinhi;

    private BigDecimal ifromflag;

    private String taxflag;

    private String vformula;

    private String vformulastr;

    private String clearflag;

    private String sumceilflag;

    private BigDecimal nsumceil;

    private String sumfloorflag;

    private BigDecimal nsumfloor;

    private String psnceilflag;

    private String ts;

    private Long dr;

    private String pkBudgetItem;


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

    public BigDecimal getNpsnceil() {
        return npsnceil;
    }

    public void setNpsnceil(BigDecimal npsnceil) {
        this.npsnceil = npsnceil;
    }

    public String getPsnfloorflag() {
        return psnfloorflag;
    }

    public void setPsnfloorflag(String psnfloorflag) {
        this.psnfloorflag = psnfloorflag == null ? null : psnfloorflag.trim();
    }

    public BigDecimal getNpsnfloor() {
        return npsnfloor;
    }

    public void setNpsnfloor(BigDecimal npsnfloor) {
        this.npsnfloor = npsnfloor;
    }

    public BigDecimal getIfldwidth() {
        return ifldwidth;
    }

    public void setIfldwidth(BigDecimal ifldwidth) {
        this.ifldwidth = ifldwidth;
    }

    public String getTotalitem() {
        return totalitem;
    }

    public void setTotalitem(String totalitem) {
        this.totalitem = totalitem == null ? null : totalitem.trim();
    }

    public String getIntotalitem() {
        return intotalitem;
    }

    public void setIntotalitem(String intotalitem) {
        this.intotalitem = intotalitem == null ? null : intotalitem.trim();
    }

    public BigDecimal getIdisplayseq() {
        return idisplayseq;
    }

    public void setIdisplayseq(BigDecimal idisplayseq) {
        this.idisplayseq = idisplayseq;
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

    public String getPkWaItem() {
        return pkWaItem;
    }

    public void setPkWaItem(String pkWaItem) {
        this.pkWaItem = pkWaItem == null ? null : pkWaItem.trim();
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

    public String getPkGroup() {
        return pkGroup;
    }

    public void setPkGroup(String pkGroup) {
        this.pkGroup = pkGroup == null ? null : pkGroup.trim();
    }

    public String getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(String pkOrg) {
        this.pkOrg = pkOrg == null ? null : pkOrg.trim();
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getItemkey() {
        return itemkey;
    }

    public void setItemkey(String itemkey) {
        this.itemkey = itemkey == null ? null : itemkey.trim();
    }

    public BigDecimal getIitemtype() {
        return iitemtype;
    }

    public void setIitemtype(BigDecimal iitemtype) {
        this.iitemtype = iitemtype;
    }

    public String getDefaultflag() {
        return defaultflag;
    }

    public void setDefaultflag(String defaultflag) {
        this.defaultflag = defaultflag == null ? null : defaultflag.trim();
    }

    public BigDecimal getIproperty() {
        return iproperty;
    }

    public void setIproperty(BigDecimal iproperty) {
        this.iproperty = iproperty;
    }

    public BigDecimal getIflddecimal() {
        return iflddecimal;
    }

    public void setIflddecimal(BigDecimal iflddecimal) {
        this.iflddecimal = iflddecimal;
    }

    public BigDecimal getIprivil() {
        return iprivil;
    }

    public void setIprivil(BigDecimal iprivil) {
        this.iprivil = iprivil;
    }

    public String getIsinhi() {
        return isinhi;
    }

    public void setIsinhi(String isinhi) {
        this.isinhi = isinhi == null ? null : isinhi.trim();
    }

    public BigDecimal getIfromflag() {
        return ifromflag;
    }

    public void setIfromflag(BigDecimal ifromflag) {
        this.ifromflag = ifromflag;
    }

    public String getTaxflag() {
        return taxflag;
    }

    public void setTaxflag(String taxflag) {
        this.taxflag = taxflag == null ? null : taxflag.trim();
    }

    public String getVformula() {
        return vformula;
    }

    public void setVformula(String vformula) {
        this.vformula = vformula == null ? null : vformula.trim();
    }

    public String getVformulastr() {
        return vformulastr;
    }

    public void setVformulastr(String vformulastr) {
        this.vformulastr = vformulastr == null ? null : vformulastr.trim();
    }

    public String getClearflag() {
        return clearflag;
    }

    public void setClearflag(String clearflag) {
        this.clearflag = clearflag == null ? null : clearflag.trim();
    }

    public String getSumceilflag() {
        return sumceilflag;
    }

    public void setSumceilflag(String sumceilflag) {
        this.sumceilflag = sumceilflag == null ? null : sumceilflag.trim();
    }

    public BigDecimal getNsumceil() {
        return nsumceil;
    }

    public void setNsumceil(BigDecimal nsumceil) {
        this.nsumceil = nsumceil;
    }

    public String getSumfloorflag() {
        return sumfloorflag;
    }

    public void setSumfloorflag(String sumfloorflag) {
        this.sumfloorflag = sumfloorflag == null ? null : sumfloorflag.trim();
    }

    public BigDecimal getNsumfloor() {
        return nsumfloor;
    }

    public void setNsumfloor(BigDecimal nsumfloor) {
        this.nsumfloor = nsumfloor;
    }

    public String getPsnceilflag() {
        return psnceilflag;
    }

    public void setPsnceilflag(String psnceilflag) {
        this.psnceilflag = psnceilflag == null ? null : psnceilflag.trim();
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

    public String getPkBudgetItem() {
        return pkBudgetItem;
    }

    public void setPkBudgetItem(String pkBudgetItem) {
        this.pkBudgetItem = pkBudgetItem == null ? null : pkBudgetItem.trim();
    }
}