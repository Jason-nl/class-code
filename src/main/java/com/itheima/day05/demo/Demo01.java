package com.itheima.day05.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * Comparator
         */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 3, 4, 5, 1, 2);
        System.out.println("排序前:" + list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("排序后:" + list);
        int[] arr = {3, 4, 5, 1, 2};
        int[] ints = bubbleSort(arr);
        System.out.println(Arrays.toString(ints));

        int index = binarySearch(arr, 4);
        System.out.println("查询的索引位置是:" + index);
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key > arr[mid]) {
                left = mid + 1;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}

