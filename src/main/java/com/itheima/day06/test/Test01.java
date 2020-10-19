package com.itheima.day06.test;

import java.util.Comparator;
import java.util.TreeSet;

public class Test01 {
    //
    public static void main(String[] args) {
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        };
//        TreeSet<Student> set = new TreeSet<>(comparator);
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("张三", 17));
        set.add(new Student("李四", 18));
        System.out.println(set);
    }
}
