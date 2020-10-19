package com.itheima.day10.reader;

import java.io.*;

/**
 * Created by Jason on 2020/10/19 16:09
 */
public class FileReaderDemo {

    private static FileReader fileReader;
    private static InputStreamReader inputStreamReader;

    public static void main(String[] args) throws IOException {
        File file = new File("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
        try {
//            fileReader = new FileReader(file);
            inputStreamReader = new InputStreamReader(new FileInputStream(file), "utf-8");
            int read;
            while ((read = FileReaderDemo.inputStreamReader.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
//            fileReader.close();
            inputStreamReader.close();
        }
    }
}
