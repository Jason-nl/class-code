package com.itheima.day10.task;

import java.io.File;

/**
 * Created by Jason on 2020/10/19 20:01
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        	请使用递归遍历一个多级目录，打印所有文件的“绝对路径”。
         */

        // "/Volumes/Worker/tools"

        listDir(new File("/Volumes/Worker/mobiletrain/vue_pro/project/jiuji"));
    }

    public static void listDir(File dir) {
        if (dir.exists()) {
            if (dir.isFile()) {
                System.out.println(dir.getAbsolutePath());
            } else {
                File[] files = dir.listFiles();
                for (File file : files) {
                    listDir(file);
                }
            }
            System.out.println(dir.getAbsolutePath());
        }
    }
}
