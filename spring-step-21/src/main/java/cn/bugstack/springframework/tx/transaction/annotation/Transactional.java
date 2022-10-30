package cn.bugstack.springframework.tx.transaction.annotation;

import java.lang.annotation.*;

/**
 * 事务注解
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Transactional {

    Class<? extends Throwable>[] rollbackFor() default {};

}
