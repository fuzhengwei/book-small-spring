package cn.bugstack.springframework.beans.factory.config;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 单例 Bean 注册表
 * @date 2022/03/07
 *
 *
 */
public interface SingletonBeanRegistry {

    /**
     * 返回在给定名称下注册的（原始）单例对象。
     * @param beanName 要查找的bean的名称
     * @return 返回注册的单例对象
     */
    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
