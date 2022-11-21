package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 *
 * @description 实现此接口，既能感知到所属的 BeanFactory
 * @date 2022/3/11
 *  /CodeDesignTutorials
 *
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
