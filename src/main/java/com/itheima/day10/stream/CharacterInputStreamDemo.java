package com.itheima.day10.stream;

import java.io.*;

/**
 * Created by Jason on 2020/10/19 15:18
 */
public class CharacterInputStreamDemo {

    private static FileInputStream fis;
    private static FileReader fileReader;

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("/Volumes/Worker/Code/Java/class-code/class-code/src/com/itheima/day10/stream/a.txt");
            fis = new FileInputStream(file);
            fileReader = new FileReader(file);
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }
    }
}
