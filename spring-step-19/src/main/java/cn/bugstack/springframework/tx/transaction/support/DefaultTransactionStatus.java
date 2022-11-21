package cn.bugstack.springframework.tx.transaction.support;

/**
 *
 * @description Default implementation of the TransactionStatus
 * interface, used by {@link AbstractPlatformTransactionManager}. Based on the concept of an underlying "transaction object".
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
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
