package com.itheima.day10.task;

import java.io.FileReader;

/**
 * Created by Jason on 2020/10/19 20:31
 */
public class Test06 {
    public static void main(String[] args) {
        /*
        读取1.3的student.txt文件，一次读取一个字符，显示到控制台。
         */

        try(FileReader fileReader = new FileReader("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/resource/student.txt")) {
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
