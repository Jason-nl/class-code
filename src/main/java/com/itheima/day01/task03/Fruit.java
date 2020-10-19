package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:02
 * 水果类
 */
public abstract class Fruit extends Food {

    // 颜色
    private String color;

    // 可以使用
    public abstract void use();

    public Fruit() {
    }

    public Fruit(double weight, String color) {
        super(weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
