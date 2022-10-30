package cn.bugstack.springframework.jdbc.support;

import cn.bugstack.springframework.beans.factory.InitializingBean;
import cn.hutool.core.lang.Assert;

import javax.sql.DataSource;

/**
 * @author 小傅哥，微信：fustack
 * @description Base class for {@link cn.bugstack.springframework.jdbc.core.JdbcTemplate} and
 * other JDBC-accessing DAO helpers, defining common properties such as
 * DataSource and exception translator.
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public abstract class JdbcAccessor implements InitializingBean {

    private DataSource dataSource;

    /**
     * Set the JDBC DataSource to obtain connections from.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Return the DataSource used by this template.
     */
    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * Obtain the DataSource for actual use.
     * @return the DataSource (never {@code null})
     * @throws IllegalStateException in case of no DataSource set
     * @since 5.0
     */
    protected DataSource obtainDataSource() {
        DataSource dataSource = getDataSource();
        Assert.state(dataSource != null, "No DataSource set");
        return dataSource;
    }

    /**
     * Eagerly initialize the exception translator, if demanded,
     * creating a default one for the specified DataSource if none set.
     */
    @Override
    public void afterPropertiesSet() {
        if (getDataSource() == null) {
            throw new IllegalArgumentException("Property 'dataSource' is required");
        }
    }

}