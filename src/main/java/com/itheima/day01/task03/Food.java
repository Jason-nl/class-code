package com.itheima.day01.task03;

/**
 * Created by Jason on 2020/10/6 11:57
 * 食品类
 */
public abstract class Food {
    // 重量 和 可以吃
    private double weight;

    public abstract void eat();

    public Food() {
    }

    public Food(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
