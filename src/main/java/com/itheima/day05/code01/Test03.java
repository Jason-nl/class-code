package com.itheima.day05.code01;


import java.util.Collections;
import java.util.LinkedHashSet;

public class Test03 {
    /*
    请按以下要求顺序编码：

1. 定义一个可以存储“整数”的LinkedHashSet对象
1. 存储以下整数: 20,30,50,10,30,20
1. 打印集合大小。为什么跟存入的数量不一致？
1. 使用增强for遍历集合，打印大于25的元素
     */

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Collections.addAll(set, 20, 30, 50, 10, 30, 20);
        System.out.println(set);
        for (Integer el : set) {
            if (el > 25) {
                System.out.println(el);
            }
        }


    }
}
