package cn.bugstack.springframework.tx.transaction.interceptor;

import cn.bugstack.springframework.tx.transaction.PlatformTransactionManager;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.io.Serializable;

/**
 * @author 小傅哥，微信：fustack
 * @description AOP Alliance MethodInterceptor for declarative transaction
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class TransactionInterceptor extends TransactionAspectSupport implements MethodInterceptor, Serializable {

    public TransactionInterceptor(PlatformTransactionManager ptm, TransactionAttributeSource transactionAttributeSource) {
        setTransactionManager(ptm);
        setTransactionAttributeSource(transactionAttributeSource);
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return invokeWithinTransaction(invocation.getMethod(), invocation.getThis().getClass(), invocation::proceed);
    }

}
