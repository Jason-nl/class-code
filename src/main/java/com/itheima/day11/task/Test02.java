package com.itheima.day11.task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/20 19:08
 */
public class Test02 {
    public static void main(String[] args) {
//        请编写main()方法，定义一个存储String的集合：List<String>，并初始化以下数据：
        List<String> list = new ArrayList<>();
//			List<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("周杰伦");
        list.add("蔡徐坤");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/com/itheima/day11/resource/Task1_2.txt",true))){
            for (String name : list) {
                bufferedWriter.write(name);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//			list.add(“迪丽热巴”);
//
//			list.add(“古力娜扎”);
//
//			list.add(“周杰伦”);
//
//			list.add(“蔡徐坤”);
//
//        请定义“字符缓冲输出流”BufferedWriter将集合中的数据写入到文件：Task1_2.txt中，每个名字一行。
    }
}
