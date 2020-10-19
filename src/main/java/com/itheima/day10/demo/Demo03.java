package com.itheima.day10.demo;

import java.io.File;

/**
 * Created by Jason on 2020/10/19 09:57
 */
public class Demo03 {
    public static void main(String[] args) {
        File file = new File("/Users/jason/Desktop/996-master");
//        deleteFile(file);

        int byteCalc = calcByteFile(new File("/Users/jason/Desktop/JavaSE"));
        System.out.println(byteCalc);
    }

    public static void deleteFile(File dir) {
        // 列出指定目录下的所有子文件及子文件夹
        File[] files = dir.listFiles();
        // 遍历这些文件/文件夹
        for (File file : files) {
            // 如果是文件直接删除
            if (file.isFile()) {
                file.delete();
            } else {
                // 如果是文件夹继续循环
                deleteFile(file);
            }
        }
        // 删除自身
        dir.delete();
    }

    public static int calcByteFile(File file) {
        int sum = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                sum += file1.length();
            } else {
                sum += calcByteFile(file1);
            }
        }
        return sum;
    }
}
