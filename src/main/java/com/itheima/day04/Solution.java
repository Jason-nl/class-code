package com.itheima.day04;

import java.util.*;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Set<String> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[]{-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
//                return new int[]{map.get(target - nums[i]),i};
                arr[0] = map.get(target - nums[i]);
                arr[1] = i;
            }
            map.put(nums[i], i);
        }
//        throw new IllegalArgumentException("No two sum solution");
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] twoSums = twoSum(nums, 9);
        System.out.println(Arrays.toString(twoSums));
    }
}
