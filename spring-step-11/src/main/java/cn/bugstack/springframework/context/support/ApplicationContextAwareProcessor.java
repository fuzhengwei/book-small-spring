package cn.bugstack.springframework.context.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanPostProcessor;
import cn.bugstack.springframework.context.ApplicationContext;
import cn.bugstack.springframework.context.ApplicationContextAware;

/**
 * @author 小傅哥，微信：fustack
 *
 * 来自于对开源项目的学习；
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 通过 BeanPostProcessor 实现类感知应用上下文对象
 * @date 2022/3/11
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
