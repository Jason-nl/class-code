package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 12:02
 * 蔬菜类
 */
public abstract class Vegetables extends Food {
    private String color;

    public Vegetables() {

    }

    public Vegetables(double weight, String color) {
        super(weight);
        this.color = color;
    }

    public abstract void use();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
