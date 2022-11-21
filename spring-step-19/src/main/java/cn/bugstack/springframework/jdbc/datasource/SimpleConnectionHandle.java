package cn.bugstack.springframework.jdbc.datasource;

import cn.hutool.core.lang.Assert;

import java.sql.Connection;

/**
 *
 * @description Simple implementation of the {@link ConnectionHandle} interface,
 * containing a given JDBC Connection.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class SimpleConnectionHandle implements ConnectionHandle {

    private final Connection connection;

    public SimpleConnectionHandle(Connection connection) {
        Assert.notNull(connection, "Connection must not be null");
        this.connection = connection;
    }

    @Override
    public Connection getConnection() {
        return this.connection;
    }

}
