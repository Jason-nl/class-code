package com.itheima.day05.code01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test05 {
    /*
    请定义一个可以存储“整数”的集合，并存储一些数据。

请按以下要求顺序编程实现：

1. 对集合中的数据打乱顺序；
1. 打印集合
1. 对集合中的数据进行升序排序
1. 打印集合
1. 对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
1. 打印集合
    */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 添加一些数据
        Collections.addAll(list, 10, 20, 30, 40, 50);
        // 打乱数据
        Collections.shuffle(list);
        // 打印集合
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("升序后的集合:" + list);
        MyCollections.sort(list, new MyComparator() {
            @Override
            public int compare(int o1, int o2) {
                return o2 - o1;
            }
        });
        System.out.println("降序后集合:" + list);
    }

}

class MyCollections {
    public static void sort(ArrayList<Integer> list, MyComparator comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                int res = comparator.compare(list.get(j), list.get(j + 1));
                if (res > 0) {
                    int temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}

interface MyComparator {
    int compare(int o1, int o2);
}