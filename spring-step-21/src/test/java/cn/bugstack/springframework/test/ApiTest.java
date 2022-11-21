package cn.bugstack.springframework.test;

import cn.bugstack.springframework.beans.factory.BeanFactory;
import cn.bugstack.springframework.context.support.ClassPathXmlApplicationContext;
import cn.bugstack.springframework.test.dao.IUserDao;
import cn.bugstack.springframework.test.po.User;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

/**
 *
 * @description 单元测试
 * @date 2022/3/16
 *
 *
 */
public class ApiTest {

    @Test
    public void test_ClassPathXmlApplicationContext() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserDao userDao = beanFactory.getBean("IUserDao", IUserDao.class);
        User user = userDao.queryUserInfoById(1L);
        System.out.println("测试结果：" + JSON.toJSONString(user));
    }

}
