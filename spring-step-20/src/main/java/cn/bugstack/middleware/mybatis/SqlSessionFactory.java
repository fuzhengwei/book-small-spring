package cn.bugstack.middleware.mybatis;

/**
 * @author 小傅哥，微信：fustack
 * @description SqlSessionFactory
 * @date 2022/3/16
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface SqlSessionFactory {

    SqlSession openSession();

}
