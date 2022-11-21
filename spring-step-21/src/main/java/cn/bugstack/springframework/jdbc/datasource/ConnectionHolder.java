package cn.bugstack.springframework.jdbc.datasource;

import cn.hutool.core.lang.Assert;

import java.sql.Connection;

/**
 *
 * @description Resource holder wrapping a JDBC {@link Connection}.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class ConnectionHolder {

    private ConnectionHandle connectionHandle;

    private Connection currentConnection;

    public ConnectionHolder(ConnectionHandle connectionHandle) {
        this.connectionHandle = connectionHandle;
    }

    public ConnectionHolder(Connection connection) {
        this.connectionHandle = new SimpleConnectionHandle(connection);
    }

    public ConnectionHandle getConnectionHandle() {
        return connectionHandle;
    }

    protected boolean hasConnection() {
        return this.connectionHandle != null;
    }

    protected void setConnection(Connection connection) {
        if (null != this.currentConnection) {
            if (null != this.connectionHandle) {
                this.connectionHandle.releaseConnection(this.currentConnection);
            }
            this.currentConnection = null;
        }
        if (null != connection) {
            this.connectionHandle = new SimpleConnectionHandle(connection);
        } else {
            this.connectionHandle = null;
        }
    }

    protected Connection getConnection() {
        Assert.notNull(this.connectionHandle, "Active connection is required.");
        if (null == this.currentConnection) {
            this.currentConnection = this.connectionHandle.getConnection();
        }
        return this.currentConnection;
    }

}