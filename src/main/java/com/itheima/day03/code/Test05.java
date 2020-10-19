package com.itheima.day03.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/6 14:54
 */
public class Test05 {
    public static void main(String[] args) {
        /**
         * 请定义一个集合：List<Integer>，并循环向集合中添加1千万个数字，请计算这个循环运行的时间，并打印。
         */

        List<Integer> list = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        long tempTime = (endTime - startTime);
        System.out.println("start time:" + startTime+ "; end time:" + endTime+ "; Run Time:" + tempTime + "(ms)");
    }
}
