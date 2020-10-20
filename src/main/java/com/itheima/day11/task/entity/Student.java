package com.itheima.day11.task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Jason on 2020/10/20 19:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //姓名、
    private String name;
    // 性别、
    private String gender;
    // 年龄、
    private int age;
    // 分数
    private int score;

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%d", name, gender, age, score);
    }
}
