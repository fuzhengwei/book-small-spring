package cn.bugstack.springframework.util;

/**
 * @author 小傅哥，微信：fustack
 * @description Simple strategy interface for resolving a String value.
 * Used by {@link cn.bugstack.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * @date 2022/3/9
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);

}
