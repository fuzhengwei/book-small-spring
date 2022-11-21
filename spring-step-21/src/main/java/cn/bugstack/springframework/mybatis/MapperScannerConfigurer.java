package cn.bugstack.springframework.mybatis;

import cn.bugstack.middleware.mybatis.SqlSessionFactory;
import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.PropertyValue;
import cn.bugstack.springframework.beans.PropertyValues;
import cn.bugstack.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import cn.bugstack.springframework.beans.factory.support.BeanDefinitionRegistry;
import cn.bugstack.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import cn.hutool.core.lang.ClassScanner;

import java.util.Set;

/**
 *
 * @description Mapper 扫描配置，根据包信息扫描接口类并注册
 * @date 2022/3/18
 *
 *
 */
public class MapperScannerConfigurer implements BeanDefinitionRegistryPostProcessor {

    private String basePackage;
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        try {
            Set<Class<?>> classes = ClassScanner.scanPackage(basePackage);
            for (Class<?> clazz : classes) {
                // Bean 对象定义
                BeanDefinition beanDefinition = new BeanDefinition(clazz);
                PropertyValues propertyValues = new PropertyValues();
                propertyValues.addPropertyValue(new PropertyValue("mapperInterface", clazz));
                propertyValues.addPropertyValue(new PropertyValue("sqlSessionFactory", sqlSessionFactory));
                beanDefinition.setPropertyValues(propertyValues);
                beanDefinition.setBeanClass(MapperFactoryBean.class);
                // Bean 对象注册
                registry.registerBeanDefinition(clazz.getSimpleName(), beanDefinition);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // left intentionally blank
    }

}
