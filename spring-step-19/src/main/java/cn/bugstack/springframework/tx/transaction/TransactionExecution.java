package cn.bugstack.springframework.tx.transaction;

/**
 * @author 小傅哥，微信：fustack
 * @description Common representation of the current state of a transaction.
 * Serves as base interface for {@link TransactionStatus} as well as
 * @date 2022/3/18
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionExecution {

    /**
     * Return whether the present transaction is new; otherwise participating
     * in an existing transaction, or potentially not running in an actual
     * transaction in the first place.
     */
    boolean isNewTransaction();

    /**
     * Set the transaction rollback-only. This instructs the transaction manager
     * that the only possible outcome of the transaction may be a rollback, as
     * alternative to throwing an exception which would in turn trigger a rollback.
     */
    void setRollbackOnly();

    /**
     * Return whether the transaction has been marked as rollback-only
     * (either by the application or by the transaction infrastructure).
     */
    boolean isRollbackOnly();

    /**
     * Return whether this transaction is completed, that is,
     * whether it has already been committed or rolled back.
     */
    boolean isCompleted();

}
