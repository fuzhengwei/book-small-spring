package cn.bugstack.springframework.jdbc.core;

import cn.bugstack.springframework.jdbc.UncategorizedSQLException;
import cn.bugstack.springframework.jdbc.datasource.DataSourceUtils;
import cn.bugstack.springframework.jdbc.support.JdbcAccessor;
import cn.hutool.core.lang.Assert;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @description JDBC 操作模板
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {

    /**
     * If this variable is set to a non-negative value, it will be used for setting the
     * fetchSize property on statements used for query processing.
     */
    private int fetchSize = -1;

    /**
     * If this variable is set to a non-negative value, it will be used for setting the
     * maxRows property on statements used for query processing.
     */
    private int maxRows = -1;

    /**
     * If this variable is set to a non-negative value, it will be used for setting the
     * queryTimeout property on statements used for query processing.
     */
    private int queryTimeout = -1;

    public JdbcTemplate() {
    }

    public JdbcTemplate(DataSource dataSource) {
        setDataSource(dataSource);
        afterPropertiesSet();
    }

    public int getFetchSize() {
        return fetchSize;
    }

    public void setFetchSize(int fetchSize) {
        this.fetchSize = fetchSize;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public int getQueryTimeout() {
        return queryTimeout;
    }

    public void setQueryTimeout(int queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    @Override
    public <T> T execute(StatementCallback<T> action) {
        Connection con = DataSourceUtils.getConnection(obtainDataSource());
        try {
            Statement stmt = con.createStatement();
            applyStatementSettings(stmt);
            return action.doInStatement(stmt);
        } catch (SQLException ex) {
            throw new UncategorizedSQLException("ConnectionCallback", getSql(action), ex);
        }
    }

    private static String getSql(Object sqlProvider) {
        if (sqlProvider instanceof SqlProvider) {
            return ((SqlProvider) sqlProvider).getSql();
        } else {
            return null;
        }
    }

    @Override
    public void execute(String sql) {
        class ExecuteStatementCallback implements StatementCallback<Object>, SqlProvider {
            @Override
            public Object doInStatement(Statement statement) throws SQLException {
                statement.execute(sql);
                return null;
            }
            @Override
            public String getSql() {
                return sql;
            }
        }
        execute(new ExecuteStatementCallback());
    }

    @Override
    public <T> T query(String sql, ResultSetExtractor<T> res) {
        class QueryStatementCallback implements StatementCallback<T>, SqlProvider {

            @Override
            public String getSql() {
                return sql;
            }

            @Override
            public T doInStatement(Statement statement) throws SQLException {
                ResultSet rs = statement.executeQuery(sql);
                return res.extractData(rs);
            }
        }

        return execute(new QueryStatementCallback());
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper) {
        return result(query(sql, new RowMapperResultSetExtractor<>(rowMapper)));
    }

    @Override
    public List<Map<String, Object>> queryForList(String sql) {
        return query(sql, new ColumnMapRowMapper());
    }

    private static <T> T result(T result) {
        Assert.state(null != result, "No result");
        return result;
    }

    protected void applyStatementSettings(Statement stat) throws SQLException {
        int fetchSize = getFetchSize();
        if (fetchSize != -1) {
            stat.setFetchSize(fetchSize);
        }

        int maxRows = getMaxRows();
        if (maxRows != -1) {
            stat.setMaxRows(maxRows);
        }
    }

}
