package com.itheima.day11.util;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/20 15:49
 */
public class IOUtilTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/com/itheima/day11/resource/a.txt");
            FileOutputStream fos = new FileOutputStream("src/main/java/com/itheima/day11/resource/c.txt");
            long copy = IOUtils.copy(fis, fos);
            System.out.println(copy);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
