package cn.bugstack.springframework.tx.transaction;

/**
 * @author 小傅哥，微信：fustack
 * @description Interface that specifies an API to programmatically manage transaction
 * savepoints in a generic fashion. Extended by TransactionStatus to
 * expose savepoint management functionality for a specific transaction.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface SavepointManager {

    Object createSavepoint() throws TransactionException;

    void rollbackToSavepoint(Object savepoint) throws TransactionException;

    void releaseSavepoint(Object savepoint) throws TransactionException;

}
