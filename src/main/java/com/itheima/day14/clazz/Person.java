package com.itheima.day14.clazz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by Jason on 2020/10/25 4:11 下午
 */
@Data
@NoArgsConstructor
public class Person {
    public String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
