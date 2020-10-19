package com.itheima.day10.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/19 11:09
 */
public class Demo01 {

    private static FileInputStream ins;

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
            ins = new FileInputStream(file);
            int read;
            while ((read = ins.read()) != -1) { //初始化，循环赋值
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            ins.close();
        }
    }
}
