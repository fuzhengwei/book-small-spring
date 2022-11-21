package cn.bugstack.springframework.tx.transaction;

/**
 *
 * @description Exception thrown when attempting to work with a nested transaction
 * but nested transactions are not supported by the underlying backend.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class NestedTransactionNotSupportedException extends CannotCreateTransactionException{

    public NestedTransactionNotSupportedException(String message) {
        super(message);
    }

    public NestedTransactionNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
