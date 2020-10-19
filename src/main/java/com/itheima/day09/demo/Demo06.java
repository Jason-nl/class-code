package com.itheima.day09.demo;

import org.junit.Test;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Jason on 2020/10/17 14:13
 */
public class Demo06 {

    @Test
    public void collectionStreamTest() {
        Collection<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        HashMap<String, String> map = new HashMap<>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();

        String[] arr = {"a", "b", "c", "d"};
        Stream<String> arrStream = Stream.of(arr);

    }
}
