package cn.bugstack.springframework.tx.transaction;

/**
 *
 * @description Exception thrown when a transaction can't be created using an
 * underlying transaction API such as JTA.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class TransactionException extends RuntimeException{

    public TransactionException(String message) {
        super(message);
    }

    public TransactionException(String message, Throwable cause) {
        super(message, cause);
    }

}
