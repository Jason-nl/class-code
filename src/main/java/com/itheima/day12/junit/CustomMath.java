package com.itheima.day12.junit;

/**
 * Created by Jason on 2020/10/22 16:08
 */
public class CustomMath {
    public static int add(int... rest) {
        int res = 0;
        for (int val : rest) {
            res += val;
        }

        return res;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
