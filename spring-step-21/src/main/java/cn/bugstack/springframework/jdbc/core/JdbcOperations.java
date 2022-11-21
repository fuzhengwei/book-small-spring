package cn.bugstack.springframework.jdbc.core;

import java.util.List;
import java.util.Map;

/**
 *
 * @description Interface specifying a basic set of JDBC operations.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface JdbcOperations {

    <T> T execute(StatementCallback<T> action);

    void execute(String sql);

    <T> T query(String sql, ResultSetExtractor<T> res);

    <T> List<T> query(String sql, RowMapper<T> rowMapper);

    List<Map<String, Object>> queryForList(String sql);

}
