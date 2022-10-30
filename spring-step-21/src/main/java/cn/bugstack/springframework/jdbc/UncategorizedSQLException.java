package cn.bugstack.springframework.jdbc;

/**
 * @author 小傅哥，微信：fustack
 * @description Exception thrown when we can't classify an SQLException into
 * one of our generic data access exceptions.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class UncategorizedSQLException extends RuntimeException{

    public UncategorizedSQLException(String message) {
        super(message);
    }

    public UncategorizedSQLException(String task,String sql, Throwable cause) {
        super(sql, cause);
    }

}
