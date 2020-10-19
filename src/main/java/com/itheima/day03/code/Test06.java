package com.itheima.day03.code;

import java.util.Scanner;

/**
 * Created by Jason on 2020/10/6 15:03
 */
public class Test06 {
    /**
     *请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，
     * 程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数的分数值");
        String grade = scanner.next();
        int score = Integer.parseInt(grade);
        System.out.println(score + 5);

        Object obj = new Object();
        boolean equals = obj.equals(grade);
//        String s = obj.toString();
    }
}
