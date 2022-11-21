package cn.bugstack.springframework.tx.transaction.interceptor;


import cn.bugstack.springframework.tx.transaction.support.DelegatingTransactionDefinition;

import java.io.Serializable;

/**
 *
 * @description {@link TransactionAttribute} implementation that delegates all calls to a given target
 * {@link TransactionAttribute} instance. Abstract because it is meant to be subclassed,
 * with subclasses overriding specific methods that are not supposed to simply delegate
 * to the target instance.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public abstract class DelegatingTransactionAttribute extends DelegatingTransactionDefinition implements TransactionAttribute, Serializable {

    private final TransactionAttribute targetAttribute;

    public DelegatingTransactionAttribute(TransactionAttribute targetAttribute) {
        super(targetAttribute);
        this.targetAttribute = targetAttribute;
    }

    @Override
    public boolean rollbackOn(Throwable ex) {
        return this.targetAttribute.rollbackOn(ex);
    }
}
