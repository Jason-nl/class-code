package com.itheima.day15.pattern;

import java.util.ArrayList;

/**
 * created by Jason on 2020/10/26 9:58 上午
 */
public class MyPool {
    // 线程的数量
    private int count;
    // 线程容器
    private ArrayList<Thread> list;

    /*
    private static MyPool myPool = new MyPool();
    单例：饿汉单例
    public static MyPool getInstance() {
        return myPool;
    }
     */

    private static MyPool myPool;
    // 单例：懒汉单例
    public static MyPool getInstance() {
        return myPool != null ? new MyPool() : null;
    }

    private MyPool() {

    }

    private MyPool(int count, ArrayList<Thread> list) {
        this.count = count;
        this.list = list;

    }

}
