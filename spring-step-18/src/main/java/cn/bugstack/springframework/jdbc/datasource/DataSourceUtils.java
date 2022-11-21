package cn.bugstack.springframework.jdbc.datasource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @description Helper class that provides static methods for obtaining JDBC Connections from a {@link javax.sql.DataSource}.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
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
