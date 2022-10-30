package cn.bugstack.springframework.beans.factory.config;

import cn.bugstack.springframework.beans.factory.BeanFactory;

/**
 * @author 小傅哥，微信：fustack
 * @description Extension of the {@link cn.bugstack.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @date 2022/3/9
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
