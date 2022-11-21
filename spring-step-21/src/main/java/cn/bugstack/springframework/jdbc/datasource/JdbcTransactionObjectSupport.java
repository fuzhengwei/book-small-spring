package cn.bugstack.springframework.jdbc.datasource;

/**
 *
 * @description Convenient base class for JDBC-aware transaction objects.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
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
