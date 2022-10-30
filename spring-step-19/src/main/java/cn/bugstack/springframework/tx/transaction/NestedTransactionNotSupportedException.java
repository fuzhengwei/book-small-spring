package cn.bugstack.springframework.tx.transaction;

/**
 * @author 小傅哥，微信：fustack
 * @description Exception thrown when attempting to work with a nested transaction
 * but nested transactions are not supported by the underlying backend.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class NestedTransactionNotSupportedException extends CannotCreateTransactionException{

    public NestedTransactionNotSupportedException(String message) {
        super(message);
    }

    public NestedTransactionNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}
