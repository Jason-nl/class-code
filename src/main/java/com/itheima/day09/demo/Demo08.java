package com.itheima.day09.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by Jason on 2020/10/17 14:49
 */
public class Demo08 {
    @Test
    public void filterNameTest() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "张三丰", "李四", "李四石", "王五");

        list.stream()
                .filter(s -> s.startsWith("李"))
                .forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------");
        list.stream().skip(3).forEach(System.out::println);

    }

    @Test
    public void mapListStreamTest() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "100", "200", "300");
        list.stream()
                .map(Integer::parseInt)
                .forEach(t -> System.out.println(t + 1));

        System.out.println("====================");

        // map实现
        map(list, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s) * 10;
            }
        });
    }

    @Test
    public void concatStreamTest() {
        Stream<Integer> streamA = Stream.of(1, 2, 3);
        Stream<Integer> streamB = Stream.of(4, 5);
        Stream.concat(streamA, streamB).forEach(t -> System.out.println(t));
    }



    // map映射 原理
    private void map(List<String> list, Function<String, Integer> function) {
        for (String s : list) {
            Integer val = function.apply(s);
            System.out.println(val);
        }
    }
}
