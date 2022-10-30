package cn.bugstack.springframework.test.bean;

import cn.bugstack.springframework.jdbc.core.JdbcTemplate;
import cn.bugstack.springframework.tx.transaction.annotation.Transactional;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
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
