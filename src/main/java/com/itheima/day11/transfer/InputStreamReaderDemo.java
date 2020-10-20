package com.itheima.day11.transfer;

import java.io.*;

/**
 * Created by Jason on 2020/10/20 09:54
 */
public class InputStreamReaderDemo {

//    private static FileReader fr;
    private static InputStreamReader fr;

    public static void main(String[] args) throws IOException {
//        InputStreamReader
        try {
//            fr = new FileReader("src/main/java/com/itheima/day11/resource/a.txt");
            fr = new InputStreamReader(new FileInputStream("src/main/java/com/itheima/day11/resource/a.txt"),"gbk");
            int read;
            while ((read = fr.read()) != -1) {
                System.out.println((char) read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fr.close();
        }
    }
}
