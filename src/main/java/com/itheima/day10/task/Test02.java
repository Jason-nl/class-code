package com.itheima.day10.task;

/**
 * Created by Jason on 2020/10/19 19:43
 */
public class Test02 {
    public static void main(String[] args) {
        /*
        	请使用递归计算从1--100的所有数的累加和。
         */

        int n = 100;
        int sum = recursionSum(n);
        System.out.println(sum);
    }

    private static int recursionSum(int n) {
        // 设置终止条件
        if (n == 1) {
            return 1;
        }

        return n + recursionSum(n - 1);
    }
}
