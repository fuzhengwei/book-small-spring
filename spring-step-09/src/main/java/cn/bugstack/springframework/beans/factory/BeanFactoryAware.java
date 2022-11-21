package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @author 小傅哥，微信：fustack
 *
 * 来自于对开源项目的学习；
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 实现此接口，既能感知到所属的 BeanFactory
 * @date 2022/3/11
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
