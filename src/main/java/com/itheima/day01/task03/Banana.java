package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:15
 * 香蕉类
 */
public class Banana extends Fruit{
    @Override
    public void use() {
        System.out.println("做香蕉面膜");
    }

    @Override
    public void eat() {
        System.out.println("脆皮香蕉");
    }
}
