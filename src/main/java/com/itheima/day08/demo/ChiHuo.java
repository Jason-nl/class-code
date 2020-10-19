package com.itheima.day08.demo;

import java.util.ArrayList;

public class ChiHuo extends Thread {
    ArrayList<String> list;

    public ChiHuo(ArrayList list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() <= 0) {
                    try {
                        // 当前没有包子，当前线程进入进入对象监视器中，当前线程进入无限等待状态
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 有包子，吃包子
                String remove = list.remove(0);
                System.out.println("吃货吃包子" + remove);
                // 吃完包子，通知对象监视器中的包子铺线程，唤醒包子铺线程
                list.notify();
            }
        }
    }
}
