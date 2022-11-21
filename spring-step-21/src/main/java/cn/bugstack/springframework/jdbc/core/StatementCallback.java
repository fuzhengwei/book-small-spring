package cn.bugstack.springframework.jdbc.core;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @description Generic callback interface for code that operates on a JDBC Statement.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface StatementCallback<T> {

    T doInStatement(Statement statement) throws SQLException;

}
