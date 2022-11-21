package cn.bugstack.springframework.tx.transaction.interceptor;

import java.io.Serializable;

/**
 *
 * @description Rule determining whether or not a given exception (and any subclasses)
 * should cause a rollback.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class RollbackRuleAttribute implements Serializable {

    private final String exceptionName;

    public RollbackRuleAttribute(Class<?> clazz) {
        this.exceptionName = clazz.getName();
    }

}
