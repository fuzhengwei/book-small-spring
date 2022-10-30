package cn.bugstack.springframework.core.annotation;


import cn.bugstack.springframework.util.ReflectionUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author 小傅哥，微信：fustack
 * @description DefaultAnnotationAttributeExtractor
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
class DefaultAnnotationAttributeExtractor extends AbstractAliasAwareAnnotationAttributeExtractor<Annotation> {

    /**
     * Construct a new {@code DefaultAnnotationAttributeExtractor}.
     * @param annotation the annotation to synthesize; never {@code null}
     * @param annotatedElement the element that is annotated with the supplied
     * annotation; may be {@code null} if unknown
     */
    DefaultAnnotationAttributeExtractor(Annotation annotation, Object annotatedElement) {
        super(annotation.annotationType(), annotatedElement, annotation);
    }


    @Override
    
    protected Object getRawAttributeValue(Method attributeMethod) {
        ReflectionUtils.makeAccessible(attributeMethod);
        return ReflectionUtils.invokeMethod(attributeMethod, getSource());
    }

    @Override
    
    protected Object getRawAttributeValue(String attributeName) {
        Method attributeMethod = ReflectionUtils.findMethod(getAnnotationType(), attributeName);
        return (attributeMethod != null ? getRawAttributeValue(attributeMethod) : null);
    }

}
