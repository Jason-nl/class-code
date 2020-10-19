package com.itheima.day05.task;

import java.util.ArrayList;
import java.util.HashSet;

public class Test01 {
    public static void main(String[] args) {
        /*
        需求：ArrayList有以下元素: "a","f","b","c","a","d"利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)。
            1. 创建ArrayList
            2. 使用add方法往ArrayList添加元素
            3. 创建HashSet.用于将ArrayList中重复的元素去除
            4. 调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
            5. 清空list的所有元素
            6. 将set集合中的元素再添加回ArrayList集合
         */

//        1. 创建ArrayList
        ArrayList<Character> list = new ArrayList<>();
//        2. 使用add方法往ArrayList添加元素
        list.add('a');
        list.add('f');
        list.add('b');
        list.add('c');
        list.add('a');
        list.add('d');
//        3. 创建HashSet.用于将ArrayList中重复的元素去除
        HashSet<Character> set = new HashSet<>();
//        4. 调用HashSet的addAll方法,将ArrayList中的元素添加到HashSet中
        set.addAll(list);
//        5. 清空list的所有元素
        list.clear();
//        6. 将set集合中的元素再添加回ArrayList集合
        list.addAll(set);

        System.out.println(list);
    }
}
