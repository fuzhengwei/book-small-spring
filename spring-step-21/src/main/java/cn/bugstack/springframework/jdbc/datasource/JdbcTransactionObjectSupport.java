package cn.bugstack.springframework.jdbc.datasource;

/**
 * @author 小傅哥，微信：fustack
 * @description Convenient base class for JDBC-aware transaction objects.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public abstract class JdbcTransactionObjectSupport {

    private ConnectionHolder connectionHolder;

    public void setConnectionHolder(ConnectionHolder connectionHolder) {
        this.connectionHolder = connectionHolder;
    }

    public ConnectionHolder getConnectionHolder() {
        return connectionHolder;
    }

    public boolean hasConnectionHolder() {
        return null != this.connectionHolder;
    }

}
