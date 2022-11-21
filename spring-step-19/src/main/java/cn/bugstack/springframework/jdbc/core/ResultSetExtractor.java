package cn.bugstack.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @description Callback interface used by {@link JdbcTemplate}'s query methods.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface ResultSetExtractor<T> {

    T extractData(ResultSet rs) throws SQLException;

}
