package cn.bugstack.springframework.core.annotation;

/**
 * @author 小傅哥，微信：fustack
 * @description Thrown by {@link AnnotationUtils} and <em>synthesized annotations</em>
 * if an annotation is improperly configured.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class AnnotationConfigurationException extends RuntimeException{

    public AnnotationConfigurationException(String message) {
        super(message);
    }

    public AnnotationConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
