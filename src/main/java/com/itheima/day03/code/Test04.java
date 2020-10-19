package com.itheima.day03.code;

import java.util.Arrays;

/**
 * Created by Jason on 2020/10/6 14:13
 */
public class Test04 {
    public static void main(String[] args) {
        /**
         * 有以下数组：
         *
         * ​       int[] arr = {55,77,0,88,22,44,33};
         *
         *   请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.
         */

        int[] arr = {55, 77, 0, 88, 22, 44, 33};
        int temp = arr[arr.length - 5];
        System.out.println(temp);
        for (int i = 0; i < arr.length; i++) {
            if (i >= arr.length - 4) {
                arr[i - 1] = arr[i];
            }
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
