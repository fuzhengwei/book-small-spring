package cn.bugstack.springframework.test.bean;

import cn.bugstack.springframework.jdbc.core.JdbcTemplate;
import cn.bugstack.springframework.tx.transaction.annotation.Transactional;

/**
 *
 * @description
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class JdbcService {

    /**
     * 使用注解事务
     */
    @Transactional(rollbackFor = Exception.class)
    public void saveData(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
    }

    public void saveDataNoTransaction(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
        jdbcTemplate.execute("insert into user (id, userId, userHead, createTime, updateTime) values (1, '184172133','01_50', now(), now())");
    }

}
