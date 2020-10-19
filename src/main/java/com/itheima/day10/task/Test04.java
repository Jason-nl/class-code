package com.itheima.day10.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Jason on 2020/10/19 20:11
 */
public class Test04 {
    public static void main(String[] args) {
        /*
        请使用字节流复制一个文件，一次读、写一个字节。
         */

//        writeByByte();

        writeByBytesArray();
    }

    private static void writeByBytesArray() {
        try (FileInputStream fis = new FileInputStream("/Volumes/Worker/mobiletrain/vue_pro/project/jiuji/dist/index.html");
             FileOutputStream fos = new FileOutputStream("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/task/index.html")) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeByByte() {
        try (FileInputStream fis = new FileInputStream("/Volumes/Worker/mobiletrain/vue_pro/project/jiuji/dist/index.html");
             FileOutputStream fos = new FileOutputStream("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/task/index.html")) {
            int read;
            while ((read = fis.read()) != -1) {
                fos.write(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
