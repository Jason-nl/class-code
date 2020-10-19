package com.itheima.day05.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量,输出结果:”其他=1, 空格=2, 字母=12,数字=6”
         */

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.println("录入一个字符串:");
        String s = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c > 'a' && c < 'z') ||(c > 'A' && c < 'Z') ) {
                countingKey(map, "字母");
            } else if (c > '0' && c < '9') {
                countingKey(map,"数字");
            } else if (c == ' ') {
                countingKey(map, "空格");
            } else {
                countingKey(map, "其他");
            }
        }

        System.out.println(map);
    }

    public static void countingKey(Map<String, Integer> map, String key) {
        Integer num = map.get(key);
        if (num == null) {
            map.put(key, 1);
        } else {
            map.put(key, ++num);
        }
    }
}
