package com.itheima.day06.test;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put(null, 0);
        Set<String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println(key+":"+map.get(key));
        }
    }
}
