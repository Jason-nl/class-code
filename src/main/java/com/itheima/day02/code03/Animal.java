package com.itheima.day02.code03;

/**
 * Created by Jason on 2020/10/6 13:37
 */
public class Animal {
    //    属性：名称、年龄、性别
    private String name;
    private int age;
    private String gender;
//    行为：吃饭(非抽象)

    public void eat() {
        System.out.println("吃...");
    }
}
