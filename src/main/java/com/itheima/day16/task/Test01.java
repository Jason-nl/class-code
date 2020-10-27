package com.itheima.day16.task;

import java.util.ArrayList;
import java.util.List;

/**
 * created by Ethan on 2020/10/27 7:23 下午
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("大明");
        names.add("二明");
        names.add("小明");

        names.stream().forEach(System.out::println);
    }
}
