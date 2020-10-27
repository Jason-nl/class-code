package com.itheima.day14.ioc;

import java.util.ResourceBundle;

/**
 * created by Jason on 2020/10/25 4:36 下午
 * 解耦：
 *      1、耦合：越来越依赖
 *      2、解耦：越来越不依赖
 */
public class Demo01 {
    public static void main(String[] args) {
        Singer singer = SingerFactor.getSinger();
        singer.sing();
    }
}
