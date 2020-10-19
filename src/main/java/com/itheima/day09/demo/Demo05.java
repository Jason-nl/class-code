package com.itheima.day09.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/17 11:47
 */
public class Demo05 {
    @Test
    public void ListStreamTest() {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
