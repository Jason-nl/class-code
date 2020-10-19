package com.itheima.day10.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/19 14:36
 */
public class Demo04 {

    private static FileInputStream fis;
    private static FileOutputStream fos;

    public static void main(String[] args) {
        write1();
        write2();
    }

    private static void write2() {
//        try {
//            // 创建一个输入流指向原文件
//            fis = new FileInputStream("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day10/stream/a.txt");
//            // 创建一个输出流指向目标文件
//            fos = new FileOutputStream("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day10/resource/c.txt", true);
//            int length;
//            byte[] bytes = new byte[1024];
//            while ((length = fis.read(bytes)) != -1) {
//                fos.write(bytes, 0, length);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

        try (// 创建一个输入流指向原文件
             FileInputStream fis = new FileInputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
             // 创建一个输出流指向目标文件
             FileOutputStream fos = new FileOutputStream("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day10/resource/c.txt", true)) {

            int length;
            byte[] bytes = new byte[1024];
            while ((length = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write1() {
       /*
        try {
            // 创建一个输入流指向原文件
            fis = new FileInputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
            // 创建一个输出流指向目标文件
            fos = new FileOutputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/resource/a.txt", true);
            int read;
            while ((read = fis.read()) != -1) {
                fos.write(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 先开后关
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */

        try (// 创建一个输入流指向原文件
             FileInputStream fis = new FileInputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
             // 创建一个输出流指向目标文件
             FileOutputStream fos = new FileOutputStream("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day10/resource/c.txt", true)) {

            int read;
            while ((read = fis.read()) != -1) {
                fos.write(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
