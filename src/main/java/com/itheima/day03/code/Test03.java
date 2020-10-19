package com.itheima.day03.code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jason on 2020/10/6 13:56
 */
public class Test03 {
    /**
     * 有以下数组：
     * <p>
     * ​    int[] arr = {10,27,8,5,2,1,3,55,88};
     * <p>
     * ​    请定义一个新数组，长度为5，并将arr中几个连续的1位数的数字复制到新数组。
     */

    public static void main(String[] args) {
        int[] arr = {10, 27, 8, 5, 2, 1, 3, 55, 88};
        int[] newArr = new int[5];

        ArrayList<Integer> list = new ArrayList<>();

        for (int k = 0; k < newArr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] / 10 == 0) {
                    list.add(arr[i]);
                }
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(newArr));
    }
}
