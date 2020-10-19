package com.itheima.day01.code03;

public class Coach extends Person {

    public Coach() {
    }

    public Coach(int id, String name, String gender, int age) {
        super(id, name, gender, age);
    }

    @Override
    void eat() {
        System.out.println("吃工作餐...");
    }
}
