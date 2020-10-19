package com.itheima.day10.conditions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Jason on 2020/10/19 20:47
 */
public class Example01 {


    public static void main(String[] args) {
        /*
        需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。可以输入多条信息，
        每条信息存储一行。当用户输入：”886”时，程序结束。
         */

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("请输入第一行古诗:");
            String line1 = sc.nextLine();
            writeInfo(line1);
            System.out.println("请输入第二行古诗:");
            String line2 = sc.nextLine();
            writeInfo(line2);

            System.out.println("请输入第三行古诗:");
            String line3 = sc.nextLine();
            writeInfo(line3);

             System.out.println("请输入第四行古诗:");
            String line4 = sc.nextLine();
            writeInfo(line4);

            System.out.println("输入886");
            String last = sc.next();
            if (last.equals("886")) {
                System.exit(0);
            }
        }
    }

    private static void writeInfo(String line) {
        try (FileWriter fileWriter = new FileWriter("/Volumes/Worker/project/java_project/class-code/src/main/java/com/itheima/day10/resource/Info.txt",true)){
            fileWriter.write(line);
            String lineSeparator = System.lineSeparator();
            fileWriter.write(lineSeparator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
