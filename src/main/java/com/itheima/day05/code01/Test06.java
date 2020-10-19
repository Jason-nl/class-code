package com.itheima.day05.code01;

import java.util.Arrays;

public class Test06 {
    /*
    请按以下要求顺序编写程序：

1. 定义测试类，定义main()方法；
1. 定义以下数组：`int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};`
1. 用Arrays类打印此数组的所有元素；
1. 用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
        System.out.println("排序前的数组:"+Arrays.toString(arr));

        bufferSort(arr);

        System.out.println("排序后的数组:" + Arrays.toString(arr));

    }

    public static void bufferSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
