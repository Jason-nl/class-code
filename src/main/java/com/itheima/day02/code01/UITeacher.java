package com.itheima.day02.code01;

/**
 * Created by Jason on 2020/10/6 13:04
 */
public class UITeacher extends Employee implements Paint{
    @Override
    public void work() {
        System.out.println("教会学生UI制作能力...");
    }

    @Override
    public void paint() {
        System.out.println("教授学生学会绘图技能");
    }
}
