package cn.bugstack.springframework.tx.transaction.support;

/**
 * @author 小傅哥，微信：fustack
 * @description Default implementation of the TransactionStatus
 * interface, used by {@link AbstractPlatformTransactionManager}. Based on the concept of an underlying "transaction object".
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DefaultTransactionStatus extends AbstractTransactionStatus {

    private final Object transaction;

    private final boolean newTransaction;

    public DefaultTransactionStatus(Object transaction, boolean newTransaction) {
        this.transaction = transaction;
        this.newTransaction = newTransaction;
    }

    public Object getTransaction() {
        return transaction;
    }

    public boolean hasTransaction() {
        return this.transaction != null;
    }

    @Override
    public boolean isNewTransaction() {
        return hasTransaction() && this.newTransaction;
    }

}
