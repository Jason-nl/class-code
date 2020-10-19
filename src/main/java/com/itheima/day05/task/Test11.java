package com.itheima.day05.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*
        需求：
            1.利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
            2.如用户输入字符串:"helloworld java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
            3.注：输出结果不要求顺序一致

            1. 创建键盘输入对象
            2. 使用nextLine从键盘中读取一行内容
            3. 将字符串转换成字符数组
            4. 创建map集合，用来存放字符：key是字符 value是字符出现的个数
            5. 遍历字符数组
            6. 拿到每个字符,去map中查看是否有保存对应的次数
            7. 如果这个字符没有保存次数,就设置为1次
            8. 如果这个字符有保存次数,就设置为原来的次数+1次
            9. 创建字符串缓冲区对象
            10. 按题目要求拼接字符串
            11. 输出结果
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("录入一个字符串:");
        String str = scanner.nextLine();

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer count = map.get(aChar);
                map.put(aChar, ++count);
            } else {
                map.put(aChar, 1);
            }
            StringBuffer sb = new StringBuffer();
            Integer num = map.get(aChar);
            sb.append(String.format("%s(%d)", aChar, num));
            System.out.print(sb.toString());
        }
    }
}
