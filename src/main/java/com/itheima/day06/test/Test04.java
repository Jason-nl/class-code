package com.itheima.day06.test;

public class Test04 {

    public static void main(String[] args) {
        try {
            printSlow("thread stack is running" + "\n......", 300);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public static void printSlow(String text, int millis) throws InterruptedException {
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            Thread.sleep(millis);
            System.out.print(aChar);
        }
    }
}
