package cn.bugstack.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 小傅哥，微信：fustack
 * @description An interface used by {@link JdbcTemplate} for mapping rows of a
 * {@link java.sql.ResultSet} on a per-row basis.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws SQLException;

}
