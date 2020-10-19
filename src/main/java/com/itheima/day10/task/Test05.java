package com.itheima.day10.task;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/19 20:22
 */
public class Test05 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("张三", "男", 20, 88));
        studentList.add(new Student("李四", "女", 19, 99));

        try (FileOutputStream fos = new FileOutputStream("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/resource/student.txt",true)) {
            for (Student student : studentList) {
                String lineSeparator = System.lineSeparator();
                fos.write(lineSeparator.getBytes());
                fos.write(student.toFormat().getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
