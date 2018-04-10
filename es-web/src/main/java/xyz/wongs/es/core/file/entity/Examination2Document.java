package xyz.wongs.es.core.file.entity;

/**
 * @author WCNGS@QQ.CO
 * @version V1.0
 * @Title:    校验集团宽表的检验文件实体，用于校验实际入库数量与校验文件之间的差异
 * @Package nm-es xyz.wongs.es.core.file.entity
 * @Description: TODO
 * @date 2018/4/8 16:00
 **/
public class Examination2Document {

    /**
     * 文件名
     */
    private String documentName;

    /**
     * 文件的大小（字节数）
     */
    private Integer size;

    /**
     * 文件中包含的记录数
     */
    private Long counts;

    /**
     *  数据日期
     */
    private Integer monthId;

    /**
     * 接口数据文件的生成时间
     */
    private String createDate;

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getCounts() {
        return counts;
    }

    public void setCounts(Long counts) {
        this.counts = counts;
    }

    public Integer getMonthId() {
        return monthId;
    }

    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }


    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Examination2Document{" +
                "documentName='" + documentName + '\'' +
                ", size=" + size +
                ", counts=" + counts +
                ", monthId=" + monthId +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
