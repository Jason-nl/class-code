package com.itheima.day02.task01;

/**
 * Created by Jason on 2020/10/6 12:31
 */
public class Phone extends ElectronicFood implements Game{

    @Override
    public void open() {
        System.out.println("手机开机");
    }

    @Override
    public void close() {
        System.out.println("手机关机");
    }

    @Override
    public void play() {
        System.out.println("手机玩游戏");
    }
}
