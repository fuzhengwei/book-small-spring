package cn.bugstack.springframework.jdbc;

import java.sql.SQLException;

/**
 *
 * @description Fatal exception thrown when we can't connect to an RDBMS using JDBC.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class CannotGetJdbcConnectionException extends RuntimeException {

    public CannotGetJdbcConnectionException(String message) {
        super(message);
    }

    public CannotGetJdbcConnectionException(String message, SQLException ex) {
        super(message, ex);
    }

}
