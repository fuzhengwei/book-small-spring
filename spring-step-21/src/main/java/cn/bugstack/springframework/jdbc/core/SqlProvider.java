package cn.bugstack.springframework.jdbc.core;

/**
 *
 * @description Interface to be implemented by objects that can provide SQL strings.
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public interface SqlProvider {

    String getSql();

}
