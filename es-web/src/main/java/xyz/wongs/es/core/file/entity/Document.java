package xyz.wongs.es.core.file.entity;

import xyz.wongs.es.common.persistence.DataEntity;

/**
 * @Description : FTP文件解析实体
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/21 13:39
 * @Modified By :
 **/
public class Document extends DataEntity<Document> {

    public Document(){

    }

    public Document(String shortName,String name, String path,String createTime, Short flag) {
        this.shortName=shortName;
        this.name = name;
        this.path = path;
        this.createTime = createTime;
        this.flag = flag;
    }

    public Document(String shortName,
                    String name,String monthId,
                    String path,Short flag, String createTime) {
        this.shortName=shortName;
        this.name = name;
        this.monthId=monthId;
        this.path = path;
        this.createTime=createTime;
        this.flag = flag;
    }

    public Document(String shortName,
                    String name,String monthId,
                    String path, String md5, Long counts,
                    Long exuCounts,Short flag,
                    String statuscode,String errmsg,String createTime) {
        this.shortName=shortName;
        this.name = name;
        this.monthId=monthId;
        this.path = path;
        this.md5 = md5;
        this.counts = counts;
        this.exuCounts=exuCounts;
        this.flag = flag;
        this.statuscode=statuscode;
        this.errmsg=errmsg;
        this.createTime=createTime;
    }

    /**
     * Oracle 伪列
     */
    private String id;

    private String shortName;

    private String name;

    private String monthId;

    private String path;

    private String md5;

    private Long counts;

    private Long exuCounts;

    private Short flag;

    private String statuscode;

    private String errmsg;

    private String createTime;


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMonthId() {
        return monthId;
    }

    public void setMonthId(String monthId) {
        this.monthId = monthId == null ? null : monthId.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public Long getCounts() {
        return counts;
    }

    public void setCounts(Long counts) {
        this.counts = counts;
    }

    public Long getExuCounts() {
        return exuCounts;
    }

    public void setExuCounts(Long exuCounts) {
        this.exuCounts = exuCounts;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode == null ? null : statuscode.trim();
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg == null ? null : errmsg.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    @Override
    public String toString() {
        return "Document{" +
                "shortName='" + shortName + '\'' +
                ", name='" + name + '\'' +
                ", monthId='" + monthId + '\'' +
                ", path='" + path + '\'' +
                ", md5='" + md5 + '\'' +
                '}';
    }
}
