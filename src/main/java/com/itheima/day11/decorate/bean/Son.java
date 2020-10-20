package com.itheima.day11.decorate.bean;

/**
 * Created by Jason on 2020/10/20 14:08
 * 明星愿意对外出售的能力，必须赋予经纪人
 * 1、对刘德华这类的明星进行共性抽取，接口/抽象类
 */
public class Son extends CaiXuKun {
    @Override
    public void sing(double money) {
        if (money > 100) {
            super.sing(money * 0.7);
        } else {
            System.out.println("钱不够，不唱");
        }
    }

    @Override
    public void dance(double money) {
        if (money > 200) {
            super.dance(money * 0.7);
        } else {
            System.out.println("钱不够不跳");
        }
    }
}
