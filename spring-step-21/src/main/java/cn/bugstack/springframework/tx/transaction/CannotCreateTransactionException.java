package cn.bugstack.springframework.tx.transaction;

/**
 *
 * @description Exception thrown when a transaction can't be created using an
 * underlying transaction API such as JTA.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class CannotCreateTransactionException extends TransactionException {

    public CannotCreateTransactionException(String message) {
        super(message);
    }

    public CannotCreateTransactionException(String message, Throwable cause) {
        super(message, cause);
    }

}
