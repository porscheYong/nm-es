package xyz.wongs.es.mpw.wa.entity;

import xyz.wongs.es.common.persistence.DataEntity;

public class LdapmMpwWaTaxgroup extends DataEntity<LdapmMpwWaTaxgroup> {
    private Integer monthId;

    private String unitId;

    private String pkTaxgroup;

    private String ccomment;

    private String cgroupname;

    private String pkCountry;

    private String pkGroup;

    private String pkOrg;

    private String syscreateflag;

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

    public String getPkTaxgroup() {
        return pkTaxgroup;
    }

    public void setPkTaxgroup(String pkTaxgroup) {
        this.pkTaxgroup = pkTaxgroup == null ? null : pkTaxgroup.trim();
    }

    public String getCcomment() {
        return ccomment;
    }

    public void setCcomment(String ccomment) {
        this.ccomment = ccomment == null ? null : ccomment.trim();
    }

    public String getCgroupname() {
        return cgroupname;
    }

    public void setCgroupname(String cgroupname) {
        this.cgroupname = cgroupname == null ? null : cgroupname.trim();
    }

    public String getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(String pkCountry) {
        this.pkCountry = pkCountry == null ? null : pkCountry.trim();
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

    public String getSyscreateflag() {
        return syscreateflag;
    }

    public void setSyscreateflag(String syscreateflag) {
        this.syscreateflag = syscreateflag == null ? null : syscreateflag.trim();
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