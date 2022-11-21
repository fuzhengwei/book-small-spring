package cn.bugstack.springframework.tx.transaction.annotation;

import cn.bugstack.springframework.tx.transaction.interceptor.TransactionAttribute;

import java.lang.reflect.AnnotatedElement;

/**
 *
 * @description 用于解析已知事务注释类型的策略接口
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface TransactionAnnotationParser {

    /**
     * 基于该解析器理解的注释类型，解析给定方法或类的事务属性。
     */
    TransactionAttribute parseTransactionAnnotation(AnnotatedElement element);

}
