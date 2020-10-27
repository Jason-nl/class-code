package com.itheima.day15.annotation;

/**
 * created by Jason on 2020/10/26 2:49 下午
 */
public class TestDemo {
    @MyTest
    public void m1() {
        System.out.println("测试1");
    }

    @MyTest
    public void m2() {
        System.out.println("测试2");
    }

    @MyTest
    public void m3() {
        System.out.println("测试3");
    }
}
