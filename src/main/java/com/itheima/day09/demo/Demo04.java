package com.itheima.day09.demo;

import org.junit.Test;

/**
 * Created by Jason on 2020/10/17 11:34
 */
public class Demo04 {

    @Test
    public void m4() {
        method("清汤", new Cooker() {
            @Override
            public String cook(String style, String food) {
                return style + food;
            }
        });

//        method(food -> System.out.println("熬制" + food));
        method("高汤", (style, food) -> style + "牛肉" + food);
    }


    private void method(String style, Cooker cooker) {
        System.out.println("开始准备");
        String cook = cooker.cook(style, "面条");
        System.out.println(cook);
        System.out.println("结束收摊");
        System.out.println("----------------");
    }
}

interface Cooker {
    String cook(String style, String food);
}