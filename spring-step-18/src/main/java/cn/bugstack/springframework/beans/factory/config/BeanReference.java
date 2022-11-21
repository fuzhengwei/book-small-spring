package cn.bugstack.springframework.beans.factory.config;

/**
 *
 * @description Bean 引用
 * @date 2022/3/9
 *  /CodeDesignTutorials
 *
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
