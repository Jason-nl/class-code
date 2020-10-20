package com.itheima.day11.task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Jason on 2020/10/20 19:52
 * 请定义main()方法，创建一个反序列化对象：ObjectInputStream，将文件”test3_1.txt”的对象反序列化到程序中，并打印此对象。
 */
public class Test09 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/com/itheima/day11/resource/test3_1.txt"));){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
