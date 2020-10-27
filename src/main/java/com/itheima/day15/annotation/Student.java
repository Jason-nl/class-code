package com.itheima.day15.annotation;

import lombok.Data;

/**
 * created by Jason on 2020/10/26 2:24 下午
 */
@Data
public class Student {
    @MyAnno4("张三")
    public String name;

    @MyAnno4("今天天气不错哟")
    public void speak(String msg) {
        System.out.println("speak:" + msg);
    }
}
