package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @author 小傅哥，微信：fustack
 * @description 定义 Bean 工厂接口
 * @date 2022/03/07
 * @github https://github.com/fuzhengwei
 * @copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface BeanFactory {

    /**
     * 返回 Bean 的实例对象
     * @param name 要检索的bean的名称
     * @return 实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 返回含构造函数的 Bean 实例对象
     * @param name 要检索的bean的名称
     * @param args 构造函数入参
     * @return 实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param name  要检索的bean的名称
     * @param requiredType 类型
     * @param <T>          泛型
     * @return             实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param requiredType 类型
     * @param <T>          泛型
     * @return             实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    <T> T getBean(Class<T> requiredType) throws BeansException;

}
