package com.itheima.day11.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Jason on 2020/10/20 19:42
 * 请定义一个输入转换流对象：InputStreamReader，使用GBK编码读取“test2_1.txt”文件的内容，并打印。
 */
public class Test07 {
    public static void main(String[] args) {
        try(InputStreamReader reader = new InputStreamReader(new FileInputStream("src/main/java/com/itheima/day11/resource/test2_1.txt"), "GBK")) {
            int content;
            byte[] buffer = new byte[1024];
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
