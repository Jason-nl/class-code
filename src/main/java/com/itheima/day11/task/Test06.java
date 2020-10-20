package com.itheima.day11.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Jason on 2020/10/20 19:39
 * 请定义一个输出转换流对象：OutputStreamWriter，使用GBK编码，向文件”test2_1.txt”文件输出内容：”我要学好Java，我要月薪过万！！
 */
public class Test06 {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("src/main/java/com/itheima/day11/resource/test2_1.txt"),"GBK")){
            writer.write("我要学好Java，我要月薪过万!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
