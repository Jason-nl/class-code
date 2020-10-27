package com.itheima.day16.regex;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ账号:");
        String qq = sc.next();

//        boolean res = qq.matches("[^0][0-9]{4,10}");
        boolean res = qq.matches("[^0]\\d{4,10}");
        System.out.println(res);
    }
}
