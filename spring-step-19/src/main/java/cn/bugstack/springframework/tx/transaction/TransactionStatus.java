package cn.bugstack.springframework.tx.transaction;

import java.io.Flushable;
import java.io.IOException;

/**
 * @author 小傅哥，微信：fustack
 * @description Default implementation of the TransactionStatus
 * interface, used by AbstractPlatformTransactionManager Based on the concept
 * of an underlying "transaction object".
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionStatus extends TransactionExecution, SavepointManager, Flushable {

    boolean hasSavepoint();

    @Override
    void flush() throws IOException;

}
