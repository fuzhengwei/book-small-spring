package cn.bugstack.springframework.tx.transaction.interceptor;

import java.lang.reflect.Method;

/**
 *
 * @description Strategy interface used by {@link TransactionInterceptor} for metadata retrieval.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface TransactionAttributeSource {

    TransactionAttribute getTransactionAttribute(Method method, Class<?> targetClass);

}
