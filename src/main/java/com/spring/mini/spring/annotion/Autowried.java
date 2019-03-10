package com.spring.mini.spring.annotion;

import java.lang.annotation.*;

/**
 * Created by gw.zeng on 2018/7/14.
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowried {
    String value() default "";
}
