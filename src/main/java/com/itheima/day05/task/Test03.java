package com.itheima.day05.task;

import com.itheima.day05.task.entity.Person;

import java.util.HashSet;

public class Test03 {
    public static void main(String[] args) {
        /*
        需求：使用HashSet集合，保存自定义的Person类对象；要求：

        1. Person应该具有姓名、性别和年龄三个属性；
        2. 如果Person对象的姓名和性别相同，就认为是同一个人；
         */
        Person p1 = new Person("张三", 18, "男");
        Person p2 = new Person("张三", 19, "男");
        Person p3 = new Person("李四", 19, "男");
        Person p4 = new Person("王五", 20, "男");
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);

        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("小红",20,"女"));
        hs.add(new Person("小明",20,"男"));
        hs.add(new Person("小明",23,"男"));
        System.out.println(hs);
    }
}
