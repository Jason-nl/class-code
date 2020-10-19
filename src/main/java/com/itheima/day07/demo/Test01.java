package com.itheima.day07.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    public static void main(String[] args) {
        PayPicketWindow mt = new PayPicketWindow();
        Thread t0 = new Thread(mt);
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);

        t0.start();
        t1.start();
        t2.start();

    }
}

class PayPicketWindow implements Runnable {
    static int ticket = 100;
    // 锁对象要保证只有一个
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (ticket > 0) {

            lock.lock();
            if (ticket <= 0) {
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket + "张票");
            ticket--;
            lock.unlock();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
