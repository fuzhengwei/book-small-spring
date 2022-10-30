package cn.bugstack.springframework.jdbc.datasource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 小傅哥，微信：fustack
 * @description Helper class that provides static methods for obtaining JDBC Connections from a {@link javax.sql.DataSource}.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public abstract class DataSourceUtils {

    /**
     * Obtain a Connection from the given DataSource.
     */
    public static Connection getConnection(DataSource dataSource) {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to obtain JDBC Connection", e);
        }
    }

}
