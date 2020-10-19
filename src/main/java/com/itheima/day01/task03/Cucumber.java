package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:11
 * 黄瓜类
 */
public class Cucumber extends Vegetables {
    @Override
    public void use() {
        System.out.println("做面膜");
    }

    @Override
    public void eat() {
        System.out.println("黄瓜炒蛋");
    }
}
