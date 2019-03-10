package com.spring.mini.spring.annotion;

import java.lang.annotation.*;

/**
 * Created by gw.zeng on 2018/7/14.
 */

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default "";
}
