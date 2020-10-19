package com.itheima.day03.code;

import java.util.Arrays;

/**
 * Created by Jason on 2020/10/6 17:49
 */
public class Test16 {
    public static void main(String[] args) {
        /**
         *   有以下数组定义：
         *
         * ​       int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
         *
         * ​    要求：
         *
         * Ø 请打印数组所有元素
         *
         * Ø 请对数组元素进行“升序”排序
         *
         * Ø 请对排序后的数组再次打印。
         */
        int[] arr = {1, 332, 43, 25, 3324, 34, 335, 4, 45, 2, 43, 52, 54};

        System.out.println("排序前:" + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后:" + Arrays.toString(arr));


    }
}
