package com.itheima.day10.task;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/19 20:35
 */
public class Test07 {
    public static void main(String[] args) {
        /*
        请使用FileWriter向文件输出：HelloWorld
        要求：用JDK7以后的异常处理方式。
         */

        try (FileWriter fileWriter = new FileWriter("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/resource/test.txt")) {
            fileWriter.write("HelloWorld");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
