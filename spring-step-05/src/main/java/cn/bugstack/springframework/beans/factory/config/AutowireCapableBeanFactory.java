package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.factory.BeanFactory;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description Extension of the {@link cn.bugstack.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @date 2022/3/9
 *  /CodeDesignTutorials
 *
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
