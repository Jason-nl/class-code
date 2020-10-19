package com.itheima.day05.code01;


import java.util.HashMap;
import java.util.Map;

public class Test09 {
    /*
    有以下字符串：
    String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
    请编程统计每个字符出现的次数
     */
    public static void main(String[] args) {
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }

}
