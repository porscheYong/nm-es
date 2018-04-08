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
    private Integer counts;

    /**
     *  数据日期
     */
    private Integer monthId;

    /**
     * 接口数据文件的生成时间
     */
    private String cDate;
}
