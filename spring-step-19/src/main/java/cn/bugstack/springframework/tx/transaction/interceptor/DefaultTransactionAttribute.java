package cn.bugstack.springframework.tx.transaction.interceptor;


import cn.bugstack.springframework.tx.transaction.support.DefaultTransactionDefinition;

/**
 * @author 小傅哥，微信：fustack
 * @description Spring's common transaction attribute implementation.
 * Rolls back on runtime, but not checked, exceptions by default.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class DefaultTransactionAttribute extends DefaultTransactionDefinition implements TransactionAttribute {

    public DefaultTransactionAttribute() {
        super();
    }

    @Override
    public boolean rollbackOn(Throwable ex) {
        return (ex instanceof RuntimeException || ex instanceof Error);
    }

    @Override
    public String toString() {
        return "DefaultTransactionAttribute{}";
    }
}
