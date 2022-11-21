package cn.bugstack.springframework.util;

/**
 *
 * @description Simple strategy interface for resolving a String value.
 * Used by {@link cn.bugstack.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * @date 2022/3/9
 *  /CodeDesignTutorials
 *
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}
