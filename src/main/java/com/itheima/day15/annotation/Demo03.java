package com.itheima.day15.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * created by Jason on 2020/10/26 2:07 下午
 */
@Anno3
public class Demo03 {
    /*
        元注解：原始的注解
            1. 注解的注解 用于注解之上的注解
            2. 元数据 metadata

        两个元注解：
            1. @target：使用范围
            2. @Retention：保留策略(生命周期)
            source      class       runtime
            当注解用作配置的时候，需要反射解析，所以注解需要保留到运行时
     */
    public static void main(String[] args) {

    }
}
