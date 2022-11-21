package cn.bugstack.springframework.context.event;

import cn.bugstack.springframework.context.ApplicationContext;
import cn.bugstack.springframework.context.ApplicationEvent;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description Base class for events raised for an <code>ApplicationContext</code>.
 * @date 2022/3/13
 *  /CodeDesignTutorials
 *
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }

}
