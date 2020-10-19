package com.itheima.day06.test;

public class Test05 {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        m2();
    }

    private static void m2() {
        int a = 200;
        m3();
    }

    private static void m3() {
        int a = 300;
        m4();
    }

    private static void m4() {
        m5();
    }

    private static void m5() {
        int a = 500;
        m6();
    }

    private static void m6() {
        System.out.println("xxx");
    }
}
