package com.itheima.day06.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test06 {
    public static void main(String[] args) {
//        AtomicInteger
        MyThread myThread = new MyThread();
        myThread.start();

        while (true) {
            if (MyThread.a == 1) {
                System.out.println("主线程读到了a == 1");
                break;

            }
        }
    }


}

class MyThread extends Thread {
    public volatile static int a = 0;

    @Override
    public void run() {
        System.out.println("线程启动，休息2秒");
        try {
            Thread.sleep(2000 * 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a = 1;
        System.out.println("线程结束");
    }
}