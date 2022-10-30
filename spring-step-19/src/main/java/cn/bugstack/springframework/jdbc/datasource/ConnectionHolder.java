package cn.bugstack.springframework.jdbc.datasource;

import cn.hutool.core.lang.Assert;

import java.sql.Connection;

/**
 * @author 小傅哥，微信：fustack
 * @description Resource holder wrapping a JDBC {@link Connection}.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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