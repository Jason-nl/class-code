package com.itheima.day15.reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by Jason on 2020/10/26 9:05 上午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    public String name;
    private int age;

    public void speak(String a, int b) {
        System.out.println("speak:" + a + "," + b);
    }

    private void show(String c) {
        System.out.println(c);
    }
}
