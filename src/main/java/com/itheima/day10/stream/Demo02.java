package com.itheima.day10.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Jason on 2020/10/19 11:39
 */
public class Demo02 {

    private static FileInputStream fis;

    public static void main(String[] args) throws IOException {
        try {
            fis = new FileInputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
            int read = 0;
            byte[] buffer = new byte[3];
            while ((read = fis.read(buffer)) != -1) {
//                System.out.println(Arrays.toString(buffer));
//                System.out.println(read);

                String str = new String(buffer, 0, read);
                System.out.println(str);
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }

    }
}
