package xyz.wongs.es.core;

/**
 * @Description :  枚举值，用以区分测试环境和生产环境
 * @author: WCNGS@QQ.COM
 * @create: 2017/12/21 11:27
 * @Modified By : wyong
 **/
public enum EnumEvn {

    TEST(false,"test"), PRO(true,"pro");

    private Boolean flag;
    private String type;

    private EnumEvn(Boolean flag,String type) {
        this.type = type;
        this.flag=flag;
    }

    /**
     * 测试环境的枚举值，默认为测试环境
     * @method      getName
     * @author      WCNGS@QQ.COM
     * @version
     * @see
     * @param type
     * @return      java.lang.Boolean
     * @exception
     * @date        2018/1/23 13:11
     */
    public static Boolean getName(String type) {

        for (EnumEvn c : EnumEvn.values()) {
            if (c.getType().equals(type)) {
                return c.flag;
            }
        }
        return false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
