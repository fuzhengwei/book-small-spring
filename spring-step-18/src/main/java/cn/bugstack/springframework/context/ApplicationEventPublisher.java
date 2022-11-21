package cn.bugstack.springframework.context;

/**
 *
 * @description 事件发布者接口
 * @date 2022/3/13
 *  /CodeDesignTutorials
 *
 */
public interface ApplicationEventPublisher {

    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);

}
