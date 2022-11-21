package cn.bugstack.springframework.context.event;

import cn.bugstack.springframework.beans.factory.BeanFactory;
import cn.bugstack.springframework.context.ApplicationEvent;
import cn.bugstack.springframework.context.ApplicationListener;

/**
 *
 * @description Simple implementation of the {@link ApplicationEventMulticaster} interface.
 * @date 2022/3/13
 *  /CodeDesignTutorials
 *
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }

}
