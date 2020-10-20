package com.itheima.day11.decorate.bean;

/**
 * Created by Jason on 2020/10/20 14:02
 */
public class CaiXuKun implements Star {
    public void sing(double money) {
        System.out.println("蔡徐坤唱歌");
    }

    public void dance(double money) {
        System.out.println("蔡徐坤跳舞，打篮球");
    }
}
