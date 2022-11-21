package cn.bugstack.springframework.beans.factory;

/**
 *
 * @description 实现此接口的 Bean 对象，会在 BeanFactory 设置属性后作出相应的处理，如：执行自定义初始化，或者仅仅检查是否设置了所有强制属性。
 * @date 2022/3/10
 *  /CodeDesignTutorials
 *
 */
public interface InitializingBean {

    /**
     * Bean 处理了属性填充后调用
     * 
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;

}
