package com.itheima.day01.code02;

/**
 * 爬行类
 */
public class Creep extends Animal{
    @Override
    public void move() {
        System.out.println("爬行动物都在地表爬行...");
    }

    public void ectotherm() {
        System.out.println("爬行动物没有体温调节能力...");
    }
}
