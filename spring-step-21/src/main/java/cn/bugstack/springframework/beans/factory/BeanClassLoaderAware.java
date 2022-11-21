package cn.bugstack.springframework.beans.factory;

/**
 *
 * @description Callback that allows a bean to be aware of the bean
 * {@link ClassLoader class loader}; that is, the class loader used by the
 * present bean factory to load bean classes.
 * @date 2022/3/11
 *  /CodeDesignTutorials
 *
 */
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);

}
