package com.itheima.day08.demo;

import java.util.ArrayList;

public class BaoZiPu extends Thread{
    // 既做容器使用，又做锁对象使用
    ArrayList<String> list;

    public BaoZiPu(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        // 当这个锁对象list调用wait方法的时候，会让当前线程进入这个锁对象的【监视器】中，当前线程接着进入无限等待状态waitting
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
                list.add("包子" + i);
                System.out.println("包子铺做包子" + i);
                // 做完一个包子，通知监视器【队列】中的吃货线程，唤醒吃货线程
                list.notify();
            }
        }
    }
}
