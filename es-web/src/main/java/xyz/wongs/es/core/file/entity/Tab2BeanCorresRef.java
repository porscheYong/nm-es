package xyz.wongs.es.core.file.entity;

import xyz.wongs.es.common.persistence.DataEntity;

/**
 * @Description : 集团人力表、ServiceBean、EntityBean对应关系，用于数据入库解析
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/27 9:57
 * @Modified By :
 **/
public class Tab2BeanCorresRef extends DataEntity<Tab2BeanCorresRef> {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表描述
     */
    private String tableDesc;

    /**
     * 业务Service名称 用于Ioc
     */
    private String serviceName;

    /**
     * 实体Bean的全名称，用于反射，动态赋值
     */
    private String entityName;

    /**
     * 是否按月下发的表
     */
    private String monthData;

    /**
     * 是否按日下发的表
     */
    private String dayData;

    private String monthId;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getTableDesc() {
        return tableDesc;
    }

    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc == null ? null : tableDesc.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }

    public String getMonthData() {
        return monthData;
    }

    public void setMonthData(String monthData) {
        this.monthData = monthData == null ? null : monthData.trim();
    }

    public String getDayData() {
        return dayData;
    }

    public void setDayData(String dayData) {
        this.dayData = dayData == null ? null : dayData.trim();
    }

    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId;
    }

    @Override
    public String toString() {
        return "Tab2BeanCorresRef{" +
                "tableName='" + tableName + '\'' +
                ", tableDesc='" + tableDesc + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", entityName='" + entityName + '\'' +
                ", monthData='" + monthData + '\'' +
                ", dayData='" + dayData + '\'' +
                ", monthId='" + monthId + '\'' +
                '}';
    }
}