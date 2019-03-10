package com.spring.mini.spring.annotion;

import java.lang.annotation.*;

/**
 * 〈〉
 *
 * @author gw.Zeng
 * @create 2018/7/14
 * @since 1.0.0
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default "";
}
