package cn.bugstack.springframework.core.annotation;

/**
 *
 * @description Thrown by {@link AnnotationUtils} and <em>synthesized annotations</em>
 * if an annotation is improperly configured.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class AnnotationConfigurationException extends RuntimeException{

    public AnnotationConfigurationException(String message) {
        super(message);
    }

    public AnnotationConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
