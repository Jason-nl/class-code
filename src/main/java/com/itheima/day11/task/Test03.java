package com.itheima.day11.task;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 2020/10/20 19:12
 */
public class Test03 {
    public static void main(String[] args) {
        /*
        请编写main()方法，定义一个字符缓冲输入流BufferedReader，读取Task1_2.txt文件，一次读取一行，将读取的内容存储到一个List<String>集合中，遍历、并打印集合中的每个元素：

			//1.定义一个字符缓冲输入流

			BufferedReader in = new BufferedReader(......);

			//2.定义一个集合

			List<String> list = new ArrayList<>();

			//3.一次读取一行
         */
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/itheima/day11/resource/Task1_2.txt"))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String line : list) {
            System.out.println(line);
        }
    }
}
