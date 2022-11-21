package cn.bugstack.middleware.mybatis;

/**
 *
 * @description DefaultSqlSessionFactory
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }

}
