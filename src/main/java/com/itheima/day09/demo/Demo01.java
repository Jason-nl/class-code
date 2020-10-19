package com.itheima.day09.demo;

import org.junit.Test;

/**
 * Created by Jason on 2020/10/17 11:20
 */
public class Demo01 {
    @Test
    public void method01() {
        class MyTask implements Runnable {
            @Override
            public void run() {
                System.out.println("a");
            }
        }

        MyTask mt = new MyTask();
        new Thread(mt).start();

        new Thread(
                ()->{
                    System.out.println("b");
                }
        ).start();

        new Thread(() -> System.out.println("c")).start();

    }
}

