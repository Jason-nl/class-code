package com.itheima.day01.code02;

/**
 * 哺乳类
 */
public class Lactation extends Animal {
    @Override
    public void move() {
        System.out.println("哺乳动物拥有快速运动的能力...");
    }

    public void nervousSystem() {
        System.out.println("哺乳动物拥有发达的神经系统...");
    }
}
