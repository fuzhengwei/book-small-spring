package cn.bugstack.springframework;

/**
 * @description Bean 对象信息定义
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @date 2022/2/9
 *
 *
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
