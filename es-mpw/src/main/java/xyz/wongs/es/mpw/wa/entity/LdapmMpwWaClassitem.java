package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;

public class LdapmMpwWaClassitem extends DataEntity<LdapmMpwWaClassitem> {
    private Integer monthId;

    private String unitId;

    private BigDecimal bankaccount;

    private String categoryId;

    private String clearflag;

    private String cperiod;

    private String creationtime;

    private String creator;

    private String cyear;

    private String destitemcol;

    private String destitempk;

    private Long dr;

    private BigDecimal icomputeseq;

    private BigDecimal idisplayseq;

    private BigDecimal iflddecimal;

    private BigDecimal ifromflag;

    private String inapproveditem;

    private String issysformula;

    private String istransfer;

    private String itemkey;

    private String modifiedtime;

    private String modifier;

    private String name;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private String name6;

    private BigDecimal npsnceil;

    private BigDecimal npsnfloor;

    private BigDecimal nsumceil;

    private BigDecimal nsumfloor;

    private String pkGroup;

    private String pkOrg;

    private String pkWaClass;

    private String pkWaClassitem;

    private String pkWaItem;

    private String psnceilflag;

    private String psnfloorflag;

    private BigDecimal roundType;

    private String showflag;

    private String sumceilflag;

    private String sumfloorflag;

    private String taxflag;

    private String ts;

    private String vformula;

    private String vformulastr;

    private String includeitemflag;

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

    public BigDecimal getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(BigDecimal bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getClearflag() {
        return clearflag;
    }

    public void setClearflag(String clearflag) {
        this.clearflag = clearflag == null ? null : clearflag.trim();
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod == null ? null : cperiod.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCyear() {
        return cyear;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear == null ? null : cyear.trim();
    }

    public String getDestitemcol() {
        return destitemcol;
    }

    public void setDestitemcol(String destitemcol) {
        this.destitemcol = destitemcol == null ? null : destitemcol.trim();
    }

    public String getDestitempk() {
        return destitempk;
    }

    public void setDestitempk(String destitempk) {
        this.destitempk = destitempk == null ? null : destitempk.trim();
    }

    public Long getDr() {
        return dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public BigDecimal getIcomputeseq() {
        return icomputeseq;
    }

    public void setIcomputeseq(BigDecimal icomputeseq) {
        this.icomputeseq = icomputeseq;
    }

    public BigDecimal getIdisplayseq() {
        return idisplayseq;
    }

    public void setIdisplayseq(BigDecimal idisplayseq) {
        this.idisplayseq = idisplayseq;
    }

    public BigDecimal getIflddecimal() {
        return iflddecimal;
    }

    public void setIflddecimal(BigDecimal iflddecimal) {
        this.iflddecimal = iflddecimal;
    }

    public BigDecimal getIfromflag() {
        return ifromflag;
    }

    public void setIfromflag(BigDecimal ifromflag) {
        this.ifromflag = ifromflag;
    }

    public String getInapproveditem() {
        return inapproveditem;
    }

    public void setInapproveditem(String inapproveditem) {
        this.inapproveditem = inapproveditem == null ? null : inapproveditem.trim();
    }

    public String getIssysformula() {
        return issysformula;
    }

    public void setIssysformula(String issysformula) {
        this.issysformula = issysformula == null ? null : issysformula.trim();
    }

    public String getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(String istransfer) {
        this.istransfer = istransfer == null ? null : istransfer.trim();
    }

    public String getItemkey() {
        return itemkey;
    }

    public void setItemkey(String itemkey) {
        this.itemkey = itemkey == null ? null : itemkey.trim();
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public BigDecimal getNpsnceil() {
        return npsnceil;
    }

    public void setNpsnceil(BigDecimal npsnceil) {
        this.npsnceil = npsnceil;
    }

    public BigDecimal getNpsnfloor() {
        return npsnfloor;
    }

    public void setNpsnfloor(BigDecimal npsnfloor) {
        this.npsnfloor = npsnfloor;
    }

    public BigDecimal getNsumceil() {
        return nsumceil;
    }

    public void setNsumceil(BigDecimal nsumceil) {
        this.nsumceil = nsumceil;
    }

    public BigDecimal getNsumfloor() {
        return nsumfloor;
    }

    public void setNsumfloor(BigDecimal nsumfloor) {
        this.nsumfloor = nsumfloor;
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

    public String getPkWaClass() {
        return pkWaClass;
    }

    public void setPkWaClass(String pkWaClass) {
        this.pkWaClass = pkWaClass == null ? null : pkWaClass.trim();
    }

    public String getPkWaClassitem() {
        return pkWaClassitem;
    }

    public void setPkWaClassitem(String pkWaClassitem) {
        this.pkWaClassitem = pkWaClassitem == null ? null : pkWaClassitem.trim();
    }

    public String getPkWaItem() {
        return pkWaItem;
    }

    public void setPkWaItem(String pkWaItem) {
        this.pkWaItem = pkWaItem == null ? null : pkWaItem.trim();
    }

    public String getPsnceilflag() {
        return psnceilflag;
    }

    public void setPsnceilflag(String psnceilflag) {
        this.psnceilflag = psnceilflag == null ? null : psnceilflag.trim();
    }

    public String getPsnfloorflag() {
        return psnfloorflag;
    }

    public void setPsnfloorflag(String psnfloorflag) {
        this.psnfloorflag = psnfloorflag == null ? null : psnfloorflag.trim();
    }

    public BigDecimal getRoundType() {
        return roundType;
    }

    public void setRoundType(BigDecimal roundType) {
        this.roundType = roundType;
    }

    public String getShowflag() {
        return showflag;
    }

    public void setShowflag(String showflag) {
        this.showflag = showflag == null ? null : showflag.trim();
    }

    public String getSumceilflag() {
        return sumceilflag;
    }

    public void setSumceilflag(String sumceilflag) {
        this.sumceilflag = sumceilflag == null ? null : sumceilflag.trim();
    }

    public String getSumfloorflag() {
        return sumfloorflag;
    }

    public void setSumfloorflag(String sumfloorflag) {
        this.sumfloorflag = sumfloorflag == null ? null : sumfloorflag.trim();
    }

    public String getTaxflag() {
        return taxflag;
    }

    public void setTaxflag(String taxflag) {
        this.taxflag = taxflag == null ? null : taxflag.trim();
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
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

    public String getIncludeitemflag() {
        return includeitemflag;
    }

    public void setIncludeitemflag(String includeitemflag) {
        this.includeitemflag = includeitemflag == null ? null : includeitemflag.trim();
    }
}