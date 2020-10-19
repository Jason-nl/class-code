package com.itheima.day05.task;

import com.itheima.day05.task.entity.Student;

import java.util.LinkedHashSet;

public class Test04 {
    public static void main(String[] args) {
        /*
        需求:使用LinkedHashSet集合，保存自定义的Student类对象；要求：

            1. Student应该具有姓名、性别、年龄和学号四个属性；
            2. 如果Student对象的学号相同，就认为是同一个人；
         */

        LinkedHashSet set = new LinkedHashSet();
        set.add(new Student("张三", "男", "17", "it1008"));
        set.add(new Student("李四", "女", "18", "it1009"));
        set.add(new Student("王五", "男", "19", "it1008"));
        set.add(new Student("赵六", "男", "20", "it1010"));
        System.out.println(set);
    }
}
