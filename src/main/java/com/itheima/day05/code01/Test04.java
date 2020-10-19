package com.itheima.day05.code01;

import java.util.Collections;
import java.util.TreeSet;

public class Test04 {
    /*
    1. 定义一个可以存储“整数”的TreeSet对象
1. 存储以下整数:30,20,50,10,30,20
1. 打印集合大小。为什么跟存入的数量不一致？
1. 遍历集合，打印大于25的元素
     */

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        Collections.addAll(set, 30, 20, 50, 10, 30, 20);
        System.out.println(set);

        for (Integer el : set) {
            if (el > 25) {
                System.out.println(el);
            }
        }
    }
}
