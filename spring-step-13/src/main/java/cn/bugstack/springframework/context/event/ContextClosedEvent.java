package cn.bugstack.springframework.context.event;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description Event raised when an <code>ApplicationContext</code> gets closed.
 * @date 2022/3/13
 *  /CodeDesignTutorials
 *
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }

}
