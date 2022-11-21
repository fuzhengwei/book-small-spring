package cn.bugstack.springframework.jdbc.support;

import cn.hutool.core.util.StrUtil;

import java.sql.*;

/**
 *
 * @description Generic utility methods for working with JDBC. Mainly for internal use
 * within the framework, but also useful for custom JDBC access code.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class JdbcUtils {

    /**
     * Determine the column name to use. The column name is determined based on a
     * lookup using ResultSetMetaData.
     * <p>This method implementation takes into account recent clarifications
     * expressed in the JDBC 4.0 specification:
     * <p><i>columnLabel - the label for the column specified with the SQL AS clause.
     * If the SQL AS clause was not specified, then the label is the name of the column</i>.
     * @param resultSetMetaData the current meta-data to use
     * @param columnIndex the index of the column for the look up
     * @return the column name to use
     * @throws SQLException in case of lookup failure
     */
    public static String lookupColumnName(ResultSetMetaData resultSetMetaData, int columnIndex) throws SQLException {
        String name = resultSetMetaData.getColumnLabel(columnIndex);
        if (StrUtil.isEmpty(name)) {
            name = resultSetMetaData.getColumnName(columnIndex);
        }
        return name;
    }

    /**
     * Retrieve a JDBC column value from a ResultSet, using the most appropriate
     * value type. The returned value should be a detached value object, not having
     * any ties to the active ResultSet: in particular, it should not be a Blob or
     * Clob object but rather a byte array or String representation, respectively.
     * <p>Uses the {@code getObject(index)} method, but includes additional "hacks"
     * to get around Oracle 10g returning a non-standard object for its TIMESTAMP
     * datatype and a {@code java.sql.Date} for DATE columns leaving out the
     * time portion: These columns will explicitly be extracted as standard
     * {@code java.sql.Timestamp} object.
     * @param rs is the ResultSet holding the data
     * @param index is the column index
     * @return the value object
     * @throws SQLException if thrown by the JDBC API
     * @see java.sql.Blob
     * @see java.sql.Clob
     * @see java.sql.Timestamp
     */
    public static Object getResultSetValue(ResultSet rs, int index) throws SQLException {
        Object obj = rs.getObject(index);
        String className = null;
        if (null != obj) {
            className = obj.getClass().getName();
        }

        if (obj instanceof Blob) {
            Blob blob = (Blob) obj;
            obj = blob.getBytes(1, (int) blob.length());
        } else if (obj instanceof Clob) {
            Clob clob = (Clob) obj;
            obj = clob.getSubString(1, (int) clob.length());
        } else if ("oracle.sql.TIMESTAMP".equals(className) || "oracle.sql.TIMESTAMPTZ".equals(className)) {
            obj = rs.getTimestamp(index);
        } else if (null != className && className.startsWith("oracle.sql.DATE")) {
            String metadataClassName = rs.getMetaData().getColumnClassName(index);
            if ("java.sql.Timestamp".equals(metadataClassName) || "oracle.sql.TIMESTAMP".equals(metadataClassName)) {
                obj = rs.getTimestamp(index);
            } else {
                obj = rs.getDate(index);
            }
        } else if (obj instanceof Date) {
            if ("java.sql.Timestamp".equals(rs.getMetaData().getColumnClassName(index))) {
                obj = rs.getDate(index);
            }
        }

        return obj;
    }

}
