package com.itheima.day09.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by Jason on 2020/10/17 14:26
 */
public class Demo07 {

    @Test
    public void eachTest() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "da", "cba");

        Stream<String> stream = list.stream();
//        stream.forEach(t -> System.out.println(t));
        list.stream().forEach(this::print);

        long count = list.stream().count();
        System.out.println(count);
        System.out.println("---------------------");
        foreach(list, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


    }

    private void foreach(List<String> list, Consumer<String> consumer) {
        for (String s : list) {
            consumer.accept(s);
        }
    }

    private void print(String t) {
        if (t.contains("b")) {
            System.out.println(t);
        }
    }
}
