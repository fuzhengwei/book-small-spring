package cn.bugstack.springframework.context;

import cn.bugstack.springframework.beans.factory.HierarchicalBeanFactory;
import cn.bugstack.springframework.beans.factory.ListableBeanFactory;
import cn.bugstack.springframework.core.io.ResourceLoader;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 应用上下文接口 Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 * @date 2022/3/10
 *
 *
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher  {
}
