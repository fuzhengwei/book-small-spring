package cn.bugstack.springframework.jdbc.datasource;

import java.sql.Connection;

/**
 *
 * @description Simple interface to be implemented by handles for a JDBC Connection.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface ConnectionHandle {

    Connection getConnection();

    default void releaseConnection(Connection con) {

    }

}
