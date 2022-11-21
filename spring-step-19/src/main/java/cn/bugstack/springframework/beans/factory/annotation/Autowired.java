package cn.bugstack.springframework.beans.factory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @description Marks a constructor, field, setter method or config method as to be
 * autowired by Spring's dependency injection facilities.
 * @date 2022/3/15
 *  /CodeDesignTutorials
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD})
public @interface Autowired {
}
