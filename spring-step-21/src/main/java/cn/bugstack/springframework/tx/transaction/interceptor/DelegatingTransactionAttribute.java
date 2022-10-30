package cn.bugstack.springframework.tx.transaction.interceptor;


import cn.bugstack.springframework.tx.transaction.support.DelegatingTransactionDefinition;

import java.io.Serializable;

/**
 * @author 小傅哥，微信：fustack
 * @description {@link TransactionAttribute} implementation that delegates all calls to a given target
 * {@link TransactionAttribute} instance. Abstract because it is meant to be subclassed,
 * with subclasses overriding specific methods that are not supposed to simply delegate
 * to the target instance.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
