package com.itheima.day16.task;

/**
 * created by Ethan on 2020/10/27 8:58 下午
 */
public class Test05 {
    public static void main(String[] args) {
        String dir = "/Volumes/Worker/Document/Web/mock/mock.pdf";
        String[] split = dir.split("\\/");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
