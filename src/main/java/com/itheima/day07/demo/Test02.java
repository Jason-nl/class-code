package com.itheima.day07.demo;

public class Test02 {
    public static synchronized void test01() {

    }

    public static void test02() {
        synchronized (Test02.class) {

        }
    }

    public static void main(String[] args) {
        test01();
        test02();
    }
}
