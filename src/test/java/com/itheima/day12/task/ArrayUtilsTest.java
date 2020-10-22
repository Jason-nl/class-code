package com.itheima.day12.task;

import org.junit.Test;


/**
 * Created by Jason on 2020/10/22 19:10
 */
public class ArrayUtilsTest {
    @Test
    public void testGetMax() {
        int[] arr = {11, 22, 33, 44, 55};
        int max = ArrayUtils.getMax(arr);
        System.out.println(max);
    }
}