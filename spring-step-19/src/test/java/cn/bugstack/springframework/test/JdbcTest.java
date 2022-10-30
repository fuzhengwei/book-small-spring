package cn.bugstack.springframework.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author 小傅哥，微信：fustack
 * @description JDBC Test
 * @date 2022/3/18
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class JdbcTest {

    private DruidDataSource dataSource;
    private Connection connection;
    private Statement statement;

    @Before
    public void init() throws SQLException {
        dataSource = new DruidDataSource();
        dataSource.setDriver(new Driver());
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?useSSL=false");
        dataSource.setPassword("123456");
        dataSource.setUsername("root");
    }

    @Test
    public void test_translation() throws SQLException {
        connection = dataSource.getConnection().getConnection();
        statement = connection.createStatement();

        connection.setAutoCommit(false);
        try {
            statement.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
            statement.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        }
        connection.commit();
    }

}
