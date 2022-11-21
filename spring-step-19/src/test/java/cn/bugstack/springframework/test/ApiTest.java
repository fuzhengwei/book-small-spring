package cn.bugstack.springframework.test;

import cn.bugstack.springframework.aop.AdvisedSupport;
import cn.bugstack.springframework.aop.TargetSource;
import cn.bugstack.springframework.aop.aspectj.AspectJExpressionPointcut;
import cn.bugstack.springframework.aop.framework.Cglib2AopProxy;
import cn.bugstack.springframework.aop.framework.JdkDynamicAopProxy;
import cn.bugstack.springframework.context.support.ClassPathXmlApplicationContext;
import cn.bugstack.springframework.jdbc.core.JdbcTemplate;
import cn.bugstack.springframework.jdbc.datasource.DataSourceTransactionManager;
import cn.bugstack.springframework.test.bean.JdbcService;
import cn.bugstack.springframework.tx.transaction.annotation.AnnotationTransactionAttributeSource;
import cn.bugstack.springframework.tx.transaction.interceptor.TransactionInterceptor;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @description
 * @date 2022/3/16
 *  /CodeDesignTutorials
 *
 */
public class ApiTest {

    private JdbcTemplate jdbcTemplate;
    private JdbcService jdbcService;
    private DataSource dataSource;

    @Before
    public void init() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        dataSource = applicationContext.getBean(DruidDataSource.class);
        jdbcService = applicationContext.getBean(JdbcService.class);
    }

    @Test
    public void test_Transaction() throws SQLException {
        AnnotationTransactionAttributeSource transactionAttributeSource = new AnnotationTransactionAttributeSource();
        transactionAttributeSource.findTransactionAttribute(jdbcService.getClass());

        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        TransactionInterceptor interceptor = new TransactionInterceptor(transactionManager, transactionAttributeSource);

        // 组装代理信息
        AdvisedSupport advisedSupport = new AdvisedSupport();
        advisedSupport.setTargetSource(new TargetSource(jdbcService));
        advisedSupport.setMethodInterceptor(interceptor);
        advisedSupport.setMethodMatcher(new AspectJExpressionPointcut("execution(* cn.bugstack.springframework.test.bean.JdbcService.*(..))"));

        // 代理对象(Cglib2AopProxy)
        JdbcService proxy_cglib = (JdbcService) new Cglib2AopProxy(advisedSupport).getProxy();

        // 测试调用，有事务【不能同时提交2条有主键冲突的数据】
        // proxy_cglib.saveData(jdbcTemplate);

        // 测试调用，无事务【提交2条有主键冲突的数据成功一条】
        proxy_cglib.saveDataNoTransaction(jdbcTemplate);
    }

}
