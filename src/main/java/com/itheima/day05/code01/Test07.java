package com.itheima.day05.code01;

import java.util.Arrays;

public class Test07 {
    /*
    # 编程题【选择排序】

## 题目

请按以下要求顺序编写程序：

1. 定义测试类，定义main()方法；
1. 定义以下数组：int[] arr = {7, 6, 5, 4, 3};
1. 用Arrays类打印此数组的所有元素；
1. 用“排序”对数组元素“升序”排序；打印排序后的数组。
     */

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3};
        System.out.println("排序前的数组:" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("排序后的数组:" + Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
