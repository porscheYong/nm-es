package xyz.wongs.es.core.area.entity;

import xyz.wongs.es.common.persistence.TreeEntity;
import org.hibernate.validator.constraints.Length;

/**
 * @author
 * @create 2017-12-10 8:55
 **/
public class Location extends TreeEntity<Location> {

    private static final long serialVersionUID = 1L;

    private String localCode;

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(int cns) {
        this.isParent = cns==0?false:true;
        //this.open = open;
    }

    private Boolean isParent;


    @Length(min=12, max=15)
    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    @Override
    public Location getParent() {
        return parent;
    }

    @Override
    public void setParent(Location parent) {
        this.parent=parent;
    }


}
