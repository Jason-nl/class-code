package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:13
 * 茄子类
 */
public class Eggplant extends Vegetables {
    @Override
    public void use() {
        System.out.println("做中药");
    }

    @Override
    public void eat() {
        System.out.println("油焖茄子");
    }
}
