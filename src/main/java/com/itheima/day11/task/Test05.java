package com.itheima.day11.task;

import com.itheima.day11.task.entity.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/20 19:26
 * 请编写main()方法，定义一个字符缓冲输入流BufferedReader对象，读取”test1_4.txt”文件，一次读取一行，
 * 将每行数据封装为一个Student对象，并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。
 * <p>
 * ​		//定义一个BufferedReader对象
 * <p>
 * ​		BufferedReader in = new BufferedReader(......);
 * <p>
 * ​		//定义一个集合
 * <p>
 * ​		List<Student> stuList = new ArrayList<>();
 * <p>
 * ​		//一次读取一行
 */
public class Test05 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/itheima/day11/resource/test1_4.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                Student student = new Student(split[0], split[1], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                studentList.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
