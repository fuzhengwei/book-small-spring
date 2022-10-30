package cn.bugstack.springframework.beans.factory.config;

/**
 * @author 小傅哥，微信：fustack
 * @description 单例 Bean 注册表
 * @date 2022/03/07
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
