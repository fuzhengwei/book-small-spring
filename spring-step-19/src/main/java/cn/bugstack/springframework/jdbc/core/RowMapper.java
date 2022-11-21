package cn.bugstack.springframework.jdbc.core;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @description An interface used by {@link JdbcTemplate} for mapping rows of a
 * {@link ResultSet} on a per-row basis.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws SQLException;

}
