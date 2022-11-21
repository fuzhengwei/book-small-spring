package cn.bugstack.springframework.jdbc;

/**
 *
 * @description Exception thrown when we can't classify an SQLException into
 * one of our generic data access exceptions.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class UncategorizedSQLException extends RuntimeException{

    public UncategorizedSQLException(String message) {
        super(message);
    }

    public UncategorizedSQLException(String task,String sql, Throwable cause) {
        super(sql, cause);
    }

}
