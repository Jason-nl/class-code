package com.itheima.day12.task;

/**
 * Created by Jason on 2020/10/22 19:06
 */
public class ArrayUtils {
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i = 1 ;i < arr.length ; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
