package com.itheima.day09.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jason on 2020/10/17 11:24
 */
public class Demo02 {

    @Test
    public void m1() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 3, 2, 1, 4);
        Collections.sort(list, (o1, o2) -> o1 - o2);
        System.out.println(list);

        Collections.sort(list, (Integer a, Integer b) -> {return a - b;});

    }
}
