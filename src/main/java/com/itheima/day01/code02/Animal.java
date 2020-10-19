package com.itheima.day01.code02;

/**
 * 动物类
 */
public class Animal {
    // 年龄
    private int age;
    public void move() {
        System.out.println("动物会动...");
    }

    public Animal() {

    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
