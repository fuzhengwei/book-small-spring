package cn.bugstack.springframework.tx.transaction.annotation;

import cn.bugstack.springframework.tx.transaction.interceptor.TransactionAttribute;

import java.lang.reflect.AnnotatedElement;

/**
 * @author 小傅哥，微信：fustack
 * @description 用于解析已知事务注释类型的策略接口
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionAnnotationParser {

    /**
     * 基于该解析器理解的注释类型，解析给定方法或类的事务属性。
     */
    TransactionAttribute parseTransactionAnnotation(AnnotatedElement element);

}
