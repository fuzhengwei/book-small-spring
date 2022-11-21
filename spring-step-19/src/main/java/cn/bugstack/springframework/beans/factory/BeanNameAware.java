package cn.bugstack.springframework.beans.factory;

/**
 *
 * @description Interface to be implemented by beans that want to be aware of their
 * bean name in a bean factory. Note that it is not usually recommended
 * that an object depend on its bean name, as this represents a potentially
 * brittle dependence on external configuration, as well as a possibly
 * unnecessary dependence on a Spring API.
 * @date 2022/3/11
 *  /CodeDesignTutorials
 *
 */
public interface BeanNameAware {

    void setBeanName(String name);

}
