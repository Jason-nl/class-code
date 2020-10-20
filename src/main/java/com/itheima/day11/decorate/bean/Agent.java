package com.itheima.day11.decorate.bean;

/**
 * Created by Jason on 2020/10/20 14:23
 */
public class Agent implements Star {

    Star star;

    public Agent(Star star) {
        this.star = star;
    }

    @Override
    public void sing(double money) {
        if (money > 100) {
            star.sing(money * 0.8);
        } else {
            System.out.println("钱不够，不唱");
        }
    }

    @Override
    public void dance(double money) {
        if (money > 200) {
            star.dance(money * 0.8);
        } else {
            System.out.println("钱不够，不跳");
        }
    }
}
