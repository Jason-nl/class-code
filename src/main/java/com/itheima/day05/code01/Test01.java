package com.itheima.day05.code01;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
    /**
     * 请编写main()方法，按以下要求顺序：
     *
     * 1. 定义一个Set集合，并存储以下数据：刘备,关羽,张飞,刘备,张飞
     * 1. 打印集合大小
     * 1. 使用迭代器遍历集合，并打印每个元素
     * 1. 使用增强for遍历集合，并打印每个元素
     */

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
//        set.add("刘备");
//        set.add("关羽");
//        set.add("张飞");
//        set.add("刘备");
//        set.add("张飞");
        Collections.addAll(set, "刘备", "关羽", "张飞", "刘备", "张飞");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
