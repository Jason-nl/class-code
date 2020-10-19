package com.itheima.day10.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/19 14:04
 */
public class Demo03 {

    private static FileOutputStream fos;

    public static void main(String[] args) throws IOException {
//        File file = new File("/Volumes/Worker/Code/Java/class-code/src/com/itheima/day10/resource");
//        if (file.exists()) {
//            file.mkdir();
//            FileOutputStream fos = new FileOutputStream(file, true);
//        }
//

        try {
            fos = new FileOutputStream("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/resource/b.txt", true);
            String lineSeparator = System.lineSeparator();
            String str = "我爱中国";
            byte[] bytes = str.getBytes();
            fos.write(lineSeparator.getBytes());
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fos.close();
        }

    }
}
