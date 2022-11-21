package cn.bugstack.springframework.core.annotation;

import cn.hutool.core.lang.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.LinkedHashMap;

/**
 *
 * @description {@link LinkedHashMap} subclass representing annotation attribute
 * <em>key-value</em> pairs as read by {@link AnnotationUtils},
 * {@link AnnotatedElementUtils}, and Spring's reflection- and ASM-based AnnotationMetadata implementations.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class AnnotationAttributes extends LinkedHashMap<String, Object> {

    private final Class<? extends Annotation> annotationType;

    boolean validated = false;

    final String displayName;

    public AnnotationAttributes(Class<? extends Annotation> annotationType) {
        Assert.notNull(annotationType, "'annotationType' must not be null");
        this.annotationType = annotationType;
        this.displayName = annotationType.getName();
    }


    public Class<?>[] getClassArray(String attributeName) {
        return getRequiredAttribute(attributeName, Class[].class);
    }

    private <T> T getRequiredAttribute(String attributeName, Class<T> expectedType) {
        Object value = get(attributeName);

        if (!expectedType.isInstance(value) && expectedType.isArray() &&
                expectedType.getComponentType().isInstance(value)) {
            Object array = Array.newInstance(expectedType.getComponentType(), 1);
            Array.set(array,0,value);
            value=array;
        }

        return (T) value;
    }

    public Class<? extends Annotation> annotationType() {
        return this.annotationType;
    }
}
