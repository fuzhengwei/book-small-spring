package cn.bugstack.springframework.jdbc.core;

import java.util.List;
import java.util.Map;

/**
 * @author 小傅哥，微信：fustack
 * @description Interface specifying a basic set of JDBC operations.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface JdbcOperations {

    <T> T execute(StatementCallback<T> action) throws Exception;

    void execute(String sql);

    <T> T query(String sql, ResultSetExtractor<T> res);

    <T> List<T> query(String sql, RowMapper<T> rowMapper);

    List<Map<String, Object>> queryForList(String sql);

}
