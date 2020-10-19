package com.itheima.day10.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Jason on 2020/10/19 16:27
 */
public class FileWriterDemo {

    private static FileWriter fileWriter;

    public static void main(String[] args) throws IOException {
        File file = new File("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
        try {
            fileWriter = new FileWriter(file);
            String str = "123木头人";
            fileWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }
    }
}
