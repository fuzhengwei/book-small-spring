package cn.bugstack.springframework.jdbc.datasource;

import cn.hutool.core.lang.Assert;

import java.sql.Connection;

/**
 * @author 小傅哥，微信：fustack
 * @description Simple implementation of the {@link ConnectionHandle} interface,
 * containing a given JDBC Connection.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
