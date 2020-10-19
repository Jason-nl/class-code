package com.itheima.day10.demo;

/**
 * Created by Jason on 2020/10/19 08:51
 */
public class Demo01 {

    public static void main(String[] args) {

        int n = 3;
        int result = getResult(n);
        System.out.println(result);
    }

    private static int getResult(int n) {
        if (n > 1) {
            int res = n * getResult(n - 1);
            return res;
        } else if (n == 1) {
            return 1;
        } else {
            throw new IllegalArgumentException("N must be more than one");
        }
    }


}
