package com.itheima.day08.demo;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {

        MyTask mt = new MyTask();

        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}

class MyTask implements Runnable {
    Semaphore semaphore = new Semaphore(2);
    @Override
    public void run() {
        try {
            // 获得许可
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "进来了");
        System.out.println(Thread.currentThread().getName() + "出去了");
        // 释放许可
        semaphore.release();
    }
}


