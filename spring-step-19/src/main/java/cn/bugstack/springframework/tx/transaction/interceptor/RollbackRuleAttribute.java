package cn.bugstack.springframework.tx.transaction.interceptor;

import java.io.Serializable;

/**
 * @author 小傅哥，微信：fustack
 * @description Rule determining whether or not a given exception (and any subclasses)
 * should cause a rollback.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class RollbackRuleAttribute implements Serializable {

    private final String exceptionName;

    public RollbackRuleAttribute(Class<?> clazz) {
        this.exceptionName = clazz.getName();
    }

}
