package com.itheima.day10.task;

/**
 * Created by Jason on 2020/10/19 19:32
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        请使用递归计算5的阶乘
         */

        int result = recursion(5);
        System.out.println(result);
    }

    private static int recursion(int n) {
        if (n > 1) {
            int res =  n *= recursion(n - 1);
            return res;
        } else if (n == 1) {
            return 1;
        } else {
            throw new IllegalArgumentException("n must be more than one");
        }
    }
}
