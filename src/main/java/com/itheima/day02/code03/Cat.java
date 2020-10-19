package com.itheima.day02.code03;

/**
 * Created by Jason on 2020/10/6 13:38
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼...");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠...");
    }
}
