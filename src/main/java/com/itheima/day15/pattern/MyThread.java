package com.itheima.day15.pattern;

import java.util.ArrayList;

/**
 * created by Jason on 2020/10/26 10:28 上午
 */
public class MyThread {

    private static int count = 3;
    private static ArrayList<MyThread> list = new ArrayList<>();
    static {
        for (int i = 0; i < count; i++) {
            MyThread thread = new MyThread();
            list.add(thread);
        }
    }

    private MyThread() {}

    public static MyThread getInstance() {
        MyThread mt = list.remove(0);
        return mt;
    }

    public static void back(MyThread mt) {
        list.add(mt);
    }


}
