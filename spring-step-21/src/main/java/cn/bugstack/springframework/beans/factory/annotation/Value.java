package cn.bugstack.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 *
 * @description Annotation at the field or method/constructor parameter level
 * that indicates a default value expression for the affected argument.
 * @date 2022/3/15
 *  /CodeDesignTutorials
 *
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * The actual value expression: e.g. "#{systemProperties.myProp}".
     */
    String value();

}
