package cn.bugstack.middleware.mybatis;

import java.sql.Connection;
import java.util.Map;

/**
 *
 * @description 链接信息和数据源配置类
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
