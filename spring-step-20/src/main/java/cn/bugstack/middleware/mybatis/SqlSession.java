package cn.bugstack.middleware.mybatis;

import java.util.List;

/**
 *
 * @description SqlSession 接口
 * @date 2022/3/16
 *
 *
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T> List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
