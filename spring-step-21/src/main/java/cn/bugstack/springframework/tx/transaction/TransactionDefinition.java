package cn.bugstack.springframework.tx.transaction;

import java.sql.Connection;

/**
 * @author 小傅哥，微信：fustack
 * @description {@link TransactionDefinition} implementation that delegates all calls to a given target
 * {@link TransactionDefinition} instance. Abstract because it is meant to be subclassed,
 * with subclasses overriding specific methods that are not supposed to simply delegate
 * to the target instance.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionDefinition {

    /**
     * 这个是spring默认的事务传播行为
     * 如果正处于一个事务中，则加入，否则创建一个新的事务
     */
    int PROPAGATION_REQUIRED = 0;

    /**
     * 如果正处于一个事务中，则加入，否则不使用事务
     */
    int PROPAGATION_SUPPORTS = 1;

    /**
     * 如果正处于一个事务中，则加入，否则抛出异常
     */
    int PROPAGATION_MANDATORY = 2;

    /**
     * 无论如何都会创建一个新事务，
     * 如果正处于一个事务中，则先挂起当前事务，然后创建
     */
    int PROPAGATION_REQUIRES_NEW = 3;

    /**
     * 不使用事务
     * 如果正处于一个事务中，则挂起当前事务，不使用
     */
    int PROPAGATION_NOT_SUPPORTED = 4;

    /**
     * 不使用事务，
     * 如果正处于一个事务中，则抛出异常
     */
    int PROPAGATION_NEVER = 5;

    /**
     * 嵌套事务
     * 如果正处于一个事务中，则创建一个事务嵌套其中（MySQL 采用 SAVEPOINT 保护点实现的），否则创建一个新事务
     */
    int PROPAGATION_NESTED = 6;

    /**
     * 使用默认的隔离级别
     */
    int ISOLATION_DEFAULT = -1;

    /**
     * 读未提交
     */
    int ISOLATION_READ_UNCOMMITTED = Connection.TRANSACTION_READ_UNCOMMITTED;

    /**
     * 读已提交
     */
    int ISOLATION_READ_COMMITTED = Connection.TRANSACTION_READ_COMMITTED;

    /**
     * 可重复读
     */
    int ISOLATION_REPEATABLE_READ = Connection.TRANSACTION_REPEATABLE_READ;

    /**
     * 串行化
     */
    int ISOLATION_SERIALIZABLE = Connection.TRANSACTION_SERIALIZABLE;

    /**
     * 默认超时时间
     */
    int TIMEOUT_DEFAULT = -1;

    /**
     * 获取传播行为
     */
    int getPropagationBehavior();

    /**
     * 获取事务隔离级别
     */
    int getIsolationLevel();

    /**
     * 获取事务超时时间
     */
    int getTimeout();

    boolean isReadOnly();

    String getName();

}
