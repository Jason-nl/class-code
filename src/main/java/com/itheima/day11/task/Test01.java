package com.itheima.day11.task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Jason on 2020/10/20 19:02
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        请将D:盘下的一个文件复制到E:盘下，例如：d:\\视频.itcast，复制到   E:\\视频.itcast。
        请使用“字节缓冲流”：BufferedInputStream和BufferedOutputStream实现
         */
        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream("/Users/jason/Desktop/test/a/t1.txt"));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("/Users/jason/Desktop/test/b/t1.txt"))) {
            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
