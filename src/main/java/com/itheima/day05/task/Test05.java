package com.itheima.day05.task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        /*
        需求：Map集合中包含5对元素: "邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏芝”。使用keySet方式迭代出Map集合中的元素。
            1. 创建HashMap

            2. 使用put方法添加元素

            3. 使用keySet方法获取所有的键

            4. 获取到keySet的迭代器

            5. 循环判断迭代器是否有下一个元素

            6. 使用迭代器next方法获取到一个键

            7. 通过一个键找到一个值

            8. 输出键和值
         */

//        1. 创建HashMap
        HashMap<String, String> map = new HashMap<>();
//        2. 使用put方法添加元素
            //"邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”,“谢霆锋”->”张柏芝”
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");
//        3. 使用keySet方法获取所有的键
        Set<String> set = map.keySet();
//        4. 获取到keySet的迭代器
        Iterator<String> iterator = set.iterator();
//        5. 循环判断迭代器是否有下一个元素
        while (iterator.hasNext()) {
//        6. 使用迭代器next方法获取到一个键
            String key = iterator.next();
//        7. 通过一个键找到一个值
            String val = map.get(key);
//        8. 输出键和值
            System.out.println(key + "-" + val);

        }
//
//
//
    }
}
