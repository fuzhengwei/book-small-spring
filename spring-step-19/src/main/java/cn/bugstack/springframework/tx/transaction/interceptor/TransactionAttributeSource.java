package cn.bugstack.springframework.tx.transaction.interceptor;

import java.lang.reflect.Method;

/**
 * @author 小傅哥，微信：fustack
 * @description Strategy interface used by {@link TransactionInterceptor} for metadata retrieval.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface TransactionAttributeSource {

    TransactionAttribute getTransactionAttribute(Method method, Class<?> targetClass);

}
