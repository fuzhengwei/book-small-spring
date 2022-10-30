package cn.bugstack.springframework.beans;

/**
 * @author 小傅哥，微信：fustack
 * @description Bean 属性信息
 * @date 2022/3/9
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
