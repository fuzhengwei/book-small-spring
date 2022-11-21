package cn.bugstack.springframework.tx.transaction.interceptor;


import cn.bugstack.springframework.tx.transaction.TransactionDefinition;

/**
 *
 * @description This interface adds a {@code rollbackOn} specification to {@link TransactionDefinition}.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface TransactionAttribute extends TransactionDefinition {

    boolean rollbackOn(Throwable ex);

}
