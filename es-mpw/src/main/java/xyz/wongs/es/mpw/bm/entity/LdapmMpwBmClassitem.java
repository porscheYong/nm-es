package xyz.wongs.es.mpw.bm.entity;

import xyz.wongs.es.common.persistence.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

public class LdapmMpwBmClassitem extends DataEntity<LdapmMpwBmClassitem> {
    private Integer monthId;

    private String unitId;

    private String name2;

    private String name3;

    private String name4;

    private String name5;

    private String name6;

    private String pkGroup;

    private String pkOrg;

    private String pkClassitem;

    private String pkBmClass;

    private String cyear;

    private String cperiod;

    private String pkBmItem;

    private String itemkey;

    private String name;

    private String vformula;

    private String vformulastr;

    private BigDecimal icomputeseq;

    private BigDecimal idisplayseq;

    private String istransfer;

    private String destitempk;

    private String destitemcol;

    private String showflag;

    private String issysformula;

    private BigDecimal roundType;

    private String categoryId;

    private BigDecimal iflddecimal;

    private String hrssdisplay;

    private BigDecimal ifromflag;

    private String clearflag;

    private String creator;

    private String creationtime;

    private String modifier;

    private String modifiedtime;

    private BigDecimal ifldwidth;

    private String isassigned;

    private String modifyflag;

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

    public String getPkClassitem() {
        return pkClassitem;
    }

    public void setPkClassitem(String pkClassitem) {
        this.pkClassitem = pkClassitem == null ? null : pkClassitem.trim();
    }

    public String getPkBmClass() {
        return pkBmClass;
    }

    public void setPkBmClass(String pkBmClass) {
        this.pkBmClass = pkBmClass == null ? null : pkBmClass.trim();
    }

    public String getCyear() {
        return cyear;
    }

    public void setCyear(String cyear) {
        this.cyear = cyear == null ? null : cyear.trim();
    }

    public String getCperiod() {
        return cperiod;
    }

    public void setCperiod(String cperiod) {
        this.cperiod = cperiod == null ? null : cperiod.trim();
    }

    public String getPkBmItem() {
        return pkBmItem;
    }

    public void setPkBmItem(String pkBmItem) {
        this.pkBmItem = pkBmItem == null ? null : pkBmItem.trim();
    }

    public String getItemkey() {
        return itemkey;
    }

    public void setItemkey(String itemkey) {
        this.itemkey = itemkey == null ? null : itemkey.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(String istransfer) {
        this.istransfer = istransfer == null ? null : istransfer.trim();
    }

    public String getDestitempk() {
        return destitempk;
    }

    public void setDestitempk(String destitempk) {
        this.destitempk = destitempk == null ? null : destitempk.trim();
    }

    public String getDestitemcol() {
        return destitemcol;
    }

    public void setDestitemcol(String destitemcol) {
        this.destitemcol = destitemcol == null ? null : destitemcol.trim();
    }

    public String getShowflag() {
        return showflag;
    }

    public void setShowflag(String showflag) {
        this.showflag = showflag == null ? null : showflag.trim();
    }

    public String getIssysformula() {
        return issysformula;
    }

    public void setIssysformula(String issysformula) {
        this.issysformula = issysformula == null ? null : issysformula.trim();
    }

    public BigDecimal getRoundType() {
        return roundType;
    }

    public void setRoundType(BigDecimal roundType) {
        this.roundType = roundType;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public BigDecimal getIflddecimal() {
        return iflddecimal;
    }

    public void setIflddecimal(BigDecimal iflddecimal) {
        this.iflddecimal = iflddecimal;
    }

    public String getHrssdisplay() {
        return hrssdisplay;
    }

    public void setHrssdisplay(String hrssdisplay) {
        this.hrssdisplay = hrssdisplay == null ? null : hrssdisplay.trim();
    }

    public BigDecimal getIfromflag() {
        return ifromflag;
    }

    public void setIfromflag(BigDecimal ifromflag) {
        this.ifromflag = ifromflag;
    }

    public String getClearflag() {
        return clearflag;
    }

    public void setClearflag(String clearflag) {
        this.clearflag = clearflag == null ? null : clearflag.trim();
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

    public BigDecimal getIfldwidth() {
        return ifldwidth;
    }

    public void setIfldwidth(BigDecimal ifldwidth) {
        this.ifldwidth = ifldwidth;
    }

    public String getIsassigned() {
        return isassigned;
    }

    public void setIsassigned(String isassigned) {
        this.isassigned = isassigned == null ? null : isassigned.trim();
    }

    public String getModifyflag() {
        return modifyflag;
    }

    public void setModifyflag(String modifyflag) {
        this.modifyflag = modifyflag == null ? null : modifyflag.trim();
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

}