package cn.bugstack.springframework.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * @author 小傅哥，微信：fustack
 * @description Annotation at the field or method/constructor parameter level
 * that indicates a default value expression for the affected argument.
 * @date 2022/3/15
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
