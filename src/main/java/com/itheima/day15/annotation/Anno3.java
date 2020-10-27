package com.itheima.day15.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * created by Jason on 2020/10/26 2:04 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.TYPE})
public @interface Anno3 {

}
