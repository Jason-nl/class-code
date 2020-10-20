package com.itheima.day11.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Jason on 2020/10/20 10:19
 */
public class PrintDemo {

    private static PrintStream printStream;

    public static void main(String[] args) {
        System.out.println("呵呵");

        try {
            printStream = new PrintStream("src/main/java/com/itheima/day11/resource/b.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }
    }
}
