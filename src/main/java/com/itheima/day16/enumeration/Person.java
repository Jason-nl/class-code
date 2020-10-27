package com.itheima.day16.enumeration;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by Ethan on 2020/10/27 2:10 下午
 */
@Data
@NoArgsConstructor
public class Person {
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
