package cn.bugstack.springframework.tx.transaction.interceptor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @description TransactionAttribute implementation that works out whether a given exception
 * should cause transaction rollback by applying a number of rollback rules,
 * both positive and negative. If no custom rollback rules apply, this attribute
 * behaves like DefaultTransactionAttribute (rolling back on runtime exceptions).
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class RuleBasedTransactionAttribute extends DefaultTransactionAttribute implements Serializable {

    private List<RollbackRuleAttribute> rollbackRules;

    public RuleBasedTransactionAttribute() {
        super();
    }

    public void setRollbackRules(List<RollbackRuleAttribute> rollbackRules) {
        this.rollbackRules = rollbackRules;
    }

}
