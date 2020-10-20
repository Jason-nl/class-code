package com.itheima.day11.task;

import com.itheima.day11.task.entity.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/20 19:16
 */
public class Test04 {
    public static void main(String[] args) {
        /*
        请按以下要求编写程序：

1. 定义一个学员类，有以下属性：姓名、性别、年龄、分数

		  无参、全参构造方法，get/set方法

2. 定义main()方法，定义一个存储Student的集合，并初始化一些数据：

			List<Student> stuList = new ArrayList<>();

			stuList.add(new Student(“迪丽热巴”,”女”,18,99);

			stuList.add(new Student(“古力娜扎”,”女”,19,98);

			stuList.add(new Student(“周杰伦”,”男”,20,88);

			stuList.add(new Student(“蔡徐坤”,”男”,19,78);

			/*

3. 定义一个字符缓冲输出流BufferedWriter，将学员信息写入到”test1_4.txt”中，每个学员信息占一行，每个字段之间用,符号隔开，例如：

				迪丽热巴,女,18,99

				古力娜扎,女,19,98

				周杰伦,男,20,88

				蔡徐坤,男,19,78
         */
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古丽热巴", "女", 19, 98));
        stuList.add(new Student("周杰伦", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/com/itheima/day11/resource/test1_4.txt", true))){
            for (Student student : stuList) {
                bufferedWriter.write(String.valueOf(student));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
