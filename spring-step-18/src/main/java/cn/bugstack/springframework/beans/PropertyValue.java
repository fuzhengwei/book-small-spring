package cn.bugstack.springframework.beans;

/**
 *
 * @description Bean 属性信息
 * @date 2022/3/9
 *  /CodeDesignTutorials
 *
 */
public class PropertyValue {

    /** 属性名称 */
    private final String name;

    /** 属性值 */
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }


}
