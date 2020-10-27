package com.itheima.day16.task;

import java.util.Scanner;

/**
 * created by Ethan on 2020/10/27 7:26 下午
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码:");
        String qqNumber = sc.next();
        String regex = "[^0]\\d{4,11}";
        boolean res = qqNumber.matches(regex);
        System.out.println(res ? "符合条件" : "不符合条件");
    }
}
