package com.itheima.day09.demo;

import org.junit.Test;

/**
 * Created by Jason on 2020/10/17 11:27
 */
public class Demo03 {

    @Test
    public void m3() {
        // 上文
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("a");
            }
        };

        // 下文
        method(new Runnable() {
            @Override
            public void run() {
                System.out.println("b");
            }
        });

        Runnable c = () -> System.out.println("c");

        new Thread(() -> System.out.println("d")).start();



    }

    private void method(Runnable runnable) {
    }
}

@FunctionalInterface
interface M {
    void eat();  //有且仅有一个需要被重写的抽象方法的函数式接口
    default void test1() {

    }

    static void test2() {

    }

}