package com.itheima.day15.annotation;

/**
 * created by Jason on 2020/10/26 11:35 上午
 */
public @interface Anno2 {
    String name() default "佚名";

    int age() default 2;

    String value() default "yy";

    String[] arr() default {};
}
