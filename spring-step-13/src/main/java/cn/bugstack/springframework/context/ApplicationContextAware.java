package cn.bugstack.springframework.context;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.Aware;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 实现此接口，既能感知到所属的 ApplicationContext
 * @date 2022/3/11
 *  /CodeDesignTutorials
 *
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
