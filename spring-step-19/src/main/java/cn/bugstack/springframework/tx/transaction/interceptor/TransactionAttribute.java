package cn.bugstack.springframework.tx.transaction.interceptor;


import cn.bugstack.springframework.tx.transaction.TransactionDefinition;

/**
 * @author 小傅哥，微信：fustack
 * @description This interface adds a {@code rollbackOn} specification to {@link TransactionDefinition}.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionAttribute extends TransactionDefinition {

    boolean rollbackOn(Throwable ex);

}
