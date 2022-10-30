package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * @author 小傅哥，微信：fustack
 * @description Defines a factory which can return an Object instance (possibly shared or independent) when invoked.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;

}
