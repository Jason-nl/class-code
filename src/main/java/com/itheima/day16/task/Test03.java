package com.itheima.day16.task;

import java.util.Scanner;

/**
 * created by Ethan on 2020/10/27 7:29 下午
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String phoneNumber = scanner.next();

        boolean res = phoneNumber.matches("^1[3578]\\d{9}");
        System.out.println(res ? "手机号输入正确" : "手机号输入有误");

    }
}
