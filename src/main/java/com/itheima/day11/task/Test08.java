package com.itheima.day11.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Jason on 2020/10/20 19:48
 * 请定义Student类，有以下属性：姓名、性别、年龄，并实现Serializable接口。
 * <p>
 * 请定义main()方法，创建一个Student对象：
 * <p>
 * Student stu = new Student(“迪丽热巴”,”女”,18);
 * //定义一个序列化对象：ObjectOutputStream，将stu序列化到文件“test3_1.txt”中
 */
public class Test08 {
    public static void main(String[] args) {
        Student student = new Student("迪丽热巴", "女", 18);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/com/itheima/day11/resource/test3_1.txt"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student implements Serializable {
    private static final long serialVersionUID = -158129430547727784L;
    private String name;
    private String gender;
    private int age;
}